package p174m3;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p006a5.AbstractC0134e;
import p020b5.AbstractC1192d;
import p020b5.AbstractC1221n;
import p020b5.C1186a;
import p020b5.C1213l;
import p020b5.C1216l0;
import p020b5.C1226r;
import p020b5.C1230s;
import p073f4.C4260a;
import p174m3.AbstractC6604g3;
import p174m3.AbstractC6618i2;
import p174m3.AbstractC6689s;
import p174m3.C6570c1;
import p174m3.C6654n2;
import p174m3.C6728z1;
import p186n3.C7122h1;
import p187n4.AbstractC7164a0;
import p187n4.AbstractC7214n0;
import p187n4.AbstractC7230t;
import p187n4.C7233t0;
import p356z4.AbstractC11265j;
import p356z4.AbstractC11280t;
import p356z4.C11272n;
import p356z4.C11282u;
import p358z6.AbstractC11396q;

public final class C6726z0 extends AbstractC6588e {
    public C6717x2 f21125A;
    public AbstractC7214n0 f21126B;
    public boolean f21127C;
    public AbstractC6618i2.C6620b f21128D;
    public C6693s1 f21129E;
    public C6693s1 f21130F;
    public C6693s1 f21131G;
    public C6596f2 f21132H;
    public int f21133I;
    public int f21134J;
    public long f21135K;
    public final C11282u f21136b;
    public final AbstractC6618i2.C6620b f21137c;
    public final AbstractC6696s2[] f21138d;
    public final AbstractC11280t f21139e;
    public final AbstractC1221n f21140f;
    public final C6570c1.AbstractC6576f f21141g;
    public final C6570c1 f21142h;
    public final C1226r<AbstractC6618i2.AbstractC6622c> f21143i;
    public final CopyOnWriteArraySet<AbstractC6689s.AbstractC6690a> f21144j;
    public final AbstractC6604g3.C6606b f21145k;
    public final List<C6727a> f21146l;
    public final boolean f21147m;
    public final AbstractC7164a0 f21148n;
    public final C7122h1 f21149o;
    public final Looper f21150p;
    public final AbstractC0134e f21151q;
    public final long f21152r;
    public final long f21153s;
    public final AbstractC1192d f21154t;
    public int f21155u;
    public boolean f21156v;
    public int f21157w;
    public int f21158x;
    public boolean f21159y;
    public int f21160z;

    public static final class C6727a implements AbstractC6716x1 {
        public final Object f21161a;
        public AbstractC6604g3 f21162b;

        public C6727a(Object obj, AbstractC6604g3 g3Var) {
            this.f21161a = obj;
            this.f21162b = g3Var;
        }

        @Override
        public Object mo19182a() {
            return this.f21161a;
        }

        @Override
        public AbstractC6604g3 mo19181b() {
            return this.f21162b;
        }
    }

