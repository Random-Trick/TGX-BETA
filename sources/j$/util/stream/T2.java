package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.F;
import j$.util.W;
import j$.util.function.AbstractC0278f;
import j$.util.function.Consumer;
import j$.util.z;

final class T2 extends Z2 implements z {
    final U2 f14634g;

    public T2(U2 u22, int i10, int i11, int i12, int i13) {
        super(u22, i10, i11, i12, i13);
        this.f14634g = u22;
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.q(this, consumer);
    }

    @Override
    final void b(Object obj, int i10, Object obj2) {
        ((AbstractC0278f) obj2).c(((double[]) obj)[i10]);
    }

    @Override
    final F c(Object obj, int i10, int i11) {
        return W.j((double[]) obj, i10, i11 + i10);
    }

    @Override
    final F d(int i10, int i11, int i12, int i13) {
        return new T2(this.f14634g, i10, i11, i12, i13);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.c(this, consumer);
    }
}
