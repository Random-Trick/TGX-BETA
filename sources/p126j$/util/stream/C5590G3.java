package p126j$.util.stream;

import p126j$.util.AbstractC5464C;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.Consumer;

final class C5590G3 extends AbstractC5595H3 implements AbstractC5464C, AbstractC5535q {
    long f18148e;

    public C5590G3(AbstractC5464C c, long j, long j2) {
        super(c, j, j2);
    }

    C5590G3(AbstractC5464C c, C5590G3 g3) {
        super(c, g3);
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22562s(this, consumer);
    }

    @Override
    public void mo22127e(long j) {
        this.f18148e = j;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22570e(this, consumer);
    }

    @Override
    protected AbstractC5468G mo22373p(AbstractC5468G g) {
        return new C5590G3((AbstractC5464C) g, this);
    }

    @Override
    protected void mo22377r(Object obj) {
        ((AbstractC5535q) obj).mo22127e(this.f18148e);
    }

    @Override
    protected AbstractC5735l3 mo22376u(int i) {
        return new C5730k3(i);
    }
}
