package e4;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import c5.h0;
import c5.j0;
import c5.l0;
import c5.s;
import c5.x;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import e4.l;
import e4.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import m3.f;
import m3.i;
import m3.q;
import m3.q1;
import m3.r1;
import n3.p1;
import p3.e;
import p3.g;
import p3.h;
import q3.n;
import q3.o;

public abstract class o extends f {
    public static final byte[] f10522o1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public n A0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public i M0;
    public ByteBuffer Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public final l.b W;
    public boolean W0;
    public final q X;
    public final boolean Y;
    public final float Z;
    public boolean f10524a1;
    public boolean f10526b1;
    public boolean f10528c1;
    public final h f10529d0;
    public boolean f10534f1;
    public boolean f10536g1;
    public boolean f10538h1;
    public boolean f10540i1;
    public q f10542j1;
    public q1 f10543k0;
    public e f10544k1;
    public q1 f10545l0;
    public q3.o f10547m0;
    public q3.o f10549n0;
    public int f10550n1;
    public MediaCrypto f10551o0;
    public boolean f10552p0;
    public l f10556t0;
    public q1 f10557u0;
    public MediaFormat f10558v0;
    public boolean f10559w0;
    public ArrayDeque<n> f10561y0;
    public b f10562z0;
    public final g f10523a0 = g.i();
    public final g f10525b0 = new g(0);
    public final g f10527c0 = new g(2);
    public final h0<q1> f10531e0 = new h0<>();
    public final ArrayList<Long> f10533f0 = new ArrayList<>();
    public final MediaCodec.BufferInfo f10535g0 = new MediaCodec.BufferInfo();
    public float f10554r0 = 1.0f;
    public float f10555s0 = 1.0f;
    public long f10553q0 = -9223372036854775807L;
    public final long[] f10537h0 = new long[10];
    public final long[] f10539i0 = new long[10];
    public final long[] f10541j0 = new long[10];
    public long f10546l1 = -9223372036854775807L;
    public long f10548m1 = -9223372036854775807L;
    public float f10560x0 = -1.0f;
    public int B0 = 0;
    public int X0 = 0;
    public int O0 = -1;
    public int P0 = -1;
    public long N0 = -9223372036854775807L;
    public long f10530d1 = -9223372036854775807L;
    public long f10532e1 = -9223372036854775807L;
    public int Y0 = 0;
    public int Z0 = 0;

