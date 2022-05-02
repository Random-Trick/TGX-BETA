package p126j$.util.stream;

import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5482V;
import p126j$.util.AbstractC5485a;
import p126j$.util.AbstractC5811y;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.Consumer;

class C5647S2 extends AbstractC5671Y2 implements AbstractC5811y {
    final C5651T2 f18239g;

    public C5647S2(C5651T2 t2, int i, int i2, int i3, int i4) {
        super(t2, i, i2, i3, i4);
        this.f18239g = t2;
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22564q(this, consumer);
    }

    @Override
    void mo22345b(Object obj, int i, Object obj2) {
        ((AbstractC5525g) obj2).mo22150c(((double[]) obj)[i]);
    }

    @Override
    AbstractC5466E mo22344c(Object obj, int i, int i2) {
        return AbstractC5482V.m22590j((double[]) obj, i, i2 + i, 1040);
    }

    @Override
    AbstractC5466E mo22343d(int i, int i2, int i3, int i4) {
        return new C5647S2(this.f18239g, i, i2, i3, i4);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22572c(this, consumer);
    }
}
