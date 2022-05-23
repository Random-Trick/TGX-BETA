package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.B;
import j$.util.F;
import j$.util.W;
import j$.util.function.Consumer;
import j$.util.function.n;

final class V2 extends Z2 implements B {
    final W2 f14645g;

    public V2(W2 w22, int i10, int i11, int i12, int i13) {
        super(w22, i10, i11, i12, i13);
        this.f14645g = w22;
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.r(this, consumer);
    }

    @Override
    final void b(Object obj, int i10, Object obj2) {
        ((n) obj2).d(((int[]) obj)[i10]);
    }

    @Override
    final F c(Object obj, int i10, int i11) {
        return W.k((int[]) obj, i10, i11 + i10);
    }

    @Override
    final F d(int i10, int i11, int i12, int i13) {
        return new V2(this.f14645g, i10, i11, i12, i13);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.d(this, consumer);
    }
}
