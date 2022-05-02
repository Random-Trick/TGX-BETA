package p020b5;

import p174m3.C6613h2;

public final class C1195e0 implements AbstractC1232u {
    public long f4487M;
    public C6613h2 f4488N = C6613h2.f20669M;
    public final AbstractC1192d f4489a;
    public boolean f4490b;
    public long f4491c;

    public C1195e0(AbstractC1192d dVar) {
        this.f4489a = dVar;
    }

    public void m38093a(long j) {
        this.f4491c = j;
        if (this.f4490b) {
            this.f4487M = this.f4489a.mo38084d();
        }
    }

    public void m38092b() {
        if (!this.f4490b) {
            this.f4487M = this.f4489a.mo38084d();
            this.f4490b = true;
        }
    }

    public void m38091c() {
        if (this.f4490b) {
            m38093a(mo15503g());
            this.f4490b = false;
        }
    }

    @Override
    public void mo15504d(C6613h2 h2Var) {
        if (this.f4490b) {
            m38093a(mo15503g());
        }
        this.f4488N = h2Var;
    }

    @Override
    public long mo15503g() {
        long j;
        long j2 = this.f4491c;
        if (!this.f4490b) {
            return j2;
        }
        long d = this.f4489a.mo38084d() - this.f4487M;
        C6613h2 h2Var = this.f4488N;
        if (h2Var.f20671a == 1.0f) {
            j = C1216l0.m37956q0(d);
        } else {
            j = h2Var.m19786b(d);
        }
        return j2 + j;
    }

    @Override
    public C6613h2 mo15501j() {
        return this.f4488N;
    }
}
