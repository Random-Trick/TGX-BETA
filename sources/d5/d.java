package d5;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import c5.a;
import c5.h0;
import c5.j0;
import c5.l0;
import c5.s;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import d5.z;
import m3.f;
import m3.q1;
import m3.r1;
import org.thunderdog.challegram.Log;
import p3.e;
import p3.g;
import p3.h;
import q3.n;
import q3.o;

public abstract class d extends f {
    public int A0;
    public int B0;
    public long C0;
    public long D0;
    public e E0;
    public final long W;
    public final int X;
    public final z.a Y;
    public q1 f6214b0;
    public q1 f6215c0;
    public p3.d<g, ? extends VideoDecoderOutputBuffer, ? extends p3.f> f6216d0;
    public g f6217e0;
    public VideoDecoderOutputBuffer f6218f0;
    public Object f6220h0;
    public Surface f6221i0;
    public k f6222j0;
    public l f6223k0;
    public o f6224l0;
    public o f6225m0;
    public boolean f6227o0;
    public boolean f6228p0;
    public boolean f6229q0;
    public boolean f6230r0;
    public long f6231s0;
    public boolean f6233u0;
    public boolean f6234v0;
    public boolean f6235w0;
    public b0 f6236x0;
    public long f6237y0;
    public int f6238z0;
    public long f6232t0 = -9223372036854775807L;
    public final h0<q1> Z = new h0<>();
    public final g f6213a0 = g.i();
    public int f6226n0 = 0;
    public int f6219g0 = -1;

    public d(long j10, Handler handler, z zVar, int i10) {
        super(2);
        this.W = j10;
        this.X = i10;
        V();
        this.Y = new z.a(handler, zVar);
    }

    public static boolean c0(long j10) {
        return j10 < -30000;
    }

    public static boolean d0(long j10) {
        return j10 < -500000;
    }

    public boolean A0(long j10, long j11) {
        return d0(j10);
    }

    public boolean B0(long j10, long j11) {
        return c0(j10);
    }

    public boolean C0(long j10, long j11) {
        return c0(j10) && j11 > 100000;
    }

    public void D0(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.E0.f20479f++;
        videoDecoderOutputBuffer.release();
    }

    public void E0(int i10, int i11) {
        e eVar = this.E0;
        eVar.f20481h += i10;
        int i12 = i10 + i11;
        eVar.f20480g += i12;
        this.f6238z0 += i12;
        int i13 = this.A0 + i12;
        this.A0 = i13;
        eVar.f20482i = Math.max(i13, eVar.f20482i);
        int i14 = this.X;
        if (i14 > 0 && this.f6238z0 >= i14) {
            g0();
        }
    }

    @Override
    public void J() {
        this.f6214b0 = null;
        V();
        U();
        try {
            z0(null);
            s0();
        } finally {
            this.Y.m(this.E0);
        }
    }

    @Override
    public void K(boolean z10, boolean z11) {
        e eVar = new e();
        this.E0 = eVar;
        this.Y.o(eVar);
        this.f6229q0 = z11;
        this.f6230r0 = false;
    }

    @Override
    public void L(long j10, boolean z10) {
        this.f6234v0 = false;
        this.f6235w0 = false;
        U();
        this.f6231s0 = -9223372036854775807L;
        this.A0 = 0;
        if (this.f6216d0 != null) {
            a0();
        }
        if (z10) {
            x0();
        } else {
            this.f6232t0 = -9223372036854775807L;
        }
        this.Z.c();
    }

    @Override
    public void N() {
        this.f6238z0 = 0;
        this.f6237y0 = SystemClock.elapsedRealtime();
        this.C0 = SystemClock.elapsedRealtime() * 1000;
    }

    @Override
    public void O() {
        this.f6232t0 = -9223372036854775807L;
        g0();
    }

    @Override
    public void P(q1[] q1VarArr, long j10, long j11) {
        this.D0 = j11;
        super.P(q1VarArr, j10, j11);
    }

