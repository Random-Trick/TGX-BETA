package me;

import android.content.Context;
import android.view.TextureView;
import java.io.File;
import java.util.List;
import nc.C7389v0;
import p032c5.C1607b0;
import p073f4.C4260a;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p174m3.AbstractC6604g3;
import p174m3.AbstractC6618i2;
import p174m3.AbstractC6689s;
import p174m3.C6591e2;
import p174m3.C6613h2;
import p174m3.C6637k2;
import p174m3.C6643l2;
import p174m3.C6644l3;
import p174m3.C6658o;
import p174m3.C6660o1;
import p174m3.C6693s1;
import p187n4.AbstractC7230t;
import p187n4.C7173e;
import p187n4.C7233t0;
import p199o3.C7602e;
import p356z4.C11272n;

public class C6899h3 extends TextureView implements AbstractC5911c, AbstractC6618i2.AbstractC6624e {
    public String f21795M;
    public double f21796N = -1.0d;
    public double f21797O = -1.0d;
    public AbstractC7230t f21798P;
    public AbstractC7230t f21799Q;
    public boolean f21800R;
    public boolean f21801S;
    public boolean f21802T;
    public boolean f21803U;
    public long f21804V;
    public AbstractC6689s f21805a;
    public AbstractC6900a f21806b;
    public boolean f21807c;

    public interface AbstractC6900a {
        void mo6833a(boolean z);

        void mo6832b(boolean z);
    }

    public C6899h3(Context context) {
        super(context);
    }

    private void setDataSource(AbstractC7230t tVar) {
        AbstractC7230t tVar2;
        AbstractC6689s sVar = this.f21805a;
        if (sVar != null && (tVar2 = this.f21799Q) != tVar) {
            if (tVar2 != null) {
                boolean z = tVar2 instanceof C7173e;
            }
            this.f21799Q = tVar;
            sVar.mo19378M(tVar);
            this.f21805a.mo19279b();
        }
    }

    private void setRendered(boolean z) {
        if (this.f21807c != z) {
            this.f21807c = z;
            AbstractC6900a aVar = this.f21806b;
            if (aVar != null) {
                aVar.mo6833a(z);
            }
        }
    }

    @Override
    public void mo7370C(boolean z) {
        C6643l2.m19695u(this, z);
    }

    @Override
    public void mo7368K(AbstractC6604g3 g3Var, int i) {
        C6643l2.m19692x(this, g3Var, i);
    }

    @Override
    public void mo7367L(int i, boolean z) {
        C6643l2.m19711e(this, i, z);
    }

    @Override
    public void mo7366M(boolean z, int i) {
        C6637k2.m19739k(this, z, i);
    }

    @Override
    public void mo7365N(C6693s1 s1Var) {
        C6643l2.m19706j(this, s1Var);
    }

    @Override
    public void mo7364R(int i) {
        C6643l2.m19696t(this, i);
    }

    @Override
    public void mo7363V(C7602e eVar) {
        C6643l2.m19715a(this, eVar);
    }

    @Override
    public void mo7362a(boolean z) {
        C6643l2.m19694v(this, z);
    }

    @Override
    public void mo7361a0(boolean z, int i) {
        C6643l2.m19704l(this, z, i);
    }

    @Override
    public void mo4501a3() {
        setVideo(null);
    }

    @Override
    public void mo7360b(C1607b0 b0Var) {
        C6643l2.m19690z(this, b0Var);
    }

    @Override
    public void mo7359b0(C6660o1 o1Var, int i) {
        C6643l2.m19707i(this, o1Var, i);
    }

    @Override
    public void mo7358c(C6613h2 h2Var) {
        C6643l2.m19703m(this, h2Var);
    }

    @Override
    public void mo7357c0(AbstractC6618i2 i2Var, AbstractC6618i2.C6623d dVar) {
        C6643l2.m19710f(this, i2Var, dVar);
    }

    @Override
    public void mo7356d(C4260a aVar) {
        C6643l2.m19705k(this, aVar);
    }

    @Override
    public void mo7252e() {
        setRendered(true);
    }

    @Override
    public void mo7355e0(C6591e2 e2Var) {
        C6643l2.m19700p(this, e2Var);
    }

    public boolean m18523f() {
        return this.f21805a != null && this.f21807c && this.f21804V > 0;
    }

    @Override
    public void mo7354f0(int i, int i2) {
        C6643l2.m19693w(this, i, i2);
    }

    @Override
    public void mo7353g(List list) {
        C6643l2.m19713c(this, list);
    }

    public double getEndTime() {
        if (m18522i()) {
            return this.f21797O;
        }
        return -1.0d;
    }

    public double getStartTime() {
        if (m18522i()) {
            return this.f21796N;
        }
        return -1.0d;
    }

    @Override
    public void mo7352h(int i) {
        C6643l2.m19701o(this, i);
    }

    public boolean m18522i() {
        return (!m18523f() || this.f21796N == -1.0d || this.f21797O == -1.0d) ? false : true;
    }

    @Override
    public void mo7351i0(AbstractC6618i2.C6620b bVar) {
        C6643l2.m19714b(this, bVar);
    }

