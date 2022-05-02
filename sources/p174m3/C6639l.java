package p174m3;

import p020b5.AbstractC1192d;
import p020b5.AbstractC1232u;
import p020b5.C1186a;
import p020b5.C1195e0;

public final class C6639l implements AbstractC1232u {
    public AbstractC1232u f20750M;
    public boolean f20751N = true;
    public boolean f20752O;
    public final C1195e0 f20753a;
    public final AbstractC6640a f20754b;
    public AbstractC6696s2 f20755c;

    public interface AbstractC6640a {
        void mo19722c(C6613h2 h2Var);
    }

    public C6639l(AbstractC6640a aVar, AbstractC1192d dVar) {
        this.f20754b = aVar;
        this.f20753a = new C1195e0(dVar);
    }

    public void m19730a(AbstractC6696s2 s2Var) {
        if (s2Var == this.f20755c) {
            this.f20750M = null;
            this.f20755c = null;
            this.f20751N = true;
        }
    }

    public void m19729b(AbstractC6696s2 s2Var) {
        AbstractC1232u uVar;
        AbstractC1232u A = s2Var.mo15519A();
        if (A != null && A != (uVar = this.f20750M)) {
            if (uVar == null) {
                this.f20750M = A;
                this.f20755c = s2Var;
                A.mo15504d(this.f20753a.mo15501j());
                return;
            }
            throw C6681q.m19580i(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void m19728c(long j) {
        this.f20753a.m38090a(j);
    }

    @Override
    public void mo15504d(C6613h2 h2Var) {
        AbstractC1232u uVar = this.f20750M;
        if (uVar != null) {
            uVar.mo15504d(h2Var);
            h2Var = this.f20750M.mo15501j();
        }
        this.f20753a.mo15504d(h2Var);
    }

    public final boolean m19727e(boolean z) {
        AbstractC6696s2 s2Var = this.f20755c;
        return s2Var == null || s2Var.mo13706e() || (!this.f20755c.mo13705f() && (z || this.f20755c.mo19477m()));
    }

    public void m19726f() {
        this.f20752O = true;
        this.f20753a.m38089b();
    }

    @Override
    public long mo15503g() {
        if (this.f20751N) {
            return this.f20753a.mo15503g();
        }
        return ((AbstractC1232u) C1186a.m38185e(this.f20750M)).mo15503g();
    }

    public void m19725h() {
        this.f20752O = false;
        this.f20753a.m38088c();
    }

    public long m19724i(boolean z) {
        m19723k(z);
        return mo15503g();
    }

    @Override
    public C6613h2 mo15501j() {
        AbstractC1232u uVar = this.f20750M;
        if (uVar != null) {
            return uVar.mo15501j();
        }
        return this.f20753a.mo15501j();
    }

    public final void m19723k(boolean z) {
        if (m19727e(z)) {
            this.f20751N = true;
            if (this.f20752O) {
                this.f20753a.m38089b();
                return;
            }
            return;
        }
        AbstractC1232u uVar = (AbstractC1232u) C1186a.m38185e(this.f20750M);
        long g = uVar.mo15503g();
        if (this.f20751N) {
            if (g < this.f20753a.mo15503g()) {
                this.f20753a.m38088c();
                return;
            }
            this.f20751N = false;
            if (this.f20752O) {
                this.f20753a.m38089b();
            }
        }
        this.f20753a.m38090a(g);
        C6613h2 j = uVar.mo15501j();
        if (!j.equals(this.f20753a.mo15501j())) {
            this.f20753a.mo15504d(j);
            this.f20754b.mo19722c(j);
        }
    }
}
