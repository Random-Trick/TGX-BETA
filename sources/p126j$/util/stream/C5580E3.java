package p126j$.util.stream;

import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.AbstractC5811y;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.Consumer;

final class C5580E3 extends AbstractC5595H3 implements AbstractC5811y, AbstractC5525g {
    double f18135e;

    public C5580E3(AbstractC5811y yVar, long j, long j2) {
        super(yVar, j, j2);
    }

    C5580E3(AbstractC5811y yVar, C5580E3 e3) {
        super(yVar, e3);
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22565q(this, consumer);
    }

    @Override
    public void mo22151c(double d) {
        this.f18135e = d;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22573c(this, consumer);
    }

    @Override
    protected AbstractC5468G mo22374p(AbstractC5468G g) {
        return new C5580E3((AbstractC5811y) g, this);
    }

    @Override
    protected void mo22378r(Object obj) {
        ((AbstractC5525g) obj).mo22151c(this.f18135e);
    }

    @Override
    protected AbstractC5735l3 mo22377u(int i) {
        return new C5720i3(i);
    }
}
