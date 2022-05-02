package p126j$.util.stream;

import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5540v;
import p126j$.util.function.AbstractC5542x;

class C5588G1 extends AbstractC5674Z1 implements AbstractC5670Y1, AbstractC5754p2 {
    final AbstractC5542x f18144b;
    final AbstractC5540v f18145c;
    final AbstractC5521c f18146d;

    public C5588G1(AbstractC5542x xVar, AbstractC5540v vVar, AbstractC5521c cVar) {
        this.f18144b = xVar;
        this.f18145c = vVar;
        this.f18146d = cVar;
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
        this.f18145c.mo22230q(this.f18281a, j);
    }

    @Override
    public void mo22133h() {
    }

    @Override
    public void mo22132j(long j) {
        this.f18281a = this.f18144b.get();
    }

    @Override
    public void mo22347s(AbstractC5670Y1 y1) {
        this.f18281a = this.f18146d.mo22173u(this.f18281a, ((C5588G1) y1).f18281a);
    }

    @Override
    public boolean mo22131t() {
        return false;
    }
}
