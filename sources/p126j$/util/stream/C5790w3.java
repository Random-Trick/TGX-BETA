package p126j$.util.stream;

import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.AbstractC5811y;
import p126j$.util.function.Consumer;

public final class C5790w3 extends AbstractC5565B3 implements AbstractC5811y {
    public C5790w3(AbstractC5811y yVar, long j, long j2) {
        super(yVar, j, j2);
    }

    C5790w3(AbstractC5811y yVar, long j, long j2, long j3, long j4) {
        super(yVar, j, j2, j3, j4, null);
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22564q(this, consumer);
    }

    @Override
    protected AbstractC5468G mo22138b(AbstractC5468G g, long j, long j2, long j3, long j4) {
        return new C5790w3((AbstractC5811y) g, j, j2, j3, j4);
    }

    @Override
    protected Object mo22137c() {
        return C5785v3.f18494a;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22572c(this, consumer);
    }
}
