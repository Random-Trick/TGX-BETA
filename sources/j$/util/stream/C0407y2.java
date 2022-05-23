package j$.util.stream;

final class C0407y2 extends AbstractC0344k2 {
    long f14902b;
    long f14903c;
    final C0411z2 f14904d;

    public C0407y2(C0411z2 z2Var, AbstractC0378r2 r2Var) {
        super(r2Var);
        this.f14904d = z2Var;
        this.f14902b = z2Var.f14912u;
        long j10 = z2Var.f14913v;
        this.f14903c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override
    public final void c(double d10) {
        long j10 = this.f14902b;
        if (j10 == 0) {
            long j11 = this.f14903c;
            if (j11 > 0) {
                this.f14903c = j11 - 1;
                this.f14788a.c(d10);
                return;
            }
            return;
        }
        this.f14902b = j10 - 1;
    }

    @Override
    public final void k(long j10) {
        this.f14788a.k(E0.H(j10, this.f14904d.f14912u, this.f14903c));
    }

    @Override
    public final boolean u() {
        return this.f14903c == 0 || this.f14788a.u();
    }
}
