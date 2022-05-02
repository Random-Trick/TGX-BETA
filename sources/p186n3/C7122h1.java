package p186n3;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p006a5.AbstractC0134e;
import p020b5.AbstractC1192d;
import p020b5.AbstractC1221n;
import p020b5.C1186a;
import p020b5.C1213l;
import p020b5.C1216l0;
import p020b5.C1226r;
import p032c5.AbstractC1642z;
import p032c5.C1607b0;
import p032c5.C1631o;
import p073f4.C4260a;
import p174m3.AbstractC6604g3;
import p174m3.AbstractC6618i2;
import p174m3.C6591e2;
import p174m3.C6600g1;
import p174m3.C6613h2;
import p174m3.C6637k2;
import p174m3.C6643l2;
import p174m3.C6644l3;
import p174m3.C6658o;
import p174m3.C6660o1;
import p174m3.C6681q;
import p174m3.C6693s1;
import p186n3.AbstractC7126i1;
import p187n4.AbstractC7230t;
import p187n4.AbstractC7240z;
import p187n4.C7205l;
import p187n4.C7221p;
import p187n4.C7226r;
import p187n4.C7233t0;
import p199o3.AbstractC7634s;
import p199o3.C7602e;
import p199o3.C7616h;
import p216p3.C8024e;
import p216p3.C8028h;
import p230q3.AbstractC8219w;
import p230q3.C8211p;
import p343y6.C10432h;
import p356z4.C11272n;
import p358z6.AbstractC11396q;
import p358z6.AbstractC11401r;
import p358z6.C11406t;

public class C7122h1 implements AbstractC6618i2.AbstractC6624e, AbstractC7634s, AbstractC1642z, AbstractC7240z, AbstractC0134e.AbstractC0135a, AbstractC8219w {
    public final C7123a f22633M;
    public C1226r<AbstractC7126i1> f22635O;
    public AbstractC6618i2 f22636P;
    public AbstractC1221n f22637Q;
    public boolean f22638R;
    public final AbstractC1192d f22639a;
    public final AbstractC6604g3.C6606b f22640b;
    public final AbstractC6604g3.C6608d f22641c = new AbstractC6604g3.C6608d();
    public final SparseArray<AbstractC7126i1.C7127a> f22634N = new SparseArray<>();

    public static final class C7123a {
        public final AbstractC6604g3.C6606b f22642a;
        public AbstractC11396q<AbstractC7230t.C7231a> f22643b = AbstractC11396q.m768D();
        public AbstractC11401r<AbstractC7230t.C7231a, AbstractC6604g3> f22644c = AbstractC11401r.m740j();
        public AbstractC7230t.C7231a f22645d;
        public AbstractC7230t.C7231a f22646e;
        public AbstractC7230t.C7231a f22647f;

        public C7123a(AbstractC6604g3.C6606b bVar) {
            this.f22642a = bVar;
        }

        public static AbstractC7230t.C7231a m17593c(AbstractC6618i2 i2Var, AbstractC11396q<AbstractC7230t.C7231a> qVar, AbstractC7230t.C7231a aVar, AbstractC6604g3.C6606b bVar) {
            AbstractC6604g3 L = i2Var.mo19302L();
            int m = i2Var.mo19250m();
            Object s = L.m19820w() ? null : L.mo17299s(m);
            int f = (i2Var.mo19265h() || L.m19820w()) ? -1 : L.m19827j(m, bVar).m19812f(C1216l0.m37956q0(i2Var.mo19293Q()) - bVar.m19803o());
            for (int i = 0; i < qVar.size(); i++) {
                AbstractC7230t.C7231a aVar2 = qVar.get(i);
                if (m17587i(aVar2, s, i2Var.mo19265h(), i2Var.mo19317C(), i2Var.mo19247n(), f)) {
                    return aVar2;
                }
            }
            if (qVar.isEmpty() && aVar != null) {
                if (m17587i(aVar, s, i2Var.mo19265h(), i2Var.mo19317C(), i2Var.mo19247n(), f)) {
                    return aVar;
                }
            }
            return null;
        }

        public static boolean m17587i(AbstractC7230t.C7231a aVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!aVar.f23020a.equals(obj)) {
                return false;
            }
            return (z && aVar.f23021b == i && aVar.f23022c == i2) || (!z && aVar.f23021b == -1 && aVar.f23024e == i3);
        }

