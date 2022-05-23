package m3;

import c5.d;
import c5.e0;
import c5.u;

public final class l implements u {
    public u M;
    public boolean N = true;
    public boolean O;
    public final e0 f16766a;
    public final a f16767b;
    public b3 f16768c;

    public interface a {
        void g(r2 r2Var);
    }

    public l(a aVar, d dVar) {
        this.f16767b = aVar;
        this.f16766a = new e0(dVar);
    }

    public void a(b3 b3Var) {
        if (b3Var == this.f16768c) {
            this.M = null;
            this.f16768c = null;
            this.N = true;
        }
    }

    public void b(b3 b3Var) {
        u uVar;
        u A = b3Var.A();
        if (A != null && A != (uVar = this.M)) {
            if (uVar == null) {
                this.M = A;
                this.f16768c = b3Var;
                A.d(this.f16766a.j());
                return;
            }
            throw q.i(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void c(long j10) {
        this.f16766a.a(j10);
    }

    @Override
    public void d(r2 r2Var) {
        u uVar = this.M;
        if (uVar != null) {
            uVar.d(r2Var);
            r2Var = this.M.j();
        }
        this.f16766a.d(r2Var);
    }

    public final boolean e(boolean z10) {
        b3 b3Var = this.f16768c;
        return b3Var == null || b3Var.e() || (!this.f16768c.f() && (z10 || this.f16768c.l()));
    }

    public void f() {
        this.O = true;
        this.f16766a.b();
    }

    @Override
    public long g() {
        if (this.N) {
            return this.f16766a.g();
        }
        return ((u) c5.a.e(this.M)).g();
    }

    public void h() {
        this.O = false;
        this.f16766a.c();
    }

    public long i(boolean z10) {
        k(z10);
        return g();
    }

    @Override
    public r2 j() {
        u uVar = this.M;
        if (uVar != null) {
            return uVar.j();
        }
        return this.f16766a.j();
    }

    public final void k(boolean z10) {
        if (e(z10)) {
            this.N = true;
            if (this.O) {
                this.f16766a.b();
                return;
            }
            return;
        }
        u uVar = (u) c5.a.e(this.M);
        long g10 = uVar.g();
        if (this.N) {
            if (g10 < this.f16766a.g()) {
                this.f16766a.c();
                return;
            }
            this.N = false;
            if (this.O) {
                this.f16766a.b();
            }
        }
        this.f16766a.a(g10);
        r2 j10 = uVar.j();
        if (!j10.equals(this.f16766a.j())) {
            this.f16766a.d(j10);
            this.f16767b.g(j10);
        }
    }
}
