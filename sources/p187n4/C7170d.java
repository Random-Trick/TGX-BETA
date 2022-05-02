package p187n4;

import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1234w;
import p174m3.C6600g1;
import p174m3.C6612h1;
import p174m3.C6717x2;
import p187n4.AbstractC7223q;
import p187n4.C7173e;
import p216p3.C8026g;
import p356z4.AbstractC11265j;

public final class C7170d implements AbstractC7223q, AbstractC7223q.AbstractC7224a {
    public long f22754M;
    public long f22755N;
    public long f22756O;
    public C7173e.C7175b f22757P;
    public final AbstractC7223q f22758a;
    public AbstractC7223q.AbstractC7224a f22759b;
    public C7171a[] f22760c = new C7171a[0];

    public final class C7171a implements AbstractC7206l0 {
        public final AbstractC7206l0 f22761a;
        public boolean f22762b;

        public C7171a(AbstractC7206l0 l0Var) {
            this.f22761a = l0Var;
        }

        @Override
        public int mo17352a(C6612h1 h1Var, C8026g gVar, int i) {
            if (C7170d.this.m17498j()) {
                return -3;
            }
            if (this.f22762b) {
                gVar.setFlags(4);
                return -4;
            }
            int a = this.f22761a.mo17352a(h1Var, gVar, i);
            if (a == -5) {
                C6600g1 g1Var = (C6600g1) C1186a.m38185e(h1Var.f20668b);
                int i2 = g1Var.f20594k0;
                if (!(i2 == 0 && g1Var.f20595l0 == 0)) {
                    C7170d dVar = C7170d.this;
                    int i3 = 0;
                    if (dVar.f22755N != 0) {
                        i2 = 0;
                    }
                    if (dVar.f22756O == Long.MIN_VALUE) {
                        i3 = g1Var.f20595l0;
                    }
                    h1Var.f20668b = g1Var.m19901b().m19880N(i2).m19879O(i3).m19889E();
                }
                return -5;
            }
            C7170d dVar2 = C7170d.this;
            long j = dVar2.f22756O;
            if (j == Long.MIN_VALUE || ((a != -4 || gVar.f26126N < j) && (a != -3 || dVar2.mo17279s() != Long.MIN_VALUE || gVar.f26125M))) {
                return a;
            }
            gVar.clear();
            gVar.setFlags(4);
            this.f22762b = true;
            return -4;
        }

        @Override
        public void mo17351b() {
            this.f22761a.mo17351b();
        }

        @Override
        public int mo17350c(long j) {
            if (C7170d.this.m17498j()) {
                return -3;
            }
            return this.f22761a.mo17350c(j);
        }

        public void m17493d() {
            this.f22762b = false;
        }

        @Override
        public boolean mo17349f() {
            return !C7170d.this.m17498j() && this.f22761a.mo17349f();
        }
    }

    public C7170d(AbstractC7223q qVar, boolean z, long j, long j2) {
        this.f22758a = qVar;
        this.f22754M = z ? j : -9223372036854775807L;
        this.f22755N = j;
        this.f22756O = j2;
    }

    public static boolean m17495n(long j, AbstractC11265j[] jVarArr) {
        if (j != 0) {
            for (AbstractC11265j jVar : jVarArr) {
                if (jVar != null) {
                    C6600g1 g = jVar.mo1027g();
                    if (!C1234w.m37870a(g.f20575U, g.f20572R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void mo17276a(AbstractC7223q qVar) {
        if (this.f22757P == null) {
            ((AbstractC7223q.AbstractC7224a) C1186a.m38185e(this.f22759b)).mo17276a(this);
        }
    }

    public final C6717x2 m17499b(long j, C6717x2 x2Var) {
        long q = C1216l0.m37954q(x2Var.f21073a, 0L, j - this.f22755N);
        long j2 = x2Var.f21074b;
        long j3 = this.f22756O;
        long q2 = C1216l0.m37954q(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (q == x2Var.f21073a && q2 == x2Var.f21074b) ? x2Var : new C6717x2(q, q2);
    }

    @Override
    public long mo17289c() {
        long c = this.f22758a.mo17289c();
        if (c != Long.MIN_VALUE) {
            long j = this.f22756O;
            if (j == Long.MIN_VALUE || c < j) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public long mo17288d(long j, C6717x2 x2Var) {
        long j2 = this.f22755N;
        if (j == j2) {
            return j2;
        }
        return this.f22758a.mo17288d(j, m17499b(j, x2Var));
    }

    @Override
    public void mo17287e(AbstractC7223q.AbstractC7224a aVar, long j) {
        this.f22759b = aVar;
        this.f22758a.mo17287e(this, j);
    }

    @Override
    public void mo17286f() {
        C7173e.C7175b bVar = this.f22757P;
        if (bVar == null) {
            this.f22758a.mo17286f();
            return;
        }
        throw bVar;
    }

    @Override
    public long mo17285g(long r7) {
        throw new UnsupportedOperationException("Method not decompiled: p187n4.C7170d.mo17285g(long):long");
    }

    @Override
    public boolean mo17284h(long j) {
        return this.f22758a.mo17284h(j);
    }

    public boolean m17498j() {
        return this.f22754M != -9223372036854775807L;
    }

    @Override
    public boolean mo17283k() {
        return this.f22758a.mo17283k();
    }

    public void mo17336i(AbstractC7223q qVar) {
        ((AbstractC7223q.AbstractC7224a) C1186a.m38185e(this.f22759b)).mo17336i(this);
    }

    public void m17496m(C7173e.C7175b bVar) {
        this.f22757P = bVar;
    }

    @Override
    public long mo17282o(p356z4.AbstractC11265j[] r13, boolean[] r14, p187n4.AbstractC7206l0[] r15, boolean[] r16, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: p187n4.C7170d.mo17282o(z4.j[], boolean[], n4.l0[], boolean[], long):long");
    }

    @Override
    public long mo17281p() {
        if (m17498j()) {
            long j = this.f22754M;
            this.f22754M = -9223372036854775807L;
            long p = mo17281p();
            return p != -9223372036854775807L ? p : j;
        }
        long p2 = this.f22758a.mo17281p();
        if (p2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C1186a.m38184f(p2 >= this.f22755N);
        long j2 = this.f22756O;
        if (j2 != Long.MIN_VALUE && p2 > j2) {
            z = false;
        }
        C1186a.m38184f(z);
        return p2;
    }

    @Override
    public C7233t0 mo17280q() {
        return this.f22758a.mo17280q();
    }

    public void m17494r(long j, long j2) {
        this.f22755N = j;
        this.f22756O = j2;
    }

    @Override
    public long mo17279s() {
        long s = this.f22758a.mo17279s();
        if (s != Long.MIN_VALUE) {
            long j = this.f22756O;
            if (j == Long.MIN_VALUE || s < j) {
                return s;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override
    public void mo17278t(long j, boolean z) {
        this.f22758a.mo17278t(j, z);
    }

    @Override
    public void mo17277u(long j) {
        this.f22758a.mo17277u(j);
    }
}
