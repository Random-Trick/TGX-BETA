package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.D;
import j$.util.F;
import j$.util.W;
import j$.util.function.Consumer;
import j$.util.function.v;

final class X2 extends Z2 implements D {
    final Y2 f14656g;

    public X2(Y2 y22, int i10, int i11, int i12, int i13) {
        super(y22, i10, i11, i12, i13);
        this.f14656g = y22;
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.s(this, consumer);
    }

    @Override
    final void b(Object obj, int i10, Object obj2) {
        ((v) obj2).e(((long[]) obj)[i10]);
    }

    @Override
    final F c(Object obj, int i10, int i11) {
        return W.l((long[]) obj, i10, i11 + i10);
    }

    @Override
    final F d(int i10, int i11, int i12, int i13) {
        return new X2(this.f14656g, i10, i11, i12, i13);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.e(this, consumer);
    }
}
