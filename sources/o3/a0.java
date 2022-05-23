package o3;

import android.os.Handler;
import android.os.SystemClock;
import c5.j0;
import c5.l0;
import c5.u;
import c5.w;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.decoder.SimpleDecoderOutputBuffer;
import m3.c3;
import m3.q1;
import m3.r1;
import m3.r2;
import o3.b0;
import o3.s;
import o3.t;
import org.thunderdog.challegram.Log;
import p3.d;
import p3.e;
import p3.f;
import p3.g;
import p3.h;
import q3.n;
import q3.o;

public abstract class a0<T extends d<g, ? extends SimpleDecoderOutputBuffer, ? extends f>> extends m3.f implements u {
    public final s.a W;
    public final t X;
    public final g Y;
    public e Z;
    public q1 f18651a0;
    public int f18652b0;
    public int f18653c0;
    public boolean f18654d0;
    public T f18655e0;
    public g f18656f0;
    public SimpleDecoderOutputBuffer f18657g0;
    public o f18658h0;
    public o f18659i0;
    public int f18660j0;
    public boolean f18661k0;
    public boolean f18662l0;
    public long f18663m0;
    public boolean f18664n0;
    public boolean f18665o0;
    public boolean f18666p0;
    public boolean f18667q0;

    public final class b implements t.c {
        public b() {
        }

        @Override
        public void a(long j10) {
            a0.this.W.B(j10);
        }

        @Override
        public void b(boolean z10) {
            a0.this.W.C(z10);
        }

        @Override
        public void c(Exception exc) {
            c5.s.d("DecoderAudioRenderer", "Audio sink error", exc);
            a0.this.W.l(exc);
        }

        @Override
        public void d(int i10, long j10, long j11) {
            a0.this.W.D(i10, j10, j11);
        }

        @Override
        public void e(long j10) {
            u.b(this, j10);
        }

        @Override
        public void f() {
            a0.this.d0();
        }

        @Override
        public void g() {
            u.a(this);
        }
    }

    public a0() {
        this((Handler) null, (s) null, new g[0]);
    }

    @Override
    public u A() {
        return this;
    }

    @Override
    public void J() {
        this.f18651a0 = null;
        this.f18662l0 = true;
        try {
            i0(null);
            g0();
            this.X.c();
        } finally {
            this.W.o(this.Z);
        }
    }

    @Override
    public void K(boolean z10, boolean z11) {
        e eVar = new e();
        this.Z = eVar;
        this.W.p(eVar);
        if (D().f16641a) {
            this.X.s();
        } else {
            this.X.o();
        }
        this.X.t(G());
    }

    @Override
    public void L(long j10, boolean z10) {
        if (this.f18654d0) {
            this.X.w();
        } else {
            this.X.flush();
        }
        this.f18663m0 = j10;
        this.f18664n0 = true;
        this.f18665o0 = true;
        this.f18666p0 = false;
        this.f18667q0 = false;
        if (this.f18655e0 != null) {
            Y();
        }
    }

    @Override
    public void N() {
        this.X.g();
    }

    @Override
    public void O() {
        l0();
        this.X.b();
    }

    public h U(String str, q1 q1Var, q1 q1Var2) {
        return new h(str, q1Var, q1Var2, 0, 1);
    }

    public abstract T V(q1 q1Var, CryptoConfig cryptoConfig);

