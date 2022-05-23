package j$.util.stream;

import j$.util.H;
import j$.util.function.E;
import j$.util.function.F;

public final class N implements O3 {
    private final int f14580a;
    final boolean f14581b;
    final Object f14582c;
    final E f14583d;
    final F f14584e;

    public N(boolean z10, int i10, Object obj, E e10, F f10) {
        this.f14581b = z10;
        this.f14580a = i10;
        this.f14582c = obj;
        this.f14583d = e10;
        this.f14584e = f10;
    }

    @Override
    public final int a() {
        return EnumC0325g3.f14766u | (this.f14581b ? 0 : EnumC0325g3.f14763r);
    }

    @Override
    public final Object f(E0 e02, H h10) {
        return new U(this, e02, h10).invoke();
    }

    @Override
    public final Object g(E0 e02, H h10) {
        P3 p32 = (P3) this.f14584e.get();
        e02.u0(p32, h10);
        Object obj = p32.get();
        return obj != null ? obj : this.f14582c;
    }
}
