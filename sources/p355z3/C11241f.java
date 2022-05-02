package p355z3;

import java.io.EOFException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p073f4.C4260a;
import p147k4.C6066h;
import p147k4.C6072k;
import p147k4.C6076m;
import p174m3.C6600g1;
import p199o3.C7614g0;
import p270t3.AbstractC8958f;
import p270t3.AbstractC8959g;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8965l;
import p270t3.AbstractC8974t;
import p270t3.C8957e;
import p270t3.C8969o;
import p270t3.C8970p;
import p270t3.C8971q;
import p355z3.AbstractC11242g;

public final class C11241f implements AbstractC8958f {
    public static final AbstractC8965l f35975u = C11240e.f35974b;
    public static final C6066h.AbstractC6067a f35976v = C11239d.f35973a;
    public final int f35977a;
    public final long f35978b;
    public final C1189b0 f35979c;
    public final C7614g0.C7615a f35980d;
    public final C8969o f35981e;
    public final C8970p f35982f;
    public final AbstractC8974t f35983g;
    public AbstractC8960h f35984h;
    public AbstractC8974t f35985i;
    public AbstractC8974t f35986j;
    public int f35987k;
    public C4260a f35988l;
    public long f35989m;
    public long f35990n;
    public long f35991o;
    public int f35992p;
    public AbstractC11242g f35993q;
    public boolean f35994r;
    public boolean f35995s;
    public long f35996t;

    public C11241f() {
        this(0);
    }

