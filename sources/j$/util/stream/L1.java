package j$.util.stream;

import j$.util.C0284l;
import j$.util.function.AbstractC0276d;

final class L1 implements Z1, AbstractC0364o2 {
    private boolean f14568a;
    private double f14569b;
    final AbstractC0276d f14570c;

    public L1(AbstractC0276d dVar) {
        this.f14570c = dVar;
    }

    @Override
    public final void c(double d10) {
        if (this.f14568a) {
            this.f14568a = false;
        } else {
            d10 = this.f14570c.m(this.f14569b, d10);
        }
        this.f14569b = d10;
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
        return this.f14568a ? C0284l.a() : C0284l.d(this.f14569b);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        this.f14568a = true;
        this.f14569b = 0.0d;
    }

    @Override
    public final void l(Object obj) {
        y((Double) obj);
    }

    @Override
    public final void t(Z1 z12) {
        L1 l12 = (L1) z12;
        if (!l12.f14568a) {
            c(l12.f14569b);
        }
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
