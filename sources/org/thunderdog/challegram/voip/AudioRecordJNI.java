package org.thunderdog.challegram.voip;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;

public class AudioRecordJNI {
    private AcousticEchoCanceler aec;
    private AutomaticGainControl agc;
    private AudioRecord audioRecord;
    private ByteBuffer buffer;
    private int bufferSize;
    private long nativeInst;
    private boolean needResampling = false;
    private NoiseSuppressor f25808ns;
    private boolean running;
    private Thread thread;

    public AudioRecordJNI(long j) {
        this.nativeInst = j;
    }

    private int getBufferSize(int i, int i2) {
        return Math.max(AudioRecord.getMinBufferSize(i2, 16, 2), i);
    }

    public static boolean isGoodAudioEffect(AudioEffect audioEffect) {
        Pattern makeNonEmptyRegex = makeNonEmptyRegex("adsp_good_impls");
        Pattern makeNonEmptyRegex2 = makeNonEmptyRegex("adsp_good_names");
        AudioEffect.Descriptor descriptor = audioEffect.getDescriptor();
        VLog.m14060d(audioEffect.getClass().getSimpleName() + ": implementor=" + descriptor.implementor + ", name=" + descriptor.name);
        if (makeNonEmptyRegex != null && makeNonEmptyRegex.matcher(descriptor.implementor).find()) {
            return true;
        }
        if (makeNonEmptyRegex2 != null && makeNonEmptyRegex2.matcher(descriptor.name).find()) {
            return true;
        }
        if (audioEffect instanceof AcousticEchoCanceler) {
            Pattern makeNonEmptyRegex3 = makeNonEmptyRegex("aaec_good_impls");
            Pattern makeNonEmptyRegex4 = makeNonEmptyRegex("aaec_good_names");
            if (makeNonEmptyRegex3 != null && makeNonEmptyRegex3.matcher(descriptor.implementor).find()) {
                return true;
            }
            if (makeNonEmptyRegex4 != null && makeNonEmptyRegex4.matcher(descriptor.name).find()) {
                return true;
            }
        }
        if (!(audioEffect instanceof NoiseSuppressor)) {
            return false;
        }
        Pattern makeNonEmptyRegex5 = makeNonEmptyRegex("ans_good_impls");
        Pattern makeNonEmptyRegex6 = makeNonEmptyRegex("ans_good_names");
        if (makeNonEmptyRegex5 == null || !makeNonEmptyRegex5.matcher(descriptor.implementor).find()) {
            return makeNonEmptyRegex6 != null && makeNonEmptyRegex6.matcher(descriptor.name).find();
        }
        return true;
    }

