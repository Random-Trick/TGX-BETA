package p126j$.util.stream;

class C5794x2 extends AbstractC5724j2 {
    long f18508b;
    long f18509c;
    final C5799y2 f18510d;

    public C5794x2(C5799y2 y2Var, AbstractC5759q2 q2Var) {
        super(q2Var);
        this.f18510d = y2Var;
        this.f18508b = y2Var.f18518u;
        long j = y2Var.f18519v;
        this.f18509c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override
    public void mo22136c(double d) {
        long j = this.f18508b;
        if (j == 0) {
            long j2 = this.f18509c;
            if (j2 > 0) {
                this.f18509c = j2 - 1;
                this.f18394a.mo22136c(d);
                return;
            }
            return;
        }
        this.f18508b = j - 1;
    }

    @Override
    public void mo22132j(long j) {
        this.f18394a.mo22132j(AbstractC5572D0.m22449B(j, this.f18510d.f18518u, this.f18509c));
    }

    @Override
    public boolean mo22131t() {
        return this.f18509c == 0 || this.f18394a.mo22131t();
    }
}
