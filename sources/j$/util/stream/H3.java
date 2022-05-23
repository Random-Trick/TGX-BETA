package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.D;
import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.v;

final class H3 extends I3 implements D, v {
    long f14543e;

    public H3(D d10, long j10, long j11) {
        super(d10, j10, j11);
    }

    H3(D d10, H3 h32) {
        super(d10, h32);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.s(this, consumer);
    }

    @Override
    public final void e(long j10) {
        this.f14543e = j10;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.e(this, consumer);
    }

    @Override
    protected final H q(H h10) {
        return new H3((D) h10, this);
    }

    @Override
    protected final void s(Object obj) {
        ((v) obj).e(this.f14543e);
    }

    @Override
    protected final AbstractC0355m3 v() {
        return new C0350l3();
    }
}
