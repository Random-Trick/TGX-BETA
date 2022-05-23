package kd;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.SystemClock;
import ce.j0;
import gd.m;
import hd.l6;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.N;
import org.thunderdog.challegram.voip.AudioRecordJNI;
import zd.o6;

public class j1 implements Runnable {
    public static j1 f15810d0;
    public static m f15811e0;
    public static m f15812f0;
    public long M;
    public short[] N = new short[Log.TAG_CAMERA];
    public AutomaticGainControl O;
    public NoiseSuppressor P;
    public AcousticEchoCanceler Q;
    public kb.b R;
    public long S;
    public int T;
    public long U;
    public AudioRecord V;
    public o6 W;
    public b X;
    public ArrayList<ByteBuffer> Y;
    public ByteBuffer Z;
    public o6.l f15813a;
    public int f15814a0;
    public o6.l f15815b;
    public boolean f15816b0;
    public boolean f15817c;
    public float f15818c0;

    public class a extends kb.b {
        public final o6 M;
        public final boolean N;
        public final b O;

        public a(o6 o6Var, boolean z10, b bVar) {
            this.M = o6Var;
            this.N = z10;
            this.O = bVar;
        }

        @Override
        public void b() {
            j1.this.R = null;
            synchronized (j1.this) {
                if (j1.this.f15817c) {
                    j1.this.Q(this.M, this.N, this.O);
                }
            }
        }
    }

    public interface b {
        void a();

        void e(float f10);

        void i(o6.l lVar, int i10, byte[] bArr);
    }

    public j1() {
        f15811e0 = new m("RecorderThread");
        f15812f0 = new m("EncoderThread");
    }

    public void B() {
        q(true);
    }

    public void C() {
        this.X.a();
    }

    public void E(ByteBuffer byteBuffer) {
        this.Y.add(byteBuffer);
    }

    public void F(float f10) {
        this.X.e(f10);
    }

    public void G(o6 o6Var, boolean z10, b bVar) {
        m mVar = f15811e0;
        a aVar = new a(o6Var, z10, bVar);
        this.R = aVar;
        mVar.e(aVar, 150L);
    }

    public void H() {
        q(this.f15816b0);
    }

    public void J(boolean z10, boolean z11) {
        if (z10) {
            this.f15816b0 = z11;
            AudioRecord audioRecord = this.V;
            if (audioRecord != null) {
                try {
                    audioRecord.stop();
                    T();
                } catch (Throwable th) {
                    Log.e("Cannot stop recorder", th, new Object[0]);
                }
            }
        } else {
            q(z11);
        }
    }

    public void K(final boolean z10) {
        final boolean z11;
        kb.b bVar = this.R;
        if (bVar != null) {
            bVar.c();
            this.R = null;
            z11 = false;
        } else {
            z11 = true;
        }
        f15811e0.e(new Runnable() {
            @Override
            public final void run() {
                j1.this.J(z11, z10);
            }
        }, 0L);
    }

    public static j1 y() {
        if (f15810d0 == null) {
            f15810d0 = new j1();
        }
        return f15810d0;
    }

