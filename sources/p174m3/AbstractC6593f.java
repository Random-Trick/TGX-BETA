package p174m3;

import p020b5.AbstractC1232u;
import p020b5.C1186a;
import p187n4.AbstractC7206l0;
import p216p3.C8026g;

public abstract class AbstractC6593f implements AbstractC6696s2, AbstractC6705u2 {
    public int f20528M;
    public int f20529N;
    public AbstractC7206l0 f20530O;
    public C6600g1[] f20531P;
    public long f20532Q;
    public long f20533R;
    public boolean f20535T;
    public boolean f20536U;
    public final int f20537a;
    public C6709v2 f20539c;
    public final C6612h1 f20538b = new C6612h1();
    public long f20534S = Long.MIN_VALUE;

    public AbstractC6593f(int i) {
        this.f20537a = i;
    }

    @Override
    public AbstractC1232u mo15519A() {
        return null;
    }

    public final C6681q m19924B(Throwable th, C6600g1 g1Var, int i) {
        return m19923C(th, g1Var, false, i);
    }

    public final C6681q m19923C(Throwable th, C6600g1 g1Var, boolean z, int i) {
        int i2;
        if (g1Var != null && !this.f20536U) {
            this.f20536U = true;
            try {
                i2 = C6701t2.m19435c(mo11839a(g1Var));
            } catch (C6681q unused) {
            } finally {
                this.f20536U = false;
            }
            return C6681q.m19582g(th, mo11838b(), m19920F(), g1Var, i2, z, i);
        }
        i2 = 4;
        return C6681q.m19582g(th, mo11838b(), m19920F(), g1Var, i2, z, i);
    }

    public final C6709v2 m19922D() {
        return (C6709v2) C1186a.m38185e(this.f20539c);
    }

    public final C6612h1 m19921E() {
        this.f20538b.m19787a();
        return this.f20538b;
    }

    public final int m19920F() {
        return this.f20528M;
    }

    public final C6600g1[] m19919G() {
        return (C6600g1[]) C1186a.m38185e(this.f20531P);
    }

    public final boolean m19918H() {
        return mo19477m() ? this.f20535T : ((AbstractC7206l0) C1186a.m38185e(this.f20530O)).mo17349f();
    }

    public abstract void mo13719I();

    public void mo15518J(boolean z, boolean z2) {
    }

    public abstract void mo13718K(long j, boolean z);

    public void mo15515L() {
    }

    public void mo15513M() {
    }

    public void mo15511N() {
    }

    public void mo13717O(C6600g1[] g1VarArr, long j, long j2) {
    }

    public final int m19917P(C6612h1 h1Var, C8026g gVar, int i) {
        int a = ((AbstractC7206l0) C1186a.m38185e(this.f20530O)).mo17352a(h1Var, gVar, i);
        if (a == -4) {
            if (gVar.isEndOfStream()) {
                this.f20534S = Long.MIN_VALUE;
                return this.f20535T ? -4 : -3;
            }
            long j = gVar.f26126N + this.f20532Q;
            gVar.f26126N = j;
            this.f20534S = Math.max(this.f20534S, j);
        } else if (a == -5) {
            C6600g1 g1Var = (C6600g1) C1186a.m38185e(h1Var.f20668b);
            if (g1Var.f20579Y != Long.MAX_VALUE) {
                h1Var.f20668b = g1Var.m19901b().m19850i0(g1Var.f20579Y + this.f20532Q).m19889E();
            }
        }
        return a;
    }

    public int m19916Q(long j) {
        return ((AbstractC7206l0) C1186a.m38185e(this.f20530O)).mo17350c(j - this.f20532Q);
    }

    @Override
    public final void mo19481c() {
        C1186a.m38184f(this.f20529N == 0);
        this.f20538b.m19787a();
        mo15515L();
    }

    @Override
    public final void mo19480h() {
        boolean z = true;
        if (this.f20529N != 1) {
            z = false;
        }
        C1186a.m38184f(z);
        this.f20538b.m19787a();
        this.f20529N = 0;
        this.f20530O = null;
        this.f20531P = null;
        this.f20535T = false;
        mo13719I();
    }

    @Override
    public final int mo19479i() {
        return this.f20529N;
    }

    @Override
    public final int mo19431k() {
        return this.f20537a;
    }

    @Override
    public final void mo19478l(C6709v2 v2Var, C6600g1[] g1VarArr, AbstractC7206l0 l0Var, long j, boolean z, boolean z2, long j2, long j3) {
        C1186a.m38184f(this.f20529N == 0);
        this.f20539c = v2Var;
        this.f20529N = 1;
        this.f20533R = j;
        mo15518J(z, z2);
        mo19476n(g1VarArr, l0Var, j2, j3);
        mo13718K(j, z);
    }

    @Override
    public final boolean mo19477m() {
        return this.f20534S == Long.MIN_VALUE;
    }

    @Override
    public final void mo19476n(C6600g1[] g1VarArr, AbstractC7206l0 l0Var, long j, long j2) {
        C1186a.m38184f(!this.f20535T);
        this.f20530O = l0Var;
        if (this.f20534S == Long.MIN_VALUE) {
            this.f20534S = j;
        }
        this.f20531P = g1VarArr;
        this.f20532Q = j2;
        mo13717O(g1VarArr, j, j2);
    }

    @Override
    public final void mo19475o() {
        this.f20535T = true;
    }

    @Override
    public final AbstractC6705u2 mo19474p() {
        return this;
    }

    @Override
    public void mo19473q(float f, float f2) {
        C6688r2.m19572a(this, f, f2);
    }

    @Override
    public final void mo19472r(int i) {
        this.f20528M = i;
    }

    public int mo19430s() {
        return 0;
    }

    @Override
    public final void start() {
        boolean z = true;
        if (this.f20529N != 1) {
            z = false;
        }
        C1186a.m38184f(z);
        this.f20529N = 2;
        mo15513M();
    }

    @Override
    public final void stop() {
        C1186a.m38184f(this.f20529N == 2);
        this.f20529N = 1;
        mo15511N();
    }

    @Override
    public void mo15492u(int i, Object obj) {
    }

    @Override
    public final AbstractC7206l0 mo19471v() {
        return this.f20530O;
    }

    @Override
    public final void mo19470w() {
        ((AbstractC7206l0) C1186a.m38185e(this.f20530O)).mo17351b();
    }

    @Override
    public final long mo19469x() {
        return this.f20534S;
    }

    @Override
    public final void mo19468y(long j) {
        this.f20535T = false;
        this.f20533R = j;
        this.f20534S = j;
        mo13718K(j, false);
    }

    @Override
    public final boolean mo19467z() {
        return this.f20535T;
    }
}