    private static Pattern makeNonEmptyRegex(String str) {
        String string = VoIPServerConfig.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Pattern.compile(string);
        } catch (Exception e) {
            VLog.m14057e(e);
            return null;
        }
    }

    public native void nativeCallback(ByteBuffer byteBuffer);

    private void startThread() {
        if (this.thread == null) {
            this.running = true;
            final ByteBuffer allocateDirect = this.needResampling ? ByteBuffer.allocateDirect(1764) : null;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (AudioRecordJNI.this.running) {
                        try {
                            if (!AudioRecordJNI.this.needResampling) {
                                AudioRecordJNI.this.audioRecord.read(AudioRecordJNI.this.buffer, 1920);
                            } else {
                                AudioRecordJNI.this.audioRecord.read(allocateDirect, 1764);
                                Resampler.convert44to48(allocateDirect, AudioRecordJNI.this.buffer);
                            }
                        } catch (Exception e) {
                            VLog.m14057e(e);
                        }
                        if (!AudioRecordJNI.this.running) {
                            AudioRecordJNI.this.audioRecord.stop();
                            break;
                        } else {
                            AudioRecordJNI audioRecordJNI = AudioRecordJNI.this;
                            audioRecordJNI.nativeCallback(audioRecordJNI.buffer);
                        }
                    }
                    VLog.m14056i("audiorecord thread exits");
                }
            });
            this.thread = thread;
            thread.start();
            return;
        }
        throw new IllegalStateException("thread already started");
    }

    private boolean tryInit(int i, int i2) {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            try {
                audioRecord.release();
            } catch (Exception unused) {
            }
        }
        VLog.m14056i("Trying to initialize AudioRecord with source=" + i + " and sample rate=" + i2);
        try {
            this.audioRecord = new AudioRecord(i, i2, 16, 2, getBufferSize(this.bufferSize, 48000));
        } catch (Exception e) {
            VLog.m14058e("AudioRecord init failed!", e);
        }
        this.needResampling = i2 != 48000;
        AudioRecord audioRecord2 = this.audioRecord;
        return audioRecord2 != null && audioRecord2.getState() == 1;
    }

    public int getEnabledEffectsMask() {
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        int i = (acousticEchoCanceler == null || !acousticEchoCanceler.getEnabled()) ? 0 : 1;
        NoiseSuppressor noiseSuppressor = this.f25808ns;
        return (noiseSuppressor == null || !noiseSuppressor.getEnabled()) ? i : i | 2;
    }

    public void init(int i, int i2, int i3, int i4) {
        if (this.audioRecord == null) {
            this.bufferSize = i4;
            boolean tryInit = tryInit(7, 48000);
            boolean z = true;
            if (!tryInit) {
                tryInit = tryInit(1, 48000);
            }
            if (!tryInit) {
                tryInit = tryInit(7, 44100);
            }
            if (!tryInit) {
                tryInit = tryInit(1, 44100);
            }
            if (tryInit) {
                if (Build.VERSION.SDK_INT >= 16) {
                    try {
                        if (AutomaticGainControl.isAvailable()) {
                            AutomaticGainControl create = AutomaticGainControl.create(this.audioRecord.getAudioSessionId());
                            this.agc = create;
                            if (create != null) {
                                create.setEnabled(false);
                            }
                        } else {
                            VLog.m14054w("AutomaticGainControl is not available on this device :(");
                        }
                    } catch (Throwable th) {
                        VLog.m14058e("error creating AutomaticGainControl", th);
                    }
                    try {
                        if (NoiseSuppressor.isAvailable()) {
                            NoiseSuppressor create2 = NoiseSuppressor.create(this.audioRecord.getAudioSessionId());
                            this.f25808ns = create2;
                            if (create2 != null) {
                                create2.setEnabled(VoIPServerConfig.getBoolean("use_system_ns", true) && isGoodAudioEffect(this.f25808ns));
                            }
                        } else {
                            VLog.m14054w("NoiseSuppressor is not available on this device :(");
                        }
                    } catch (Throwable th2) {
                        VLog.m14058e("error creating NoiseSuppressor", th2);
                    }
                    try {
                        if (AcousticEchoCanceler.isAvailable()) {
                            AcousticEchoCanceler create3 = AcousticEchoCanceler.create(this.audioRecord.getAudioSessionId());
                            this.aec = create3;
                            if (create3 != null) {
                                if (!VoIPServerConfig.getBoolean("use_system_aec", true) || !isGoodAudioEffect(this.aec)) {
                                    z = false;
                                }
                                create3.setEnabled(z);
                            }
                        } else {
                            VLog.m14054w("AcousticEchoCanceler is not available on this device");
                        }
                    } catch (Throwable th3) {
                        VLog.m14058e("error creating AcousticEchoCanceler", th3);
                    }
                }
                this.buffer = ByteBuffer.allocateDirect(i4);
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
                VLog.m14057e(e);
            }
            this.thread = null;
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        AutomaticGainControl automaticGainControl = this.agc;
        if (automaticGainControl != null) {
            automaticGainControl.release();
            this.agc = null;
        }
        NoiseSuppressor noiseSuppressor = this.f25808ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f25808ns = null;
        }
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
    }

    public boolean start() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null && audioRecord.getState() == 1) {
            try {
                if (this.thread == null) {
                    AudioRecord audioRecord2 = this.audioRecord;
                    if (audioRecord2 == null) {
                        return false;
                    }
                    audioRecord2.startRecording();
                    startThread();
                } else {
                    this.audioRecord.startRecording();
                }
                return true;
            } catch (Exception e) {
                VLog.m14058e("Error initializing AudioRecord", e);
            }
        }
        return false;
    }

    public void stop() {
        try {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord != null) {
                audioRecord.stop();
            }
        } catch (Exception unused) {
        }
    }
}
