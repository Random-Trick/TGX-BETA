package j$.util.stream;

import j$.util.function.AbstractC0275c;
import j$.util.function.BiFunction;

final class N1 extends AbstractC0294a2 implements Z1 {
    final Object f14586b;
    final BiFunction f14587c;
    final AbstractC0275c f14588d;

    public N1(Object obj, BiFunction biFunction, AbstractC0275c cVar) {
        this.f14586b = obj;
        this.f14587c = biFunction;
        this.f14588d = cVar;
    }

    @Override
    public final void c(double d10) {
        E0.i();
        throw null;
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
        this.f14696a = this.f14586b;
    }

    @Override
    public final void l(Object obj) {
        this.f14696a = this.f14587c.v(this.f14696a, obj);
    }

    @Override
    public final void t(Z1 z12) {
        this.f14696a = this.f14588d.v(this.f14696a, ((N1) z12).f14696a);
    }

    @Override
    public final boolean u() {
        return false;
    }
}
