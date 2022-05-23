package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.D;
import j$.util.H;
import j$.util.function.Consumer;

public final class B3 extends C3 implements D {
    public B3(D d10, long j10, long j11) {
        super(d10, j10, j11);
    }

    B3(D d10, long j10, long j11, long j12, long j13) {
        super(d10, j10, j11, j12, j13, null);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.s(this, consumer);
    }

    @Override
    protected final H b(H h10, long j10, long j11, long j12, long j13) {
        return new B3((D) h10, j10, j11, j12, j13);
    }

    @Override
    protected final Object c() {
        return A3.f14485a;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.e(this, consumer);
    }
}
