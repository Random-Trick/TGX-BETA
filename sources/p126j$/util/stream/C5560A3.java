package p126j$.util.stream;

import p126j$.util.AbstractC5464C;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.Consumer;

public final class C5560A3 extends AbstractC5565B3 implements AbstractC5464C {
    public C5560A3(AbstractC5464C c, long j, long j2) {
        super(c, j, j2);
    }

    C5560A3(AbstractC5464C c, long j, long j2, long j3, long j4) {
        super(c, j, j2, j3, j4, null);
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22562s(this, consumer);
    }

    @Override
    protected AbstractC5468G mo22138b(AbstractC5468G g, long j, long j2, long j3, long j4) {
        return new C5560A3((AbstractC5464C) g, j, j2, j3, j4);
    }

    @Override
    protected Object mo22137c() {
        return C5805z3.f18526a;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22570e(this, consumer);
    }
}
