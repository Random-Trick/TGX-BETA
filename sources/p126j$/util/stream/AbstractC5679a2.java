package p126j$.util.stream;

import java.util.Objects;
import p126j$.util.AbstractC5468G;

public abstract class AbstractC5679a2 implements AbstractC5625N3 {
    private final int f18308a;

    public AbstractC5679a2(int i) {
        this.f18308a = i;
    }

    @Override
    public int mo22322a() {
        return 0;
    }

    public abstract AbstractC5670Y1 mo22321b();

    @Override
    public Object mo22320f(AbstractC5572D0 d0, AbstractC5468G g) {
        return ((AbstractC5670Y1) new C5684b2(this, d0, g).invoke()).get();
    }

    @Override
    public Object mo22319g(AbstractC5572D0 d0, AbstractC5468G g) {
        AbstractC5670Y1 b = mo22321b();
        AbstractC5686c cVar = (AbstractC5686c) d0;
        Objects.requireNonNull(b);
        cVar.mo22307M(cVar.mo22300r0(b), g);
        return b.get();
    }
}
