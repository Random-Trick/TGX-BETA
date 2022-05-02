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
    public static final AbstractC8965l f35978u = C11240e.f35977b;
    public static final C6066h.AbstractC6067a f35979v = C11239d.f35976a;
    public final int f35980a;
    public final long f35981b;
    public final C1189b0 f35982c;
    public final C7614g0.C7615a f35983d;
    public final C8969o f35984e;
    public final C8970p f35985f;
    public final AbstractC8974t f35986g;
    public AbstractC8960h f35987h;
    public AbstractC8974t f35988i;
    public AbstractC8974t f35989j;
    public int f35990k;
    public C4260a f35991l;
    public long f35992m;
    public long f35993n;
    public long f35994o;
    public int f35995p;
    public AbstractC11242g f35996q;
    public boolean f35997r;
    public boolean f35998s;
    public long f35999t;

    public C11241f() {
        this(0);
    }

    public static long m1141m(C4260a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int d = aVar.m28329d();
        for (int i = 0; i < d; i++) {
            C4260a.AbstractC4262b c = aVar.m28330c(i);
            if (c instanceof C6076m) {
                C6076m mVar = (C6076m) c;
                if (mVar.f19289a.equals("TLEN")) {
                    return C1216l0.m37956q0(Long.parseLong(mVar.f19301c));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int m1140n(C1189b0 b0Var, int i) {
        if (b0Var.m38140f() >= i + 4) {
            b0Var.m38147P(i);
            int n = b0Var.m38132n();
            if (n == 1483304551 || n == 1231971951) {
                return n;
            }
        }
        if (b0Var.m38140f() < 40) {
            return 0;
        }
        b0Var.m38147P(36);
        return b0Var.m38132n() == 1447187017 ? 1447187017 : 0;
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
        int d = aVar.m28329d();
        for (int i = 0; i < d; i++) {
            C4260a.AbstractC4262b c = aVar.m28330c(i);
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
        this.f35990k = 0;
        this.f35992m = -9223372036854775807L;
        this.f35993n = 0L;
        this.f35995p = 0;
        this.f35999t = j2;
        AbstractC11242g gVar = this.f35996q;
        if ((gVar instanceof C11237b) && !((C11237b) gVar).m1161a(j2)) {
            this.f35998s = true;
            this.f35989j = this.f35986g;
        }
    }

    @Override
    public int mo1149e(AbstractC8959g gVar, C8971q qVar) {
        m1147g();
        int u = m1133u(gVar);
        if (u == -1 && (this.f35996q instanceof C11237b)) {
            long i = m1145i(this.f35993n);
            if (this.f35996q.mo1126d() != i) {
                ((C11237b) this.f35996q).m1159e(i);
                this.f35987h.mo6042a(this.f35996q);
            }
        }
        return u;
    }

    @Override
    public void mo1148f(AbstractC8960h hVar) {
        this.f35987h = hVar;
        AbstractC8974t r = hVar.mo6039r(0, 1);
        this.f35988i = r;
        this.f35989j = r;
        this.f35987h.mo6040m();
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    public final void m1147g() {
        C1186a.m38185h(this.f35988i);
        C1216l0.m37971j(this.f35987h);
    }

    public final AbstractC11242g m1146h(AbstractC8959g gVar) {
        long j;
        long d;
        long c;
        AbstractC11242g s = m1135s(gVar);
        C11238c r = m1136r(this.f35991l, gVar.mo6043r());
        if (this.f35997r) {
            return new AbstractC11242g.C11243a();
        }
        s = null;
        if ((this.f35980a & 4) != 0) {
            long j2 = -1;
            if (r != null) {
                d = r.mo1126d();
                c = r.mo1127c();
            } else if (s != null) {
                d = s.mo1126d();
                c = s.mo1127c();
            } else {
                j = m1141m(this.f35991l);
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
        if (s != null && (s.mo1125g() || (this.f35980a & 1) == 0)) {
            return s;
        }
        if ((this.f35980a & 2) == 0) {
            z = false;
        }
        return m1142l(gVar, z);
    }

    public final long m1145i(long j) {
        return this.f35992m + ((j * 1000000) / this.f35983d.f24375d);
    }

    @Override
    public boolean mo1144j(AbstractC8959g gVar) {
        return m1131w(gVar, true);
    }

    public void m1143k() {
        this.f35997r = true;
    }

    public final AbstractC11242g m1142l(AbstractC8959g gVar, boolean z) {
        gVar.mo10805q(this.f35982c.m38142d(), 0, 4);
        this.f35982c.m38147P(0);
        this.f35983d.m15473a(this.f35982c.m38132n());
        return new C11236a(gVar.mo6046a(), gVar.mo6043r(), this.f35983d, z);
    }

    public final AbstractC11242g m1135s(AbstractC8959g gVar) {
        int i;
        C1189b0 b0Var = new C1189b0(this.f35983d.f24374c);
        gVar.mo10805q(b0Var.m38142d(), 0, this.f35983d.f24374c);
        C7614g0.C7615a aVar = this.f35983d;
        if ((aVar.f24372a & 1) != 0) {
            if (aVar.f24376e != 1) {
                i = 36;
            }
            i = 21;
        } else {
            if (aVar.f24376e == 1) {
                i = 13;
            }
            i = 21;
        }
        int n = m1140n(b0Var, i);
        if (n == 1483304551 || n == 1231971951) {
            C11245i a = C11245i.m1129a(gVar.mo6046a(), gVar.mo6043r(), this.f35983d, b0Var);
            if (a != null && !this.f35984e.m10804a()) {
                gVar.mo10808m();
                gVar.mo10811h(i + 141);
                gVar.mo10805q(this.f35982c.m38142d(), 0, 3);
                this.f35982c.m38147P(0);
                this.f35984e.m10801d(this.f35982c.m38156G());
            }
            gVar.mo10807n(this.f35983d.f24374c);
            return (a == null || a.mo1125g() || n != 1231971951) ? a : m1142l(gVar, false);
        } else if (n == 1447187017) {
            C11244h a2 = C11244h.m1130a(gVar.mo6046a(), gVar.mo6043r(), this.f35983d, b0Var);
            gVar.mo10807n(this.f35983d.f24374c);
            return a2;
        } else {
            gVar.mo10808m();
            return null;
        }
    }

    public final boolean m1134t(AbstractC8959g gVar) {
        AbstractC11242g gVar2 = this.f35996q;
        if (gVar2 != null) {
            long c = gVar2.mo1127c();
            if (c != -1 && gVar.mo6045f() > c - 4) {
                return true;
            }
        }
        try {
            return !gVar.mo10812e(this.f35982c.m38142d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    public final int m1133u(AbstractC8959g gVar) {
        if (this.f35990k == 0) {
            try {
                m1131w(gVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f35996q == null) {
            AbstractC11242g h = m1146h(gVar);
            this.f35996q = h;
            this.f35987h.mo6042a(h);
            this.f35989j.mo10797a(new C6600g1.C6602b().m19859e0(this.f35983d.f24373b).m19872W(Log.TAG_EMOJI).m19887H(this.f35983d.f24376e).m19857f0(this.f35983d.f24375d).m19881N(this.f35984e.f28857a).m19880O(this.f35984e.f28858b).m19871X((this.f35980a & 8) != 0 ? null : this.f35991l).m19890E());
            this.f35994o = gVar.mo6043r();
        } else if (this.f35994o != 0) {
            long r = gVar.mo6043r();
            long j = this.f35994o;
            if (r < j) {
                gVar.mo10807n((int) (j - r));
            }
        }
        return m1132v(gVar);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    public final int m1132v(AbstractC8959g gVar) {
        C7614g0.C7615a aVar;
        if (this.f35995p == 0) {
            gVar.mo10808m();
            if (m1134t(gVar)) {
                return -1;
            }
            this.f35982c.m38147P(0);
            int n = this.f35982c.m38132n();
            if (!m1139o(n, this.f35990k) || C7614g0.m15477j(n) == -1) {
                gVar.mo10807n(1);
                this.f35990k = 0;
                return 0;
            }
            this.f35983d.m15473a(n);
            if (this.f35992m == -9223372036854775807L) {
                this.f35992m = this.f35996q.mo1124h(gVar.mo6043r());
                if (this.f35981b != -9223372036854775807L) {
                    this.f35992m += this.f35981b - this.f35996q.mo1124h(0L);
                }
            }
            this.f35995p = this.f35983d.f24374c;
            AbstractC11242g gVar2 = this.f35996q;
            if (gVar2 instanceof C11237b) {
                C11237b bVar = (C11237b) gVar2;
                bVar.m1160b(m1145i(this.f35993n + aVar.f24378g), gVar.mo6043r() + this.f35983d.f24374c);
                if (this.f35998s && bVar.m1161a(this.f35999t)) {
                    this.f35998s = false;
                    this.f35989j = this.f35988i;
                }
            }
        }
        int d = this.f35989j.mo10794d(gVar, this.f35995p, true);
        if (d == -1) {
            return -1;
        }
        int i = this.f35995p - d;
        this.f35995p = i;
        if (i > 0) {
            return 0;
        }
        this.f35989j.mo10793e(m1145i(this.f35993n), 1, this.f35983d.f24374c, 0, null);
        this.f35993n += this.f35983d.f24378g;
        this.f35995p = 0;
        return 0;
    }

    public final boolean m1131w(p270t3.AbstractC8959g r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: p355z3.C11241f.m1131w(t3.g, boolean):boolean");
    }

    public C11241f(int i) {
        this(i, -9223372036854775807L);
    }

    public C11241f(int i, long j) {
        this.f35980a = (i & 2) != 0 ? i | 1 : i;
        this.f35981b = j;
        this.f35982c = new C1189b0(10);
        this.f35983d = new C7614g0.C7615a();
        this.f35984e = new C8969o();
        this.f35992m = -9223372036854775807L;
        this.f35985f = new C8970p();
        C8957e eVar = new C8957e();
        this.f35986g = eVar;
        this.f35989j = eVar;
    }
}
