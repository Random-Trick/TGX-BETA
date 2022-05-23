package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.B;
import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.n;

final class G3 extends I3 implements B, n {
    int f14537e;

    public G3(B b10, long j10, long j11) {
        super(b10, j10, j11);
    }

    G3(B b10, G3 g32) {
        super(b10, g32);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.r(this, consumer);
    }

    @Override
    public final void d(int i10) {
        this.f14537e = i10;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.d(this, consumer);
    }

    @Override
    protected final H q(H h10) {
        return new G3((B) h10, this);
    }

    @Override
    protected final void s(Object obj) {
        ((n) obj).d(this.f14537e);
    }

    @Override
    protected final AbstractC0355m3 v() {
        return new C0345k3();
    }
}
