package p126j$.util.stream;

import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;

class C5638Q1 extends AbstractC5674Z1 implements AbstractC5670Y1 {
    final AbstractC5542x f18215b;
    final BiConsumer f18216c;
    final BiConsumer f18217d;

    public C5638Q1(AbstractC5542x xVar, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f18215b = xVar;
        this.f18216c = biConsumer;
        this.f18217d = biConsumer2;
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
        AbstractC5572D0.m22412n();
        throw null;
    }

    @Override
    public void mo22132h() {
    }

    @Override
    public void mo22131j(long j) {
        this.f18281a = this.f18215b.get();
    }

    @Override
    public void mo22128k(Object obj) {
        this.f18216c.mo22179p(this.f18281a, obj);
    }

    @Override
    public void mo22346s(AbstractC5670Y1 y1) {
        this.f18217d.mo22179p(this.f18281a, ((C5638Q1) y1).f18281a);
    }

    @Override
    public boolean mo22130t() {
        return false;
    }
}