    public static long m1141m(C4260a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int d = aVar.m28327d();
        for (int i = 0; i < d; i++) {
            C4260a.AbstractC4262b c = aVar.m28328c(i);
            if (c instanceof C6076m) {
                C6076m mVar = (C6076m) c;
                if (mVar.f19289a.equals("TLEN")) {
                    return C1216l0.m37953q0(Long.parseLong(mVar.f19301c));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int m1140n(C1189b0 b0Var, int i) {
        if (b0Var.m38137f() >= i + 4) {
            b0Var.m38144P(i);
            int n = b0Var.m38129n();
            if (n == 1483304551 || n == 1231971951) {
                return n;
            }
        }
        if (b0Var.m38137f() < 40) {
            return 0;
        }
        b0Var.m38144P(36);
        return b0Var.m38129n() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean m1139o(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    public static AbstractC8958f[] m1138p() {
        return new AbstractC8958f[]{new C11241f()};
    }

    public static boolean m1137q(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    public static C11238c m1136r(C4260a aVar, long j) {
        if (aVar == null) {
            return null;
        }
        int d = aVar.m28327d();
        for (int i = 0; i < d; i++) {
            C4260a.AbstractC4262b c = aVar.m28328c(i);
            if (c instanceof C6072k) {
                return C11238c.m1158a(j, (C6072k) c, m1141m(aVar));
            }
        }
        return null;
    }

    @Override
    public void mo1153a() {
    }

    @Override
    public void mo1152b(long j, long j2) {
        this.f35987k = 0;
        this.f35989m = -9223372036854775807L;
        this.f35990n = 0L;
        this.f35992p = 0;
        this.f35996t = j2;
        AbstractC11242g gVar = this.f35993q;
        if ((gVar instanceof C11237b) && !((C11237b) gVar).m1161a(j2)) {
            this.f35995s = true;
            this.f35986j = this.f35983g;
        }
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        m1147g();
        int u = m1133u(gVar);
        if (u == -1 && (this.f35993q instanceof C11237b)) {
            long i = m1145i(this.f35990n);
            if (this.f35993q.mo1126d() != i) {
                ((C11237b) this.f35993q).m1159e(i);
                this.f35984h.mo6042a(this.f35993q);
            }
        }
        return u;
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f35984h = hVar;
        AbstractC8974t r = hVar.mo6039r(0, 1);
        this.f35985i = r;
        this.f35986j = r;
        this.f35984h.mo6040m();
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    public final void m1147g() {
        C1186a.m38182h(this.f35985i);
        C1216l0.m37968j(this.f35984h);
    }

    public final AbstractC11242g m1146h(AbstractC8959g gVar) {
        long j;
        long d;
        long c;
        AbstractC11242g s = m1135s(gVar);
        C11238c r = m1136r(this.f35988l, gVar.mo6043r());
        if (this.f35994r) {
            return new AbstractC11242g.C11243a();
        }
        s = null;
        if ((this.f35977a & 4) != 0) {
            long j2 = -1;
            if (r != null) {
                d = r.mo1126d();
                c = r.mo1127c();
            } else if (s != null) {
                d = s.mo1126d();
                c = s.mo1127c();
            } else {
                j = m1141m(this.f35988l);
                s = new C11237b(j, gVar.mo6043r(), j2);
            }
            j2 = c;
            j = d;
            s = new C11237b(j, gVar.mo6043r(), j2);
        } else if (r != null) {
            s = r;
        } else if (s == null) {
        }
        boolean z = true;
        if (s != null && (s.mo1125g() || (this.f35977a & 1) == 0)) {
            return s;
        }
        if ((this.f35977a & 2) == 0) {
            z = false;
        }
        return m1142l(gVar, z);
    }

    public final long m1145i(long j) {
        return this.f35989m + ((j * 1000000) / this.f35980d.f24372d);
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        return m1131w(gVar, true);
    }

    public void m1143k() {
        this.f35994r = true;
    }

    public final AbstractC11242g m1142l(AbstractC8959g gVar, boolean z) {
        gVar.mo10806q(this.f35979c.m38139d(), 0, 4);
        this.f35979c.m38144P(0);
        this.f35980d.m15473a(this.f35979c.m38129n());
        return new C11236a(gVar.mo6046a(), gVar.mo6043r(), this.f35980d, z);
    }

    public final AbstractC11242g m1135s(AbstractC8959g gVar) {
        int i;
        C1189b0 b0Var = new C1189b0(this.f35980d.f24371c);
        gVar.mo10806q(b0Var.m38139d(), 0, this.f35980d.f24371c);
        C7614g0.C7615a aVar = this.f35980d;
        if ((aVar.f24369a & 1) != 0) {
            if (aVar.f24373e != 1) {
                i = 36;
            }
            i = 21;
        } else {
            if (aVar.f24373e == 1) {
                i = 13;
            }
            i = 21;
        }
        int n = m1140n(b0Var, i);
        if (n == 1483304551 || n == 1231971951) {
            C11245i a = C11245i.m1129a(gVar.mo6046a(), gVar.mo6043r(), this.f35980d, b0Var);
            if (a != null && !this.f35981e.m10805a()) {
                gVar.mo10809m();
                gVar.mo10812h(i + 141);
                gVar.mo10806q(this.f35979c.m38139d(), 0, 3);
                this.f35979c.m38144P(0);
                this.f35981e.m10802d(this.f35979c.m38153G());
            }
            gVar.mo10808n(this.f35980d.f24371c);
            return (a == null || a.mo1125g() || n != 1231971951) ? a : m1142l(gVar, false);
        } else if (n == 1447187017) {
            C11244h a2 = C11244h.m1130a(gVar.mo6046a(), gVar.mo6043r(), this.f35980d, b0Var);
            gVar.mo10808n(this.f35980d.f24371c);
            return a2;
        } else {
            gVar.mo10809m();
            return null;
        }
    }

    public final boolean m1134t(AbstractC8959g gVar) {
        AbstractC11242g gVar2 = this.f35993q;
        if (gVar2 != null) {
            long c = gVar2.mo1127c();
            if (c != -1 && gVar.mo6045f() > c - 4) {
                return true;
            }
        }
        try {
            return !gVar.mo10813e(this.f35979c.m38139d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    public final int m1133u(AbstractC8959g gVar) {
        if (this.f35987k == 0) {
            try {
                m1131w(gVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f35993q == null) {
            AbstractC11242g h = m1146h(gVar);
            this.f35993q = h;
            this.f35984h.mo6042a(h);
            this.f35986j.mo10798a(new C6600g1.C6602b().m19858e0(this.f35980d.f24370b).m19871W(Log.TAG_EMOJI).m19886H(this.f35980d.f24373e).m19856f0(this.f35980d.f24372d).m19880N(this.f35981e.f28854a).m19879O(this.f35981e.f28855b).m19870X((this.f35977a & 8) != 0 ? null : this.f35988l).m19889E());
            this.f35991o = gVar.mo6043r();
        } else if (this.f35991o != 0) {
            long r = gVar.mo6043r();
            long j = this.f35991o;
            if (r < j) {
                gVar.mo10808n((int) (j - r));
            }
        }
        return m1132v(gVar);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    public final int m1132v(AbstractC8959g gVar) {
        C7614g0.C7615a aVar;
        if (this.f35992p == 0) {
            gVar.mo10809m();
            if (m1134t(gVar)) {
                return -1;
            }
            this.f35979c.m38144P(0);
            int n = this.f35979c.m38129n();
            if (!m1139o(n, this.f35987k) || C7614g0.m15477j(n) == -1) {
                gVar.mo10808n(1);
                this.f35987k = 0;
                return 0;
            }
            this.f35980d.m15473a(n);
            if (this.f35989m == -9223372036854775807L) {
                this.f35989m = this.f35993q.mo1124h(gVar.mo6043r());
                if (this.f35978b != -9223372036854775807L) {
                    this.f35989m += this.f35978b - this.f35993q.mo1124h(0L);
                }
            }
            this.f35992p = this.f35980d.f24371c;
            AbstractC11242g gVar2 = this.f35993q;
            if (gVar2 instanceof C11237b) {
                C11237b bVar = (C11237b) gVar2;
                bVar.m1160b(m1145i(this.f35990n + aVar.f24375g), gVar.mo6043r() + this.f35980d.f24371c);
                if (this.f35995s && bVar.m1161a(this.f35996t)) {
                    this.f35995s = false;
                    this.f35986j = this.f35985i;
                }
            }
        }
        int d = this.f35986j.mo10795d(gVar, this.f35992p, true);
        if (d == -1) {
            return -1;
        }
        int i = this.f35992p - d;
        this.f35992p = i;
        if (i > 0) {
            return 0;
        }
        this.f35986j.mo10794e(m1145i(this.f35990n), 1, this.f35980d.f24371c, 0, null);
        this.f35990n += this.f35980d.f24375g;
        this.f35992p = 0;
        return 0;
    }

    public final boolean m1131w(p270t3.AbstractC8959g r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: p355z3.C11241f.m1131w(t3.g, boolean):boolean");
    }

    public C11241f(int i) {
        this(i, -9223372036854775807L);
    }

    public C11241f(int i, long j) {
        this.f35977a = (i & 2) != 0 ? i | 1 : i;
        this.f35978b = j;
        this.f35979c = new C1189b0(10);
        this.f35980d = new C7614g0.C7615a();
        this.f35981e = new C8969o();
        this.f35989m = -9223372036854775807L;
        this.f35982f = new C8970p();
        C8957e eVar = new C8957e();
        this.f35983g = eVar;
        this.f35986j = eVar;
    }
}
