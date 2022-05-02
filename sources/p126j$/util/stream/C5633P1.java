package p126j$.util.stream;

import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;

class C5633P1 extends AbstractC5674Z1 implements AbstractC5670Y1 {
    final AbstractC5542x f18208b;
    final BiConsumer f18209c;
    final AbstractC5521c f18210d;

    public C5633P1(AbstractC5542x xVar, BiConsumer biConsumer, AbstractC5521c cVar) {
        this.f18208b = xVar;
        this.f18209c = biConsumer;
        this.f18210d = cVar;
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
        AbstractC5572D0.m22413n();
        throw null;
    }

    @Override
    public void mo22133h() {
    }

    @Override
    public void mo22132j(long j) {
        this.f18281a = this.f18208b.get();
    }

    @Override
    public void mo22129k(Object obj) {
        this.f18209c.mo22180p(this.f18281a, obj);
    }

    @Override
    public void mo22347s(AbstractC5670Y1 y1) {
        this.f18281a = this.f18210d.mo22173u(this.f18281a, ((C5633P1) y1).f18281a);
    }

    @Override
    public boolean mo22131t() {
        return false;
    }
}
