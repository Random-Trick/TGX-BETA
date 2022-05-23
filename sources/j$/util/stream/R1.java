package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.F;

final class R1 extends AbstractC0294a2 implements Z1 {
    final F f14610b;
    final BiConsumer f14611c;
    final BiConsumer f14612d;

    public R1(F f10, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f14610b = f10;
        this.f14611c = biConsumer;
        this.f14612d = biConsumer2;
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
        this.f14696a = this.f14610b.get();
    }

    @Override
    public final void l(Object obj) {
        this.f14611c.q(this.f14696a, obj);
    }

    @Override
    public final void t(Z1 z12) {
        this.f14612d.q(this.f14696a, ((R1) z12).f14696a);
    }

    @Override
    public final boolean u() {
        return false;
    }
}
