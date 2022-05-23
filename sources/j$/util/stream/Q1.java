package j$.util.stream;

import j$.util.function.AbstractC0275c;
import j$.util.function.BiConsumer;
import j$.util.function.F;

final class Q1 extends AbstractC0294a2 implements Z1 {
    final F f14603b;
    final BiConsumer f14604c;
    final AbstractC0275c f14605d;

    public Q1(F f10, BiConsumer biConsumer, AbstractC0275c cVar) {
        this.f14603b = f10;
        this.f14604c = biConsumer;
        this.f14605d = cVar;
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
        this.f14696a = this.f14603b.get();
    }

    @Override
    public final void l(Object obj) {
        this.f14604c.q(this.f14696a, obj);
    }

    @Override
    public final void t(Z1 z12) {
        this.f14696a = this.f14605d.v(this.f14696a, ((Q1) z12).f14696a);
    }

    @Override
    public final boolean u() {
        return false;
    }
}
