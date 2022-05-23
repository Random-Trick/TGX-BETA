package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.D;
import j$.util.function.Consumer;

final class C0373q1 extends AbstractC0377r1 implements D {
    public C0373q1(O0 o02) {
        super(o02);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.s(this, consumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.e(this, consumer);
    }
}
