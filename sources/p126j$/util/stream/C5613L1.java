package p126j$.util.stream;

import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5538t;
import p126j$.util.function.AbstractC5542x;

class C5613L1 extends AbstractC5674Z1 implements AbstractC5670Y1, AbstractC5744n2 {
    final AbstractC5542x f18180b;
    final AbstractC5538t f18181c;
    final AbstractC5521c f18182d;

    public C5613L1(AbstractC5542x xVar, AbstractC5538t tVar, AbstractC5521c cVar) {
        this.f18180b = xVar;
        this.f18181c = tVar;
        this.f18182d = cVar;
    }

    public void mo22129k(Double d) {
        AbstractC5572D0.m22420j(this, d);
    }

    @Override
    public void mo22136c(double d) {
        this.f18181c.mo22225a(this.f18281a, d);
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
        this.f18281a = this.f18180b.get();
    }

    @Override
    public void mo22347s(AbstractC5670Y1 y1) {
        this.f18281a = this.f18182d.mo22173u(this.f18281a, ((C5613L1) y1).f18281a);
    }

    @Override
    public boolean mo22131t() {
        return false;
    }
}
