package o4;

import a5.r;
import c5.l0;
import c5.w;
import m3.g3;
import m3.q1;
import m3.r1;
import o4.d;
import o4.p;
import p3.g;

public final class c implements p, p.a {
    public long M;
    public long N;
    public long O;
    public d.b P;
    public final p f18963a;
    public p.a f18964b;
    public a[] f18965c = new a[0];

    public final class a implements j0 {
        public final j0 f18966a;
        public boolean f18967b;

        public a(j0 j0Var) {
            this.f18966a = j0Var;
        }

        @Override
        public int a(r1 r1Var, g gVar, int i10) {
            if (c.this.k()) {
                return -3;
            }
            if (this.f18967b) {
                gVar.setFlags(4);
                return -4;
            }
            int a10 = this.f18966a.a(r1Var, gVar, i10);
            if (a10 == -5) {
                q1 q1Var = (q1) c5.a.e(r1Var.f16947b);
                int i11 = q1Var.f16911k0;
                if (!(i11 == 0 && q1Var.f16912l0 == 0)) {
                    c cVar = c.this;
                    int i12 = 0;
                    if (cVar.N != 0) {
                        i11 = 0;
                    }
                    if (cVar.O == Long.MIN_VALUE) {
                        i12 = q1Var.f16912l0;
                    }
                    r1Var.f16947b = q1Var.b().N(i11).O(i12).E();
                }
                return -5;
            }
            c cVar2 = c.this;
            long j10 = cVar2.O;
            if (j10 == Long.MIN_VALUE || ((a10 != -4 || gVar.N < j10) && (a10 != -3 || cVar2.r() != Long.MIN_VALUE || gVar.M))) {
                return a10;
            }
            gVar.clear();
            gVar.setFlags(4);
            this.f18967b = true;
            return -4;
        }

        @Override
        public void b() {
            this.f18966a.b();
        }

        @Override
        public int c(long j10) {
            if (c.this.k()) {
                return -3;
            }
            return this.f18966a.c(j10);
        }

        public void d() {
            this.f18967b = false;
        }

        @Override
        public boolean f() {
            return !c.this.k() && this.f18966a.f();
        }
    }

    public c(p pVar, boolean z10, long j10, long j11) {
        this.f18963a = pVar;
        this.M = z10 ? j10 : -9223372036854775807L;
        this.N = j10;
        this.O = j11;
    }

    public static boolean q(long j10, r[] rVarArr) {
        if (j10 != 0) {
            for (r rVar : rVarArr) {
                if (rVar != null) {
                    q1 l10 = rVar.l();
                    if (!w.a(l10.U, l10.R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final g3 a(long j10, g3 g3Var) {
        long q10 = l0.q(g3Var.f16671a, 0L, j10 - this.N);
        long j11 = g3Var.f16672b;
        long j12 = this.O;
        long q11 = l0.q(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (q10 == g3Var.f16671a && q11 == g3Var.f16672b) ? g3Var : new g3(q10, q11);
    }

    @Override
    public void b(p pVar) {
        if (this.P == null) {
            ((p.a) c5.a.e(this.f18964b)).b(this);
        }
    }

    @Override
    public long c() {
        long c10 = this.f18963a.c();
        if (c10 != Long.MIN_VALUE) {
            long j10 = this.O;
            if (j10 == Long.MIN_VALUE || c10 < j10) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public void d(p.a aVar, long j10) {
        this.f18964b = aVar;
        this.f18963a.d(this, j10);
    }

    @Override
    public long e(long j10, g3 g3Var) {
        long j11 = this.N;
        if (j10 == j11) {
            return j11;
        }
        return this.f18963a.e(j10, a(j10, g3Var));
    }

    @Override
    public void g() {
        d.b bVar = this.P;
        if (bVar == null) {
            this.f18963a.g();
            return;
        }
        throw bVar;
    }

    @Override
    public long h(long r7) {
        throw new UnsupportedOperationException("Method not decompiled: o4.c.h(long):long");
    }

    @Override
    public boolean i(long j10) {
        return this.f18963a.i(j10);
    }

    @Override
    public boolean j() {
        return this.f18963a.j();
    }

    public boolean k() {
        return this.M != -9223372036854775807L;
    }

    public void f(p pVar) {
        ((p.a) c5.a.e(this.f18964b)).f(this);
    }

    public void m(d.b bVar) {
        this.P = bVar;
    }

    @Override
    public long n() {
        if (k()) {
            long j10 = this.M;
            this.M = -9223372036854775807L;
            long n10 = n();
            return n10 != -9223372036854775807L ? n10 : j10;
        }
        long n11 = this.f18963a.n();
        if (n11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        c5.a.f(n11 >= this.N);
        long j11 = this.O;
        if (j11 != Long.MIN_VALUE && n11 > j11) {
            z10 = false;
        }
        c5.a.f(z10);
        return n11;
    }

    @Override
    public long o(a5.r[] r13, boolean[] r14, o4.j0[] r15, boolean[] r16, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: o4.c.o(a5.r[], boolean[], o4.j0[], boolean[], long):long");
    }

    @Override
    public r0 p() {
        return this.f18963a.p();
    }

    @Override
    public long r() {
        long r10 = this.f18963a.r();
        if (r10 != Long.MIN_VALUE) {
            long j10 = this.O;
            if (j10 == Long.MIN_VALUE || r10 < j10) {
                return r10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public void s(long j10, boolean z10) {
        this.f18963a.s(j10, z10);
    }

    public void t(long j10, long j11) {
        this.N = j10;
        this.O = j11;
    }

    @Override
    public void u(long j10) {
        this.f18963a.u(j10);
    }
}
