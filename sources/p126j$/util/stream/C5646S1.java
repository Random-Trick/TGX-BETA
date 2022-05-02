package p126j$.util.stream;

import p126j$.util.function.AbstractC5528j;

class C5646S1 implements AbstractC5670Y1, AbstractC5749o2 {
    private int f18236a;
    final int f18237b;
    final AbstractC5528j f18238c;

    public C5646S1(int i, AbstractC5528j jVar) {
        this.f18237b = i;
        this.f18238c = jVar;
    }

    public void mo22128k(Integer num) {
        AbstractC5572D0.m22417k(this, num);
    }

    @Override
    public void mo22135c(double d) {
        AbstractC5572D0.m22421i();
        throw null;
    }

    @Override
    public void mo22134d(int i) {
        this.f18236a = this.f18238c.mo22223i(this.f18236a, i);
    }

    @Override
    public void mo22133e(long j) {
        AbstractC5572D0.m22412n();
        throw null;
    }

    @Override
    public Object get() {
        return Integer.valueOf(this.f18236a);
    }

    @Override
    public void mo22132h() {
    }

    @Override
    public void mo22131j(long j) {
        this.f18236a = this.f18237b;
    }

    @Override
    public void mo22346s(AbstractC5670Y1 y1) {
        mo22134d(((C5646S1) y1).f18236a);
    }

    @Override
    public boolean mo22130t() {
        return false;
    }
}
