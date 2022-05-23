package j$.util.stream;

import j$.util.function.t;

final class X1 implements Z1, AbstractC0374q2 {
    private long f14653a;
    final long f14654b;
    final t f14655c;

    public X1(long j10, t tVar) {
        this.f14654b = j10;
        this.f14655c = tVar;
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
        this.f14653a = this.f14655c.j(this.f14653a, j10);
    }

    @Override
    public final Object get() {
        return Long.valueOf(this.f14653a);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        this.f14653a = this.f14654b;
    }

    @Override
    public final void l(Object obj) {
        x((Long) obj);
    }

    @Override
    public final void t(Z1 z12) {
        e(((X1) z12).f14653a);
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
