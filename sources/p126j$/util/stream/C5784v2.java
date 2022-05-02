package p126j$.util.stream;

class C5784v2 extends AbstractC5734l2 {
    long f18491b;
    long f18492c;
    final C5789w2 f18493d;

    public C5784v2(C5789w2 w2Var, AbstractC5759q2 q2Var) {
        super(q2Var);
        this.f18493d = w2Var;
        this.f18491b = w2Var.f18501u;
        long j = w2Var.f18502v;
        this.f18492c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override
    public void mo22133e(long j) {
        long j2 = this.f18491b;
        if (j2 == 0) {
            long j3 = this.f18492c;
            if (j3 > 0) {
                this.f18492c = j3 - 1;
                this.f18425a.mo22133e(j);
                return;
            }
            return;
        }
        this.f18491b = j2 - 1;
    }

    @Override
    public void mo22131j(long j) {
        this.f18425a.mo22131j(AbstractC5572D0.m22448B(j, this.f18493d.f18501u, this.f18492c));
    }

    @Override
    public boolean mo22130t() {
        return this.f18492c == 0 || this.f18425a.mo22130t();
    }
}
