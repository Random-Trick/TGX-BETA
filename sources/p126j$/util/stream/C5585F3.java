package p126j$.util.stream;

import p126j$.util.AbstractC5462A;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.Consumer;

final class C5585F3 extends AbstractC5595H3 implements AbstractC5462A, AbstractC5530l {
    int f18142e;

    public C5585F3(AbstractC5462A a, long j, long j2) {
        super(a, j, j2);
    }

    C5585F3(AbstractC5462A a, C5585F3 f3) {
        super(a, f3);
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22564r(this, consumer);
    }

    @Override
    public void mo22145d(int i) {
        this.f18142e = i;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22572d(this, consumer);
    }

    @Override
    protected AbstractC5468G mo22374p(AbstractC5468G g) {
        return new C5585F3((AbstractC5462A) g, this);
    }

    @Override
    protected void mo22378r(Object obj) {
        ((AbstractC5530l) obj).mo22145d(this.f18142e);
    }

    @Override
    protected AbstractC5735l3 mo22377u(int i) {
        return new C5725j3(i);
    }
}
