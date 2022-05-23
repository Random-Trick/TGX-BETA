package d5;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import c5.j0;
import c5.l0;
import c5.s;
import c5.w;
import d5.z;
import e4.l;
import e4.m;
import e4.n;
import e4.o;
import e4.v;
import java.nio.ByteBuffer;
import java.util.List;
import m3.c3;
import m3.q;
import m3.q1;
import m3.r1;
import org.thunderdog.challegram.Log;
import p3.e;
import p3.g;
import p3.h;

public class j extends o {
    public static final int[] Y1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean Z1;
    public static boolean f6269a2;
    public boolean A1;
    public int B1;
    public boolean C1;
    public boolean D1;
    public boolean E1;
    public long F1;
    public long G1;
    public long H1;
    public int I1;
    public int J1;
    public int K1;
    public long L1;
    public long M1;
    public long N1;
    public int O1;
    public int P1;
    public int Q1;
    public int R1;
    public float S1;
    public b0 T1;
    public boolean U1;
    public int V1;
    public b W1;
    public l X1;
    public final Context f6270p1;
    public final n f6271q1;
    public final z.a f6272r1;
    public final long f6273s1;
    public final int f6274t1;
    public final boolean f6275u1;
    public a f6276v1;
    public boolean f6277w1;
    public boolean f6278x1;
    public Surface f6279y1;
    public f f6280z1;

    public static final class a {
        public final int f6281a;
        public final int f6282b;
        public final int f6283c;

        public a(int i10, int i11, int i12) {
            this.f6281a = i10;
            this.f6282b = i11;
            this.f6283c = i12;
        }
    }

    public final class b implements l.c, Handler.Callback {
        public final Handler f6284a;

        public b(l lVar) {
            Handler v10 = l0.v(this);
            this.f6284a = v10;
            lVar.o(this, v10);
        }

        @Override
        public void a(l lVar, long j10, long j11) {
            if (l0.f4841a < 30) {
                this.f6284a.sendMessageAtFrontOfQueue(Message.obtain(this.f6284a, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            b(j10);
        }

        public final void b(long j10) {
            j jVar = j.this;
            if (this == jVar.W1) {
                if (j10 == Long.MAX_VALUE) {
                    jVar.R1();
                    return;
                }
                try {
                    jVar.Q1(j10);
                } catch (q e10) {
                    j.this.g1(e10);
                }
            }
        }

        @Override
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(l0.F0(message.arg1, message.arg2));
            return true;
        }
    }

    public j(Context context, l.b bVar, e4.q qVar, long j10, boolean z10, Handler handler, z zVar, int i10) {
        this(context, bVar, qVar, j10, z10, handler, zVar, i10, 30.0f);
    }

    public static int A1(e4.n r10, m3.q1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: d5.j.A1(e4.n, m3.q1):int");
    }

    public static Point B1(n nVar, q1 q1Var) {
        int[] iArr;
        int i10 = q1Var.f16899a0;
        int i11 = q1Var.Z;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : Y1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (l0.f4841a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point b10 = nVar.b(i15, i13);
                if (nVar.u(b10.x, b10.y, q1Var.f16901b0)) {
                    return b10;
                }
            } else {
                try {
                    int l10 = l0.l(i13, 16) * 16;
                    int l11 = l0.l(i14, 16) * 16;
                    if (l10 * l11 <= v.N()) {
                        int i16 = z10 ? l11 : l10;
                        if (!z10) {
                            l10 = l11;
                        }
                        return new Point(i16, l10);
                    }
                } catch (v.c unused) {
                }
            }
        }
        return null;
    }

    public static List<n> D1(e4.q qVar, q1 q1Var, boolean z10, boolean z11) {
        String str = q1Var.U;
        if (str == null) {
            return a7.q.D();
        }
        List<n> a10 = qVar.a(str, z10, z11);
        String m10 = v.m(q1Var);
        if (m10 == null) {
            return a7.q.z(a10);
        }
        return a7.q.x().g(a10).g(qVar.a(m10, z10, z11)).h();
    }

    public static int E1(n nVar, q1 q1Var) {
        if (q1Var.V == -1) {
            return A1(nVar, q1Var);
        }
        int size = q1Var.W.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += q1Var.W.get(i11).length;
        }
        return q1Var.V + i10;
    }

    public static boolean G1(long j10) {
        return j10 < -30000;
    }

