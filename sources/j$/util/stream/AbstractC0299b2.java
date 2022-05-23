package j$.util.stream;

import j$.util.H;

public abstract class AbstractC0299b2 implements O3 {
    private final int f14705a;

    public AbstractC0299b2(int i10) {
        this.f14705a = i10;
    }

    @Override
    public int a() {
        return 0;
    }

    public abstract Z1 b();

    @Override
    public final Object f(E0 e02, H h10) {
        return ((Z1) new C0304c2(this, e02, h10).invoke()).get();
    }

    @Override
    public final Object g(E0 e02, H h10) {
        Z1 b10 = b();
        e02.u0(b10, h10);
        return b10.get();
    }
}
