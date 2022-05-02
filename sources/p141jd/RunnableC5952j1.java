package p141jd;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.SystemClock;
import be.C1379j0;
import gd.C4695l6;
import id.AbstractC5333b;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.voip.AudioRecordJNI;
import p082fd.C4384m;
import p139jb.AbstractRunnableC5910b;
import p350yd.C10930q6;

public class RunnableC5952j1 implements Runnable {
    public static RunnableC5952j1 f18893d0;
    public static C4384m f18894e0;
    public static C4384m f18895f0;
    public long f18896M;
    public short[] f18897N = new short[Log.TAG_CAMERA];
    public AutomaticGainControl f18898O;
    public NoiseSuppressor f18899P;
    public AcousticEchoCanceler f18900Q;
    public AbstractRunnableC5910b f18901R;
    public long f18902S;
    public int f18903T;
    public long f18904U;
    public AudioRecord f18905V;
    public C10930q6 f18906W;
    public AbstractC5954b f18907X;
    public ArrayList<ByteBuffer> f18908Y;
    public ByteBuffer f18909Z;
    public C10930q6.C10942l f18910a;
    public int f18911a0;
    public C10930q6.C10942l f18912b;
    public boolean f18913b0;
    public boolean f18914c;
    public float f18915c0;

    public class C5953a extends AbstractRunnableC5910b {
        public final C10930q6 f18916M;
        public final boolean f18917N;
        public final AbstractC5954b f18918O;

        public C5953a(C10930q6 q6Var, boolean z, AbstractC5954b bVar) {
            this.f18916M = q6Var;
            this.f18917N = z;
            this.f18918O = bVar;
        }

        @Override
        public void mo1364b() {
            RunnableC5952j1.this.f18901R = null;
            synchronized (RunnableC5952j1.this) {
                if (RunnableC5952j1.this.f18914c) {
                    RunnableC5952j1.this.m21807Q(this.f18916M, this.f18917N, this.f18918O);
                }
            }
        }
    }

    public interface AbstractC5954b {
        void mo6916a();

        void mo6900f(float f);

        void mo6894h(C10930q6.C10942l lVar, int i, byte[] bArr);
    }

    public RunnableC5952j1() {
        f18894e0 = new C4384m("RecorderThread");
        f18895f0 = new C4384m("EncoderThread");
    }

    public void m21822B() {
        m21787q(true);
    }

    public void m21821C() {
        this.f18907X.mo6916a();
    }

    public void m21819E(ByteBuffer byteBuffer) {
        this.f18908Y.add(byteBuffer);
    }

    public void m21818F(float f) {
        this.f18907X.mo6900f(f);
    }

    public void m21817G(C10930q6 q6Var, boolean z, AbstractC5954b bVar) {
        C4384m mVar = f18894e0;
        C5953a aVar = new C5953a(q6Var, z, bVar);
        this.f18901R = aVar;
        mVar.m28052e(aVar, 150L);
    }

    public void m21816H() {
        m21787q(this.f18913b0);
    }

    public void m21814J(boolean z, boolean z2) {
        if (z) {
            this.f18913b0 = z2;
            AudioRecord audioRecord = this.f18905V;
            if (audioRecord != null) {
                try {
                    audioRecord.stop();
                    m21804T();
                } catch (Throwable th) {
                    Log.m14725e("Cannot stop recorder", th, new Object[0]);
                }
            }
        } else {
            m21787q(z2);
        }
    }

    public void m21813K(final boolean z) {
        final boolean z2;
        AbstractRunnableC5910b bVar = this.f18901R;
        if (bVar != null) {
            bVar.m21857c();
            this.f18901R = null;
            z2 = false;
        } else {
            z2 = true;
        }
        f18894e0.m28052e(new Runnable() {
            @Override
            public final void run() {
                RunnableC5952j1.this.m21814J(z2, z);
            }
        }, 0L);
    }

