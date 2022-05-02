package p126j$.util.stream;

import p126j$.util.function.AbstractC5523e;

class C5598I1 implements AbstractC5670Y1, AbstractC5744n2 {
    private double f18156a;
    final double f18157b;
    final AbstractC5523e f18158c;

    public C5598I1(double d, AbstractC5523e eVar) {
        this.f18157b = d;
        this.f18158c = eVar;
    }

    public void mo22128k(Double d) {
        AbstractC5572D0.m22419j(this, d);
    }

    @Override
    public void mo22135c(double d) {
        this.f18156a = this.f18158c.mo22231m(this.f18156a, d);
    }

    @Override
    public void mo22134d(int i) {
        AbstractC5572D0.m22414m();
        throw null;
    }

    @Override
    public void mo22133e(long j) {
        AbstractC5572D0.m22412n();
        throw null;
    }

    @Override
    public Object get() {
        return Double.valueOf(this.f18156a);
    }

    @Override
    public void mo22132h() {
    }

    @Override
    public void mo22131j(long j) {
        this.f18156a = this.f18157b;
    }

    @Override
    public void mo22346s(AbstractC5670Y1 y1) {
        mo22135c(((C5598I1) y1).f18156a);
    }

    @Override
    public boolean mo22130t() {
        return false;
    }
}
