package p126j$.util.stream;

import p126j$.util.AbstractC5462A;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.Consumer;

public final class C5800y3 extends AbstractC5565B3 implements AbstractC5462A {
    public C5800y3(AbstractC5462A a, long j, long j2) {
        super(a, j, j2);
    }

    C5800y3(AbstractC5462A a, long j, long j2, long j3, long j4) {
        super(a, j, j2, j3, j4, null);
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22563r(this, consumer);
    }

    @Override
    protected AbstractC5468G mo22138b(AbstractC5468G g, long j, long j2, long j3, long j4) {
        return new C5800y3((AbstractC5462A) g, j, j2, j3, j4);
    }

    @Override
    protected Object mo22137c() {
        return C5795x3.f18511a;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22571d(this, consumer);
    }
}
