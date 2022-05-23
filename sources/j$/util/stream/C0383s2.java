package j$.util.stream;

final class C0383s2 extends AbstractC0359n2 {
    long f14849b;
    long f14850c;
    final C0387t2 f14851d;

    public C0383s2(C0387t2 t2Var, AbstractC0378r2 r2Var) {
        super(r2Var);
        this.f14851d = t2Var;
        this.f14849b = t2Var.f14863u;
        long j10 = t2Var.f14864v;
        this.f14850c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override
    public final void k(long j10) {
        this.f14822a.k(E0.H(j10, this.f14851d.f14863u, this.f14850c));
    }

    @Override
    public final void l(Object obj) {
        long j10 = this.f14849b;
        if (j10 == 0) {
            long j11 = this.f14850c;
            if (j11 > 0) {
                this.f14850c = j11 - 1;
                this.f14822a.l(obj);
                return;
            }
            return;
        }
        this.f14849b = j10 - 1;
    }

    @Override
    public final boolean u() {
        return this.f14850c == 0 || this.f14822a.u();
    }
}
