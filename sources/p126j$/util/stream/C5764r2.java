package p126j$.util.stream;

class C5764r2 extends AbstractC5739m2 {
    long f18455b;
    long f18456c;
    final C5769s2 f18457d;

    public C5764r2(C5769s2 s2Var, AbstractC5759q2 q2Var) {
        super(q2Var);
        this.f18457d = s2Var;
        this.f18455b = s2Var.f18469u;
        long j = s2Var.f18470v;
        this.f18456c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override
    public void mo22131j(long j) {
        this.f18428a.mo22131j(AbstractC5572D0.m22448B(j, this.f18457d.f18469u, this.f18456c));
    }

    @Override
    public void mo22128k(Object obj) {
        long j = this.f18455b;
        if (j == 0) {
            long j2 = this.f18456c;
            if (j2 > 0) {
                this.f18456c = j2 - 1;
                this.f18428a.mo22128k(obj);
                return;
            }
            return;
        }
        this.f18455b = j - 1;
    }

    @Override
    public boolean mo22130t() {
        return this.f18456c == 0 || this.f18428a.mo22130t();
    }
}
