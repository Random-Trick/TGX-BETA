package z3;

import c5.b0;
import c5.l0;
import f4.a;
import java.io.EOFException;
import k4.h;
import k4.k;
import k4.m;
import m3.q1;
import o3.h0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import t3.e;
import t3.g;
import t3.l;
import t3.o;
import t3.p;
import t3.q;
import t3.t;
import z3.g;

public final class f implements t3.f {
    public static final l f26849u = e.f26848b;
    public static final h.a f26850v = d.f26847a;
    public final int f26851a;
    public final long f26852b;
    public final b0 f26853c;
    public final h0.a f26854d;
    public final o f26855e;
    public final p f26856f;
    public final t f26857g;
    public t3.h f26858h;
    public t f26859i;
    public t f26860j;
    public int f26861k;
    public a f26862l;
    public long f26863m;
    public long f26864n;
    public long f26865o;
    public int f26866p;
    public g f26867q;
    public boolean f26868r;
    public boolean f26869s;
    public long f26870t;

    public f() {
        this(0);
    }

    public static long m(a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            a.b c10 = aVar.c(i10);
            if (c10 instanceof m) {
                m mVar = (m) c10;
                if (mVar.f15647a.equals("TLEN")) {
                    return l0.r0(Long.parseLong(mVar.f15655c));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int n(b0 b0Var, int i10) {
        if (b0Var.f() >= i10 + 4) {
            b0Var.P(i10);
            int n10 = b0Var.n();
            if (n10 == 1483304551 || n10 == 1231971951) {
                return n10;
            }
        }
        if (b0Var.f() < 40) {
            return 0;
        }
        b0Var.P(36);
        return b0Var.n() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean o(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public static t3.f[] p() {
        return new t3.f[]{new f()};
    }

    public static boolean q(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    public static c r(a aVar, long j10) {
        if (aVar == null) {
            return null;
        }
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            a.b c10 = aVar.c(i10);
            if (c10 instanceof k) {
                return c.a(j10, (k) c10, m(aVar));
            }
        }
        return null;
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        this.f26861k = 0;
        this.f26863m = -9223372036854775807L;
        this.f26864n = 0L;
        this.f26866p = 0;
        this.f26870t = j11;
        g gVar = this.f26867q;
        if ((gVar instanceof b) && !((b) gVar).a(j11)) {
            this.f26869s = true;
            this.f26860j = this.f26857g;
        }
    }

    @Override
    public int e(g gVar, q qVar) {
        g();
        int u10 = u(gVar);
        if (u10 == -1 && (this.f26867q instanceof b)) {
            long i10 = i(this.f26864n);
            if (this.f26867q.d() != i10) {
                ((b) this.f26867q).e(i10);
                this.f26858h.a(this.f26867q);
            }
        }
        return u10;
    }

    @Override
    public void f(t3.h hVar) {
        this.f26858h = hVar;
        t q10 = hVar.q(0, 1);
        this.f26859i = q10;
        this.f26860j = q10;
        this.f26858h.k();
    }

    @EnsuresNonNull({"extractorOutput", "realTrackOutput"})
    public final void g() {
        c5.a.h(this.f26859i);
        l0.j(this.f26858h);
    }

    public final g h(g gVar) {
        long j10;
        long d10;
        long c10;
        g s10 = s(gVar);
        c r10 = r(this.f26862l, gVar.r());
        if (this.f26868r) {
            return new g.a();
        }
        s10 = null;
        if ((this.f26851a & 4) != 0) {
            long j11 = -1;
            if (r10 != null) {
                d10 = r10.d();
                c10 = r10.c();
            } else if (s10 != null) {
                d10 = s10.d();
                c10 = s10.c();
            } else {
                j10 = m(this.f26862l);
                s10 = new b(j10, gVar.r(), j11);
            }
            j11 = c10;
            j10 = d10;
            s10 = new b(j10, gVar.r(), j11);
        } else if (r10 != null) {
            s10 = r10;
        } else if (s10 == null) {
        }
        boolean z10 = true;
        if (s10 != null && (s10.g() || (this.f26851a & 1) == 0)) {
            return s10;
        }
        if ((this.f26851a & 2) == 0) {
            z10 = false;
        }
        return l(gVar, z10);
    }

    public final long i(long j10) {
        return this.f26863m + ((j10 * 1000000) / this.f26854d.f18809d);
    }

    @Override
    public boolean j(t3.g gVar) {
        return w(gVar, true);
    }

    public void k() {
        this.f26868r = true;
    }

    public final g l(t3.g gVar, boolean z10) {
        gVar.q(this.f26853c.d(), 0, 4);
        this.f26853c.P(0);
        this.f26854d.a(this.f26853c.n());
        return new a(gVar.a(), gVar.r(), this.f26854d, z10);
    }

    public final g s(t3.g gVar) {
        int i10;
        b0 b0Var = new b0(this.f26854d.f18808c);
        gVar.q(b0Var.d(), 0, this.f26854d.f18808c);
        h0.a aVar = this.f26854d;
        if ((aVar.f18806a & 1) != 0) {
            if (aVar.f18810e != 1) {
                i10 = 36;
            }
            i10 = 21;
        } else {
            if (aVar.f18810e == 1) {
                i10 = 13;
            }
            i10 = 21;
        }
        int n10 = n(b0Var, i10);
        if (n10 == 1483304551 || n10 == 1231971951) {
            i a10 = i.a(gVar.a(), gVar.r(), this.f26854d, b0Var);
            if (a10 != null && !this.f26855e.a()) {
                gVar.m();
                gVar.g(i10 + 141);
                gVar.q(this.f26853c.d(), 0, 3);
                this.f26853c.P(0);
                this.f26855e.d(this.f26853c.G());
            }
            gVar.n(this.f26854d.f18808c);
            return (a10 == null || a10.g() || n10 != 1231971951) ? a10 : l(gVar, false);
        } else if (n10 == 1447187017) {
            h a11 = h.a(gVar.a(), gVar.r(), this.f26854d, b0Var);
            gVar.n(this.f26854d.f18808c);
            return a11;
        } else {
            gVar.m();
            return null;
        }
    }

    public final boolean t(t3.g gVar) {
        g gVar2 = this.f26867q;
        if (gVar2 != null) {
            long c10 = gVar2.c();
            if (c10 != -1 && gVar.f() > c10 - 4) {
                return true;
            }
        }
        try {
            return !gVar.e(this.f26853c.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    public final int u(t3.g gVar) {
        if (this.f26861k == 0) {
            try {
                w(gVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f26867q == null) {
            g h10 = h(gVar);
            this.f26867q = h10;
            this.f26858h.a(h10);
            this.f26860j.a(new q1.b().e0(this.f26854d.f18807b).W(Log.TAG_EMOJI).H(this.f26854d.f18810e).f0(this.f26854d.f18809d).N(this.f26855e.f22896a).O(this.f26855e.f22897b).X((this.f26851a & 8) != 0 ? null : this.f26862l).E());
            this.f26865o = gVar.r();
        } else if (this.f26865o != 0) {
            long r10 = gVar.r();
            long j10 = this.f26865o;
            if (r10 < j10) {
                gVar.n((int) (j10 - r10));
            }
        }
        return v(gVar);
    }

    @RequiresNonNull({"realTrackOutput", "seeker"})
    public final int v(t3.g gVar) {
        h0.a aVar;
        if (this.f26866p == 0) {
            gVar.m();
            if (t(gVar)) {
                return -1;
            }
            this.f26853c.P(0);
            int n10 = this.f26853c.n();
            if (!o(n10, this.f26861k) || h0.j(n10) == -1) {
                gVar.n(1);
                this.f26861k = 0;
                return 0;
            }
            this.f26854d.a(n10);
            if (this.f26863m == -9223372036854775807L) {
                this.f26863m = this.f26867q.h(gVar.r());
                if (this.f26852b != -9223372036854775807L) {
                    this.f26863m += this.f26852b - this.f26867q.h(0L);
                }
            }
            this.f26866p = this.f26854d.f18808c;
            g gVar2 = this.f26867q;
            if (gVar2 instanceof b) {
                b bVar = (b) gVar2;
                bVar.b(i(this.f26864n + aVar.f18812g), gVar.r() + this.f26854d.f18808c);
                if (this.f26869s && bVar.a(this.f26870t)) {
                    this.f26869s = false;
                    this.f26860j = this.f26859i;
                }
            }
        }
        int b10 = this.f26860j.b(gVar, this.f26866p, true);
        if (b10 == -1) {
            return -1;
        }
        int i10 = this.f26866p - b10;
        this.f26866p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f26860j.f(i(this.f26864n), 1, this.f26854d.f18808c, 0, null);
        this.f26864n += this.f26854d.f18812g;
        this.f26866p = 0;
        return 0;
    }

    public final boolean w(t3.g r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: z3.f.w(t3.g, boolean):boolean");
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f26851a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f26852b = j10;
        this.f26853c = new b0(10);
        this.f26854d = new h0.a();
        this.f26855e = new o();
        this.f26863m = -9223372036854775807L;
        this.f26856f = new p();
        e eVar = new e();
        this.f26857g = eVar;
        this.f26860j = eVar;
    }
}