    public static final class a {
        public static void a(l.a aVar, p1 p1Var) {
            LogSessionId a10 = p1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                aVar.f10504b.setString("log-session-id", a10.getStringId());
            }
        }
    }

    public o(int i10, l.b bVar, q qVar, boolean z10, float f10) {
        super(i10);
        this.W = bVar;
        this.X = (q) c5.a.e(qVar);
        this.Y = z10;
        this.Z = f10;
        h hVar = new h();
        this.f10529d0 = hVar;
        hVar.f(0);
        hVar.f20488c.order(ByteOrder.nativeOrder());
    }

    public static boolean G0(IllegalStateException illegalStateException) {
        if (l0.f4841a >= 21 && H0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean H0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean I0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    @TargetApi(23)
    private void T0() {
        int i10 = this.Z0;
        if (i10 == 1) {
            n0();
        } else if (i10 == 2) {
            n0();
            p1();
        } else if (i10 != 3) {
            this.f10536g1 = true;
            Z0();
        } else {
            X0();
        }
    }

    public static boolean X(String str, q1 q1Var) {
        return l0.f4841a < 21 && q1Var.W.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean Y(String str) {
        if (l0.f4841a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(l0.f4843c)) {
            String str2 = l0.f4842b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean Z(String str) {
        int i10 = l0.f4841a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = l0.f4842b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean a0(String str) {
        return l0.f4841a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean b0(n nVar) {
        String str = nVar.f10511a;
        int i10 = l0.f4841a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(l0.f4843c) && "AFTS".equals(l0.f4844d) && nVar.f10517g));
    }

    public static boolean c0(String str) {
        int i10 = l0.f4841a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && l0.f4844d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean d0(String str, q1 q1Var) {
        return l0.f4841a <= 18 && q1Var.f16908h0 == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static boolean e0(String str) {
        return l0.f4841a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void h1(q3.o oVar) {
        n.a(this.f10549n0, oVar);
        this.f10549n0 = oVar;
    }

    private boolean m0() {
        int i10;
        if (this.f10556t0 == null || (i10 = this.Y0) == 2 || this.f10534f1) {
            return false;
        }
        if (i10 == 0 && k1()) {
            i0();
        }
        if (this.O0 < 0) {
            int f10 = this.f10556t0.f();
            this.O0 = f10;
            if (f10 < 0) {
                return false;
            }
            this.f10525b0.f20488c = this.f10556t0.k(f10);
            this.f10525b0.clear();
        }
        if (this.Y0 == 1) {
            if (!this.L0) {
                this.f10526b1 = true;
                this.f10556t0.m(this.O0, 0, 0, 0L, 4);
                c1();
            }
            this.Y0 = 2;
            return false;
        } else if (this.J0) {
            this.J0 = false;
            ByteBuffer byteBuffer = this.f10525b0.f20488c;
            byte[] bArr = f10522o1;
            byteBuffer.put(bArr);
            this.f10556t0.m(this.O0, 0, bArr.length, 0L, 0);
            c1();
            this.f10524a1 = true;
            return true;
        } else {
            if (this.X0 == 1) {
                for (int i11 = 0; i11 < this.f10557u0.W.size(); i11++) {
                    this.f10525b0.f20488c.put(this.f10557u0.W.get(i11));
                }
                this.X0 = 2;
            }
            int position = this.f10525b0.f20488c.position();
            r1 E = E();
            try {
                int Q = Q(E, this.f10525b0, 0);
                if (l()) {
                    this.f10532e1 = this.f10530d1;
                }
                if (Q == -3) {
                    return false;
                }
                if (Q == -5) {
                    if (this.X0 == 2) {
                        this.f10525b0.clear();
                        this.X0 = 1;
                    }
                    O0(E);
                    return true;
                } else if (this.f10525b0.isEndOfStream()) {
                    if (this.X0 == 2) {
                        this.f10525b0.clear();
                        this.X0 = 1;
                    }
                    this.f10534f1 = true;
                    if (!this.f10524a1) {
                        T0();
                        return false;
                    }
                    try {
                        if (!this.L0) {
                            this.f10526b1 = true;
                            this.f10556t0.m(this.O0, 0, 0, 0L, 4);
                            c1();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw B(e10, this.f10543k0, l0.O(e10.getErrorCode()));
                    }
                } else if (this.f10524a1 || this.f10525b0.isKeyFrame()) {
                    boolean h10 = this.f10525b0.h();
                    if (h10) {
                        this.f10525b0.f20487b.b(position);
                    }
                    if (this.C0 && !h10) {
                        x.b(this.f10525b0.f20488c);
                        if (this.f10525b0.f20488c.position() == 0) {
                            return true;
                        }
                        this.C0 = false;
                    }
                    g gVar = this.f10525b0;
                    long j10 = gVar.N;
                    i iVar = this.M0;
                    if (iVar != null) {
                        j10 = iVar.d(this.f10543k0, gVar);
                        this.f10530d1 = Math.max(this.f10530d1, this.M0.b(this.f10543k0));
                    }
                    long j11 = j10;
                    if (this.f10525b0.isDecodeOnly()) {
                        this.f10533f0.add(Long.valueOf(j11));
                    }
                    if (this.f10538h1) {
                        this.f10531e0.a(j11, this.f10543k0);
                        this.f10538h1 = false;
                    }
                    this.f10530d1 = Math.max(this.f10530d1, j11);
                    this.f10525b0.g();
                    if (this.f10525b0.hasSupplementalData()) {
                        B0(this.f10525b0);
                    }
                    S0(this.f10525b0);
                    try {
                        if (h10) {
                            this.f10556t0.j(this.O0, 0, this.f10525b0.f20487b, j11, 0);
                        } else {
                            this.f10556t0.m(this.O0, 0, this.f10525b0.f20488c.limit(), j11, 0);
                        }
                        c1();
                        this.f10524a1 = true;
                        this.X0 = 0;
                        this.f10544k1.f20476c++;
                        return true;
                    } catch (MediaCodec.CryptoException e11) {
                        throw B(e11, this.f10543k0, l0.O(e11.getErrorCode()));
                    }
                } else {
                    this.f10525b0.clear();
                    if (this.X0 == 2) {
                        this.X0 = 1;
                    }
                    return true;
                }
            } catch (g.a e12) {
                L0(e12);
                W0(0);
                n0();
                return true;
            }
        }
    }

    public static boolean n1(q1 q1Var) {
        int i10 = q1Var.f16914n0;
        return i10 == 0 || i10 == 2;
    }

    public float A0() {
        return this.f10554r0;
    }

    public void B0(g gVar) {
    }

    public final boolean C0() {
        return this.P0 >= 0;
    }

    public final void D0(q1 q1Var) {
        g0();
        String str = q1Var.U;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f10529d0.q(32);
        } else {
            this.f10529d0.q(1);
        }
        this.T0 = true;
    }

    public final void E0(n nVar, MediaCrypto mediaCrypto) {
        String str = nVar.f10511a;
        int i10 = l0.f4841a;
        float f10 = -1.0f;
        float u02 = i10 < 23 ? -1.0f : u0(this.f10555s0, this.f10543k0, H());
        if (u02 > this.Z) {
            f10 = u02;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l.a y02 = y0(nVar, this.f10543k0, mediaCrypto, f10);
        if (i10 >= 31) {
            a.a(y02, G());
        }
        try {
            String valueOf = String.valueOf(str);
            j0.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            this.f10556t0 = this.W.a(y02);
            j0.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.A0 = nVar;
            this.f10560x0 = f10;
            this.f10557u0 = this.f10543k0;
            this.B0 = W(str);
            this.C0 = X(str, this.f10557u0);
            this.D0 = c0(str);
            this.E0 = e0(str);
            this.F0 = Z(str);
            this.G0 = a0(str);
            this.H0 = Y(str);
            this.I0 = d0(str, this.f10557u0);
            boolean z10 = false;
            this.L0 = b0(nVar) || t0();
            if (this.f10556t0.b()) {
                this.W0 = true;
                this.X0 = 1;
                if (this.B0 != 0) {
                    z10 = true;
                }
                this.J0 = z10;
            }
            if ("c2.android.mp3.decoder".equals(nVar.f10511a)) {
                this.M0 = new i();
            }
            if (i() == 2) {
                this.N0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f10544k1.f20474a++;
            M0(str, y02, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            j0.c();
            throw th;
        }
    }

    public final boolean F0(long j10) {
        int size = this.f10533f0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10533f0.get(i10).longValue() == j10) {
                this.f10533f0.remove(i10);
                return true;
            }
        }
        return false;
    }

    @Override
    public void J() {
        this.f10543k0 = null;
        this.f10546l1 = -9223372036854775807L;
        this.f10548m1 = -9223372036854775807L;
        this.f10550n1 = 0;
        p0();
    }

    public final void J0() {
        q1 q1Var;
        if (this.f10556t0 == null && !this.T0 && (q1Var = this.f10543k0) != null) {
            if (this.f10549n0 != null || !l1(q1Var)) {
                e1(this.f10549n0);
                String str = this.f10543k0.U;
                q3.o oVar = this.f10547m0;
                if (oVar != null) {
                    if (this.f10551o0 == null) {
                        q3.h0 x02 = x0(oVar);
                        if (x02 != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(x02.f21319a, x02.f21320b);
                                this.f10551o0 = mediaCrypto;
                                this.f10552p0 = !x02.f21321c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e10) {
                                throw B(e10, this.f10543k0, 6006);
                            }
                        } else if (this.f10547m0.g() == null) {
                            return;
                        }
                    }
                    if (q3.h0.f21318d) {
                        int i10 = this.f10547m0.i();
                        if (i10 == 1) {
                            o.a aVar = (o.a) c5.a.e(this.f10547m0.g());
                            throw B(aVar, this.f10543k0, aVar.f21348a);
                        } else if (i10 != 4) {
                            return;
                        }
                    }
                }
                try {
                    K0(this.f10551o0, this.f10552p0);
                } catch (b e11) {
                    throw B(e11, this.f10543k0, 4001);
                }
            } else {
                D0(this.f10543k0);
            }
        }
    }

    @Override
    public void K(boolean z10, boolean z11) {
        this.f10544k1 = new e();
    }

    public final void K0(android.media.MediaCrypto r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: e4.o.K0(android.media.MediaCrypto, boolean):void");
    }

    @Override
    public void L(long j10, boolean z10) {
        this.f10534f1 = false;
        this.f10536g1 = false;
        this.f10540i1 = false;
        if (this.T0) {
            this.f10529d0.clear();
            this.f10527c0.clear();
            this.U0 = false;
        } else {
            o0();
        }
        if (this.f10531e0.l() > 0) {
            this.f10538h1 = true;
        }
        this.f10531e0.c();
        int i10 = this.f10550n1;
        if (i10 != 0) {
            this.f10548m1 = this.f10539i0[i10 - 1];
            this.f10546l1 = this.f10537h0[i10 - 1];
            this.f10550n1 = 0;
        }
    }

    public abstract void L0(Exception exc);

    @Override
    public void M() {
        try {
            g0();
            Y0();
        } finally {
            h1(null);
        }
    }

    public abstract void M0(String str, l.a aVar, long j10, long j11);

    @Override
    public void N() {
    }

    public abstract void N0(String str);

    @Override
    public void O() {
    }

    public p3.h O0(m3.r1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: e4.o.O0(m3.r1):p3.h");
    }

    @Override
    public void P(q1[] q1VarArr, long j10, long j11) {
        boolean z10 = true;
        if (this.f10548m1 == -9223372036854775807L) {
            if (this.f10546l1 != -9223372036854775807L) {
                z10 = false;
            }
            c5.a.f(z10);
            this.f10546l1 = j10;
            this.f10548m1 = j11;
            return;
        }
        int i10 = this.f10550n1;
        long[] jArr = this.f10539i0;
        if (i10 == jArr.length) {
            long j12 = jArr[i10 - 1];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j12);
            s.i("MediaCodecRenderer", sb2.toString());
        } else {
            this.f10550n1 = i10 + 1;
        }
        long[] jArr2 = this.f10537h0;
        int i11 = this.f10550n1;
        jArr2[i11 - 1] = j10;
        this.f10539i0[i11 - 1] = j11;
        this.f10541j0[i11 - 1] = this.f10530d1;
    }

    public abstract void P0(q1 q1Var, MediaFormat mediaFormat);

    public void Q0(long j10) {
        while (true) {
            int i10 = this.f10550n1;
            if (i10 != 0 && j10 >= this.f10541j0[0]) {
                long[] jArr = this.f10537h0;
                this.f10546l1 = jArr[0];
                this.f10548m1 = this.f10539i0[0];
                int i11 = i10 - 1;
                this.f10550n1 = i11;
                System.arraycopy(jArr, 1, jArr, 0, i11);
                long[] jArr2 = this.f10539i0;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f10550n1);
                long[] jArr3 = this.f10541j0;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f10550n1);
                R0();
            } else {
                return;
            }
        }
    }

    public void R0() {
    }

    public abstract void S0(g gVar);

    public final void T() {
        c5.a.f(!this.f10534f1);
        r1 E = E();
        this.f10527c0.clear();
        do {
            this.f10527c0.clear();
            int Q = Q(E, this.f10527c0, 0);
            if (Q == -5) {
                O0(E);
                return;
            } else if (Q != -4) {
                if (Q != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f10527c0.isEndOfStream()) {
                this.f10534f1 = true;
                return;
            } else {
                if (this.f10538h1) {
                    q1 q1Var = (q1) c5.a.e(this.f10543k0);
                    this.f10545l0 = q1Var;
                    P0(q1Var, null);
                    this.f10538h1 = false;
                }
                this.f10527c0.g();
            }
        } while (this.f10529d0.k(this.f10527c0));
        this.U0 = true;
    }

    public final boolean U(long j10, long j11) {
        c5.a.f(!this.f10536g1);
        if (this.f10529d0.p()) {
            h hVar = this.f10529d0;
            if (!U0(j10, j11, null, hVar.f20488c, this.P0, 0, hVar.o(), this.f10529d0.m(), this.f10529d0.isDecodeOnly(), this.f10529d0.isEndOfStream(), this.f10545l0)) {
                return false;
            }
            Q0(this.f10529d0.n());
            this.f10529d0.clear();
        }
        if (this.f10534f1) {
            this.f10536g1 = true;
            return false;
        }
        if (this.U0) {
            c5.a.f(this.f10529d0.k(this.f10527c0));
            this.U0 = false;
        }
        if (this.V0) {
            if (this.f10529d0.p()) {
                return true;
            }
            g0();
            this.V0 = false;
            J0();
            if (!this.T0) {
                return false;
            }
        }
        T();
        if (this.f10529d0.p()) {
            this.f10529d0.g();
        }
        return this.f10529d0.p() || this.f10534f1 || this.V0;
    }

    public abstract boolean U0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, q1 q1Var);

    public abstract h V(n nVar, q1 q1Var, q1 q1Var2);

    public final void V0() {
        this.f10528c1 = true;
        MediaFormat c10 = this.f10556t0.c();
        if (this.B0 != 0 && c10.getInteger("width") == 32 && c10.getInteger("height") == 32) {
            this.K0 = true;
            return;
        }
        if (this.I0) {
            c10.setInteger("channel-count", 1);
        }
        this.f10558v0 = c10;
        this.f10559w0 = true;
    }

    public final int W(String str) {
        int i10 = l0.f4841a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = l0.f4844d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = l0.f4842b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public final boolean W0(int i10) {
        r1 E = E();
        this.f10523a0.clear();
        int Q = Q(E, this.f10523a0, i10 | 4);
        if (Q == -5) {
            O0(E);
            return true;
        } else if (Q != -4 || !this.f10523a0.isEndOfStream()) {
            return false;
        } else {
            this.f10534f1 = true;
            T0();
            return false;
        }
    }

    public final void X0() {
        Y0();
        J0();
    }

    public void Y0() {
        try {
            l lVar = this.f10556t0;
            if (lVar != null) {
                lVar.a();
                this.f10544k1.f20475b++;
                N0(this.A0.f10511a);
            }
            this.f10556t0 = null;
            try {
                MediaCrypto mediaCrypto = this.f10551o0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f10556t0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f10551o0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void Z0() {
    }

    @Override
    public final int a(q1 q1Var) {
        try {
            return m1(this.X, q1Var);
        } catch (v.c e10) {
            throw B(e10, q1Var, 4002);
        }
    }

    public void a1() {
        c1();
        d1();
        this.N0 = -9223372036854775807L;
        this.f10526b1 = false;
        this.f10524a1 = false;
        this.J0 = false;
        this.K0 = false;
        this.R0 = false;
        this.S0 = false;
        this.f10533f0.clear();
        this.f10530d1 = -9223372036854775807L;
        this.f10532e1 = -9223372036854775807L;
        i iVar = this.M0;
        if (iVar != null) {
            iVar.c();
        }
        this.Y0 = 0;
        this.Z0 = 0;
        this.X0 = this.W0 ? 1 : 0;
    }

    public void b1() {
        a1();
        this.f10542j1 = null;
        this.M0 = null;
        this.f10561y0 = null;
        this.A0 = null;
        this.f10557u0 = null;
        this.f10558v0 = null;
        this.f10559w0 = false;
        this.f10528c1 = false;
        this.f10560x0 = -1.0f;
        this.B0 = 0;
        this.C0 = false;
        this.D0 = false;
        this.E0 = false;
        this.F0 = false;
        this.G0 = false;
        this.H0 = false;
        this.I0 = false;
        this.L0 = false;
        this.W0 = false;
        this.X0 = 0;
        this.f10552p0 = false;
    }

    public final void c1() {
        this.O0 = -1;
        this.f10525b0.f20488c = null;
    }

    public final void d1() {
        this.P0 = -1;
        this.Q0 = null;
    }

    @Override
    public boolean e() {
        return this.f10536g1;
    }

    public final void e1(q3.o oVar) {
        n.a(this.f10547m0, oVar);
        this.f10547m0 = oVar;
    }

    @Override
    public boolean f() {
        return this.f10543k0 != null && (I() || C0() || (this.N0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.N0));
    }

    public m f0(Throwable th, n nVar) {
        return new m(th, nVar);
    }

    public final void f1() {
        this.f10540i1 = true;
    }

    public final void g0() {
        this.V0 = false;
        this.f10529d0.clear();
        this.f10527c0.clear();
        this.U0 = false;
        this.T0 = false;
    }

    public final void g1(q qVar) {
        this.f10542j1 = qVar;
    }

    public final boolean h0() {
        if (this.f10524a1) {
            this.Y0 = 1;
            if (this.D0 || this.F0) {
                this.Z0 = 3;
                return false;
            }
            this.Z0 = 1;
        }
        return true;
    }

    public final void i0() {
        if (this.f10524a1) {
            this.Y0 = 1;
            this.Z0 = 3;
            return;
        }
        X0();
    }

    public final boolean i1(long j10) {
        return this.f10553q0 == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.f10553q0;
    }

    @TargetApi(23)
    public final boolean j0() {
        if (this.f10524a1) {
            this.Y0 = 1;
            if (this.D0 || this.F0) {
                this.Z0 = 3;
                return false;
            }
            this.Z0 = 2;
        } else {
            p1();
        }
        return true;
    }

    public boolean j1(n nVar) {
        return true;
    }

    public final boolean k0(long j10, long j11) {
        boolean z10;
        boolean z11;
        int i10;
        if (!C0()) {
            if (!this.G0 || !this.f10526b1) {
                i10 = this.f10556t0.g(this.f10535g0);
            } else {
                try {
                    i10 = this.f10556t0.g(this.f10535g0);
                } catch (IllegalStateException unused) {
                    T0();
                    if (this.f10536g1) {
                        Y0();
                    }
                    return false;
                }
            }
            if (i10 < 0) {
                if (i10 == -2) {
                    V0();
                    return true;
                }
                if (this.L0 && (this.f10534f1 || this.Y0 == 2)) {
                    T0();
                }
                return false;
            } else if (this.K0) {
                this.K0 = false;
                this.f10556t0.h(i10, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo = this.f10535g0;
                if (bufferInfo.size != 0 || (bufferInfo.flags & 4) == 0) {
                    this.P0 = i10;
                    ByteBuffer n10 = this.f10556t0.n(i10);
                    this.Q0 = n10;
                    if (n10 != null) {
                        n10.position(this.f10535g0.offset);
                        ByteBuffer byteBuffer = this.Q0;
                        MediaCodec.BufferInfo bufferInfo2 = this.f10535g0;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                    }
                    if (this.H0) {
                        MediaCodec.BufferInfo bufferInfo3 = this.f10535g0;
                        if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                            long j12 = this.f10530d1;
                            if (j12 != -9223372036854775807L) {
                                bufferInfo3.presentationTimeUs = j12;
                            }
                        }
                    }
                    this.R0 = F0(this.f10535g0.presentationTimeUs);
                    long j13 = this.f10532e1;
                    long j14 = this.f10535g0.presentationTimeUs;
                    this.S0 = j13 == j14;
                    q1(j14);
                } else {
                    T0();
                    return false;
                }
            }
        }
        if (!this.G0 || !this.f10526b1) {
            z10 = false;
            l lVar = this.f10556t0;
            ByteBuffer byteBuffer2 = this.Q0;
            int i11 = this.P0;
            MediaCodec.BufferInfo bufferInfo4 = this.f10535g0;
            z11 = U0(j10, j11, lVar, byteBuffer2, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.R0, this.S0, this.f10545l0);
        } else {
            try {
                l lVar2 = this.f10556t0;
                ByteBuffer byteBuffer3 = this.Q0;
                int i12 = this.P0;
                MediaCodec.BufferInfo bufferInfo5 = this.f10535g0;
                z10 = false;
                try {
                    z11 = U0(j10, j11, lVar2, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.R0, this.S0, this.f10545l0);
                } catch (IllegalStateException unused2) {
                    T0();
                    if (this.f10536g1) {
                        Y0();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        }
        if (z11) {
            Q0(this.f10535g0.presentationTimeUs);
            boolean z12 = (this.f10535g0.flags & 4) != 0;
            d1();
            if (!z12) {
                return true;
            }
            T0();
        }
        return z10;
    }

    public boolean k1() {
        return false;
    }

    public final boolean l0(n nVar, q1 q1Var, q3.o oVar, q3.o oVar2) {
        q3.h0 x02;
        if (oVar == oVar2) {
            return false;
        }
        if (oVar2 == null || oVar == null || l0.f4841a < 23) {
            return true;
        }
        UUID uuid = i.f16680e;
        if (uuid.equals(oVar.b()) || uuid.equals(oVar2.b()) || (x02 = x0(oVar2)) == null) {
            return true;
        }
        return !nVar.f10517g && (x02.f21321c ? false : oVar2.f(q1Var.U));
    }

    public boolean l1(q1 q1Var) {
        return false;
    }

    public abstract int m1(q qVar, q1 q1Var);

    public final void n0() {
        try {
            this.f10556t0.flush();
        } finally {
            a1();
        }
    }

    public final boolean o0() {
        boolean p02 = p0();
        if (p02) {
            J0();
        }
        return p02;
    }

    public final boolean o1(q1 q1Var) {
        if (!(l0.f4841a < 23 || this.f10556t0 == null || this.Z0 == 3 || i() == 0)) {
            float u02 = u0(this.f10555s0, q1Var, H());
            float f10 = this.f10560x0;
            if (f10 == u02) {
                return true;
            }
            if (u02 == -1.0f) {
                i0();
                return false;
            } else if (f10 == -1.0f && u02 <= this.Z) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", u02);
                this.f10556t0.d(bundle);
                this.f10560x0 = u02;
            }
        }
        return true;
    }

    @Override
    public void p(float f10, float f11) {
        this.f10554r0 = f10;
        this.f10555s0 = f11;
        o1(this.f10557u0);
    }

    public boolean p0() {
        if (this.f10556t0 == null) {
            return false;
        }
        if (this.Z0 == 3 || this.D0 || ((this.E0 && !this.f10528c1) || (this.F0 && this.f10526b1))) {
            Y0();
            return true;
        }
        n0();
        return false;
    }

    public final void p1() {
        try {
            this.f10551o0.setMediaDrmSession(x0(this.f10549n0).f21320b);
            e1(this.f10549n0);
            this.Y0 = 0;
            this.Z0 = 0;
        } catch (MediaCryptoException e10) {
            throw B(e10, this.f10543k0, 6006);
        }
    }

    @Override
    public final int q() {
        return 8;
    }

    public final List<n> q0(boolean z10) {
        List<n> w02 = w0(this.X, this.f10543k0, z10);
        if (w02.isEmpty() && z10) {
            w02 = w0(this.X, this.f10543k0, false);
            if (!w02.isEmpty()) {
                String str = this.f10543k0.U;
                String valueOf = String.valueOf(w02);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 99 + valueOf.length());
                sb2.append("Drm session requires secure decoder for ");
                sb2.append(str);
                sb2.append(", but no secure decoder available. Trying to proceed with ");
                sb2.append(valueOf);
                sb2.append(".");
                s.i("MediaCodecRenderer", sb2.toString());
            }
        }
        return w02;
    }

    public final void q1(long j10) {
        boolean z10;
        q1 j11 = this.f10531e0.j(j10);
        if (j11 == null && this.f10559w0) {
            j11 = this.f10531e0.i();
        }
        if (j11 != null) {
            this.f10545l0 = j11;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.f10559w0 && this.f10545l0 != null)) {
            P0(this.f10545l0, this.f10558v0);
            this.f10559w0 = false;
        }
    }

    @Override
    public void r(long j10, long j11) {
        boolean z10 = false;
        if (this.f10540i1) {
            this.f10540i1 = false;
            T0();
        }
        q qVar = this.f10542j1;
        if (qVar == null) {
            try {
                if (this.f10536g1) {
                    Z0();
                } else if (this.f10543k0 != null || W0(2)) {
                    J0();
                    if (this.T0) {
                        j0.a("bypassRender");
                        while (U(j10, j11)) {
                        }
                        j0.c();
                    } else if (this.f10556t0 != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        j0.a("drainAndFeed");
                        while (k0(j10, j11) && i1(elapsedRealtime)) {
                        }
                        while (m0() && i1(elapsedRealtime)) {
                        }
                        j0.c();
                    } else {
                        this.f10544k1.f20477d += S(j10);
                        W0(1);
                    }
                    this.f10544k1.c();
                }
            } catch (IllegalStateException e10) {
                if (G0(e10)) {
                    L0(e10);
                    if (l0.f4841a >= 21 && I0(e10)) {
                        z10 = true;
                    }
                    if (z10) {
                        Y0();
                    }
                    throw C(f0(e10, s0()), this.f10543k0, z10, 4003);
                }
                throw e10;
            }
        } else {
            this.f10542j1 = null;
            throw qVar;
        }
    }

    public final l r0() {
        return this.f10556t0;
    }

    public final n s0() {
        return this.A0;
    }

    public boolean t0() {
        return false;
    }

    public abstract float u0(float f10, q1 q1Var, q1[] q1VarArr);

    public final MediaFormat v0() {
        return this.f10558v0;
    }

    public abstract List<n> w0(q qVar, q1 q1Var, boolean z10);

    public final q3.h0 x0(q3.o oVar) {
        CryptoConfig h10 = oVar.h();
        if (h10 == null || (h10 instanceof q3.h0)) {
            return (q3.h0) h10;
        }
        String valueOf = String.valueOf(h10);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 43);
        sb2.append("Expecting FrameworkCryptoConfig but found: ");
        sb2.append(valueOf);
        throw B(new IllegalArgumentException(sb2.toString()), this.f10543k0, 6001);
    }

    public abstract l.a y0(n nVar, q1 q1Var, MediaCrypto mediaCrypto, float f10);

    public final long z0() {
        return this.f10548m1;
    }

    public static class b extends Exception {
        public final String M;
        public final b N;
        public final String f10563a;
        public final boolean f10564b;
        public final n f10565c;

        public b(m3.q1 r12, java.lang.Throwable r13, boolean r14, int r15) {
            throw new UnsupportedOperationException("Method not decompiled: e4.o.b.<init>(m3.q1, java.lang.Throwable, boolean, int):void");
        }

        public static String b(int i10) {
            String str = i10 < 0 ? "neg_" : "";
            int abs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder(str.length() + 71);
            sb2.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb2.append(str);
            sb2.append(abs);
            return sb2.toString();
        }

        public static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public final b c(b bVar) {
            return new b(getMessage(), getCause(), this.f10563a, this.f10564b, this.f10565c, this.M, bVar);
        }

        public b(m3.q1 r9, java.lang.Throwable r10, boolean r11, e4.n r12) {
            throw new UnsupportedOperationException("Method not decompiled: e4.o.b.<init>(m3.q1, java.lang.Throwable, boolean, e4.n):void");
        }

        public b(String str, Throwable th, String str2, boolean z10, n nVar, String str3, b bVar) {
            super(str, th);
            this.f10563a = str2;
            this.f10564b = z10;
            this.f10565c = nVar;
            this.M = str3;
            this.N = bVar;
        }
    }
}