    public h T(String str, q1 q1Var, q1 q1Var2) {
        return new h(str, q1Var, q1Var2, 0, 1);
    }

    public final void U() {
        this.f6228p0 = false;
    }

    public final void V() {
        this.f6236x0 = null;
    }

    public abstract p3.d<g, ? extends VideoDecoderOutputBuffer, ? extends p3.f> W(q1 q1Var, CryptoConfig cryptoConfig);

    public final boolean X(long j10, long j11) {
        if (this.f6218f0 == null) {
            VideoDecoderOutputBuffer d10 = this.f6216d0.d();
            this.f6218f0 = d10;
            if (d10 == null) {
                return false;
            }
            e eVar = this.E0;
            int i10 = eVar.f20479f;
            int i11 = d10.skippedOutputBufferCount;
            eVar.f20479f = i10 + i11;
            this.B0 -= i11;
        }
        if (this.f6218f0.isEndOfStream()) {
            if (this.f6226n0 == 2) {
                s0();
                f0();
            } else {
                this.f6218f0.release();
                this.f6218f0 = null;
                this.f6235w0 = true;
            }
            return false;
        }
        boolean r02 = r0(j10, j11);
        if (r02) {
            p0(this.f6218f0.timeUs);
            this.f6218f0 = null;
        }
        return r02;
    }

    public void Y(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        E0(0, 1);
        videoDecoderOutputBuffer.release();
    }

    public final boolean Z() {
        p3.d<g, ? extends VideoDecoderOutputBuffer, ? extends p3.f> dVar = this.f6216d0;
        if (dVar == null || this.f6226n0 == 2 || this.f6234v0) {
            return false;
        }
        if (this.f6217e0 == null) {
            g e10 = dVar.e();
            this.f6217e0 = e10;
            if (e10 == null) {
                return false;
            }
        }
        if (this.f6226n0 == 1) {
            this.f6217e0.setFlags(4);
            this.f6216d0.f(this.f6217e0);
            this.f6217e0 = null;
            this.f6226n0 = 2;
            return false;
        }
        r1 E = E();
        int Q = Q(E, this.f6217e0, 0);
        if (Q == -5) {
            l0(E);
            return true;
        } else if (Q != -4) {
            if (Q == -3) {
                return false;
            }
            throw new IllegalStateException();
        } else if (this.f6217e0.isEndOfStream()) {
            this.f6234v0 = true;
            this.f6216d0.f(this.f6217e0);
            this.f6217e0 = null;
            return false;
        } else {
            if (this.f6233u0) {
                this.Z.a(this.f6217e0.N, this.f6214b0);
                this.f6233u0 = false;
            }
            this.f6217e0.g();
            g gVar = this.f6217e0;
            gVar.f20486a = this.f6214b0;
            q0(gVar);
            this.f6216d0.f(this.f6217e0);
            this.B0++;
            this.f6227o0 = true;
            this.E0.f20476c++;
            this.f6217e0 = null;
            return true;
        }
    }

