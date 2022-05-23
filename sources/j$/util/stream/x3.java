package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.H;
import j$.util.function.Consumer;
import j$.util.z;

public final class x3 extends C3 implements z {
    public x3(z zVar, long j10, long j11) {
        super(zVar, j10, j11);
    }

    x3(z zVar, long j10, long j11, long j12, long j13) {
        super(zVar, j10, j11, j12, j13, null);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.q(this, consumer);
    }

    @Override
    protected final H b(H h10, long j10, long j11, long j12, long j13) {
        return new x3((z) h10, j10, j11, j12, j13);
    }

    @Override
    protected final Object c() {
        return w3.f14888a;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.c(this, consumer);
    }
}
