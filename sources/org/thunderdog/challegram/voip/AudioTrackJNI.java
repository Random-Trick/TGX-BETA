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

    public AudioTrackJNI(long j) {
        this.nativeInst = j;
    }

    private int getBufferSize(int i, int i2) {
        return Math.max(AudioTrack.getMinBufferSize(i2, 4, 2), i);
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
                            } catch (Exception e) {
                                VLog.m14058e(e);
                            }
                            if (!AudioTrackJNI.this.running) {
                                AudioTrackJNI.this.audioTrack.stop();
                                break;
                            }
                            continue;
                        }
                        VLog.m14057i("audiotrack thread exits");
                    } catch (Exception e2) {
                        VLog.m14059e("error starting AudioTrack", e2);
                    }
                }
            });
            this.thread = thread;
            thread.start();
            return;
        }
        throw new IllegalStateException("thread already started");
    }

    public void init(int i, int i2, int i3, int i4) {
        if (this.audioTrack == null) {
            int bufferSize = getBufferSize(i4, 48000);
            this.bufferSize = i4;
            AudioTrack audioTrack = new AudioTrack(0, 48000, i3 == 1 ? 4 : 12, 2, bufferSize, 1);
            this.audioTrack = audioTrack;
            if (audioTrack.getState() != 1) {
                VLog.m14055w("Error initializing AudioTrack with 48k, trying 44.1k with resampling");
                try {
                    this.audioTrack.release();
                } catch (Throwable unused) {
                }
                int bufferSize2 = getBufferSize(i4 * 6, 44100);
                VLog.m14061d("buffer size: " + bufferSize2);
                this.audioTrack = new AudioTrack(0, 44100, i3 == 1 ? 4 : 12, 2, bufferSize2, 1);
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
            } catch (InterruptedException e) {
                VLog.m14058e(e);
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