        public final void m17594b(AbstractC11401r.C11402a<AbstractC7230t.C7231a, AbstractC6604g3> aVar, AbstractC7230t.C7231a aVar2, AbstractC6604g3 g3Var) {
            if (aVar2 != null) {
                if (g3Var.mo17302f(aVar2.f23020a) != -1) {
                    aVar.m736c(aVar2, g3Var);
                    return;
                }
                AbstractC6604g3 g3Var2 = this.f22644c.get(aVar2);
                if (g3Var2 != null) {
                    aVar.m736c(aVar2, g3Var2);
                }
            }
        }

        public AbstractC7230t.C7231a m17592d() {
            return this.f22645d;
        }

        public AbstractC7230t.C7231a m17591e() {
            if (this.f22643b.isEmpty()) {
                return null;
            }
            return (AbstractC7230t.C7231a) C11406t.m717c(this.f22643b);
        }

        public AbstractC6604g3 m17590f(AbstractC7230t.C7231a aVar) {
            return this.f22644c.get(aVar);
        }

        public AbstractC7230t.C7231a m17589g() {
            return this.f22646e;
        }

        public AbstractC7230t.C7231a m17588h() {
            return this.f22647f;
        }

        public void m17586j(AbstractC6618i2 i2Var) {
            this.f22645d = m17593c(i2Var, this.f22643b, this.f22646e, this.f22642a);
        }

        public void m17585k(List<AbstractC7230t.C7231a> list, AbstractC7230t.C7231a aVar, AbstractC6618i2 i2Var) {
            this.f22643b = AbstractC11396q.m758z(list);
            if (!list.isEmpty()) {
                this.f22646e = list.get(0);
                this.f22647f = (AbstractC7230t.C7231a) C1186a.m38188e(aVar);
            }
            if (this.f22645d == null) {
                this.f22645d = m17593c(i2Var, this.f22643b, this.f22646e, this.f22642a);
            }
            m17583m(i2Var.mo19302L());
        }

        public void m17584l(AbstractC6618i2 i2Var) {
            this.f22645d = m17593c(i2Var, this.f22643b, this.f22646e, this.f22642a);
            m17583m(i2Var.mo19302L());
        }

