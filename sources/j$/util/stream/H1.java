package j$.util.stream;

import j$.util.function.AbstractC0275c;
import j$.util.function.D;
import j$.util.function.F;

final class H1 extends AbstractC0294a2 implements Z1, AbstractC0374q2 {
    final F f14539b;
    final D f14540c;
    final AbstractC0275c f14541d;

    public H1(F f10, D d10, AbstractC0275c cVar) {
        this.f14539b = f10;
        this.f14540c = d10;
        this.f14541d = cVar;
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
        this.f14540c.r(this.f14696a, j10);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        this.f14696a = this.f14539b.get();
    }

    @Override
    public final void l(Object obj) {
        x((Long) obj);
    }

    @Override
    public final void t(Z1 z12) {
        this.f14696a = this.f14541d.v(this.f14696a, ((H1) z12).f14696a);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void x(Long l10) {
        E0.n(this, l10);
    }
}