    public void a0() {
        this.B0 = 0;
        if (this.f6226n0 != 0) {
            s0();
            f0();
            return;
        }
        this.f6217e0 = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f6218f0;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.f6218f0 = null;
        }
        this.f6216d0.flush();
        this.f6227o0 = false;
    }

    public final boolean b0() {
        return this.f6219g0 != -1;
    }

    @Override
    public boolean e() {
        return this.f6235w0;
    }

    public boolean e0(long j10) {
        int S = S(j10);
        if (S == 0) {
            return false;
        }
        this.E0.f20483j++;
        E0(S, this.B0);
        a0();
        return true;
    }

    @Override
    public boolean f() {
        if (this.f6214b0 != null && ((I() || this.f6218f0 != null) && (this.f6228p0 || !b0()))) {
            this.f6232t0 = -9223372036854775807L;
            return true;
        } else if (this.f6232t0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f6232t0) {
                return true;
            }
            this.f6232t0 = -9223372036854775807L;
            return false;
        }
    }

    public final void f0() {
        if (this.f6216d0 == null) {
            v0(this.f6225m0);
            CryptoConfig cryptoConfig = null;
            o oVar = this.f6224l0;
            if (oVar == null || (cryptoConfig = oVar.h()) != null || this.f6224l0.g() != null) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f6216d0 = W(this.f6214b0, cryptoConfig);
                    w0(this.f6219g0);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    this.Y.k(this.f6216d0.b(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.E0.f20474a++;
                } catch (OutOfMemoryError e10) {
                    throw B(e10, this.f6214b0, 4001);
                } catch (p3.f e11) {
                    s.d("DecoderVideoRenderer", "Video codec error", e11);
                    this.Y.C(e11);
                    throw B(e11, this.f6214b0, 4001);
                }
            }
        }
    }

    public final void g0() {
        if (this.f6238z0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.Y.n(this.f6238z0, elapsedRealtime - this.f6237y0);
            this.f6238z0 = 0;
            this.f6237y0 = elapsedRealtime;
        }
    }

    public final void h0() {
        this.f6230r0 = true;
        if (!this.f6228p0) {
            this.f6228p0 = true;
            this.Y.A(this.f6220h0);
        }
    }

    public final void i0(int i10, int i11) {
        b0 b0Var = this.f6236x0;
        if (b0Var == null || b0Var.f6207a != i10 || b0Var.f6208b != i11) {
            b0 b0Var2 = new b0(i10, i11);
            this.f6236x0 = b0Var2;
            this.Y.D(b0Var2);
        }
    }

    public final void j0() {
        if (this.f6228p0) {
            this.Y.A(this.f6220h0);
        }
    }

    public final void k0() {
        b0 b0Var = this.f6236x0;
        if (b0Var != null) {
            this.Y.D(b0Var);
        }
    }

    public void l0(r1 r1Var) {
        h hVar;
        this.f6233u0 = true;
        q1 q1Var = (q1) a.e(r1Var.f16947b);
        z0(r1Var.f16946a);
        q1 q1Var2 = this.f6214b0;
        this.f6214b0 = q1Var;
        p3.d<g, ? extends VideoDecoderOutputBuffer, ? extends p3.f> dVar = this.f6216d0;
        if (dVar == null) {
            f0();
            this.Y.p(this.f6214b0, null);
            return;
        }
        if (this.f6225m0 != this.f6224l0) {
            hVar = new h(dVar.b(), q1Var2, q1Var, 0, Log.TAG_YOUTUBE);
        } else {
            hVar = T(dVar.b(), q1Var2, q1Var);
        }
        if (hVar.f20494d == 0) {
            if (this.f6227o0) {
                this.f6226n0 = 1;
            } else {
                s0();
                f0();
            }
        }
        this.Y.p(this.f6214b0, hVar);
    }

    public final void m0() {
        k0();
        U();
        if (i() == 2) {
            x0();
        }
    }

    public final void n0() {
        V();
        U();
    }

    public final void o0() {
        k0();
        j0();
    }

    public void p0(long j10) {
        this.B0--;
    }

    public void q0(g gVar) {
    }

    @Override
    public void r(long j10, long j11) {
        if (!this.f6235w0) {
            if (this.f6214b0 == null) {
                r1 E = E();
                this.f6213a0.clear();
                int Q = Q(E, this.f6213a0, 2);
                if (Q == -5) {
                    l0(E);
                } else if (Q == -4) {
                    a.f(this.f6213a0.isEndOfStream());
                    this.f6234v0 = true;
                    this.f6235w0 = true;
                    return;
                } else {
                    return;
                }
            }
            f0();
            if (this.f6216d0 != null) {
                try {
                    j0.a("drainAndFeed");
                    while (X(j10, j11)) {
                    }
                    while (Z()) {
                    }
                    j0.c();
                    this.E0.c();
                } catch (p3.f e10) {
                    s.d("DecoderVideoRenderer", "Video codec error", e10);
                    this.Y.C(e10);
                    throw B(e10, this.f6214b0, 4003);
                }
            }
        }
    }

    public final boolean r0(long j10, long j11) {
        if (this.f6231s0 == -9223372036854775807L) {
            this.f6231s0 = j10;
        }
        long j12 = this.f6218f0.timeUs - j10;
        if (b0()) {
            long j13 = this.f6218f0.timeUs - this.D0;
            q1 j14 = this.Z.j(j13);
            if (j14 != null) {
                this.f6215c0 = j14;
            }
            long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.C0;
            boolean z10 = i() == 2;
            if ((this.f6230r0 ? !this.f6228p0 : !(!z10 && !this.f6229q0)) || (z10 && C0(j12, elapsedRealtime))) {
                t0(this.f6218f0, j13, this.f6215c0);
                return true;
            } else if (!z10 || j10 == this.f6231s0 || (A0(j12, j11) && e0(j10))) {
                return false;
            } else {
                if (B0(j12, j11)) {
                    Y(this.f6218f0);
                    return true;
                }
                if (j12 < 30000) {
                    t0(this.f6218f0, j13, this.f6215c0);
                    return true;
                }
                return false;
            }
        } else if (!c0(j12)) {
            return false;
        } else {
            D0(this.f6218f0);
            return true;
        }
    }

    public void s0() {
        this.f6217e0 = null;
        this.f6218f0 = null;
        this.f6226n0 = 0;
        this.f6227o0 = false;
        this.B0 = 0;
        p3.d<g, ? extends VideoDecoderOutputBuffer, ? extends p3.f> dVar = this.f6216d0;
        if (dVar != null) {
            this.E0.f20475b++;
            dVar.a();
            this.Y.l(this.f6216d0.b());
            this.f6216d0 = null;
        }
        v0(null);
    }

    @Override
    public void t(int i10, Object obj) {
        if (i10 == 1) {
            y0(obj);
        } else if (i10 == 7) {
            this.f6223k0 = (l) obj;
        } else {
            super.t(i10, obj);
        }
    }

    public void t0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j10, q1 q1Var) {
        l lVar = this.f6223k0;
        if (lVar != null) {
            lVar.g(j10, System.nanoTime(), q1Var, null);
        }
        this.C0 = l0.r0(SystemClock.elapsedRealtime() * 1000);
        int i10 = videoDecoderOutputBuffer.mode;
        boolean z10 = i10 == 1 && this.f6221i0 != null;
        boolean z11 = i10 == 0 && this.f6222j0 != null;
        if (z11 || z10) {
            i0(videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
            if (z11) {
                this.f6222j0.setOutputBuffer(videoDecoderOutputBuffer);
            } else {
                u0(videoDecoderOutputBuffer, this.f6221i0);
            }
            this.A0 = 0;
            this.E0.f20478e++;
            h0();
            return;
        }
        Y(videoDecoderOutputBuffer);
    }

    public abstract void u0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    public final void v0(o oVar) {
        n.a(this.f6224l0, oVar);
        this.f6224l0 = oVar;
    }

    public abstract void w0(int i10);

    public final void x0() {
        this.f6232t0 = this.W > 0 ? SystemClock.elapsedRealtime() + this.W : -9223372036854775807L;
    }

    public final void y0(Object obj) {
        if (obj instanceof Surface) {
            this.f6221i0 = (Surface) obj;
            this.f6222j0 = null;
            this.f6219g0 = 1;
        } else if (obj instanceof k) {
            this.f6221i0 = null;
            this.f6222j0 = (k) obj;
            this.f6219g0 = 0;
        } else {
            this.f6221i0 = null;
            this.f6222j0 = null;
            this.f6219g0 = -1;
            obj = null;
        }
        if (this.f6220h0 != obj) {
            this.f6220h0 = obj;
            if (obj != null) {
                if (this.f6216d0 != null) {
                    w0(this.f6219g0);
                }
                m0();
                return;
            }
            n0();
        } else if (obj != null) {
            o0();
        }
    }

    public final void z0(o oVar) {
        n.a(this.f6225m0, oVar);
        this.f6225m0 = oVar;
    }
}