    public final void I(final ByteBuffer byteBuffer, boolean z10) {
        int i10;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() > this.Z.remaining()) {
                i10 = byteBuffer.limit();
                byteBuffer.limit(this.Z.remaining() + byteBuffer.position());
            } else {
                i10 = -1;
            }
            this.Z.put(byteBuffer);
            if (this.Z.position() == this.Z.limit() || z10) {
                ByteBuffer byteBuffer2 = this.Z;
                if (N.writeFrame(byteBuffer2, !z10 ? byteBuffer2.limit() : byteBuffer.position()) != 0) {
                    this.Z.rewind();
                    this.T += ((this.Z.limit() / 3) / 2) / 16;
                }
            }
            if (i10 != -1) {
                byteBuffer.limit(i10);
            }
        }
        f15811e0.e(new Runnable() {
            @Override
            public final void run() {
                j1.this.E(byteBuffer);
            }
        }, 0L);
    }

    public final void D() {
        if (this.V != null) {
            final float v10 = v();
            if (this.X != null && this.f15817c) {
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        j1.this.F(v10);
                    }
                });
            }
        }
    }

    public void N(final o6 o6Var, final boolean z10, final b bVar) {
        P(true);
        f15812f0.e(new Runnable() {
            @Override
            public final void run() {
                j1.this.G(o6Var, z10, bVar);
            }
        }, 0L);
    }

    public void O() {
        P(false);
        if (SystemClock.elapsedRealtime() - this.S < 700) {
            p();
        } else {
            R(false);
        }
    }

    public final void P(boolean z10) {
        synchronized (this) {
            this.f15817c = z10;
        }
    }

    public final void Q(o6 o6Var, boolean z10, b bVar) {
        this.W = o6Var;
        this.X = bVar;
        o6.l u52 = o6Var.u5("voice" + jd.b.h(), new TdApi.FileTypeVoiceNote(), z10, 1, 5000L);
        if (u52 == null) {
            s();
            return;
        }
        this.f15813a = u52;
        if (this.f15815b != null && new File(this.f15815b.f28149c).delete()) {
            this.f15815b = null;
        }
        try {
            if (N.startRecord(u52.f28149c) == 0) {
                s();
                return;
            }
            if (this.f15814a0 == 0) {
                int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                this.f15814a0 = minBufferSize;
                if (minBufferSize <= 0) {
                    this.f15814a0 = 1280;
                }
            }
            if (this.Y == null) {
                this.Y = new ArrayList<>(5);
                for (int i10 = 0; i10 < 5; i10++) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(Log.TAG_EMOJI);
                    allocateDirect.order(ByteOrder.nativeOrder());
                    this.Y.add(allocateDirect);
                }
            }
            ByteBuffer byteBuffer = this.Z;
            if (byteBuffer == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(1920);
                this.Z = allocateDirect2;
                allocateDirect2.order(ByteOrder.nativeOrder());
            } else {
                byteBuffer.rewind();
            }
            this.V = new AudioRecord(1, 48000, 16, 2, this.f15814a0 * 10);
            try {
                S();
                this.S = SystemClock.elapsedRealtime();
                this.T = 0;
                this.f15816b0 = true;
                this.V.startRecording();
                x();
                u();
            } catch (Throwable th) {
                AudioRecord audioRecord = this.V;
                if (audioRecord != null) {
                    try {
                        audioRecord.stop();
                    } catch (Throwable unused) {
                    }
                }
                Log.e("Couldn't start recording", th, new Object[0]);
                s();
            }
        } catch (Throwable th2) {
            Log.e("Couldn't set up recorder", th2, new Object[0]);
            s();
        }
    }

    public final void R(final boolean z10) {
        f15812f0.e(new Runnable() {
            @Override
            public final void run() {
                j1.this.K(z10);
            }
        }, 0L);
    }

    public final void S() {
        try {
            if (AutomaticGainControl.isAvailable()) {
                AutomaticGainControl create = AutomaticGainControl.create(this.V.getAudioSessionId());
                this.O = create;
                if (create != null) {
                    create.setEnabled(true);
                }
            } else {
                Log.w((int) Log.TAG_VOICE, "AutomaticGainControl is not available on this device", new Object[0]);
            }
        } catch (Throwable th) {
            Log.e(Log.TAG_VOICE, "Error creating AutomaticGainControl", th, new Object[0]);
        }
        try {
            if (NoiseSuppressor.isAvailable()) {
                NoiseSuppressor create2 = NoiseSuppressor.create(this.V.getAudioSessionId());
                this.P = create2;
                if (create2 != null) {
                    create2.setEnabled(AudioRecordJNI.isGoodAudioEffect(create2));
                }
            } else {
                Log.w((int) Log.TAG_VOICE, "NoiseSuppressor is not available on this device", new Object[0]);
            }
        } catch (Throwable th2) {
            Log.e(Log.TAG_VOICE, "Error creating NoiseSuppressor", th2, new Object[0]);
        }
        try {
            if (AcousticEchoCanceler.isAvailable()) {
                AcousticEchoCanceler create3 = AcousticEchoCanceler.create(this.V.getAudioSessionId());
                this.Q = create3;
                if (create3 != null) {
                    create3.setEnabled(AudioRecordJNI.isGoodAudioEffect(create3));
                    return;
                }
                return;
            }
            Log.w((int) Log.TAG_VOICE, "AcousticEchoCanceler is not available on this device", new Object[0]);
        } catch (Throwable th3) {
            Log.e(Log.TAG_VOICE, "Error creating AcousticEchoCanceler", th3, new Object[0]);
        }
    }

    public final void T() {
        AutomaticGainControl automaticGainControl = this.O;
        if (automaticGainControl != null) {
            automaticGainControl.release();
            this.O = null;
        }
        NoiseSuppressor noiseSuppressor = this.P;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.P = null;
        }
        AcousticEchoCanceler acousticEchoCanceler = this.Q;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.Q = null;
        }
    }

    public final void o(ByteBuffer byteBuffer, int i10) {
        double d10 = 0.0d;
        try {
            long j10 = this.M;
            long j11 = (i10 / 2) + j10;
            short[] sArr = this.N;
            int length = (int) ((j10 / j11) * sArr.length);
            int length2 = sArr.length - length;
            float f10 = 0.0f;
            if (length != 0) {
                float length3 = sArr.length / length;
                float f11 = 0.0f;
                for (int i11 = 0; i11 < length; i11++) {
                    short[] sArr2 = this.N;
                    sArr2[i11] = sArr2[(int) f11];
                    f11 += length3;
                }
            }
            float f12 = (i10 / 2.0f) / length2;
            for (int i12 = 0; i12 < i10 / 2; i12++) {
                short s10 = byteBuffer.getShort();
                if (s10 > 2500) {
                    d10 += s10 * s10;
                }
                if (i12 == ((int) f10)) {
                    short[] sArr3 = this.N;
                    if (length < sArr3.length) {
                        sArr3[length] = s10;
                        f10 += f12;
                        length++;
                    }
                }
            }
            this.M = j11;
        } catch (Throwable th) {
            Log.e(Log.TAG_VOICE, "Cannot calculate max amplitude", th, new Object[0]);
        }
        byteBuffer.position(0);
        this.f15818c0 = (float) Math.sqrt((d10 / i10) / 2.0d);
    }

    public void p() {
        P(false);
        R(true);
    }

    public final void q(boolean z10) {
        N.stopRecord();
        P(false);
        o6.l lVar = this.f15813a;
        if (lVar != null) {
            this.W.r5(lVar, z10 ? new TdApi.Error(-1, "Canceled") : null);
            if (z10) {
                this.f15815b = this.f15813a;
            } else {
                b bVar = this.X;
                if (bVar != null) {
                    bVar.i(this.f15813a, Math.round(this.T / 1000.0f), w());
                }
            }
        }
        AudioRecord audioRecord = this.V;
        if (audioRecord != null) {
            audioRecord.release();
            this.V = null;
        }
    }

    public void r(final l6 l6Var) {
        f15811e0.e(new Runnable() {
            @Override
            public final void run() {
                l6.this.a();
            }
        }, 0L);
    }

    @Override
    public void run() {
        final ByteBuffer byteBuffer;
        if (this.V != null) {
            final boolean z10 = false;
            if (this.Y.isEmpty()) {
                byteBuffer = ByteBuffer.allocateDirect(this.f15814a0);
                byteBuffer.order(ByteOrder.nativeOrder());
            } else {
                byteBuffer = this.Y.get(0);
                this.Y.remove(0);
            }
            byteBuffer.rewind();
            int read = this.V.read(byteBuffer, byteBuffer.capacity());
            if (read <= 0) {
                this.Y.add(byteBuffer);
                f15812f0.e(new Runnable() {
                    @Override
                    public final void run() {
                        j1.this.H();
                    }
                }, 0L);
                return;
            }
            byteBuffer.limit(read);
            if (read != byteBuffer.capacity()) {
                z10 = true;
            }
            o(byteBuffer, read);
            f15812f0.e(new Runnable() {
                @Override
                public final void run() {
                    j1.this.I(byteBuffer, z10);
                }
            }, 0L);
            u();
            t();
        }
    }

    public final void s() {
        o6.l lVar = this.f15813a;
        if (lVar != null) {
            this.W.r5(lVar, new TdApi.Error());
            this.f15813a = null;
        }
        f15812f0.e(new Runnable() {
            @Override
            public final void run() {
                j1.this.B();
            }
        }, 0L);
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                j1.this.C();
            }
        });
    }

    public final void t() {
        if (this.f15817c) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.U >= 57) {
                this.U = currentTimeMillis;
                f15811e0.e(new Runnable() {
                    @Override
                    public final void run() {
                        j1.this.D();
                    }
                }, 57L);
            }
        }
    }

    public final void u() {
        f15811e0.e(this, 0L);
    }

    public final float v() {
        return this.f15818c0;
    }

    public byte[] w() {
        short[] sArr = this.N;
        return N.getWaveform2(sArr, sArr.length);
    }

    public final void x() {
        this.f15818c0 = 0.0f;
        if (this.M > 0) {
            Arrays.fill(this.N, (short) 0);
            this.M = 0L;
        }
    }

    public boolean z() {
        return this.f15817c;
    }
}