    public static RunnableC5952j1 m21779y() {
        if (f18893d0 == null) {
            f18893d0 = new RunnableC5952j1();
        }
        return f18893d0;
    }

    public final void m21815I(final ByteBuffer byteBuffer, boolean z) {
        int i;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() > this.f18909Z.remaining()) {
                i = byteBuffer.limit();
                byteBuffer.limit(this.f18909Z.remaining() + byteBuffer.position());
            } else {
                i = -1;
            }
            this.f18909Z.put(byteBuffer);
            if (this.f18909Z.position() == this.f18909Z.limit() || z) {
                ByteBuffer byteBuffer2 = this.f18909Z;
                if (C7888N.writeFrame(byteBuffer2, !z ? byteBuffer2.limit() : byteBuffer.position()) != 0) {
                    this.f18909Z.rewind();
                    this.f18903T += ((this.f18909Z.limit() / 3) / 2) / 16;
                }
            }
            if (i != -1) {
                byteBuffer.limit(i);
            }
        }
        f18894e0.m28052e(new Runnable() {
            @Override
            public final void run() {
                RunnableC5952j1.this.m21819E(byteBuffer);
            }
        }, 0L);
    }

    public final void m21820D() {
        if (this.f18905V != null) {
            final float v = m21782v();
            if (this.f18907X != null && this.f18914c) {
                C1379j0.m37334d0(new Runnable() {
                    @Override
                    public final void run() {
                        RunnableC5952j1.this.m21818F(v);
                    }
                });
            }
        }
    }

    public void m21810N(final C10930q6 q6Var, final boolean z, final AbstractC5954b bVar) {
        m21808P(true);
        f18895f0.m28052e(new Runnable() {
            @Override
            public final void run() {
                RunnableC5952j1.this.m21817G(q6Var, z, bVar);
            }
        }, 0L);
    }

    public void m21809O() {
        m21808P(false);
        if (SystemClock.elapsedRealtime() - this.f18902S < 700) {
            m21788p();
        } else {
            m21806R(false);
        }
    }

    public final void m21808P(boolean z) {
        synchronized (this) {
            this.f18914c = z;
        }
    }

    public final void m21807Q(C10930q6 q6Var, boolean z, AbstractC5954b bVar) {
        this.f18906W = q6Var;
        this.f18907X = bVar;
        C10930q6.C10942l q5 = q6Var.m2285q5("voice" + AbstractC5333b.m23223h(), new TdApi.FileTypeVoiceNote(), z, 1, 5000L);
        if (q5 == null) {
            m21785s();
            return;
        }
        this.f18910a = q5;
        if (this.f18912b != null && new File(this.f18912b.f35160c).delete()) {
            this.f18912b = null;
        }
        try {
            if (C7888N.startRecord(q5.f35160c) == 0) {
                m21785s();
                return;
            }
            if (this.f18911a0 == 0) {
                int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                this.f18911a0 = minBufferSize;
                if (minBufferSize <= 0) {
                    this.f18911a0 = 1280;
                }
            }
            if (this.f18908Y == null) {
                this.f18908Y = new ArrayList<>(5);
                for (int i = 0; i < 5; i++) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(Log.TAG_EMOJI);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    this.f18908Y.add(allocateDirect);
                }
            }
            ByteBuffer byteBuffer = this.f18909Z;
            if (byteBuffer == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(1920);
                this.f18909Z = allocateDirect2;
                allocateDirect2.order(ByteOrder.nativeOrder());
            } else {
                byteBuffer.rewind();
            }
            this.f18905V = new AudioRecord(1, 48000, 16, 2, this.f18911a0 * 10);
            try {
                m21805S();
                this.f18902S = SystemClock.elapsedRealtime();
                this.f18903T = 0;
                this.f18913b0 = true;
                this.f18905V.startRecording();
                m21780x();
                m21783u();
            } catch (Throwable th) {
                AudioRecord audioRecord = this.f18905V;
                if (audioRecord != null) {
                    try {
                        audioRecord.stop();
                    } catch (Throwable unused) {
                    }
                }
                Log.m14725e("Couldn't start recording", th, new Object[0]);
                m21785s();
            }
        } catch (Throwable th2) {
            Log.m14725e("Couldn't set up recorder", th2, new Object[0]);
            m21785s();
        }
    }

    public final void m21806R(final boolean z) {
        f18895f0.m28052e(new Runnable() {
            @Override
            public final void run() {
                RunnableC5952j1.this.m21813K(z);
            }
        }, 0L);
    }

    public final void m21805S() {
        try {
            if (AutomaticGainControl.isAvailable()) {
                AutomaticGainControl create = AutomaticGainControl.create(this.f18905V.getAudioSessionId());
                this.f18898O = create;
                if (create != null) {
                    create.setEnabled(true);
                }
            } else {
                Log.m14711w((int) Log.TAG_VOICE, "AutomaticGainControl is not available on this device", new Object[0]);
            }
        } catch (Throwable th) {
            Log.m14728e(Log.TAG_VOICE, "Error creating AutomaticGainControl", th, new Object[0]);
        }
        try {
            if (NoiseSuppressor.isAvailable()) {
                NoiseSuppressor create2 = NoiseSuppressor.create(this.f18905V.getAudioSessionId());
                this.f18899P = create2;
                if (create2 != null) {
                    create2.setEnabled(AudioRecordJNI.isGoodAudioEffect(create2));
                }
            } else {
                Log.m14711w((int) Log.TAG_VOICE, "NoiseSuppressor is not available on this device", new Object[0]);
            }
        } catch (Throwable th2) {
            Log.m14728e(Log.TAG_VOICE, "Error creating NoiseSuppressor", th2, new Object[0]);
        }
        try {
            if (AcousticEchoCanceler.isAvailable()) {
                AcousticEchoCanceler create3 = AcousticEchoCanceler.create(this.f18905V.getAudioSessionId());
                this.f18900Q = create3;
                if (create3 != null) {
                    create3.setEnabled(AudioRecordJNI.isGoodAudioEffect(create3));
                    return;
                }
                return;
            }
            Log.m14711w((int) Log.TAG_VOICE, "AcousticEchoCanceler is not available on this device", new Object[0]);
        } catch (Throwable th3) {
            Log.m14728e(Log.TAG_VOICE, "Error creating AcousticEchoCanceler", th3, new Object[0]);
        }
    }

    public final void m21804T() {
        AutomaticGainControl automaticGainControl = this.f18898O;
        if (automaticGainControl != null) {
            automaticGainControl.release();
            this.f18898O = null;
        }
        NoiseSuppressor noiseSuppressor = this.f18899P;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f18899P = null;
        }
        AcousticEchoCanceler acousticEchoCanceler = this.f18900Q;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.f18900Q = null;
        }
    }

    public final void m21789o(ByteBuffer byteBuffer, int i) {
        double d = 0.0d;
        try {
            long j = this.f18896M;
            long j2 = (i / 2) + j;
            short[] sArr = this.f18897N;
            int length = (int) ((j / j2) * sArr.length);
            int length2 = sArr.length - length;
            float f = 0.0f;
            if (length != 0) {
                float length3 = sArr.length / length;
                float f2 = 0.0f;
                for (int i2 = 0; i2 < length; i2++) {
                    short[] sArr2 = this.f18897N;
                    sArr2[i2] = sArr2[(int) f2];
                    f2 += length3;
                }
            }
            float f3 = (i / 2.0f) / length2;
            for (int i3 = 0; i3 < i / 2; i3++) {
                short s = byteBuffer.getShort();
                if (s > 2500) {
                    d += s * s;
                }
                if (i3 == ((int) f)) {
                    short[] sArr3 = this.f18897N;
                    if (length < sArr3.length) {
                        sArr3[length] = s;
                        f += f3;
                        length++;
                    }
                }
            }
            this.f18896M = j2;
        } catch (Throwable th) {
            Log.m14728e(Log.TAG_VOICE, "Cannot calculate max amplitude", th, new Object[0]);
        }
        byteBuffer.position(0);
        this.f18915c0 = (float) Math.sqrt((d / i) / 2.0d);
    }

    public void m21788p() {
        m21808P(false);
        m21806R(true);
    }

    public final void m21787q(boolean z) {
        C7888N.stopRecord();
        m21808P(false);
        C10930q6.C10942l lVar = this.f18910a;
        if (lVar != null) {
            this.f18906W.m2333n5(lVar, z ? new TdApi.Error(-1, "Canceled") : null);
            if (z) {
                this.f18912b = this.f18910a;
            } else {
                AbstractC5954b bVar = this.f18907X;
                if (bVar != null) {
                    bVar.mo6894h(this.f18910a, Math.round(this.f18903T / 1000.0f), m21781w());
                }
            }
        }
        AudioRecord audioRecord = this.f18905V;
        if (audioRecord != null) {
            audioRecord.release();
            this.f18905V = null;
        }
    }

    public void m21786r(final C4695l6 l6Var) {
        f18894e0.m28052e(new Runnable() {
            @Override
            public final void run() {
                C4695l6.this.m26474a();
            }
        }, 0L);
    }

    @Override
    public void run() {
        final ByteBuffer byteBuffer;
        if (this.f18905V != null) {
            final boolean z = false;
            if (this.f18908Y.isEmpty()) {
                byteBuffer = ByteBuffer.allocateDirect(this.f18911a0);
                byteBuffer.order(ByteOrder.nativeOrder());
            } else {
                byteBuffer = this.f18908Y.get(0);
                this.f18908Y.remove(0);
            }
            byteBuffer.rewind();
            int read = this.f18905V.read(byteBuffer, byteBuffer.capacity());
            if (read <= 0) {
                this.f18908Y.add(byteBuffer);
                f18895f0.m28052e(new Runnable() {
                    @Override
                    public final void run() {
                        RunnableC5952j1.this.m21816H();
                    }
                }, 0L);
                return;
            }
            byteBuffer.limit(read);
            if (read != byteBuffer.capacity()) {
                z = true;
            }
            m21789o(byteBuffer, read);
            f18895f0.m28052e(new Runnable() {
                @Override
                public final void run() {
                    RunnableC5952j1.this.m21815I(byteBuffer, z);
                }
            }, 0L);
            m21783u();
            m21784t();
        }
    }

    public final void m21785s() {
        C10930q6.C10942l lVar = this.f18910a;
        if (lVar != null) {
            this.f18906W.m2333n5(lVar, new TdApi.Error());
            this.f18910a = null;
        }
        f18895f0.m28052e(new Runnable() {
            @Override
            public final void run() {
                RunnableC5952j1.this.m21822B();
            }
        }, 0L);
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                RunnableC5952j1.this.m21821C();
            }
        });
    }

    public final void m21784t() {
        if (this.f18914c) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f18904U >= 57) {
                this.f18904U = currentTimeMillis;
                f18894e0.m28052e(new Runnable() {
                    @Override
                    public final void run() {
                        RunnableC5952j1.this.m21820D();
                    }
                }, 57L);
            }
        }
    }

    public final void m21783u() {
        f18894e0.m28052e(this, 0L);
    }

    public final float m21782v() {
        return this.f18915c0;
    }

    public byte[] m21781w() {
        short[] sArr = this.f18897N;
        return C7888N.getWaveform2(sArr, sArr.length);
    }

    public final void m21780x() {
        this.f18915c0 = 0.0f;
        if (this.f18896M > 0) {
            Arrays.fill(this.f18897N, (short) 0);
            this.f18896M = 0L;
        }
    }

    public boolean m21778z() {
        return this.f18914c;
    }
}