    public void m18521j() {
        if (this.f21805a == null) {
            AbstractC6689s Z1 = C7389v0.m16659Z1(getContext(), true);
            this.f21805a = Z1;
            Z1.mo19294P(this);
            this.f21805a.mo19375O(this);
            m18517v();
        }
    }

    @Override
    public void mo7349j0(C6658o oVar) {
        C6643l2.m19712d(this, oVar);
    }

    @Override
    public void mo7348k(boolean z) {
        C6637k2.m19746d(this, z);
    }

    @Override
    public void mo7347l(int i) {
        C6637k2.m19738l(this, i);
    }

    @Override
    public void mo7346l0(C6591e2 e2Var) {
        C6643l2.m19699q(this, e2Var);
    }

    public void m18520m(float f) {
    }

    @Override
    public void mo7344m0(boolean z) {
        C6643l2.m19708h(this, z);
    }

    public void m18519n(double d, double d2, double d3) {
        if (this.f21805a != null) {
            if (d2 == 0.0d && d3 == d) {
                d2 = -1.0d;
                d3 = -1.0d;
            }
            if (this.f21796N != d2 || this.f21797O != d3) {
                this.f21796N = d2;
                this.f21797O = d3;
                if (d2 == -1.0d || d3 == -1.0d) {
                    setDataSource(this.f21798P);
                } else {
                    setDataSource(new C7173e(this.f21798P, (long) (d2 * 1000000.0d), (long) (d3 * 1000000.0d)));
                }
            }
        }
    }

    @Override
    public void mo7343o(boolean z) {
        C6643l2.m19709g(this, z);
    }

    @Override
    public void mo7342p() {
        C6637k2.m19735o(this);
    }

    @Override
    public void mo7341q(C6644l3 l3Var) {
        C6643l2.m19691y(this, l3Var);
    }

    public void m18518r() {
        setMuted(!this.f21801S);
    }

    @Override
    public void mo7340s(AbstractC6618i2.C6625f fVar, AbstractC6618i2.C6625f fVar2, int i) {
        C6643l2.m19698r(this, fVar, fVar2, i);
    }

    public void setActivityPaused(boolean z) {
        if (this.f21803U != z) {
            this.f21803U = z;
            m18517v();
        }
    }

    public void setDelegate(AbstractC6900a aVar) {
        this.f21806b = aVar;
    }

    public void setLooping(boolean z) {
        if (this.f21800R != z) {
            this.f21800R = z;
            m18517v();
        }
    }

    public void setMuted(boolean z) {
        if (this.f21801S != z) {
            this.f21801S = z;
            m18517v();
            AbstractC6900a aVar = this.f21806b;
            if (aVar != null) {
                aVar.mo6832b(z);
            }
        }
    }

    public void setPlaying(boolean z) {
        if (this.f21802T != z) {
            this.f21802T = z;
            m18517v();
        }
    }

    public void setVideo(String str) {
        if (!C5070i.m24067c(this.f21795M, str) || C5070i.m24061i(str)) {
            this.f21795M = str;
            this.f21797O = -1.0d;
            this.f21796N = -1.0d;
            this.f21804V = 0L;
            if (C5070i.m24061i(str)) {
                AbstractC6689s sVar = this.f21805a;
                if (sVar != null) {
                    sVar.mo19281a();
                    this.f21805a = null;
                }
                AbstractC7230t tVar = this.f21799Q;
                if (!(tVar == null || this.f21798P == tVar)) {
                    this.f21799Q = null;
                }
                if (this.f21798P != null) {
                    this.f21798P = null;
                }
                setRendered(false);
                return;
            }
            m18521j();
            AbstractC7230t i2 = C7389v0.m16623i2(new File(str));
            this.f21798P = i2;
            setDataSource(i2);
        }
    }

    @Override
    public void mo7339t(C7233t0 t0Var, C11272n nVar) {
        C6637k2.m19732r(this, t0Var, nVar);
    }

    @Override
    public void mo7338u(float f) {
        C6643l2.m19716A(this, f);
    }

    public final void m18517v() {
        AbstractC6689s sVar = this.f21805a;
        if (sVar != null) {
            boolean z = true;
            sVar.mo19312E(!this.f21800R ? 1 : 0);
            this.f21805a.mo19360f(this.f21801S ? 0.0f : 1.0f);
            AbstractC6689s sVar2 = this.f21805a;
            if (!this.f21802T || this.f21803U) {
                z = false;
            }
            sVar2.mo19340v(z);
        }
    }

    @Override
    public void mo7223w(int i) {
        AbstractC6689s sVar;
        long j = 0;
        if (i != 3) {
            if (i == 4 && this.f21800R && (sVar = this.f21805a) != null) {
                sVar.mo19779c(0L);
            }
        } else if (this.f21804V == 0 && !(this.f21799Q instanceof C7173e)) {
            AbstractC6689s sVar2 = this.f21805a;
            if (sVar2 != null) {
                j = sVar2.mo19267g();
            }
            this.f21804V = j;
        }
    }
}
