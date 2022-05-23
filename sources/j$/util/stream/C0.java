package j$.util.stream;

import j$.util.H;
import j$.util.function.F;

public final class C0 implements O3 {
    private final int f14505a;
    final B0 f14506b;
    final F f14507c;

    public C0(int i10, B0 b02, F f10) {
        this.f14505a = i10;
        this.f14506b = b02;
        this.f14507c = f10;
    }

    @Override
    public final int a() {
        return EnumC0325g3.f14766u | EnumC0325g3.f14763r;
    }

    @Override
    public final Object f(E0 e02, H h10) {
        return (Boolean) new D0(this, e02, h10).invoke();
    }

    @Override
    public final Object g(E0 e02, H h10) {
        A0 a02 = (A0) this.f14507c.get();
        e02.u0(a02, h10);
        return Boolean.valueOf(a02.f14482b);
    }
}
