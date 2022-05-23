package j$.util.stream;

import j$.util.H;

abstract class Z implements O3, P3 {
    private final boolean f14661a;

    public Z(boolean z10) {
        this.f14661a = z10;
    }

    @Override
    public final int a() {
        if (this.f14661a) {
            return 0;
        }
        return EnumC0325g3.f14763r;
    }

    public void c(double d10) {
        E0.i();
        throw null;
    }

    public void d(int i10) {
        E0.p();
        throw null;
    }

    public void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public final Object f(E0 e02, H h10) {
        (this.f14661a ? new C0292a0(e02, h10, this) : new C0297b0(e02, h10, e02.v0(this))).invoke();
        return null;
    }

    @Override
    public final Object g(E0 e02, H h10) {
        e02.u0(this, h10);
        return null;
    }

    @Override
    public final Object get() {
        return null;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
    }

    @Override
    public final boolean u() {
        return false;
    }
}
