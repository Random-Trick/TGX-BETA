package p126j$.util.stream;

import p126j$.util.function.AbstractC5533o;

class C5662W1 implements AbstractC5670Y1, AbstractC5754p2 {
    private long f18258a;
    final long f18259b;
    final AbstractC5533o f18260c;

    public C5662W1(long j, AbstractC5533o oVar) {
        this.f18259b = j;
        this.f18260c = oVar;
    }

    public void mo22128k(Long l) {
        AbstractC5572D0.m22416l(this, l);
    }

    @Override
    public void mo22135c(double d) {
        AbstractC5572D0.m22421i();
        throw null;
    }

    @Override
    public void mo22134d(int i) {
        AbstractC5572D0.m22414m();
        throw null;
    }

    @Override
    public void mo22133e(long j) {
        this.f18258a = this.f18260c.mo22222l(this.f18258a, j);
    }

    @Override
    public Object get() {
        return Long.valueOf(this.f18258a);
    }

    @Override
    public void mo22132h() {
    }

    @Override
    public void mo22131j(long j) {
        this.f18258a = this.f18259b;
    }

    @Override
    public void mo22346s(AbstractC5670Y1 y1) {
        mo22133e(((C5662W1) y1).f18258a);
    }

    @Override
    public boolean mo22130t() {
        return false;
    }
}
