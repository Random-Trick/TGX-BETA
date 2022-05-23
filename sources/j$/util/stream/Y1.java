package j$.util.stream;

import j$.util.C0286n;
import j$.util.function.t;

final class Y1 implements Z1, AbstractC0374q2 {
    private boolean f14658a;
    private long f14659b;
    final t f14660c;

    public Y1(t tVar) {
        this.f14660c = tVar;
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
        if (this.f14658a) {
            this.f14658a = false;
        } else {
            j10 = this.f14660c.j(this.f14659b, j10);
        }
        this.f14659b = j10;
    }

    @Override
    public final Object get() {
        return this.f14658a ? C0286n.a() : C0286n.d(this.f14659b);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        this.f14658a = true;
        this.f14659b = 0L;
    }

    @Override
    public final void l(Object obj) {
        x((Long) obj);
    }

    @Override
    public final void t(Z1 z12) {
        Y1 y12 = (Y1) z12;
        if (!y12.f14658a) {
            e(y12.f14659b);
        }
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
