package m3;

import c5.a;
import c5.u;
import n3.p1;
import o4.j0;
import p3.g;

public abstract class f implements b3, d3 {
    public int M;
    public p1 N;
    public int O;
    public j0 P;
    public q1[] Q;
    public long R;
    public long S;
    public boolean U;
    public boolean V;
    public final int f16642a;
    public e3 f16644c;
    public final r1 f16643b = new r1();
    public long T = Long.MIN_VALUE;

    public f(int i10) {
        this.f16642a = i10;
    }

    @Override
    public u A() {
        return null;
    }

    public final q B(Throwable th, q1 q1Var, int i10) {
        return C(th, q1Var, false, i10);
    }

    public final q C(Throwable th, q1 q1Var, boolean z10, int i10) {
        int i11;
        if (q1Var != null && !this.V) {
            this.V = true;
            try {
                i11 = c3.e(a(q1Var));
            } catch (q unused) {
            } finally {
                this.V = false;
            }
            return q.g(th, b(), F(), q1Var, i11, z10, i10);
        }
        i11 = 4;
        return q.g(th, b(), F(), q1Var, i11, z10, i10);
    }

    public final e3 D() {
        return (e3) a.e(this.f16644c);
    }

    public final r1 E() {
        this.f16643b.a();
        return this.f16643b;
    }

    public final int F() {
        return this.M;
    }

    public final p1 G() {
        return (p1) a.e(this.N);
    }

    public final q1[] H() {
        return (q1[]) a.e(this.Q);
    }

    public final boolean I() {
        return l() ? this.U : ((j0) a.e(this.P)).f();
    }

    public abstract void J();

    public void K(boolean z10, boolean z11) {
    }

    public abstract void L(long j10, boolean z10);

    public void M() {
    }

    public void N() {
    }

    public void O() {
    }

    public void P(q1[] q1VarArr, long j10, long j11) {
    }

    public final int Q(r1 r1Var, g gVar, int i10) {
        int a10 = ((j0) a.e(this.P)).a(r1Var, gVar, i10);
        if (a10 == -4) {
            if (gVar.isEndOfStream()) {
                this.T = Long.MIN_VALUE;
                return this.U ? -4 : -3;
            }
            long j10 = gVar.N + this.R;
            gVar.N = j10;
            this.T = Math.max(this.T, j10);
        } else if (a10 == -5) {
            q1 q1Var = (q1) a.e(r1Var.f16947b);
            if (q1Var.Y != Long.MAX_VALUE) {
                r1Var.f16947b = q1Var.b().i0(q1Var.Y + this.R).E();
            }
        }
        return a10;
    }

    public final void R(long j10, boolean z10) {
        this.U = false;
        this.S = j10;
        this.T = j10;
        L(j10, z10);
    }

    public int S(long j10) {
        return ((j0) a.e(this.P)).c(j10 - this.R);
    }

    @Override
    public final void c() {
        a.f(this.O == 0);
        this.f16643b.a();
        M();
    }

    @Override
    public final void h() {
        boolean z10 = true;
        if (this.O != 1) {
            z10 = false;
        }
        a.f(z10);
        this.f16643b.a();
        this.O = 0;
        this.P = null;
        this.Q = null;
        this.U = false;
        J();
    }

    @Override
    public final int i() {
        return this.O;
    }

    @Override
    public final int k() {
        return this.f16642a;
    }

    @Override
    public final boolean l() {
        return this.T == Long.MIN_VALUE;
    }

    @Override
    public final void m() {
        this.U = true;
    }

    @Override
    public final void n(int i10, p1 p1Var) {
        this.M = i10;
        this.N = p1Var;
    }

    @Override
    public final d3 o() {
        return this;
    }

    @Override
    public void p(float f10, float f11) {
        a3.a(this, f10, f11);
    }

    public int q() {
        return 0;
    }

    @Override
    public final void s(q1[] q1VarArr, j0 j0Var, long j10, long j11) {
        a.f(!this.U);
        this.P = j0Var;
        if (this.T == Long.MIN_VALUE) {
            this.T = j10;
        }
        this.Q = q1VarArr;
        this.R = j11;
        P(q1VarArr, j10, j11);
    }

    @Override
    public final void start() {
        boolean z10 = true;
        if (this.O != 1) {
            z10 = false;
        }
        a.f(z10);
        this.O = 2;
        N();
    }

    @Override
    public final void stop() {
        a.f(this.O == 2);
        this.O = 1;
        O();
    }

    @Override
    public void t(int i10, Object obj) {
    }

    @Override
    public final void u(e3 e3Var, q1[] q1VarArr, j0 j0Var, long j10, boolean z10, boolean z11, long j11, long j12) {
        a.f(this.O == 0);
        this.f16644c = e3Var;
        this.O = 1;
        K(z10, z11);
        s(q1VarArr, j0Var, j11, j12);
        R(j10, z10);
    }

    @Override
    public final j0 v() {
        return this.P;
    }

    @Override
    public final void w() {
        ((j0) a.e(this.P)).b();
    }

    @Override
    public final long x() {
        return this.T;
    }

    @Override
    public final void y(long j10) {
        R(j10, false);
    }

    @Override
    public final boolean z() {
        return this.U;
    }
}
