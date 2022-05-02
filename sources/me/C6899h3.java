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
    public String f21798M;
    public double f21799N = -1.0d;
    public double f21800O = -1.0d;
    public AbstractC7230t f21801P;
    public AbstractC7230t f21802Q;
    public boolean f21803R;
    public boolean f21804S;
    public boolean f21805T;
    public boolean f21806U;
    public long f21807V;
    public AbstractC6689s f21808a;
    public AbstractC6900a f21809b;
    public boolean f21810c;

    public interface AbstractC6900a {
        void mo6833a(boolean z);

        void mo6832b(boolean z);
    }

    public C6899h3(Context context) {
        super(context);
    }

    private void setDataSource(AbstractC7230t tVar) {
        AbstractC7230t tVar2;
        AbstractC6689s sVar = this.f21808a;
        if (sVar != null && (tVar2 = this.f21802Q) != tVar) {
            if (tVar2 != null) {
                boolean z = tVar2 instanceof C7173e;
            }
            this.f21802Q = tVar;
            sVar.mo19379M(tVar);
            this.f21808a.mo19280b();
        }
    }

    private void setRendered(boolean z) {
        if (this.f21810c != z) {
            this.f21810c = z;
            AbstractC6900a aVar = this.f21809b;
            if (aVar != null) {
                aVar.mo6833a(z);
            }
        }
    }

    @Override
    public void mo7370C(boolean z) {
        C6643l2.m19696u(this, z);
    }

    @Override
    public void mo7368K(AbstractC6604g3 g3Var, int i) {
        C6643l2.m19693x(this, g3Var, i);
    }

    @Override
    public void mo7367L(int i, boolean z) {
        C6643l2.m19712e(this, i, z);
    }

    @Override
    public void mo7366M(boolean z, int i) {
        C6637k2.m19740k(this, z, i);
    }

    @Override
    public void mo7365N(C6693s1 s1Var) {
        C6643l2.m19707j(this, s1Var);
    }

    @Override
    public void mo7364R(int i) {
        C6643l2.m19697t(this, i);
    }

    @Override
    public void mo7363V(C7602e eVar) {
        C6643l2.m19716a(this, eVar);
    }

    @Override
    public void mo7362a(boolean z) {
        C6643l2.m19695v(this, z);
    }

    @Override
    public void mo7361a0(boolean z, int i) {
        C6643l2.m19705l(this, z, i);
    }

    @Override
    public void mo4501a3() {
        setVideo(null);
    }

    @Override
    public void mo7360b(C1607b0 b0Var) {
        C6643l2.m19691z(this, b0Var);
    }

    @Override
    public void mo7359b0(C6660o1 o1Var, int i) {
        C6643l2.m19708i(this, o1Var, i);
    }

    @Override
    public void mo7358c(C6613h2 h2Var) {
        C6643l2.m19704m(this, h2Var);
    }

    @Override
    public void mo7357c0(AbstractC6618i2 i2Var, AbstractC6618i2.C6623d dVar) {
        C6643l2.m19711f(this, i2Var, dVar);
    }

    @Override
    public void mo7356d(C4260a aVar) {
        C6643l2.m19706k(this, aVar);
    }

    @Override
    public void mo7252e() {
        setRendered(true);
    }

    @Override
    public void mo7355e0(C6591e2 e2Var) {
        C6643l2.m19701p(this, e2Var);
    }

    public boolean m18523f() {
        return this.f21808a != null && this.f21810c && this.f21807V > 0;
    }

    @Override
    public void mo7354f0(int i, int i2) {
        C6643l2.m19694w(this, i, i2);
    }

    @Override
    public void mo7353g(List list) {
        C6643l2.m19714c(this, list);
    }

    public double getEndTime() {
        if (m18522i()) {
            return this.f21800O;
        }
        return -1.0d;
    }

    public double getStartTime() {
        if (m18522i()) {
            return this.f21799N;
        }
        return -1.0d;
    }

    @Override
    public void mo7352h(int i) {
        C6643l2.m19702o(this, i);
    }

    public boolean m18522i() {
        return (!m18523f() || this.f21799N == -1.0d || this.f21800O == -1.0d) ? false : true;
    }

    @Override
    public void mo7351i0(AbstractC6618i2.C6620b bVar) {
        C6643l2.m19715b(this, bVar);
    }

    public void m18521j() {
        if (this.f21808a == null) {
            AbstractC6689s Z1 = C7389v0.m16659Z1(getContext(), true);
            this.f21808a = Z1;
            Z1.mo19295P(this);
            this.f21808a.mo19376O(this);
            m18517v();
        }
    }

    @Override
    public void mo7349j0(C6658o oVar) {
        C6643l2.m19713d(this, oVar);
    }

    @Override
    public void mo7348k(boolean z) {
        C6637k2.m19747d(this, z);
    }

    @Override
    public void mo7347l(int i) {
        C6637k2.m19739l(this, i);
    }

    @Override
    public void mo7346l0(C6591e2 e2Var) {
        C6643l2.m19700q(this, e2Var);
    }

    public void m18520m(float f) {
    }

    @Override
    public void mo7344m0(boolean z) {
        C6643l2.m19709h(this, z);
    }

    public void m18519n(double d, double d2, double d3) {
        if (this.f21808a != null) {
            if (d2 == 0.0d && d3 == d) {
                d2 = -1.0d;
                d3 = -1.0d;
            }
            if (this.f21799N != d2 || this.f21800O != d3) {
                this.f21799N = d2;
                this.f21800O = d3;
                if (d2 == -1.0d || d3 == -1.0d) {
                    setDataSource(this.f21801P);
                } else {
                    setDataSource(new C7173e(this.f21801P, (long) (d2 * 1000000.0d), (long) (d3 * 1000000.0d)));
                }
            }
        }
    }

    @Override
    public void mo7343o(boolean z) {
        C6643l2.m19710g(this, z);
    }

    @Override
    public void mo7342p() {
        C6637k2.m19736o(this);
    }

    @Override
    public void mo7341q(C6644l3 l3Var) {
        C6643l2.m19692y(this, l3Var);
    }

    public void m18518r() {
        setMuted(!this.f21804S);
    }

    @Override
    public void mo7340s(AbstractC6618i2.C6625f fVar, AbstractC6618i2.C6625f fVar2, int i) {
        C6643l2.m19699r(this, fVar, fVar2, i);
    }

    public void setActivityPaused(boolean z) {
        if (this.f21806U != z) {
            this.f21806U = z;
            m18517v();
        }
    }

    public void setDelegate(AbstractC6900a aVar) {
        this.f21809b = aVar;
    }

    public void setLooping(boolean z) {
        if (this.f21803R != z) {
            this.f21803R = z;
            m18517v();
        }
    }

    public void setMuted(boolean z) {
        if (this.f21804S != z) {
            this.f21804S = z;
            m18517v();
            AbstractC6900a aVar = this.f21809b;
            if (aVar != null) {
                aVar.mo6832b(z);
            }
        }
    }

    public void setPlaying(boolean z) {
        if (this.f21805T != z) {
            this.f21805T = z;
            m18517v();
        }
    }

    public void setVideo(String str) {
        if (!C5070i.m24068c(this.f21798M, str) || C5070i.m24062i(str)) {
            this.f21798M = str;
            this.f21800O = -1.0d;
            this.f21799N = -1.0d;
            this.f21807V = 0L;
            if (C5070i.m24062i(str)) {
                AbstractC6689s sVar = this.f21808a;
                if (sVar != null) {
                    sVar.mo19282a();
                    this.f21808a = null;
                }
                AbstractC7230t tVar = this.f21802Q;
                if (!(tVar == null || this.f21801P == tVar)) {
                    this.f21802Q = null;
                }
                if (this.f21801P != null) {
                    this.f21801P = null;
                }
                setRendered(false);
                return;
            }
            m18521j();
            AbstractC7230t i2 = C7389v0.m16623i2(new File(str));
            this.f21801P = i2;
            setDataSource(i2);
        }
    }

    @Override
    public void mo7339t(C7233t0 t0Var, C11272n nVar) {
        C6637k2.m19733r(this, t0Var, nVar);
    }

    @Override
    public void mo7338u(float f) {
        C6643l2.m19717A(this, f);
    }

    public final void m18517v() {
        AbstractC6689s sVar = this.f21808a;
        if (sVar != null) {
            boolean z = true;
            sVar.mo19313E(!this.f21803R ? 1 : 0);
            this.f21808a.mo19361f(this.f21804S ? 0.0f : 1.0f);
            AbstractC6689s sVar2 = this.f21808a;
            if (!this.f21805T || this.f21806U) {
                z = false;
            }
            sVar2.mo19341v(z);
        }
    }

    @Override
    public void mo7223w(int i) {
        AbstractC6689s sVar;
        long j = 0;
        if (i != 3) {
            if (i == 4 && this.f21803R && (sVar = this.f21808a) != null) {
                sVar.mo19780c(0L);
            }
        } else if (this.f21807V == 0 && !(this.f21802Q instanceof C7173e)) {
            AbstractC6689s sVar2 = this.f21808a;
            if (sVar2 != null) {
                j = sVar2.mo19268g();
            }
            this.f21807V = j;
        }
    }
}
