package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.B;
import j$.util.H;
import j$.util.function.Consumer;

public final class z3 extends C3 implements B {
    public z3(B b10, long j10, long j11) {
        super(b10, j10, j11);
    }

    z3(B b10, long j10, long j11, long j12, long j13) {
        super(b10, j10, j11, j12, j13, null);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.r(this, consumer);
    }

    @Override
    protected final H b(H h10, long j10, long j11, long j12, long j13) {
        return new z3((B) h10, j10, j11, j12, j13);
    }

    @Override
    protected final Object c() {
        return y3.f14905a;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.d(this, consumer);
    }
}
