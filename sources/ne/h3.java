package ne;

import a5.v;
import android.content.Context;
import android.view.TextureView;
import d5.b0;
import ib.i;
import java.io.File;
import java.util.List;
import kb.c;
import m3.c2;
import m3.o;
import m3.o2;
import m3.o3;
import m3.r2;
import m3.s2;
import m3.t3;
import m3.u2;
import m3.y1;
import o3.e;
import o4.d;
import o4.r0;
import o4.s;
import oc.v0;

public class h3 extends TextureView implements c, s2.d {
    public String M;
    public double N = -1.0d;
    public double O = -1.0d;
    public s P;
    public s Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public long V;
    public m3.s f18080a;
    public a f18081b;
    public boolean f18082c;

    public interface a {
        void a(boolean z10);

        void b(boolean z10);
    }

    public h3(Context context) {
        super(context);
    }

    private void setDataSource(s sVar) {
        s sVar2;
        m3.s sVar3 = this.f18080a;
        if (sVar3 != null && (sVar2 = this.Q) != sVar) {
            if (sVar2 != null) {
                boolean z10 = sVar2 instanceof d;
            }
            this.Q = sVar;
            sVar3.w(sVar);
            this.f18080a.b();
        }
    }

    private void setRendered(boolean z10) {
        if (this.f18082c != z10) {
            this.f18082c = z10;
            a aVar = this.f18081b;
            if (aVar != null) {
                aVar.a(z10);
            }
        }
    }

    public boolean A() {
        return this.f18080a != null && this.f18082c && this.V > 0;
    }

    @Override
    public void B(boolean z10) {
        u2.i(this, z10);
    }

    public boolean C() {
        return (!A() || this.N == -1.0d || this.O == -1.0d) ? false : true;
    }

    @Override
    public void D(int i10) {
        u2.t(this, i10);
    }

    public void E() {
        if (this.f18080a == null) {
            m3.s Z1 = v0.Z1(getContext(), true);
            this.f18080a = Z1;
            Z1.U(this);
            this.f18080a.T(this);
            O();
        }
    }

    public void F(float f10) {
    }

    public void G(double d10, double d11, double d12) {
        if (this.f18080a != null) {
            if (d11 == 0.0d && d12 == d10) {
                d11 = -1.0d;
                d12 = -1.0d;
            }
            if (this.N != d11 || this.O != d12) {
                this.N = d11;
                this.O = d12;
                if (d11 == -1.0d || d12 == -1.0d) {
                    setDataSource(this.P);
                } else {
                    setDataSource(new d(this.P, (long) (d11 * 1000000.0d), (long) (d12 * 1000000.0d)));
                }
            }
        }
    }

    @Override
    public void H(boolean z10) {
        u2.g(this, z10);
    }

    @Override
    public void I() {
        u2.x(this);
    }

    public void J() {
        setMuted(!this.S);
    }

    @Override
    public void K(t3 t3Var) {
        u2.D(this, t3Var);
    }

    @Override
    public void L(s2.e eVar, s2.e eVar2, int i10) {
        u2.u(this, eVar, eVar2, i10);
    }

    @Override
    public void M(float f10) {
        u2.F(this, f10);
    }

    @Override
    public void N(int i10) {
        m3.s sVar;
        long j10 = 0;
        if (i10 != 3) {
            if (i10 == 4 && this.R && (sVar = this.f18080a) != null) {
                sVar.c(0L);
            }
        } else if (this.V == 0 && !(this.Q instanceof d)) {
            m3.s sVar2 = this.f18080a;
            if (sVar2 != null) {
                j10 = sVar2.g();
            }
            this.V = j10;
        }
    }

    public final void O() {
        m3.s sVar = this.f18080a;
        if (sVar != null) {
            boolean z10 = true;
            sVar.J(!this.R ? 1 : 0);
            this.f18080a.f(this.S ? 0.0f : 1.0f);
            m3.s sVar2 = this.f18080a;
            if (!this.T || this.U) {
                z10 = false;
            }
            sVar2.x(z10);
        }
    }

    @Override
    public void Q(boolean z10) {
        u2.y(this, z10);
    }

    @Override
    public void Q2() {
        setVideo(null);
    }

    @Override
    public void S(o3 o3Var, int i10) {
        u2.B(this, o3Var, i10);
    }

    @Override
    public void T(int i10, boolean z10) {
        u2.e(this, i10, z10);
    }

    @Override
    public void U(boolean z10, int i10) {
        u2.s(this, z10, i10);
    }

    @Override
    public void V(c2 c2Var) {
        u2.k(this, c2Var);
    }

    @Override
    public void X(int i10) {
        u2.w(this, i10);
    }

    @Override
    public void Y(e eVar) {
        u2.a(this, eVar);
    }

    @Override
    public void b(boolean z10) {
        u2.z(this, z10);
    }

    @Override
    public void c0(boolean z10, int i10) {
        u2.m(this, z10, i10);
    }

    @Override
    public void d0(y1 y1Var, int i10) {
        u2.j(this, y1Var, i10);
    }

    @Override
    public void e0(s2 s2Var, s2.c cVar) {
        u2.f(this, s2Var, cVar);
    }

    @Override
    public void g(r2 r2Var) {
        u2.n(this, r2Var);
    }

    public double getEndTime() {
        if (C()) {
            return this.O;
        }
        return -1.0d;
    }

    public double getStartTime() {
        if (C()) {
            return this.N;
        }
        return -1.0d;
    }

    @Override
    public void h0(o2 o2Var) {
        u2.q(this, o2Var);
    }

    @Override
    public void i0(int i10, int i11) {
        u2.A(this, i10, i11);
    }

    @Override
    public void j0(r0 r0Var, v vVar) {
        u2.C(this, r0Var, vVar);
    }

    @Override
    public void m0(s2.b bVar) {
        u2.b(this, bVar);
    }

    @Override
    public void n0(o oVar) {
        u2.d(this, oVar);
    }

    @Override
    public void o(f4.a aVar) {
        u2.l(this, aVar);
    }

    @Override
    public void o0(o2 o2Var) {
        u2.r(this, o2Var);
    }

    @Override
    public void p0(boolean z10) {
        u2.h(this, z10);
    }

    @Override
    public void q() {
        setRendered(true);
    }

    @Override
    public void r(List list) {
        u2.c(this, list);
    }

    public void setActivityPaused(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            O();
        }
    }

    public void setDelegate(a aVar) {
        this.f18081b = aVar;
    }

    public void setLooping(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            O();
        }
    }

    public void setMuted(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            O();
            a aVar = this.f18081b;
            if (aVar != null) {
                aVar.b(z10);
            }
        }
    }

    public void setPlaying(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            O();
        }
    }

    public void setVideo(String str) {
        if (!i.c(this.M, str) || i.i(str)) {
            this.M = str;
            this.O = -1.0d;
            this.N = -1.0d;
            this.V = 0L;
            if (i.i(str)) {
                m3.s sVar = this.f18080a;
                if (sVar != null) {
                    sVar.a();
                    this.f18080a = null;
                }
                s sVar2 = this.Q;
                if (!(sVar2 == null || this.P == sVar2)) {
                    this.Q = null;
                }
                if (this.P != null) {
                    this.P = null;
                }
                setRendered(false);
                return;
            }
            E();
            s i22 = v0.i2(new File(str));
            this.P = i22;
            setDataSource(i22);
        }
    }

    @Override
    public void x(b0 b0Var) {
        u2.E(this, b0Var);
    }

    @Override
    public void z(int i10) {
        u2.p(this, i10);
    }
}
