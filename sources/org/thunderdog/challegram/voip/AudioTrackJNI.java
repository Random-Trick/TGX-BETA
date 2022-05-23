package org.thunderdog.challegram.voip;

import android.media.AudioTrack;
import java.nio.ByteBuffer;

public class AudioTrackJNI {
    private AudioTrack audioTrack;
    private byte[] buffer = new byte[1920];
    private int bufferSize;
    private long nativeInst;
    private boolean needResampling;
    private boolean running;
    private Thread thread;

    public AudioTrackJNI(long j10) {
        this.nativeInst = j10;
    }

    private int getBufferSize(int i10, int i11) {
        return Math.max(AudioTrack.getMinBufferSize(i11, 4, 2), i10);
    }

    public native void nativeCallback(byte[] bArr);

    private void startThread() {
        if (this.thread == null) {
            this.running = true;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        AudioTrackJNI.this.audioTrack.play();
                        ByteBuffer byteBuffer = null;
                        ByteBuffer allocateDirect = AudioTrackJNI.this.needResampling ? ByteBuffer.allocateDirect(1920) : null;
                        if (AudioTrackJNI.this.needResampling) {
                            byteBuffer = ByteBuffer.allocateDirect(1764);
                        }
                        while (AudioTrackJNI.this.running) {
                            try {
                                if (AudioTrackJNI.this.needResampling) {
                                    AudioTrackJNI audioTrackJNI = AudioTrackJNI.this;
                                    audioTrackJNI.nativeCallback(audioTrackJNI.buffer);
                                    allocateDirect.rewind();
                                    allocateDirect.put(AudioTrackJNI.this.buffer);
                                    Resampler.convert48to44(allocateDirect, byteBuffer);
                                    byteBuffer.rewind();
                                    byteBuffer.get(AudioTrackJNI.this.buffer, 0, 1764);
                                    AudioTrackJNI.this.audioTrack.write(AudioTrackJNI.this.buffer, 0, 1764);
                                } else {
                                    AudioTrackJNI audioTrackJNI2 = AudioTrackJNI.this;
                                    audioTrackJNI2.nativeCallback(audioTrackJNI2.buffer);
                                    AudioTrackJNI.this.audioTrack.write(AudioTrackJNI.this.buffer, 0, 1920);
                                }
                            } catch (Exception e10) {
                                VLog.e(e10);
                            }
                            if (!AudioTrackJNI.this.running) {
                                AudioTrackJNI.this.audioTrack.stop();
                                break;
                            }
                            continue;
                        }
                        VLog.i("audiotrack thread exits");
                    } catch (Exception e11) {
                        VLog.e("error starting AudioTrack", e11);
                    }
                }
            });
            this.thread = thread;
            thread.start();
            return;
        }
        throw new IllegalStateException("thread already started");
    }

    public void init(int i10, int i11, int i12, int i13) {
        if (this.audioTrack == null) {
            int bufferSize = getBufferSize(i13, 48000);
            this.bufferSize = i13;
            AudioTrack audioTrack = new AudioTrack(0, 48000, i12 == 1 ? 4 : 12, 2, bufferSize, 1);
            this.audioTrack = audioTrack;
            if (audioTrack.getState() != 1) {
                VLog.w("Error initializing AudioTrack with 48k, trying 44.1k with resampling");
                try {
                    this.audioTrack.release();
                } catch (Throwable unused) {
                }
                int bufferSize2 = getBufferSize(i13 * 6, 44100);
                VLog.d("buffer size: " + bufferSize2);
                this.audioTrack = new AudioTrack(0, 44100, i12 == 1 ? 4 : 12, 2, bufferSize2, 1);
                this.needResampling = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("already inited");
    }

    public void release() {
        this.running = false;
        Thread thread = this.thread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e10) {
                VLog.e(e10);
            }
            this.thread = null;
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    public void start() {
        if (this.thread == null) {
            startThread();
        } else {
            this.audioTrack.play();
        }
    }

    public void stop() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            try {
                audioTrack.stop();
            } catch (Exception unused) {
            }
        }
    }
}
