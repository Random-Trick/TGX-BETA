package p126j$.util.stream;

import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.BiFunction;

class C5618M1 extends AbstractC5674Z1 implements AbstractC5670Y1 {
    final Object f18191b;
    final BiFunction f18192c;
    final AbstractC5521c f18193d;

    public C5618M1(Object obj, BiFunction biFunction, AbstractC5521c cVar) {
        this.f18191b = obj;
        this.f18192c = biFunction;
        this.f18193d = cVar;
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
        this.f18281a = this.f18191b;
    }

    @Override
    public void mo22129k(Object obj) {
        this.f18281a = this.f18192c.mo22173u(this.f18281a, obj);
    }

    @Override
    public void mo22347s(AbstractC5670Y1 y1) {
        this.f18281a = this.f18193d.mo22173u(this.f18281a, ((C5618M1) y1).f18281a);
    }

    @Override
    public boolean mo22131t() {
        return false;
    }
}
