package j$.util.stream;

final class C0399w2 extends AbstractC0354m2 {
    long f14885b;
    long f14886c;
    final C0403x2 f14887d;

    public C0399w2(C0403x2 x2Var, AbstractC0378r2 r2Var) {
        super(r2Var);
        this.f14887d = x2Var;
        this.f14885b = x2Var.f14895u;
        long j10 = x2Var.f14896v;
        this.f14886c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override
    public final void e(long j10) {
        long j11 = this.f14885b;
        if (j11 == 0) {
            long j12 = this.f14886c;
            if (j12 > 0) {
                this.f14886c = j12 - 1;
                this.f14819a.e(j10);
                return;
            }
            return;
        }
        this.f14885b = j11 - 1;
    }

    @Override
    public final void k(long j10) {
        this.f14819a.k(E0.H(j10, this.f14887d.f14895u, this.f14886c));
    }

    @Override
    public final boolean u() {
        return this.f14886c == 0 || this.f14819a.u();
    }
}
