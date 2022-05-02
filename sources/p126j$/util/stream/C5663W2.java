package p126j$.util.stream;

import p126j$.util.AbstractC5464C;
import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5482V;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.Consumer;

class C5663W2 extends AbstractC5671Y2 implements AbstractC5464C {
    final C5667X2 f18261g;

    public C5663W2(C5667X2 x2, int i, int i2, int i3, int i4) {
        super(x2, i, i2, i3, i4);
        this.f18261g = x2;
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22563s(this, consumer);
    }

    @Override
    void mo22346b(Object obj, int i, Object obj2) {
        ((AbstractC5535q) obj2).mo22128e(((long[]) obj)[i]);
    }

    @Override
    AbstractC5466E mo22345c(Object obj, int i, int i2) {
        return AbstractC5482V.m22589l((long[]) obj, i, i2 + i, 1040);
    }

    @Override
    AbstractC5466E mo22344d(int i, int i2, int i3, int i4) {
        return new C5663W2(this.f18261g, i, i2, i3, i4);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22571e(this, consumer);
    }
}