    public final boolean W() {
        if (this.f18657g0 == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.f18655e0.d();
            this.f18657g0 = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i10 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i10 > 0) {
                this.Z.f20479f += i10;
                this.X.p();
            }
        }
        if (this.f18657g0.isEndOfStream()) {
            if (this.f18660j0 == 2) {
                g0();
                b0();
                this.f18662l0 = true;
            } else {
                this.f18657g0.release();
                this.f18657g0 = null;
                try {
                    f0();
                } catch (t.e e10) {
                    throw C(e10, e10.f18902c, e10.f18901b, 5002);
                }
            }
            return false;
        }
        if (this.f18662l0) {
            this.X.v(Z(this.f18655e0).b().N(this.f18652b0).O(this.f18653c0).E(), 0, null);
            this.f18662l0 = false;
        }
        t tVar = this.X;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.f18657g0;
        if (!tVar.u(simpleDecoderOutputBuffer2.data, simpleDecoderOutputBuffer2.timeUs, 1)) {
            return false;
        }
        this.Z.f20478e++;
        this.f18657g0.release();
        this.f18657g0 = null;
        return true;
    }

    public final boolean X() {
        T t10 = this.f18655e0;
        if (t10 == null || this.f18660j0 == 2 || this.f18666p0) {
            return false;
        }
        if (this.f18656f0 == null) {
            g gVar = (g) t10.e();
            this.f18656f0 = gVar;
            if (gVar == null) {
                return false;
            }
        }
        if (this.f18660j0 == 1) {
            this.f18656f0.setFlags(4);
            this.f18655e0.f(this.f18656f0);
            this.f18656f0 = null;
            this.f18660j0 = 2;
            return false;
        }
        r1 E = E();
        int Q = Q(E, this.f18656f0, 0);
        if (Q == -5) {
            c0(E);
            return true;
        } else if (Q != -4) {
            if (Q == -3) {
                return false;
            }
            throw new IllegalStateException();
        } else if (this.f18656f0.isEndOfStream()) {
            this.f18666p0 = true;
            this.f18655e0.f(this.f18656f0);
            this.f18656f0 = null;
            return false;
        } else {
            this.f18656f0.g();
            g gVar2 = this.f18656f0;
            gVar2.f20486a = this.f18651a0;
            e0(gVar2);
            this.f18655e0.f(this.f18656f0);
            this.f18661k0 = true;
            this.Z.f20476c++;
            this.f18656f0 = null;
            return true;
        }
    }

    public final void Y() {
        if (this.f18660j0 != 0) {
            g0();
            b0();
            return;
        }
        this.f18656f0 = null;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f18657g0;
        if (simpleDecoderOutputBuffer != null) {
            simpleDecoderOutputBuffer.release();
            this.f18657g0 = null;
        }
        this.f18655e0.flush();
        this.f18661k0 = false;
    }

    public abstract q1 Z(T t10);

    @Override
    public final int a(q1 q1Var) {
        int i10 = 0;
        if (!w.h(q1Var.U)) {
            return c3.a(0);
        }
        int k02 = k0(q1Var);
        if (k02 <= 2) {
            return c3.a(k02);
        }
        if (l0.f4841a >= 21) {
            i10 = 32;
        }
        return c3.b(k02, 8, i10);
    }

    public final int a0(q1 q1Var) {
        return this.X.k(q1Var);
    }

    public final void b0() {
        if (this.f18655e0 == null) {
            h0(this.f18659i0);
            CryptoConfig cryptoConfig = null;
            o oVar = this.f18658h0;
            if (oVar == null || (cryptoConfig = oVar.h()) != null || this.f18658h0.g() != null) {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    j0.a("createAudioDecoder");
                    this.f18655e0 = V(this.f18651a0, cryptoConfig);
                    j0.c();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    this.W.m(this.f18655e0.b(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.Z.f20474a++;
                } catch (OutOfMemoryError e10) {
                    throw B(e10, this.f18651a0, 4001);
                } catch (f e11) {
                    c5.s.d("DecoderAudioRenderer", "Audio codec error", e11);
                    this.W.k(e11);
                    throw B(e11, this.f18651a0, 4001);
                }
            }
        }
    }

    public final void c0(r1 r1Var) {
        h hVar;
        q1 q1Var = (q1) c5.a.e(r1Var.f16947b);
        i0(r1Var.f16946a);
        q1 q1Var2 = this.f18651a0;
        this.f18651a0 = q1Var;
        this.f18652b0 = q1Var.f16911k0;
        this.f18653c0 = q1Var.f16912l0;
        T t10 = this.f18655e0;
        if (t10 == null) {
            b0();
            this.W.q(this.f18651a0, null);
            return;
        }
        if (this.f18659i0 != this.f18658h0) {
            hVar = new h(t10.b(), q1Var2, q1Var, 0, Log.TAG_YOUTUBE);
        } else {
            hVar = U(t10.b(), q1Var2, q1Var);
        }
        if (hVar.f20494d == 0) {
            if (this.f18661k0) {
                this.f18660j0 = 1;
            } else {
                g0();
                b0();
                this.f18662l0 = true;
            }
        }
        this.W.q(this.f18651a0, hVar);
    }

    @Override
    public void d(r2 r2Var) {
        this.X.d(r2Var);
    }

    public void d0() {
        this.f18665o0 = true;
    }

    @Override
    public boolean e() {
        return this.f18667q0 && this.X.e();
    }

    public void e0(g gVar) {
        if (this.f18664n0 && !gVar.isDecodeOnly()) {
            if (Math.abs(gVar.N - this.f18663m0) > 500000) {
                this.f18663m0 = gVar.N;
            }
            this.f18664n0 = false;
        }
    }

    @Override
    public boolean f() {
        return this.X.i() || (this.f18651a0 != null && (I() || this.f18657g0 != null));
    }

    public final void f0() {
        this.f18667q0 = true;
        this.X.h();
    }

    @Override
    public long g() {
        if (i() == 2) {
            l0();
        }
        return this.f18663m0;
    }

    public final void g0() {
        this.f18656f0 = null;
        this.f18657g0 = null;
        this.f18660j0 = 0;
        this.f18661k0 = false;
        T t10 = this.f18655e0;
        if (t10 != null) {
            this.Z.f20475b++;
            t10.a();
            this.W.n(this.f18655e0.b());
            this.f18655e0 = null;
        }
        h0(null);
    }

    public final void h0(o oVar) {
        n.a(this.f18658h0, oVar);
        this.f18658h0 = oVar;
    }

    public final void i0(o oVar) {
        n.a(this.f18659i0, oVar);
        this.f18659i0 = oVar;
    }

    @Override
    public r2 j() {
        return this.X.j();
    }

    public final boolean j0(q1 q1Var) {
        return this.X.a(q1Var);
    }

    public abstract int k0(q1 q1Var);

    public final void l0() {
        long n10 = this.X.n(e());
        if (n10 != Long.MIN_VALUE) {
            if (!this.f18665o0) {
                n10 = Math.max(this.f18663m0, n10);
            }
            this.f18663m0 = n10;
            this.f18665o0 = false;
        }
    }

    @Override
    public void r(long j10, long j11) {
        if (this.f18667q0) {
            try {
                this.X.h();
            } catch (t.e e10) {
                throw C(e10, e10.f18902c, e10.f18901b, 5002);
            }
        } else {
            if (this.f18651a0 == null) {
                r1 E = E();
                this.Y.clear();
                int Q = Q(E, this.Y, 2);
                if (Q == -5) {
                    c0(E);
                } else if (Q == -4) {
                    c5.a.f(this.Y.isEndOfStream());
                    this.f18666p0 = true;
                    try {
                        f0();
                        return;
                    } catch (t.e e11) {
                        throw B(e11, null, 5002);
                    }
                } else {
                    return;
                }
            }
            b0();
            if (this.f18655e0 != null) {
                try {
                    j0.a("drainAndFeed");
                    while (W()) {
                    }
                    while (X()) {
                    }
                    j0.c();
                    this.Z.c();
                } catch (t.a e12) {
                    throw B(e12, e12.f18894a, 5001);
                } catch (t.b e13) {
                    throw C(e13, e13.f18897c, e13.f18896b, 5001);
                } catch (t.e e14) {
                    throw C(e14, e14.f18902c, e14.f18901b, 5002);
                } catch (f e15) {
                    c5.s.d("DecoderAudioRenderer", "Audio codec error", e15);
                    this.W.k(e15);
                    throw B(e15, this.f18651a0, 4003);
                }
            }
        }
    }

    @Override
    public void t(int i10, Object obj) {
        if (i10 == 2) {
            this.X.f(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.X.q((e) obj);
        } else if (i10 == 6) {
            this.X.r((x) obj);
        } else if (i10 == 9) {
            this.X.x(((Boolean) obj).booleanValue());
        } else if (i10 != 10) {
            super.t(i10, obj);
        } else {
            this.X.m(((Integer) obj).intValue());
        }
    }

    public a0(Handler handler, s sVar, g... gVarArr) {
        this(handler, sVar, null, gVarArr);
    }

    public a0(Handler handler, s sVar, f fVar, g... gVarArr) {
        this(handler, sVar, new b0.e().g((f) z6.g.a(fVar, f.f18775c)).i(gVarArr).f());
    }

    public a0(Handler handler, s sVar, t tVar) {
        super(1);
        this.W = new s.a(handler, sVar);
        this.X = tVar;
        tVar.l(new b());
        this.Y = g.i();
        this.f18660j0 = 0;
        this.f18662l0 = true;
    }
}
