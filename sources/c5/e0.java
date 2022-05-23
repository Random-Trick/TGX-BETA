package c5;

import m3.r2;

public final class e0 implements u {
    public long M;
    public r2 N = r2.M;
    public final d f4810a;
    public boolean f4811b;
    public long f4812c;

    public e0(d dVar) {
        this.f4810a = dVar;
    }

    public void a(long j10) {
        this.f4812c = j10;
        if (this.f4811b) {
            this.M = this.f4810a.d();
        }
    }

    public void b() {
        if (!this.f4811b) {
            this.M = this.f4810a.d();
            this.f4811b = true;
        }
    }

    public void c() {
        if (this.f4811b) {
            a(g());
            this.f4811b = false;
        }
    }

    @Override
    public void d(r2 r2Var) {
        if (this.f4811b) {
            a(g());
        }
        this.N = r2Var;
    }

    @Override
    public long g() {
        long j10;
        long j11 = this.f4812c;
        if (!this.f4811b) {
            return j11;
        }
        long d10 = this.f4810a.d() - this.M;
        r2 r2Var = this.N;
        if (r2Var.f16948a == 1.0f) {
            j10 = l0.r0(d10);
        } else {
            j10 = r2Var.b(d10);
        }
        return j11 + j10;
    }

    @Override
    public r2 j() {
        return this.N;
    }
}