    public static boolean H1(long j10) {
        return j10 < -500000;
    }

    public static void V1(l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.d(bundle);
    }

    public static void w1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    public static boolean x1() {
        return "NVIDIA".equals(l0.f4843c);
    }

    public static boolean z1() {
        throw new UnsupportedOperationException("Method not decompiled: d5.j.z1():boolean");
    }

    @Override
    @TargetApi(d.j.P3)
    public void B0(g gVar) {
        if (this.f6278x1) {
            ByteBuffer byteBuffer = (ByteBuffer) c5.a.e(gVar.O);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    V1(r0(), bArr);
                }
            }
        }
    }

    public a C1(n nVar, q1 q1Var, q1[] q1VarArr) {
        int A1;
        int i10 = q1Var.Z;
        int i11 = q1Var.f16899a0;
        int E1 = E1(nVar, q1Var);
        if (q1VarArr.length == 1) {
            if (!(E1 == -1 || (A1 = A1(nVar, q1Var)) == -1)) {
                E1 = Math.min((int) (E1 * 1.5f), A1);
            }
            return new a(i10, i11, E1);
        }
        int length = q1VarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            q1 q1Var2 = q1VarArr[i12];
            if (q1Var.f16907g0 != null && q1Var2.f16907g0 == null) {
                q1Var2 = q1Var2.b().J(q1Var.f16907g0).E();
            }
            if (nVar.e(q1Var, q1Var2).f20494d != 0) {
                int i13 = q1Var2.Z;
                z10 |= i13 == -1 || q1Var2.f16899a0 == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, q1Var2.f16899a0);
                E1 = Math.max(E1, E1(nVar, q1Var2));
            }
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Resolutions unknown. Codec max resolution: ");
            sb2.append(i10);
            sb2.append("x");
            sb2.append(i11);
            s.i("MediaCodecVideoRenderer", sb2.toString());
            Point B1 = B1(nVar, q1Var);
            if (B1 != null) {
                i10 = Math.max(i10, B1.x);
                i11 = Math.max(i11, B1.y);
                E1 = Math.max(E1, A1(nVar, q1Var.b().j0(i10).Q(i11).E()));
                StringBuilder sb3 = new StringBuilder(57);
                sb3.append("Codec max resolution adjusted to: ");
                sb3.append(i10);
                sb3.append("x");
                sb3.append(i11);
                s.i("MediaCodecVideoRenderer", sb3.toString());
            }
        }
        return new a(i10, i11, E1);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat F1(q1 q1Var, String str, a aVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> q10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", q1Var.Z);
        mediaFormat.setInteger("height", q1Var.f16899a0);
        c5.v.e(mediaFormat, q1Var.W);
        c5.v.c(mediaFormat, "frame-rate", q1Var.f16901b0);
        c5.v.d(mediaFormat, "rotation-degrees", q1Var.f16903c0);
        c5.v.b(mediaFormat, q1Var.f16907g0);
        if ("video/dolby-vision".equals(q1Var.U) && (q10 = v.q(q1Var)) != null) {
            c5.v.d(mediaFormat, "profile", ((Integer) q10.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f6281a);
        mediaFormat.setInteger("max-height", aVar.f6282b);
        c5.v.d(mediaFormat, "max-input-size", aVar.f6283c);
        if (l0.f4841a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            w1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    public boolean I1(long j10, boolean z10) {
        int S = S(j10);
        if (S == 0) {
            return false;
        }
        if (z10) {
            e eVar = this.f10544k1;
            eVar.f20477d += S;
            eVar.f20479f += this.K1;
        } else {
            this.f10544k1.f20483j++;
            e2(S, this.K1);
        }
        o0();
        return true;
    }

    @Override
    public void J() {
        u1();
        t1();
        this.A1 = false;
        this.W1 = null;
        try {
            super.J();
        } finally {
            this.f6272r1.m(this.f10544k1);
        }
    }

    public final void J1() {
        if (this.I1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f6272r1.n(this.I1, elapsedRealtime - this.H1);
            this.I1 = 0;
            this.H1 = elapsedRealtime;
        }
    }

    @Override
    public void K(boolean z10, boolean z11) {
        super.K(z10, z11);
        boolean z12 = D().f16641a;
        c5.a.f(!z12 || this.V1 != 0);
        if (this.U1 != z12) {
            this.U1 = z12;
            Y0();
        }
        this.f6272r1.o(this.f10544k1);
        this.D1 = z11;
        this.E1 = false;
    }

    public void K1() {
        this.E1 = true;
        if (!this.C1) {
            this.C1 = true;
            this.f6272r1.A(this.f6279y1);
            this.A1 = true;
        }
    }

    @Override
    public void L(long j10, boolean z10) {
        super.L(j10, z10);
        t1();
        this.f6271q1.j();
        this.L1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        this.J1 = 0;
        if (z10) {
            W1();
        } else {
            this.G1 = -9223372036854775807L;
        }
    }

    @Override
    public void L0(Exception exc) {
        s.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f6272r1.C(exc);
    }

    public final void L1() {
        int i10 = this.O1;
        if (i10 != 0) {
            this.f6272r1.B(this.N1, i10);
            this.N1 = 0L;
            this.O1 = 0;
        }
    }

    @Override
    @TargetApi(17)
    public void M() {
        try {
            super.M();
        } finally {
            if (this.f6280z1 != null) {
                S1();
            }
        }
    }

    @Override
    public void M0(String str, l.a aVar, long j10, long j11) {
        this.f6272r1.k(str, j10, j11);
        this.f6277w1 = v1(str);
        this.f6278x1 = ((n) c5.a.e(s0())).n();
        if (l0.f4841a >= 23 && this.U1) {
            this.W1 = new b((l) c5.a.e(r0()));
        }
    }

    public final void M1() {
        int i10 = this.P1;
        if (i10 != -1 || this.Q1 != -1) {
            b0 b0Var = this.T1;
            if (b0Var == null || b0Var.f6207a != i10 || b0Var.f6208b != this.Q1 || b0Var.f6209c != this.R1 || b0Var.M != this.S1) {
                b0 b0Var2 = new b0(this.P1, this.Q1, this.R1, this.S1);
                this.T1 = b0Var2;
                this.f6272r1.D(b0Var2);
            }
        }
    }

    @Override
    public void N() {
        super.N();
        this.I1 = 0;
        this.H1 = SystemClock.elapsedRealtime();
        this.M1 = SystemClock.elapsedRealtime() * 1000;
        this.N1 = 0L;
        this.O1 = 0;
        this.f6271q1.k();
    }

    @Override
    public void N0(String str) {
        this.f6272r1.l(str);
    }

    public final void N1() {
        if (this.A1) {
            this.f6272r1.A(this.f6279y1);
        }
    }

    @Override
    public void O() {
        this.G1 = -9223372036854775807L;
        J1();
        L1();
        this.f6271q1.l();
        super.O();
    }

    @Override
    public h O0(r1 r1Var) {
        h O0 = super.O0(r1Var);
        this.f6272r1.p(r1Var.f16947b, O0);
        return O0;
    }

    public final void O1() {
        b0 b0Var = this.T1;
        if (b0Var != null) {
            this.f6272r1.D(b0Var);
        }
    }

    @Override
    public void P0(q1 q1Var, MediaFormat mediaFormat) {
        int i10;
        int i11;
        l r02 = r0();
        if (r02 != null) {
            r02.i(this.B1);
        }
        if (this.U1) {
            this.P1 = q1Var.Z;
            this.Q1 = q1Var.f16899a0;
        } else {
            c5.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                i10 = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i10 = mediaFormat.getInteger("width");
            }
            this.P1 = i10;
            if (z10) {
                i11 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i11 = mediaFormat.getInteger("height");
            }
            this.Q1 = i11;
        }
        float f10 = q1Var.f16904d0;
        this.S1 = f10;
        if (l0.f4841a >= 21) {
            int i12 = q1Var.f16903c0;
            if (i12 == 90 || i12 == 270) {
                int i13 = this.P1;
                this.P1 = this.Q1;
                this.Q1 = i13;
                this.S1 = 1.0f / f10;
            }
        } else {
            this.R1 = q1Var.f16903c0;
        }
        this.f6271q1.g(q1Var.f16901b0);
    }

    public final void P1(long j10, long j11, q1 q1Var) {
        l lVar = this.X1;
        if (lVar != null) {
            lVar.g(j10, j11, q1Var, v0());
        }
    }

    @Override
    public void Q0(long j10) {
        super.Q0(j10);
        if (!this.U1) {
            this.K1--;
        }
    }

    public void Q1(long j10) {
        q1(j10);
        M1();
        this.f10544k1.f20478e++;
        K1();
        Q0(j10);
    }

    @Override
    public void R0() {
        super.R0();
        t1();
    }

    public final void R1() {
        f1();
    }

    @Override
    public void S0(g gVar) {
        boolean z10 = this.U1;
        if (!z10) {
            this.K1++;
        }
        if (l0.f4841a < 23 && z10) {
            Q1(gVar.N);
        }
    }

    public final void S1() {
        Surface surface = this.f6279y1;
        f fVar = this.f6280z1;
        if (surface == fVar) {
            this.f6279y1 = null;
        }
        fVar.release();
        this.f6280z1 = null;
    }

    public void T1(l lVar, int i10, long j10) {
        M1();
        j0.a("releaseOutputBuffer");
        lVar.h(i10, true);
        j0.c();
        this.M1 = SystemClock.elapsedRealtime() * 1000;
        this.f10544k1.f20478e++;
        this.J1 = 0;
        K1();
    }

    @Override
    public boolean U0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, q1 q1Var) {
        long j13;
        boolean z12;
        c5.a.e(lVar);
        if (this.F1 == -9223372036854775807L) {
            this.F1 = j10;
        }
        if (j12 != this.L1) {
            this.f6271q1.h(j12);
            this.L1 = j12;
        }
        long z02 = z0();
        long j14 = j12 - z02;
        if (!z10 || z11) {
            double A0 = A0();
            boolean z13 = i() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j15 = (long) ((j12 - j10) / A0);
            if (z13) {
                j15 -= elapsedRealtime - j11;
            }
            if (this.f6279y1 != this.f6280z1) {
                long j16 = elapsedRealtime - this.M1;
                if (this.E1 ? this.C1 : !z13 && !this.D1) {
                    j13 = j16;
                    z12 = false;
                } else {
                    j13 = j16;
                    z12 = true;
                }
                if (this.G1 == -9223372036854775807L && j10 >= z02 && (z12 || (z13 && b2(j15, j13)))) {
                    long nanoTime = System.nanoTime();
                    P1(j14, nanoTime, q1Var);
                    if (l0.f4841a >= 21) {
                        U1(lVar, i10, j14, nanoTime);
                    } else {
                        T1(lVar, i10, j14);
                    }
                    f2(j15);
                    return true;
                }
                if (z13 && j10 != this.F1) {
                    long nanoTime2 = System.nanoTime();
                    long b10 = this.f6271q1.b((j15 * 1000) + nanoTime2);
                    long j17 = (b10 - nanoTime2) / 1000;
                    boolean z14 = this.G1 != -9223372036854775807L;
                    if (Z1(j17, j11, z11) && I1(j10, z14)) {
                        return false;
                    }
                    if (a2(j17, j11, z11)) {
                        if (z14) {
                            d2(lVar, i10, j14);
                        } else {
                            y1(lVar, i10, j14);
                        }
                        f2(j17);
                        return true;
                    } else if (l0.f4841a >= 21) {
                        if (j17 < 50000) {
                            P1(j14, b10, q1Var);
                            U1(lVar, i10, j14, b10);
                            f2(j17);
                            return true;
                        }
                    } else if (j17 < 30000) {
                        if (j17 > 11000) {
                            try {
                                Thread.sleep((j17 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        P1(j14, b10, q1Var);
                        T1(lVar, i10, j14);
                        f2(j17);
                        return true;
                    }
                }
                return false;
            } else if (!G1(j15)) {
                return false;
            } else {
                d2(lVar, i10, j14);
                f2(j15);
                return true;
            }
        } else {
            d2(lVar, i10, j14);
            return true;
        }
    }

    public void U1(l lVar, int i10, long j10, long j11) {
        M1();
        j0.a("releaseOutputBuffer");
        lVar.e(i10, j11);
        j0.c();
        this.M1 = SystemClock.elapsedRealtime() * 1000;
        this.f10544k1.f20478e++;
        this.J1 = 0;
        K1();
    }

    @Override
    public h V(n nVar, q1 q1Var, q1 q1Var2) {
        h e10 = nVar.e(q1Var, q1Var2);
        int i10 = e10.f20495e;
        int i11 = q1Var2.Z;
        a aVar = this.f6276v1;
        if (i11 > aVar.f6281a || q1Var2.f16899a0 > aVar.f6282b) {
            i10 |= Log.TAG_CRASH;
        }
        if (E1(nVar, q1Var2) > this.f6276v1.f6283c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new h(nVar.f10511a, q1Var, q1Var2, i12 != 0 ? 0 : e10.f20494d, i12);
    }

    public final void W1() {
        this.G1 = this.f6273s1 > 0 ? SystemClock.elapsedRealtime() + this.f6273s1 : -9223372036854775807L;
    }

    public final void X1(Object obj) {
        f fVar = obj instanceof Surface ? (Surface) obj : null;
        if (fVar == null) {
            f fVar2 = this.f6280z1;
            if (fVar2 != null) {
                fVar = fVar2;
            } else {
                n s02 = s0();
                if (s02 != null && c2(s02)) {
                    fVar = f.c(this.f6270p1, s02.f10517g);
                    this.f6280z1 = fVar;
                }
            }
        }
        if (this.f6279y1 != fVar) {
            this.f6279y1 = fVar;
            this.f6271q1.m(fVar);
            this.A1 = false;
            int i10 = i();
            l r02 = r0();
            if (r02 != null) {
                if (l0.f4841a < 23 || fVar == null || this.f6277w1) {
                    Y0();
                    J0();
                } else {
                    Y1(r02, fVar);
                }
            }
            if (fVar == null || fVar == this.f6280z1) {
                u1();
                t1();
                return;
            }
            O1();
            t1();
            if (i10 == 2) {
                W1();
            }
        } else if (fVar != null && fVar != this.f6280z1) {
            O1();
            N1();
        }
    }

    public void Y1(l lVar, Surface surface) {
        lVar.l(surface);
    }

    public boolean Z1(long j10, long j11, boolean z10) {
        return H1(j10) && !z10;
    }

    @Override
    public void a1() {
        super.a1();
        this.K1 = 0;
    }

    public boolean a2(long j10, long j11, boolean z10) {
        return G1(j10) && !z10;
    }

    @Override
    public String b() {
        return "MediaCodecVideoRenderer";
    }

    public boolean b2(long j10, long j11) {
        return G1(j10) && j11 > 100000;
    }

    public final boolean c2(n nVar) {
        return l0.f4841a >= 23 && !this.U1 && !v1(nVar.f10511a) && (!nVar.f10517g || f.b(this.f6270p1));
    }

    public void d2(l lVar, int i10, long j10) {
        j0.a("skipVideoBuffer");
        lVar.h(i10, false);
        j0.c();
        this.f10544k1.f20479f++;
    }

    public void e2(int i10, int i11) {
        e eVar = this.f10544k1;
        eVar.f20481h += i10;
        int i12 = i10 + i11;
        eVar.f20480g += i12;
        this.I1 += i12;
        int i13 = this.J1 + i12;
        this.J1 = i13;
        eVar.f20482i = Math.max(i13, eVar.f20482i);
        int i14 = this.f6274t1;
        if (i14 > 0 && this.I1 >= i14) {
            J1();
        }
    }

    @Override
    public boolean f() {
        f fVar;
        if (super.f() && (this.C1 || (((fVar = this.f6280z1) != null && this.f6279y1 == fVar) || r0() == null || this.U1))) {
            this.G1 = -9223372036854775807L;
            return true;
        } else if (this.G1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.G1) {
                return true;
            }
            this.G1 = -9223372036854775807L;
            return false;
        }
    }

    @Override
    public m f0(Throwable th, n nVar) {
        return new i(th, nVar, this.f6279y1);
    }

    public void f2(long j10) {
        this.f10544k1.a(j10);
        this.N1 += j10;
        this.O1++;
    }

    @Override
    public boolean j1(n nVar) {
        return this.f6279y1 != null || c2(nVar);
    }

    @Override
    public int m1(e4.q qVar, q1 q1Var) {
        boolean z10;
        int i10 = 0;
        if (!w.k(q1Var.U)) {
            return c3.a(0);
        }
        boolean z11 = q1Var.X != null;
        List<n> D1 = D1(qVar, q1Var, z11, false);
        if (z11 && D1.isEmpty()) {
            D1 = D1(qVar, q1Var, false, false);
        }
        if (D1.isEmpty()) {
            return c3.a(1);
        }
        if (!o.n1(q1Var)) {
            return c3.a(2);
        }
        n nVar = D1.get(0);
        boolean m10 = nVar.m(q1Var);
        if (!m10) {
            for (int i11 = 1; i11 < D1.size(); i11++) {
                n nVar2 = D1.get(i11);
                if (nVar2.m(q1Var)) {
                    nVar = nVar2;
                    z10 = false;
                    m10 = true;
                    break;
                }
            }
        }
        z10 = true;
        int i12 = m10 ? 4 : 3;
        int i13 = nVar.p(q1Var) ? 16 : 8;
        int i14 = nVar.f10518h ? 64 : 0;
        int i15 = z10 ? Log.TAG_YOUTUBE : 0;
        if (m10) {
            List<n> D12 = D1(qVar, q1Var, z11, true);
            if (!D12.isEmpty()) {
                n nVar3 = v.u(D12, q1Var).get(0);
                if (nVar3.m(q1Var) && nVar3.p(q1Var)) {
                    i10 = 32;
                }
            }
        }
        return c3.c(i12, i13, i10, i14, i15);
    }

    @Override
    public void p(float f10, float f11) {
        super.p(f10, f11);
        this.f6271q1.i(f10);
    }

    @Override
    public void t(int i10, Object obj) {
        if (i10 == 1) {
            X1(obj);
        } else if (i10 == 7) {
            this.X1 = (l) obj;
        } else if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.V1 != intValue) {
                this.V1 = intValue;
                if (this.U1) {
                    Y0();
                }
            }
        } else if (i10 == 4) {
            this.B1 = ((Integer) obj).intValue();
            l r02 = r0();
            if (r02 != null) {
                r02.i(this.B1);
            }
        } else if (i10 != 5) {
            super.t(i10, obj);
        } else {
            this.f6271q1.o(((Integer) obj).intValue());
        }
    }

    @Override
    public boolean t0() {
        return this.U1 && l0.f4841a < 23;
    }

    public final void t1() {
        l r02;
        this.C1 = false;
        if (l0.f4841a >= 23 && this.U1 && (r02 = r0()) != null) {
            this.W1 = new b(r02);
        }
    }

    @Override
    public float u0(float f10, q1 q1Var, q1[] q1VarArr) {
        float f11 = -1.0f;
        for (q1 q1Var2 : q1VarArr) {
            float f12 = q1Var2.f16901b0;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    public final void u1() {
        this.T1 = null;
    }

    public boolean v1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (j.class) {
            if (!Z1) {
                f6269a2 = z1();
                Z1 = true;
            }
        }
        return f6269a2;
    }

    @Override
    public List<n> w0(e4.q qVar, q1 q1Var, boolean z10) {
        return v.u(D1(qVar, q1Var, z10, this.U1), q1Var);
    }

    @Override
    @TargetApi(17)
    public l.a y0(n nVar, q1 q1Var, MediaCrypto mediaCrypto, float f10) {
        f fVar = this.f6280z1;
        if (!(fVar == null || fVar.f6242a == nVar.f10517g)) {
            S1();
        }
        String str = nVar.f10513c;
        a C1 = C1(nVar, q1Var, H());
        this.f6276v1 = C1;
        MediaFormat F1 = F1(q1Var, str, C1, f10, this.f6275u1, this.U1 ? this.V1 : 0);
        if (this.f6279y1 == null) {
            if (c2(nVar)) {
                if (this.f6280z1 == null) {
                    this.f6280z1 = f.c(this.f6270p1, nVar.f10517g);
                }
                this.f6279y1 = this.f6280z1;
            } else {
                throw new IllegalStateException();
            }
        }
        return l.a.b(nVar, F1, q1Var, this.f6279y1, mediaCrypto);
    }

    public void y1(l lVar, int i10, long j10) {
        j0.a("dropVideoBuffer");
        lVar.h(i10, false);
        j0.c();
        e2(0, 1);
    }

    public j(Context context, l.b bVar, e4.q qVar, long j10, boolean z10, Handler handler, z zVar, int i10, float f10) {
        super(2, bVar, qVar, z10, f10);
        this.f6273s1 = j10;
        this.f6274t1 = i10;
        Context applicationContext = context.getApplicationContext();
        this.f6270p1 = applicationContext;
        this.f6271q1 = new n(applicationContext);
        this.f6272r1 = new z.a(handler, zVar);
        this.f6275u1 = x1();
        this.G1 = -9223372036854775807L;
        this.P1 = -1;
        this.Q1 = -1;
        this.S1 = -1.0f;
        this.B1 = 1;
        this.V1 = 0;
        u1();
    }
}
