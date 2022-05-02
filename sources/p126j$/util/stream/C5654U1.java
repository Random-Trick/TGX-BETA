package p126j$.util.stream;

import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5539u;
import p126j$.util.function.AbstractC5542x;

class C5654U1 extends AbstractC5674Z1 implements AbstractC5670Y1, AbstractC5749o2 {
    final AbstractC5542x f18247b;
    final AbstractC5539u f18248c;
    final AbstractC5521c f18249d;

    public C5654U1(AbstractC5542x xVar, AbstractC5539u uVar, AbstractC5521c cVar) {
        this.f18247b = xVar;
        this.f18248c = uVar;
        this.f18249d = cVar;
    }

    public void mo22129k(Integer num) {
        AbstractC5572D0.m22418k(this, num);
    }

    @Override
    public void mo22136c(double d) {
        AbstractC5572D0.m22422i();
        throw null;
    }

    @Override
    public void mo22135d(int i) {
        this.f18248c.mo22231o(this.f18281a, i);
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
        this.f18281a = this.f18247b.get();
    }

    @Override
    public void mo22347s(AbstractC5670Y1 y1) {
        this.f18281a = this.f18249d.mo22173u(this.f18281a, ((C5654U1) y1).f18281a);
    }

    @Override
    public boolean mo22131t() {
        return false;
    }
}
