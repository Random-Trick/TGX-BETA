package j$.util.stream;

final class C0391u2 extends AbstractC0349l2 {
    long f14871b;
    long f14872c;
    final C0395v2 f14873d;

    public C0391u2(C0395v2 v2Var, AbstractC0378r2 r2Var) {
        super(r2Var);
        this.f14873d = v2Var;
        this.f14871b = v2Var.f14879u;
        long j10 = v2Var.f14880v;
        this.f14872c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override
    public final void d(int i10) {
        long j10 = this.f14871b;
        if (j10 == 0) {
            long j11 = this.f14872c;
            if (j11 > 0) {
                this.f14872c = j11 - 1;
                this.f14807a.d(i10);
                return;
            }
            return;
        }
        this.f14871b = j10 - 1;
    }

    @Override
    public final void k(long j10) {
        this.f14807a.k(E0.H(j10, this.f14873d.f14879u, this.f14872c));
    }

    @Override
    public final boolean u() {
        return this.f14872c == 0 || this.f14807a.u();
    }
}
