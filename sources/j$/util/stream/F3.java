package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.H;
import j$.util.function.AbstractC0278f;
import j$.util.function.Consumer;
import j$.util.z;

final class F3 extends I3 implements z, AbstractC0278f {
    double f14530e;

    public F3(z zVar, long j10, long j11) {
        super(zVar, j10, j11);
    }

    F3(z zVar, F3 f32) {
        super(zVar, f32);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.q(this, consumer);
    }

    @Override
    public final void c(double d10) {
        this.f14530e = d10;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.c(this, consumer);
    }

    @Override
    protected final H q(H h10) {
        return new F3((z) h10, this);
    }

    @Override
    protected final void s(Object obj) {
        ((AbstractC0278f) obj).c(this.f14530e);
    }

    @Override
    protected final AbstractC0355m3 v() {
        return new C0340j3();
    }
}
