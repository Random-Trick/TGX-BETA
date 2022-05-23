package j$.util.stream;

import j$.util.function.l;

final class T1 implements Z1, AbstractC0369p2 {
    private int f14631a;
    final int f14632b;
    final l f14633c;

    public T1(int i10, l lVar) {
        this.f14632b = i10;
        this.f14633c = lVar;
    }

    @Override
    public final void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public final void d(int i10) {
        this.f14631a = this.f14633c.i(this.f14631a, i10);
    }

    @Override
    public final void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public final Object get() {
        return Integer.valueOf(this.f14631a);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        this.f14631a = this.f14632b;
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
        d(((T1) z12).f14631a);
    }

    @Override
    public final boolean u() {
        return false;
    }
}
