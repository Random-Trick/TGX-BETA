package p126j$.util.stream;

class C5774t2 extends AbstractC5729k2 {
    long f18477b;
    long f18478c;
    final C5779u2 f18479d;

    public C5774t2(C5779u2 u2Var, AbstractC5759q2 q2Var) {
        super(q2Var);
        this.f18479d = u2Var;
        this.f18477b = u2Var.f18485u;
        long j = u2Var.f18486v;
        this.f18478c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override
    public void mo22134d(int i) {
        long j = this.f18477b;
        if (j == 0) {
            long j2 = this.f18478c;
            if (j2 > 0) {
                this.f18478c = j2 - 1;
                this.f18413a.mo22134d(i);
                return;
            }
            return;
        }
        this.f18477b = j - 1;
    }

    @Override
    public void mo22131j(long j) {
        this.f18413a.mo22131j(AbstractC5572D0.m22448B(j, this.f18479d.f18485u, this.f18478c));
    }

    @Override
    public boolean mo22130t() {
        return this.f18478c == 0 || this.f18413a.mo22130t();
    }
}
