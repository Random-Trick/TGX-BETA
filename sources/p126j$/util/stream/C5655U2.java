package p126j$.util.stream;

import p126j$.util.AbstractC5462A;
import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5482V;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.Consumer;

class C5655U2 extends AbstractC5671Y2 implements AbstractC5462A {
    final C5659V2 f18250g;

    public C5655U2(C5659V2 v2, int i, int i2, int i3, int i4) {
        super(v2, i, i2, i3, i4);
        this.f18250g = v2;
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22563r(this, consumer);
    }

    @Override
    void mo22345b(Object obj, int i, Object obj2) {
        ((AbstractC5530l) obj2).mo22144d(((int[]) obj)[i]);
    }

    @Override
    AbstractC5466E mo22344c(Object obj, int i, int i2) {
        return AbstractC5482V.m22589k((int[]) obj, i, i2 + i, 1040);
    }

    @Override
    AbstractC5466E mo22343d(int i, int i2, int i3, int i4) {
        return new C5655U2(this.f18250g, i, i2, i3, i4);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22571d(this, consumer);
    }
}
