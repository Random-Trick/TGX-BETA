package j$.util.stream;

import j$.util.function.AbstractC0276d;

final class J1 implements Z1, AbstractC0364o2 {
    private double f14551a;
    final double f14552b;
    final AbstractC0276d f14553c;

    public J1(double d10, AbstractC0276d dVar) {
        this.f14552b = d10;
        this.f14553c = dVar;
    }

    @Override
    public final void c(double d10) {
        this.f14551a = this.f14553c.m(this.f14551a, d10);
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
    public final Object get() {
        return Double.valueOf(this.f14551a);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        this.f14551a = this.f14552b;
    }

    @Override
    public final void l(Object obj) {
        y((Double) obj);
    }

    @Override
    public final void t(Z1 z12) {
        c(((J1) z12).f14551a);
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