        public final void m17583m(AbstractC6604g3 g3Var) {
            AbstractC11401r.C11402a<AbstractC7230t.C7231a, AbstractC6604g3> a = AbstractC11401r.m749a();
            if (this.f22643b.isEmpty()) {
                m17594b(a, this.f22646e, g3Var);
                if (!C10432h.m5139a(this.f22647f, this.f22646e)) {
                    m17594b(a, this.f22647f, g3Var);
                }
                if (!C10432h.m5139a(this.f22645d, this.f22646e) && !C10432h.m5139a(this.f22645d, this.f22647f)) {
                    m17594b(a, this.f22645d, g3Var);
                }
            } else {
                for (int i = 0; i < this.f22643b.size(); i++) {
                    m17594b(a, this.f22643b.get(i), g3Var);
                }
                if (!this.f22643b.contains(this.f22645d)) {
                    m17594b(a, this.f22645d, g3Var);
                }
            }
            this.f22644c = a.m738a();
        }
    }

    public C7122h1(AbstractC1192d dVar) {
        this.f22639a = (AbstractC1192d) C1186a.m38188e(dVar);
        this.f22635O = new C1226r<>(C1216l0.m38006J(), dVar, C7101a1.f22589a);
        AbstractC6604g3.C6606b bVar = new AbstractC6604g3.C6606b();
        this.f22640b = bVar;
        this.f22633M = new C7123a(bVar);
    }

    public static void m17734A2(AbstractC7126i1.C7127a aVar, C8024e eVar, AbstractC7126i1 i1Var) {
        i1Var.m17554b(aVar, eVar);
        i1Var.m17532m(aVar, 2, eVar);
    }

    public static void m17732B1(AbstractC7126i1 i1Var, C1213l lVar) {
    }

    public static void m17728C2(AbstractC7126i1.C7127a aVar, C6600g1 g1Var, C8028h hVar, AbstractC7126i1 i1Var) {
        i1Var.m17529n0(aVar, g1Var);
        i1Var.m17572K(aVar, g1Var, hVar);
        i1Var.m17518v(aVar, 2, g1Var);
    }

    public static void m17725D2(AbstractC7126i1.C7127a aVar, C1607b0 b0Var, AbstractC7126i1 i1Var) {
        i1Var.m17542h(aVar, b0Var);
        i1Var.m17575H(aVar, b0Var.f5886a, b0Var.f5887b, b0Var.f5888c, b0Var.f5885M);
    }

    public static void m17720F1(AbstractC7126i1.C7127a aVar, String str, long j, long j2, AbstractC7126i1 i1Var) {
        i1Var.m17520t(aVar, str, j);
        i1Var.m17526p(aVar, str, j2, j);
        i1Var.m17538j(aVar, 1, str, j);
    }

    public void m17716G2(AbstractC6618i2 i2Var, AbstractC7126i1 i1Var, C1213l lVar) {
        i1Var.m17524q(i2Var, new AbstractC7126i1.C7128b(lVar, this.f22634N));
    }

    public static void m17713H1(AbstractC7126i1.C7127a aVar, C8024e eVar, AbstractC7126i1 i1Var) {
        i1Var.m17579D(aVar, eVar);
        i1Var.m17570M(aVar, 1, eVar);
    }

    public static void m17709I1(AbstractC7126i1.C7127a aVar, C8024e eVar, AbstractC7126i1 i1Var) {
        i1Var.m17562U(aVar, eVar);
        i1Var.m17532m(aVar, 1, eVar);
    }

    public static void m17705J1(AbstractC7126i1.C7127a aVar, C6600g1 g1Var, C8028h hVar, AbstractC7126i1 i1Var) {
        i1Var.m17537j0(aVar, g1Var);
        i1Var.m17525p0(aVar, g1Var, hVar);
        i1Var.m17518v(aVar, 1, g1Var);
    }

    public static void m17680T1(AbstractC7126i1.C7127a aVar, int i, AbstractC7126i1 i1Var) {
        i1Var.m17551c0(aVar);
        i1Var.m17555a0(aVar, i);
    }

    public static void m17672X1(AbstractC7126i1.C7127a aVar, boolean z, AbstractC7126i1 i1Var) {
        i1Var.m17552c(aVar, z);
        i1Var.m17544g(aVar, z);
    }

    public static void m17638m2(AbstractC7126i1.C7127a aVar, int i, AbstractC6618i2.C6625f fVar, AbstractC6618i2.C6625f fVar2, AbstractC7126i1 i1Var) {
        i1Var.m17556a(aVar, i);
        i1Var.m17568O(aVar, fVar, fVar2, i);
    }

    public static void m17602x2(AbstractC7126i1.C7127a aVar, String str, long j, long j2, AbstractC7126i1 i1Var) {
        i1Var.m17530n(aVar, str, j);
        i1Var.m17560W(aVar, str, j2, j);
        i1Var.m17538j(aVar, 2, str, j);
    }

    public static void m17596z2(AbstractC7126i1.C7127a aVar, C8024e eVar, AbstractC7126i1 i1Var) {
        i1Var.m17543g0(aVar, eVar);
        i1Var.m17570M(aVar, 2, eVar);
    }

    @Override
    public final void mo15425A(final String str, final long j, final long j2) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1009, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17720F1(AbstractC7126i1.C7127a.this, str, j2, j, (AbstractC7126i1) obj);
            }
        });
    }

    public final AbstractC7126i1.C7127a m17735A1() {
        return m17607w1(this.f22633M.m17588h());
    }

    @Override
    public final void mo15424B(final C8024e eVar) {
        final AbstractC7126i1.C7127a z1 = m17597z1();
        m17701K2(z1, 1014, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17713H1(AbstractC7126i1.C7127a.this, eVar, (AbstractC7126i1) obj);
            }
        });
    }

    @Override
    public final void mo7370C(final boolean z) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 9, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17541h0(AbstractC7126i1.C7127a.this, z);
            }
        });
    }

    @Override
    public final void mo13194D(int i, AbstractC7230t.C7231a aVar) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1035, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17522r(AbstractC7126i1.C7127a.this);
            }
        });
    }

    @Override
    public final void mo15423E(final C6600g1 g1Var, final C8028h hVar) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1010, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17705J1(AbstractC7126i1.C7127a.this, g1Var, hVar, (AbstractC7126i1) obj);
            }
        });
    }

    @Override
    public final void mo13193F(int i, AbstractC7230t.C7231a aVar) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1033, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17540i(AbstractC7126i1.C7127a.this);
            }
        });
    }

    @Override
    public final void mo17241G(int i, AbstractC7230t.C7231a aVar, final C7205l lVar, final C7221p pVar) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1002, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17527o0(AbstractC7126i1.C7127a.this, lVar, pVar);
            }
        });
    }

    @Override
    public final void mo17715H(final C8024e eVar) {
        final AbstractC7126i1.C7127a z1 = m17597z1();
        m17701K2(z1, 1025, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17596z2(AbstractC7126i1.C7127a.this, eVar, (AbstractC7126i1) obj);
            }
        });
    }

    public final void m17712H2() {
        if (!this.f22638R) {
            final AbstractC7126i1.C7127a u1 = m17613u1();
            this.f22638R = true;
            m17701K2(u1, -1, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    ((AbstractC7126i1) obj).m17558Y(AbstractC7126i1.C7127a.this);
                }
            });
        }
    }

    @Override
    public final void mo17711I(final int i, final long j) {
        final AbstractC7126i1.C7127a z1 = m17597z1();
        m17701K2(z1, 1023, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17517w(AbstractC7126i1.C7127a.this, i, j);
            }
        });
    }

    public void m17708I2() {
        ((AbstractC1221n) C1186a.m38185h(this.f22637Q)).mo37918c(new Runnable() {
            @Override
            public final void run() {
                C7122h1.this.m17704J2();
            }
        });
    }

    @Override
    public final void mo17707J(final C6600g1 g1Var, final C8028h hVar) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1022, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17728C2(AbstractC7126i1.C7127a.this, g1Var, hVar, (AbstractC7126i1) obj);
            }
        });
    }

    public final void m17704J2() {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 1036, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17561V(AbstractC7126i1.C7127a.this);
            }
        });
        this.f22635O.m37898i();
    }

    @Override
    public final void mo7368K(AbstractC6604g3 g3Var, final int i) {
        this.f22633M.m17584l((AbstractC6618i2) C1186a.m38188e(this.f22636P));
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 0, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17571L(AbstractC7126i1.C7127a.this, i);
            }
        });
    }

    public final void m17701K2(AbstractC7126i1.C7127a aVar, int i, C1226r.AbstractC1227a<AbstractC7126i1> aVar2) {
        this.f22634N.put(i, aVar);
        this.f22635O.m37896k(i, aVar2);
    }

    @Override
    public void mo7367L(int i, boolean z) {
        C6643l2.m19712e(this, i, z);
    }

    public void m17698L2(final AbstractC6618i2 i2Var, Looper looper) {
        C1186a.m38187f(this.f22636P == null || this.f22633M.f22643b.isEmpty());
        this.f22636P = (AbstractC6618i2) C1186a.m38188e(i2Var);
        this.f22637Q = this.f22639a.mo38086b(looper, null);
        this.f22635O = this.f22635O.m37903d(looper, new C1226r.AbstractC1228b() {
            @Override
            public final void mo17512a(Object obj, C1213l lVar) {
                C7122h1.this.m17716G2(i2Var, (AbstractC7126i1) obj, lVar);
            }
        });
    }

    @Override
    public final void mo7366M(final boolean z, final int i) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, -1, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17550d(AbstractC7126i1.C7127a.this, z, i);
            }
        });
    }

    public final void m17695M2(List<AbstractC7230t.C7231a> list, AbstractC7230t.C7231a aVar) {
        this.f22633M.m17585k(list, aVar, (AbstractC6618i2) C1186a.m38188e(this.f22636P));
    }

    @Override
    public void mo7365N(final C6693s1 s1Var) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 14, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17567P(AbstractC7126i1.C7127a.this, s1Var);
            }
        });
    }

    @Override
    public final void mo13192O(int i, AbstractC7230t.C7231a aVar, final Exception exc) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1032, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17553b0(AbstractC7126i1.C7127a.this, exc);
            }
        });
    }

    @Override
    public final void mo13191P(int i, AbstractC7230t.C7231a aVar, final int i2) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1030, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17680T1(AbstractC7126i1.C7127a.this, i2, (AbstractC7126i1) obj);
            }
        });
    }

    @Override
    public final void mo17688Q(final Object obj, final long j) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1027, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj2) {
                ((AbstractC7126i1) obj2).m17534l(AbstractC7126i1.C7127a.this, obj, j);
            }
        });
    }

    @Override
    public final void mo7364R(final int i) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 8, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17564S(AbstractC7126i1.C7127a.this, i);
            }
        });
    }

    @Override
    public void mo15422S(C6600g1 g1Var) {
        C7616h.m15472a(this, g1Var);
    }

    @Override
    public final void mo13190T(int i, AbstractC7230t.C7231a aVar) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1034, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17539i0(AbstractC7126i1.C7127a.this);
            }
        });
    }

    @Override
    public final void mo17240U(int i, AbstractC7230t.C7231a aVar, final C7205l lVar, final C7221p pVar) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1000, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17514z(AbstractC7126i1.C7127a.this, lVar, pVar);
            }
        });
    }

    @Override
    public final void mo7363V(final C7602e eVar) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1016, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17523q0(AbstractC7126i1.C7127a.this, eVar);
            }
        });
    }

    @Override
    public final void mo15421W(final long j) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1011, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17535k0(AbstractC7126i1.C7127a.this, j);
            }
        });
    }

    @Override
    public final void mo13189X(int i, AbstractC7230t.C7231a aVar) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1031, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17566Q(AbstractC7126i1.C7127a.this);
            }
        });
    }

    @Override
    public final void mo15420Y(final Exception exc) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1037, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17577F(AbstractC7126i1.C7127a.this, exc);
            }
        });
    }

    @Override
    public final void mo17669Z(final Exception exc) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1038, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17557Z(AbstractC7126i1.C7127a.this, exc);
            }
        });
    }

    @Override
    public final void mo7362a(final boolean z) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1017, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17582A(AbstractC7126i1.C7127a.this, z);
            }
        });
    }

    @Override
    public final void mo7361a0(final boolean z, final int i) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 5, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17519u(AbstractC7126i1.C7127a.this, z, i);
            }
        });
    }

    @Override
    public final void mo7360b(final C1607b0 b0Var) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1028, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17725D2(AbstractC7126i1.C7127a.this, b0Var, (AbstractC7126i1) obj);
            }
        });
    }

    @Override
    public final void mo7359b0(final C6660o1 o1Var, final int i) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 1, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17573J(AbstractC7126i1.C7127a.this, o1Var, i);
            }
        });
    }

    @Override
    public final void mo7358c(final C6613h2 h2Var) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 12, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17515y(AbstractC7126i1.C7127a.this, h2Var);
            }
        });
    }

    @Override
    public void mo7357c0(AbstractC6618i2 i2Var, AbstractC6618i2.C6623d dVar) {
        C6643l2.m19711f(this, i2Var, dVar);
    }

    @Override
    public final void mo7356d(final C4260a aVar) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 1007, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17565R(AbstractC7126i1.C7127a.this, aVar);
            }
        });
    }

    @Override
    public final void mo17239d0(int i, AbstractC7230t.C7231a aVar, final C7205l lVar, final C7221p pVar) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1001, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17569N(AbstractC7126i1.C7127a.this, lVar, pVar);
            }
        });
    }

    @Override
    public void mo7252e() {
        C6643l2.m19698s(this);
    }

    @Override
    public final void mo7355e0(final C6591e2 e2Var) {
        C7226r rVar;
        final AbstractC7126i1.C7127a w1 = (!(e2Var instanceof C6681q) || (rVar = ((C6681q) e2Var).f20913R) == null) ? null : m17607w1(new AbstractC7230t.C7231a(rVar));
        if (w1 == null) {
            w1 = m17613u1();
        }
        m17701K2(w1, 10, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17521s(AbstractC7126i1.C7127a.this, e2Var);
            }
        });
    }

    @Override
    public final void mo15418f(final Exception exc) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1018, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17547e0(AbstractC7126i1.C7127a.this, exc);
            }
        });
    }

    @Override
    public void mo7354f0(final int i, final int i2) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1029, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17581B(AbstractC7126i1.C7127a.this, i, i2);
            }
        });
    }

    @Override
    public void mo7353g(List list) {
        C6643l2.m19714c(this, list);
    }

    @Override
    public final void mo15417g0(final C8024e eVar) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1008, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17709I1(AbstractC7126i1.C7127a.this, eVar, (AbstractC7126i1) obj);
            }
        });
    }

    @Override
    public final void mo7352h(final int i) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 6, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17548e(AbstractC7126i1.C7127a.this, i);
            }
        });
    }

    @Override
    public final void mo15416h0(final int i, final long j, final long j2) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1012, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17574I(AbstractC7126i1.C7127a.this, i, j, j2);
            }
        });
    }

    @Override
    public final void mo17238i(int i, AbstractC7230t.C7231a aVar, final C7221p pVar) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1004, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17516x(AbstractC7126i1.C7127a.this, pVar);
            }
        });
    }

    @Override
    public void mo7351i0(final AbstractC6618i2.C6620b bVar) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 13, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17528o(AbstractC7126i1.C7127a.this, bVar);
            }
        });
    }

    @Override
    public final void mo17648j(final C8024e eVar) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1020, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17734A2(AbstractC7126i1.C7127a.this, eVar, (AbstractC7126i1) obj);
            }
        });
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
    public final void mo17645k0(final long j, final int i) {
        final AbstractC7126i1.C7127a z1 = m17597z1();
        m17701K2(z1, 1026, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17578E(AbstractC7126i1.C7127a.this, j, i);
            }
        });
    }

    @Override
    public void mo7347l(int i) {
        C6637k2.m19739l(this, i);
    }

    @Override
    public void mo7346l0(C6591e2 e2Var) {
        C6643l2.m19700q(this, e2Var);
    }

    @Override
    public final void mo17640m(final String str) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, Log.TAG_CAMERA, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17546f(AbstractC7126i1.C7127a.this, str);
            }
        });
    }

    @Override
    public void mo7344m0(final boolean z) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 7, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17563T(AbstractC7126i1.C7127a.this, z);
            }
        });
    }

    @Override
    public final void mo17637n(final String str, final long j, final long j2) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1021, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17602x2(AbstractC7126i1.C7127a.this, str, j2, j, (AbstractC7126i1) obj);
            }
        });
    }

    @Override
    public final void mo7343o(final boolean z) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 3, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17672X1(AbstractC7126i1.C7127a.this, z, (AbstractC7126i1) obj);
            }
        });
    }

    @Override
    public final void mo7342p() {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, -1, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17576G(AbstractC7126i1.C7127a.this);
            }
        });
    }

    @Override
    public void mo7341q(final C6644l3 l3Var) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 2, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17580C(AbstractC7126i1.C7127a.this, l3Var);
            }
        });
    }

    @Override
    public void mo17624r(C6600g1 g1Var) {
        C1631o.m36155a(this, g1Var);
    }

    @Override
    public final void mo7340s(final AbstractC6618i2.C6625f fVar, final AbstractC6618i2.C6625f fVar2, final int i) {
        if (i == 1) {
            this.f22638R = false;
        }
        this.f22633M.m17586j((AbstractC6618i2) C1186a.m38188e(this.f22636P));
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 11, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                C7122h1.m17638m2(AbstractC7126i1.C7127a.this, i, fVar, fVar2, (AbstractC7126i1) obj);
            }
        });
    }

    @Override
    public final void mo7339t(final C7233t0 t0Var, final C11272n nVar) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 2, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17559X(AbstractC7126i1.C7127a.this, t0Var, nVar);
            }
        });
    }

    @Override
    public final void mo7338u(final float f) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1019, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17533l0(AbstractC7126i1.C7127a.this, f);
            }
        });
    }

    public final AbstractC7126i1.C7127a m17613u1() {
        return m17607w1(this.f22633M.m17592d());
    }

    @Override
    public void mo13188v(int i, AbstractC7230t.C7231a aVar) {
        C8211p.m13197a(this, i, aVar);
    }

    @RequiresNonNull({"player"})
    public final AbstractC7126i1.C7127a m17610v1(AbstractC6604g3 g3Var, int i, AbstractC7230t.C7231a aVar) {
        long j;
        AbstractC7230t.C7231a aVar2 = g3Var.m19820w() ? null : aVar;
        long d = this.f22639a.mo38084d();
        boolean z = true;
        boolean z2 = g3Var.equals(this.f22636P.mo19302L()) && i == this.f22636P.mo19315D();
        long j2 = 0;
        if (aVar2 != null && aVar2.m17274b()) {
            if (!(z2 && this.f22636P.mo19317C() == aVar2.f23021b && this.f22636P.mo19247n() == aVar2.f23022c)) {
                z = false;
            }
            if (z) {
                j2 = this.f22636P.mo19293Q();
            }
        } else if (z2) {
            j = this.f22636P.mo19223x();
            return new AbstractC7126i1.C7127a(d, g3Var, i, aVar2, j, this.f22636P.mo19302L(), this.f22636P.mo19315D(), this.f22633M.m17592d(), this.f22636P.mo19293Q(), this.f22636P.mo19262i());
        } else if (!g3Var.m19820w()) {
            j2 = g3Var.m19821t(i, this.f22641c).m19795d();
        }
        j = j2;
        return new AbstractC7126i1.C7127a(d, g3Var, i, aVar2, j, this.f22636P.mo19302L(), this.f22636P.mo19315D(), this.f22633M.m17592d(), this.f22636P.mo19293Q(), this.f22636P.mo19262i());
    }

    @Override
    public final void mo7223w(final int i) {
        final AbstractC7126i1.C7127a u1 = m17613u1();
        m17701K2(u1, 4, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17549d0(AbstractC7126i1.C7127a.this, i);
            }
        });
    }

    public final AbstractC7126i1.C7127a m17607w1(AbstractC7230t.C7231a aVar) {
        C1186a.m38188e(this.f22636P);
        AbstractC6604g3 f = aVar == null ? null : this.f22633M.m17590f(aVar);
        if (aVar != null && f != null) {
            return m17610v1(f, f.mo19826l(aVar.f23020a, this.f22640b).f20639c, aVar);
        }
        int D = this.f22636P.mo19315D();
        AbstractC6604g3 L = this.f22636P.mo19302L();
        if (!(D < L.mo17297v())) {
            L = AbstractC6604g3.f20630a;
        }
        return m17610v1(L, D, null);
    }

    @Override
    public final void mo17605x(final int i, final long j, final long j2) {
        final AbstractC7126i1.C7127a x1 = m17603x1();
        m17701K2(x1, 1006, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17531m0(AbstractC7126i1.C7127a.this, i, j, j2);
            }
        });
    }

    public final AbstractC7126i1.C7127a m17603x1() {
        return m17607w1(this.f22633M.m17591e());
    }

    @Override
    public final void mo17237y(int i, AbstractC7230t.C7231a aVar, final C7205l lVar, final C7221p pVar, final IOException iOException, final boolean z) {
        final AbstractC7126i1.C7127a y1 = m17600y1(i, aVar);
        m17701K2(y1, 1003, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17536k(AbstractC7126i1.C7127a.this, lVar, pVar, iOException, z);
            }
        });
    }

    public final AbstractC7126i1.C7127a m17600y1(int i, AbstractC7230t.C7231a aVar) {
        C1186a.m38188e(this.f22636P);
        boolean z = true;
        if (aVar != null) {
            if (this.f22633M.m17590f(aVar) == null) {
                z = false;
            }
            if (z) {
                return m17607w1(aVar);
            }
            return m17610v1(AbstractC6604g3.f20630a, i, aVar);
        }
        AbstractC6604g3 L = this.f22636P.mo19302L();
        if (i >= L.mo17297v()) {
            z = false;
        }
        if (!z) {
            L = AbstractC6604g3.f20630a;
        }
        return m17610v1(L, i, null);
    }

    @Override
    public final void mo15415z(final String str) {
        final AbstractC7126i1.C7127a A1 = m17735A1();
        m17701K2(A1, 1013, new C1226r.AbstractC1227a() {
            @Override
            public final void mo17513a(Object obj) {
                ((AbstractC7126i1) obj).m17545f0(AbstractC7126i1.C7127a.this, str);
            }
        });
    }

    public final AbstractC7126i1.C7127a m17597z1() {
        return m17607w1(this.f22633M.m17589g());
    }
}