    static {
        C6585d1.m19945a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public C6726z0(AbstractC6696s2[] s2VarArr, AbstractC11280t tVar, AbstractC7164a0 a0Var, AbstractC6648m1 m1Var, AbstractC0134e eVar, C7122h1 h1Var, boolean z, C6717x2 x2Var, long j, long j2, AbstractC6642l1 l1Var, long j3, boolean z2, AbstractC1192d dVar, Looper looper, AbstractC6618i2 i2Var, AbstractC6618i2.C6620b bVar) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = C1216l0.f4530e;
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb2.append("Init ");
        sb2.append(hexString);
        sb2.append(" [");
        sb2.append("ExoPlayerLib/2.16.1");
        sb2.append("] [");
        sb2.append(str);
        sb2.append("]");
        C1230s.m37884f("ExoPlayerImpl", sb2.toString());
        C1186a.m38184f(s2VarArr.length > 0);
        this.f21138d = (AbstractC6696s2[]) C1186a.m38185e(s2VarArr);
        this.f21139e = (AbstractC11280t) C1186a.m38185e(tVar);
        this.f21148n = a0Var;
        this.f21151q = eVar;
        this.f21149o = h1Var;
        this.f21147m = z;
        this.f21125A = x2Var;
        this.f21152r = j;
        this.f21153s = j2;
        this.f21127C = z2;
        this.f21150p = looper;
        this.f21154t = dVar;
        this.f21155u = 0;
        final AbstractC6618i2 i2Var2 = i2Var != null ? i2Var : this;
        this.f21143i = new C1226r<>(looper, dVar, new C1226r.AbstractC1228b() {
            @Override
            public final void mo17512a(Object obj, C1213l lVar) {
                C6726z0.m19289S0(AbstractC6618i2.this, (AbstractC6618i2.AbstractC6622c) obj, lVar);
            }
        });
        this.f21144j = new CopyOnWriteArraySet<>();
        this.f21146l = new ArrayList();
        this.f21126B = new AbstractC7214n0.C7215a(0);
        C11282u uVar = new C11282u(new C6709v2[s2VarArr.length], new AbstractC11265j[s2VarArr.length], C6644l3.f20757b, null);
        this.f21136b = uVar;
        this.f21145k = new AbstractC6604g3.C6606b();
        AbstractC6618i2.C6620b e = new AbstractC6618i2.C6620b.C6621a().m19767c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30).m19766d(29, tVar.mo961c()).m19768b(bVar).m19765e();
        this.f21137c = e;
        this.f21128D = new AbstractC6618i2.C6620b.C6621a().m19768b(e).m19769a(4).m19769a(10).m19765e();
        C6693s1 s1Var = C6693s1.f20948q0;
        this.f21129E = s1Var;
        this.f21130F = s1Var;
        this.f21131G = s1Var;
        this.f21133I = -1;
        this.f21140f = dVar.mo38083b(looper, null);
        C6570c1.AbstractC6576f q0Var = new C6570c1.AbstractC6576f() {
            @Override
            public final void mo19577a(C6570c1.C6575e eVar2) {
                C6726z0.this.m19287U0(eVar2);
            }
        };
        this.f21141g = q0Var;
        this.f21132H = C6596f2.m19905k(uVar);
        if (h1Var != null) {
            h1Var.m17698L2(i2Var2, looper);
            mo19294P(h1Var);
            eVar.mo42183a(new Handler(looper), h1Var);
        }
        this.f21142h = new C6570c1(s2VarArr, tVar, uVar, m1Var, eVar, this.f21155u, this.f21156v, h1Var, x2Var, l1Var, j3, z2, looper, dVar, q0Var);
    }

    public static long m19293P0(C6596f2 f2Var) {
        AbstractC6604g3.C6608d dVar = new AbstractC6604g3.C6608d();
        AbstractC6604g3.C6606b bVar = new AbstractC6604g3.C6606b();
        f2Var.f20543a.mo19825l(f2Var.f20544b.f23017a, bVar);
        if (f2Var.f20545c == -9223372036854775807L) {
            return f2Var.f20543a.m19820t(bVar.f20639c, dVar).m19793e();
        }
        return bVar.m19802o() + f2Var.f20545c;
    }

    public static boolean m19290R0(C6596f2 f2Var) {
        return f2Var.f20547e == 3 && f2Var.f20554l && f2Var.f20555m == 0;
    }

    public static void m19289S0(AbstractC6618i2 i2Var, AbstractC6618i2.AbstractC6622c cVar, C1213l lVar) {
        cVar.mo7357c0(i2Var, new AbstractC6618i2.C6623d(lVar));
    }

    public void m19287U0(final C6570c1.C6575e eVar) {
        this.f21140f.mo37915c(new Runnable() {
            @Override
            public final void run() {
                C6726z0.this.m19288T0(eVar);
            }
        });
    }

    public void m19286V0(AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7365N(this.f21129E);
    }

    public static void m19285W0(AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7355e0(C6681q.m19579j(new C6590e1(1), 1003));
    }

    public void m19282Z0(AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7351i0(this.f21128D);
    }

    public static void m19280a1(int i, AbstractC6618i2.C6625f fVar, AbstractC6618i2.C6625f fVar2, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7347l(i);
        cVar.mo7340s(fVar, fVar2, i);
    }

    public static void m19276c1(C6596f2 f2Var, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7346l0(f2Var.f20548f);
    }

    public static void m19273d1(C6596f2 f2Var, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7355e0(f2Var.f20548f);
    }

    public static void m19270e1(C6596f2 f2Var, C11272n nVar, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7339t(f2Var.f20550h, nVar);
    }

    public static void m19268f1(C6596f2 f2Var, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7341q(f2Var.f20551i.f36195d);
    }

    public static void m19262h1(C6596f2 f2Var, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7348k(f2Var.f20549g);
        cVar.mo7343o(f2Var.f20549g);
    }

    public static void m19259i1(C6596f2 f2Var, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7366M(f2Var.f20554l, f2Var.f20547e);
    }

    public static void m19256j1(C6596f2 f2Var, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7223w(f2Var.f20547e);
    }

    public static void m19253k1(C6596f2 f2Var, int i, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7361a0(f2Var.f20554l, i);
    }

    public static void m19250l1(C6596f2 f2Var, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7352h(f2Var.f20555m);
    }

    public static void m19247m1(C6596f2 f2Var, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7344m0(m19290R0(f2Var));
    }

    public static void m19244n1(C6596f2 f2Var, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7358c(f2Var.f20556n);
    }

    public static void m19242o1(C6596f2 f2Var, int i, AbstractC6618i2.AbstractC6622c cVar) {
        cVar.mo7368K(f2Var.f20543a, i);
    }

    public void m19320A(int i, AbstractC7230t tVar) {
        m19272e(i, Collections.singletonList(tVar));
    }

    public void m19319A0(AbstractC6618i2.AbstractC6622c cVar) {
        this.f21143i.m37901c(cVar);
    }

    public final void m19318A1(final C6596f2 f2Var, final int i, final int i2, boolean z, boolean z2, final int i3, long j, int i4) {
        C6596f2 f2Var2 = this.f21132H;
        this.f21132H = f2Var;
        Pair<Boolean, Integer> F0 = m19310F0(f2Var, f2Var2, z2, i3, !f2Var2.f20543a.equals(f2Var.f20543a));
        boolean booleanValue = ((Boolean) F0.first).booleanValue();
        final int intValue = ((Integer) F0.second).intValue();
        C6693s1 s1Var = this.f21129E;
        final C6660o1 o1Var = null;
        if (booleanValue) {
            if (!f2Var.f20543a.m19819w()) {
                o1Var = f2Var.f20543a.m19820t(f2Var.f20543a.mo19825l(f2Var.f20544b.f23017a, this.f21145k).f20639c, this.f20519a).f20664c;
            }
            this.f21131G = C6693s1.f20948q0;
        }
        if (booleanValue || !f2Var2.f20552j.equals(f2Var.f20552j)) {
            this.f21131G = this.f21131G.m19552b().m19539K(f2Var.f20552j).m19543G();
            s1Var = m19315C0();
        }
        boolean z3 = !s1Var.equals(this.f21129E);
        this.f21129E = s1Var;
        if (!f2Var2.f20543a.equals(f2Var.f20543a)) {
            this.f21143i.m37896h(0, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19242o1(C6596f2.this, i, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
        if (z2) {
            final AbstractC6618i2.C6625f O0 = m19295O0(i3, f2Var2, i4);
            final AbstractC6618i2.C6625f N0 = m19296N0(j);
            this.f21143i.m37896h(11, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19280a1(i3, O0, N0, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
        if (booleanValue) {
            this.f21143i.m37896h(1, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    ((AbstractC6618i2.AbstractC6622c) obj).mo7359b0(C6660o1.this, intValue);
                }
            });
        }
        if (f2Var2.f20548f != f2Var.f20548f) {
            this.f21143i.m37896h(10, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19276c1(C6596f2.this, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
            if (f2Var.f20548f != null) {
                this.f21143i.m37896h(10, new C1226r.AbstractC1227a() {
                    @Override
                    public final void mo17513a(Object obj) {
                        C6726z0.m19273d1(C6596f2.this, (AbstractC6618i2.AbstractC6622c) obj);
                    }
                });
            }
        }
        C11282u uVar = f2Var2.f20551i;
        C11282u uVar2 = f2Var.f20551i;
        if (uVar != uVar2) {
            this.f21139e.mo960d(uVar2.f36196e);
            final C11272n nVar = new C11272n(f2Var.f20551i.f36194c);
            this.f21143i.m37896h(2, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19270e1(C6596f2.this, nVar, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
            this.f21143i.m37896h(2, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19268f1(C6596f2.this, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
        if (z3) {
            final C6693s1 s1Var2 = this.f21129E;
            this.f21143i.m37896h(14, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    ((AbstractC6618i2.AbstractC6622c) obj).mo7365N(C6693s1.this);
                }
            });
        }
        if (f2Var2.f20549g != f2Var.f20549g) {
            this.f21143i.m37896h(3, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19262h1(C6596f2.this, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
        if (!(f2Var2.f20547e == f2Var.f20547e && f2Var2.f20554l == f2Var.f20554l)) {
            this.f21143i.m37896h(-1, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19259i1(C6596f2.this, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
        if (f2Var2.f20547e != f2Var.f20547e) {
            this.f21143i.m37896h(4, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19256j1(C6596f2.this, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
        if (f2Var2.f20554l != f2Var.f20554l) {
            this.f21143i.m37896h(5, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19253k1(C6596f2.this, i2, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
        if (f2Var2.f20555m != f2Var.f20555m) {
            this.f21143i.m37896h(6, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19250l1(C6596f2.this, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
        if (m19290R0(f2Var2) != m19290R0(f2Var)) {
            this.f21143i.m37896h(7, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19247m1(C6596f2.this, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
        if (!f2Var2.f20556n.equals(f2Var.f20556n)) {
            this.f21143i.m37896h(12, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.m19244n1(C6596f2.this, (AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
        if (z) {
            this.f21143i.m37896h(-1, C6652n0.f20783a);
        }
        m19215z1();
        this.f21143i.m37899e();
        if (f2Var2.f20557o != f2Var.f20557o) {
            Iterator<AbstractC6689s.AbstractC6690a> it = this.f21144j.iterator();
            while (it.hasNext()) {
                it.next().mo19330P(f2Var.f20557o);
            }
        }
        if (f2Var2.f20558p != f2Var.f20558p) {
            Iterator<AbstractC6689s.AbstractC6690a> it2 = this.f21144j.iterator();
            while (it2.hasNext()) {
                it2.next().mo19325x(f2Var.f20558p);
            }
        }
    }

    public final List<C6728z1.C6731c> m19317B0(int i, List<AbstractC7230t> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C6728z1.C6731c cVar = new C6728z1.C6731c(list.get(i2), this.f21147m);
            arrayList.add(cVar);
            this.f21146l.add(i2 + i, new C6727a(cVar.f21182b, cVar.f21181a.m17311K()));
        }
        this.f21126B = this.f21126B.mo17320f(i, arrayList.size());
        return arrayList;
    }

    @Override
    public int mo19316C() {
        if (mo19264h()) {
            return this.f21132H.f20544b.f23018b;
        }
        return -1;
    }

    public final C6693s1 m19315C0() {
        C6660o1 T = m19941T();
        if (T == null) {
            return this.f21131G;
        }
        return this.f21131G.m19552b().m19541I(T.f20812N).m19543G();
    }

    @Override
    public int mo19314D() {
        int K0 = m19302K0();
        if (K0 == -1) {
            return 0;
        }
        return K0;
    }

    public final AbstractC6604g3 m19313D0() {
        return new C6676o2(this.f21146l, this.f21126B);
    }

    @Override
    public void mo19312E(final int i) {
        if (this.f21155u != i) {
            this.f21155u = i;
            this.f21142h.m20054T0(i);
            this.f21143i.m37896h(8, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    ((AbstractC6618i2.AbstractC6622c) obj).mo7364R(i);
                }
            });
            m19215z1();
            this.f21143i.m37899e();
        }
    }

    public C6654n2 m19311E0(C6654n2.AbstractC6656b bVar) {
        return new C6654n2(this.f21142h, bVar, this.f21132H.f20543a, mo19314D(), this.f21154t, this.f21142h.m20093A());
    }

    public final Pair<Boolean, Integer> m19310F0(C6596f2 f2Var, C6596f2 f2Var2, boolean z, int i, boolean z2) {
        AbstractC6604g3 g3Var = f2Var2.f20543a;
        AbstractC6604g3 g3Var2 = f2Var.f20543a;
        if (g3Var2.m19819w() && g3Var.m19819w()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (g3Var2.m19819w() != g3Var.m19819w()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (!g3Var.m19820t(g3Var.mo19825l(f2Var2.f20544b.f23017a, this.f21145k).f20639c, this.f20519a).f20662a.equals(g3Var2.m19820t(g3Var2.mo19825l(f2Var.f20544b.f23017a, this.f21145k).f20639c, this.f20519a).f20662a)) {
            if (z && i == 0) {
                i2 = 1;
            } else if (z && i == 1) {
                i2 = 2;
            } else if (!z2) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
        } else if (!z || i != 0 || f2Var2.f20544b.f23020d >= f2Var.f20544b.f23020d) {
            return new Pair<>(Boolean.FALSE, -1);
        } else {
            return new Pair<>(Boolean.TRUE, 0);
        }
    }

    public boolean m19309G0() {
        return this.f21132H.f20558p;
    }

    @Override
    public void mo19308H(int i, int i2, int i3) {
        C1186a.m38189a(i >= 0 && i <= i2 && i2 <= this.f21146l.size() && i3 >= 0);
        AbstractC6604g3 L = mo19301L();
        this.f21157w++;
        int min = Math.min(i3, this.f21146l.size() - (i2 - i));
        C1216l0.m37955p0(this.f21146l, i, i2, min);
        AbstractC6604g3 D0 = m19313D0();
        C6596f2 p1 = m19239p1(this.f21132H, D0, m19300L0(L, D0));
        this.f21142h.m20035d0(i, i2, min, this.f21126B);
        m19318A1(p1, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public void m19307H0(long j) {
        this.f21142h.m19992t(j);
    }

    public Looper m19306I0() {
        return this.f21150p;
    }

    @Override
    public C7233t0 mo19305J() {
        return this.f21132H.f20550h;
    }

    public final long m19304J0(C6596f2 f2Var) {
        if (f2Var.f20543a.m19819w()) {
            return C1216l0.m37953q0(this.f21135K);
        }
        if (f2Var.f20544b.m17274b()) {
            return f2Var.f20561s;
        }
        return m19235r1(f2Var.f20543a, f2Var.f20544b, f2Var.f20561s);
    }

    @Override
    public int mo19303K() {
        return this.f21155u;
    }

    public final int m19302K0() {
        if (this.f21132H.f20543a.m19819w()) {
            return this.f21133I;
        }
        C6596f2 f2Var = this.f21132H;
        return f2Var.f20543a.mo19825l(f2Var.f20544b.f23017a, this.f21145k).f20639c;
    }

    @Override
    public AbstractC6604g3 mo19301L() {
        return this.f21132H.f20543a;
    }

    public final Pair<Object, Long> m19300L0(AbstractC6604g3 g3Var, AbstractC6604g3 g3Var2) {
        long x = mo19222x();
        int i = -1;
        if (g3Var.m19819w() || g3Var2.m19819w()) {
            boolean z = !g3Var.m19819w() && g3Var2.m19819w();
            if (!z) {
                i = m19302K0();
            }
            if (z) {
                x = -9223372036854775807L;
            }
            return m19298M0(g3Var2, i, x);
        }
        Pair<Object, Long> n = g3Var.m19824n(this.f20519a, this.f21145k, mo19314D(), C1216l0.m37953q0(x));
        Object obj = ((Pair) C1216l0.m37968j(n)).first;
        if (g3Var2.mo17302f(obj) != -1) {
            return n;
        }
        Object y0 = C6570c1.m19981y0(this.f20519a, this.f21145k, this.f21155u, this.f21156v, obj, g3Var, g3Var2);
        if (y0 == null) {
            return m19298M0(g3Var2, -1, -9223372036854775807L);
        }
        g3Var2.mo19825l(y0, this.f21145k);
        int i2 = this.f21145k.f20639c;
        return m19298M0(g3Var2, i2, g3Var2.m19820t(i2, this.f20519a).m19794d());
    }

    public void m19299M(AbstractC7230t tVar) {
        m19234s(Collections.singletonList(tVar));
    }

    public final Pair<Object, Long> m19298M0(AbstractC6604g3 g3Var, int i, long j) {
        if (g3Var.m19819w()) {
            this.f21133I = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f21135K = j;
            this.f21134J = 0;
            return null;
        }
        if (i == -1 || i >= g3Var.mo17297v()) {
            i = g3Var.mo17401e(this.f21156v);
            j = g3Var.m19820t(i, this.f20519a).m19794d();
        }
        return g3Var.m19824n(this.f20519a, this.f21145k, i, C1216l0.m37953q0(j));
    }

    @Override
    public boolean mo19297N() {
        return this.f21156v;
    }

    public final AbstractC6618i2.C6625f m19296N0(long j) {
        int i;
        Object obj;
        C6660o1 o1Var;
        int D = mo19314D();
        Object obj2 = null;
        if (!this.f21132H.f20543a.m19819w()) {
            C6596f2 f2Var = this.f21132H;
            Object obj3 = f2Var.f20544b.f23017a;
            f2Var.f20543a.mo19825l(obj3, this.f21145k);
            i = this.f21132H.f20543a.mo17302f(obj3);
            obj2 = this.f21132H.f20543a.m19820t(D, this.f20519a).f20662a;
            o1Var = this.f20519a.f20664c;
            obj = obj3;
        } else {
            o1Var = null;
            obj = null;
            i = -1;
        }
        long H0 = C1216l0.m38006H0(j);
        long H02 = this.f21132H.f20544b.m17274b() ? C1216l0.m38006H0(m19293P0(this.f21132H)) : H0;
        AbstractC7230t.C7231a aVar = this.f21132H.f20544b;
        return new AbstractC6618i2.C6625f(obj2, D, o1Var, obj, i, H0, H02, aVar.f23018b, aVar.f23019c);
    }

    public final AbstractC6618i2.C6625f m19295O0(int i, C6596f2 f2Var, int i2) {
        int i3;
        Object obj;
        C6660o1 o1Var;
        int i4;
        long j;
        long j2;
        AbstractC6604g3.C6606b bVar = new AbstractC6604g3.C6606b();
        Object obj2 = null;
        if (!f2Var.f20543a.m19819w()) {
            Object obj3 = f2Var.f20544b.f23017a;
            f2Var.f20543a.mo19825l(obj3, bVar);
            int i5 = bVar.f20639c;
            i3 = f2Var.f20543a.mo17302f(obj3);
            obj2 = f2Var.f20543a.m19820t(i5, this.f20519a).f20662a;
            o1Var = this.f20519a.f20664c;
            i4 = i5;
            obj = obj3;
        } else {
            i4 = i2;
            o1Var = null;
            obj = null;
            i3 = -1;
        }
        if (i == 0) {
            j = bVar.f20634N + bVar.f20633M;
            if (f2Var.f20544b.m17274b()) {
                AbstractC7230t.C7231a aVar = f2Var.f20544b;
                j = bVar.m19812e(aVar.f23018b, aVar.f23019c);
                j2 = m19293P0(f2Var);
            } else {
                if (f2Var.f20544b.f23021e != -1 && this.f21132H.f20544b.m17274b()) {
                    j = m19293P0(this.f21132H);
                }
                j2 = j;
            }
        } else if (f2Var.f20544b.m17274b()) {
            j = f2Var.f20561s;
            j2 = m19293P0(f2Var);
        } else {
            j = bVar.f20634N + f2Var.f20561s;
            j2 = j;
        }
        long H0 = C1216l0.m38006H0(j);
        long H02 = C1216l0.m38006H0(j2);
        AbstractC7230t.C7231a aVar2 = f2Var.f20544b;
        return new AbstractC6618i2.C6625f(obj2, i4, o1Var, obj, i3, H0, H02, aVar2.f23018b, aVar2.f23019c);
    }

    @Override
    public void mo19294P(AbstractC6618i2.AbstractC6624e eVar) {
        m19319A0(eVar);
    }

    @Override
    public long mo19292Q() {
        return C1216l0.m38006H0(m19304J0(this.f21132H));
    }

    public final void m19288T0(C6570c1.C6575e eVar) {
        long j;
        boolean z;
        long j2;
        int i = this.f21157w - eVar.f20486c;
        this.f21157w = i;
        boolean z2 = true;
        if (eVar.f20487d) {
            this.f21158x = eVar.f20488e;
            this.f21159y = true;
        }
        if (eVar.f20489f) {
            this.f21160z = eVar.f20490g;
        }
        if (i == 0) {
            AbstractC6604g3 g3Var = eVar.f20485b.f20543a;
            if (!this.f21132H.f20543a.m19819w() && g3Var.m19819w()) {
                this.f21133I = -1;
                this.f21135K = 0L;
                this.f21134J = 0;
            }
            if (!g3Var.m19819w()) {
                List<AbstractC6604g3> L = ((C6676o2) g3Var).m19585L();
                C1186a.m38184f(L.size() == this.f21146l.size());
                for (int i2 = 0; i2 < L.size(); i2++) {
                    this.f21146l.get(i2).f21162b = L.get(i2);
                }
            }
            if (this.f21159y) {
                if (eVar.f20485b.f20544b.equals(this.f21132H.f20544b) && eVar.f20485b.f20546d == this.f21132H.f20561s) {
                    z2 = false;
                }
                if (z2) {
                    if (g3Var.m19819w() || eVar.f20485b.f20544b.m17274b()) {
                        j2 = eVar.f20485b.f20546d;
                    } else {
                        C6596f2 f2Var = eVar.f20485b;
                        j2 = m19235r1(g3Var, f2Var.f20544b, f2Var.f20546d);
                    }
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f21159y = false;
            m19318A1(eVar.f20485b, 1, this.f21160z, false, z, this.f21158x, j, -1);
        }
    }

    @Override
    public void mo19281a() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = C1216l0.f4530e;
        String b = C6585d1.m19944b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(b).length());
        sb2.append("Release ");
        sb2.append(hexString);
        sb2.append(" [");
        sb2.append("ExoPlayerLib/2.16.1");
        sb2.append("] [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(b);
        sb2.append("]");
        C1230s.m37884f("ExoPlayerImpl", sb2.toString());
        if (!this.f21142h.m20015k0()) {
            this.f21143i.m37893k(10, C6641l0.f20756a);
        }
        this.f21143i.m37895i();
        this.f21140f.mo37907k(null);
        C7122h1 h1Var = this.f21149o;
        if (h1Var != null) {
            this.f21151q.mo42177g(h1Var);
        }
        C6596f2 h = this.f21132H.m19908h(1);
        this.f21132H = h;
        C6596f2 b2 = h.m19914b(h.f20544b);
        this.f21132H = b2;
        b2.f20559q = b2.f20561s;
        this.f21132H.f20560r = 0L;
    }

    @Override
    public void mo19279b() {
        C6596f2 f2Var = this.f21132H;
        if (f2Var.f20547e == 1) {
            C6596f2 f = f2Var.m19910f(null);
            C6596f2 h = f.m19908h(f.f20543a.m19819w() ? 4 : 2);
            this.f21157w++;
            this.f21142h.m20021i0();
            m19318A1(h, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    @Override
    public void mo19275d(C6613h2 h2Var) {
        if (h2Var == null) {
            h2Var = C6613h2.f20669M;
        }
        if (!this.f21132H.f20556n.equals(h2Var)) {
            C6596f2 g = this.f21132H.m19909g(h2Var);
            this.f21157w++;
            this.f21142h.m20058R0(h2Var);
            m19318A1(g, 0, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public void m19272e(int i, List<AbstractC7230t> list) {
        C1186a.m38189a(i >= 0);
        AbstractC6604g3 L = mo19301L();
        this.f21157w++;
        List<C6728z1.C6731c> B0 = m19317B0(i, list);
        AbstractC6604g3 D0 = m19313D0();
        C6596f2 p1 = m19239p1(this.f21132H, D0, m19300L0(L, D0));
        this.f21142h.m20016k(i, B0, this.f21126B);
        m19318A1(p1, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override
    public long mo19267g() {
        if (!mo19264h()) {
            return m19942S();
        }
        C6596f2 f2Var = this.f21132H;
        AbstractC7230t.C7231a aVar = f2Var.f20544b;
        f2Var.f20543a.mo19825l(aVar.f23017a, this.f21145k);
        return C1216l0.m38006H0(this.f21145k.m19812e(aVar.f23018b, aVar.f23019c));
    }

    @Override
    public boolean mo19264h() {
        return this.f21132H.f20544b.m17274b();
    }

    @Override
    public long mo19261i() {
        return C1216l0.m38006H0(this.f21132H.f20560r);
    }

    @Override
    public void mo19258j(int i, long j) {
        AbstractC6604g3 g3Var = this.f21132H.f20543a;
        if (i < 0 || (!g3Var.m19819w() && i >= g3Var.mo17297v())) {
            throw new C6636k1(g3Var, i, j);
        }
        int i2 = 1;
        this.f21157w++;
        if (mo19264h()) {
            C1230s.m37881i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C6570c1.C6575e eVar = new C6570c1.C6575e(this.f21132H);
            eVar.m19971b(1);
            this.f21141g.mo19577a(eVar);
            return;
        }
        if (mo19217z() != 1) {
            i2 = 2;
        }
        int D = mo19314D();
        C6596f2 p1 = m19239p1(this.f21132H.m19908h(i2), g3Var, m19298M0(g3Var, i, j));
        this.f21142h.m20092A0(g3Var, i, C1216l0.m37953q0(j));
        m19318A1(p1, 0, 1, true, true, 1, m19304J0(p1), D);
    }

    @Override
    public boolean mo19255k() {
        return this.f21132H.f20554l;
    }

    @Override
    public void mo19252l(final boolean z) {
        if (this.f21156v != z) {
            this.f21156v = z;
            this.f21142h.m20048W0(z);
            this.f21143i.m37896h(9, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    ((AbstractC6618i2.AbstractC6622c) obj).mo7370C(z);
                }
            });
            m19215z1();
            this.f21143i.m37899e();
        }
    }

    @Override
    public int mo19249m() {
        if (this.f21132H.f20543a.m19819w()) {
            return this.f21134J;
        }
        C6596f2 f2Var = this.f21132H;
        return f2Var.f20543a.mo17302f(f2Var.f20544b.f23017a);
    }

    @Override
    public int mo19246n() {
        if (mo19264h()) {
            return this.f21132H.f20544b.f23019c;
        }
        return -1;
    }

    public void m19241p(List<AbstractC7230t> list) {
        m19272e(this.f21146l.size(), list);
    }

    public final C6596f2 m19239p1(C6596f2 f2Var, AbstractC6604g3 g3Var, Pair<Object, Long> pair) {
        int i;
        long j;
        C1186a.m38189a(g3Var.m19819w() || pair != null);
        AbstractC6604g3 g3Var2 = f2Var.f20543a;
        C6596f2 j2 = f2Var.m19906j(g3Var);
        if (g3Var.m19819w()) {
            AbstractC7230t.C7231a l = C6596f2.m19904l();
            long q0 = C1216l0.m37953q0(this.f21135K);
            C6596f2 b = j2.m19913c(l, q0, q0, q0, 0L, C7233t0.f23027M, this.f21136b, AbstractC11396q.m768D()).m19914b(l);
            b.f20559q = b.f20561s;
            return b;
        }
        Object obj = j2.f20544b.f23017a;
        boolean z = !obj.equals(((Pair) C1216l0.m37968j(pair)).first);
        AbstractC7230t.C7231a aVar = z ? new AbstractC7230t.C7231a(pair.first) : j2.f20544b;
        long longValue = ((Long) pair.second).longValue();
        long q02 = C1216l0.m37953q0(mo19222x());
        if (!g3Var2.m19819w()) {
            q02 -= g3Var2.mo19825l(obj, this.f21145k).m19802o();
        }
        if (z || longValue < q02) {
            C1186a.m38184f(!aVar.m17274b());
            C6596f2 b2 = j2.m19913c(aVar, longValue, longValue, longValue, 0L, z ? C7233t0.f23027M : j2.f20550h, z ? this.f21136b : j2.f20551i, z ? AbstractC11396q.m768D() : j2.f20552j).m19914b(aVar);
            b2.f20559q = longValue;
            return b2;
        }
        if (i == 0) {
            int f = g3Var.mo17302f(j2.f20553k.f23017a);
            if (f == -1 || g3Var.m19826j(f, this.f21145k).f20639c != g3Var.mo19825l(aVar.f23017a, this.f21145k).f20639c) {
                g3Var.mo19825l(aVar.f23017a, this.f21145k);
                if (aVar.m17274b()) {
                    j = this.f21145k.m19812e(aVar.f23018b, aVar.f23019c);
                } else {
                    j = this.f21145k.f20633M;
                }
                j2 = j2.m19913c(aVar, j2.f20561s, j2.f20561s, j2.f20546d, j - j2.f20561s, j2.f20550h, j2.f20551i, j2.f20552j).m19914b(aVar);
                j2.f20559q = j;
            }
        } else {
            C1186a.m38184f(!aVar.m17274b());
            long max = Math.max(0L, j2.f20560r - (longValue - q02));
            long j3 = j2.f20559q;
            if (j2.f20553k.equals(j2.f20544b)) {
                j3 = longValue + max;
            }
            j2 = j2.m19913c(aVar, longValue, longValue, longValue, max, j2.f20550h, j2.f20551i, j2.f20552j);
            j2.f20559q = j3;
        }
        return j2;
    }

    public void m19237q1(C4260a aVar) {
        this.f21131G = this.f21131G.m19552b().m19540J(aVar).m19543G();
        C6693s1 C0 = m19315C0();
        if (!C0.equals(this.f21129E)) {
            this.f21129E = C0;
            this.f21143i.m37893k(14, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.this.m19286V0((AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
    }

    public final long m19235r1(AbstractC6604g3 g3Var, AbstractC7230t.C7231a aVar, long j) {
        g3Var.mo19825l(aVar.f23017a, this.f21145k);
        return j + this.f21145k.m19802o();
    }

    public void m19234s(List<AbstractC7230t> list) {
        m19225v1(list, true);
    }

    public void m19232s1(AbstractC6618i2.AbstractC6622c cVar) {
        this.f21143i.m37894j(cVar);
    }

    @Override
    public void mo19231t(int i, int i2) {
        C6596f2 t1 = m19229t1(i, Math.min(i2, this.f21146l.size()));
        m19318A1(t1, 0, 1, false, !t1.f20544b.f23017a.equals(this.f21132H.f20544b.f23017a), 4, m19304J0(t1), -1);
    }

    public final C6596f2 m19229t1(int i, int i2) {
        boolean z = false;
        C1186a.m38189a(i >= 0 && i2 >= i && i2 <= this.f21146l.size());
        int D = mo19314D();
        AbstractC6604g3 L = mo19301L();
        int size = this.f21146l.size();
        this.f21157w++;
        m19227u1(i, i2);
        AbstractC6604g3 D0 = m19313D0();
        C6596f2 p1 = m19239p1(this.f21132H, D0, m19300L0(L, D0));
        int i3 = p1.f20547e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && D >= p1.f20543a.mo17297v()) {
            z = true;
        }
        if (z) {
            p1 = p1.m19908h(4);
        }
        this.f21142h.m20006n0(i, i2, this.f21126B);
        return p1;
    }

    public final void m19227u1(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f21146l.remove(i3);
        }
        this.f21126B = this.f21126B.mo17324b(i, i2);
    }

    public void m19225v1(List<AbstractC7230t> list, boolean z) {
        m19223w1(list, -1, -9223372036854775807L, z);
    }

    public final void m19223w1(List<AbstractC7230t> list, int i, long j, boolean z) {
        int i2;
        long j2;
        int K0 = m19302K0();
        long Q = mo19292Q();
        boolean z2 = true;
        this.f21157w++;
        if (!this.f21146l.isEmpty()) {
            m19227u1(0, this.f21146l.size());
        }
        List<C6728z1.C6731c> B0 = m19317B0(0, list);
        AbstractC6604g3 D0 = m19313D0();
        if (D0.m19819w() || i < D0.mo17297v()) {
            if (z) {
                i2 = D0.mo17401e(this.f21156v);
                j2 = -9223372036854775807L;
            } else if (i == -1) {
                i2 = K0;
                j2 = Q;
            } else {
                i2 = i;
                j2 = j;
            }
            C6596f2 p1 = m19239p1(this.f21132H, D0, m19298M0(D0, i2, j2));
            int i3 = p1.f20547e;
            if (!(i2 == -1 || i3 == 1)) {
                i3 = (D0.m19819w() || i2 >= D0.mo17297v()) ? 4 : 2;
            }
            C6596f2 h = p1.m19908h(i3);
            this.f21142h.m20068M0(B0, i2, C1216l0.m37953q0(j2), this.f21126B);
            if (this.f21132H.f20544b.f23017a.equals(h.f20544b.f23017a) || this.f21132H.f20543a.m19819w()) {
                z2 = false;
            }
            m19318A1(h, 0, 1, false, z2, 4, m19304J0(h), -1);
            return;
        }
        throw new C6636k1(D0, i, j);
    }

    @Override
    public long mo19222x() {
        if (!mo19264h()) {
            return mo19292Q();
        }
        C6596f2 f2Var = this.f21132H;
        f2Var.f20543a.mo19825l(f2Var.f20544b.f23017a, this.f21145k);
        C6596f2 f2Var2 = this.f21132H;
        if (f2Var2.f20545c == -9223372036854775807L) {
            return f2Var2.f20543a.m19820t(mo19314D(), this.f20519a).m19794d();
        }
        return this.f21145k.m19803n() + C1216l0.m38006H0(this.f21132H.f20545c);
    }

    public void m19220x1(boolean z, int i, int i2) {
        C6596f2 f2Var = this.f21132H;
        if (f2Var.f20554l != z || f2Var.f20555m != i) {
            this.f21157w++;
            C6596f2 e = f2Var.m19911e(z, i);
            this.f21142h.m20062P0(z, i);
            m19318A1(e, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public void m19218y1(boolean z, C6681q qVar) {
        C6596f2 f2Var;
        if (z) {
            f2Var = m19229t1(0, this.f21146l.size()).m19910f(null);
        } else {
            C6596f2 f2Var2 = this.f21132H;
            f2Var = f2Var2.m19914b(f2Var2.f20544b);
            f2Var.f20559q = f2Var.f20561s;
            f2Var.f20560r = 0L;
        }
        C6596f2 h = f2Var.m19908h(1);
        if (qVar != null) {
            h = h.m19910f(qVar);
        }
        C6596f2 f2Var3 = h;
        this.f21157w++;
        this.f21142h.m20025g1();
        m19318A1(f2Var3, 0, 1, false, f2Var3.f20543a.m19819w() && !this.f21132H.f20543a.m19819w(), 4, m19304J0(f2Var3), -1);
    }

    @Override
    public int mo19217z() {
        return this.f21132H.f20547e;
    }

    public void m19216z0(AbstractC6689s.AbstractC6690a aVar) {
        this.f21144j.add(aVar);
    }

    public final void m19215z1() {
        AbstractC6618i2.C6620b bVar = this.f21128D;
        AbstractC6618i2.C6620b R = m19943R(this.f21137c);
        this.f21128D = R;
        if (!R.equals(bVar)) {
            this.f21143i.m37896h(13, new C1226r.AbstractC1227a() {
                @Override
                public final void mo17513a(Object obj) {
                    C6726z0.this.m19282Z0((AbstractC6618i2.AbstractC6622c) obj);
                }
            });
        }
    }
}
