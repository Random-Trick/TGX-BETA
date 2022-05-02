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

    public void mo22129k(Long l) {
        AbstractC5572D0.m22417l(this, l);
    }

    @Override
    public void mo22136c(double d) {
        AbstractC5572D0.m22422i();
        throw null;
    }

    @Override
    public void mo22135d(int i) {
        AbstractC5572D0.m22415m();
        throw null;
    }

    @Override
    public void mo22134e(long j) {
        this.f18258a = this.f18260c.mo22223l(this.f18258a, j);
    }

    @Override
    public Object get() {
        return Long.valueOf(this.f18258a);
    }

    @Override
    public void mo22133h() {
    }

    @Override
    public void mo22132j(long j) {
        this.f18258a = this.f18259b;
    }

    @Override
    public void mo22347s(AbstractC5670Y1 y1) {
        mo22134e(((C5662W1) y1).f18258a);
    }

    @Override
    public boolean mo22131t() {
        return false;
    }
}
