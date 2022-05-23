package j$.util.stream;

import j$.util.function.AbstractC0275c;
import j$.util.function.B;
import j$.util.function.F;

final class M1 extends AbstractC0294a2 implements Z1, AbstractC0364o2 {
    final F f14575b;
    final B f14576c;
    final AbstractC0275c f14577d;

    public M1(F f10, B b10, AbstractC0275c cVar) {
        this.f14575b = f10;
        this.f14576c = b10;
        this.f14577d = cVar;
    }

    @Override
    public final void c(double d10) {
        this.f14576c.a(this.f14696a, d10);
    }

    @Override
    public final void d(int i10) {
        E0.p();
        throw null;
    }

    @Override
    public final void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        this.f14696a = this.f14575b.get();
    }

    @Override
    public final void l(Object obj) {
        y((Double) obj);
    }

    @Override
    public final void t(Z1 z12) {
        this.f14696a = this.f14577d.v(this.f14696a, ((M1) z12).f14696a);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void y(Double d10) {
        E0.j(this, d10);
    }
}
