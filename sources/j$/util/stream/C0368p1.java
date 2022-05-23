package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.B;
import j$.util.function.Consumer;

final class C0368p1 extends AbstractC0377r1 implements B {
    public C0368p1(M0 m02) {
        super(m02);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.r(this, consumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.d(this, consumer);
    }
}
