package j$.util.stream;

import j$.util.function.AbstractC0275c;
import j$.util.function.C;
import j$.util.function.F;

final class V1 extends AbstractC0294a2 implements Z1, AbstractC0369p2 {
    final F f14642b;
    final C f14643c;
    final AbstractC0275c f14644d;

    public V1(F f10, C c10, AbstractC0275c cVar) {
        this.f14642b = f10;
        this.f14643c = c10;
        this.f14644d = cVar;
    }

    @Override
    public final void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public final void d(int i10) {
        this.f14643c.o(this.f14696a, i10);
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
        this.f14696a = this.f14642b.get();
    }

    @Override
    public final void l(Object obj) {
        p((Integer) obj);
    }

    @Override
    public final void p(Integer num) {
        E0.l(this, num);
    }

    @Override
    public final void t(Z1 z12) {
        this.f14696a = this.f14644d.v(this.f14696a, ((V1) z12).f14696a);
    }

    @Override
    public final boolean u() {
        return false;
    }
}
