package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.function.Consumer;
import j$.util.z;

final class C0363o1 extends AbstractC0377r1 implements z {
    public C0363o1(K0 k02) {
        super(k02);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.q(this, consumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.c(this, consumer);
    }
}
