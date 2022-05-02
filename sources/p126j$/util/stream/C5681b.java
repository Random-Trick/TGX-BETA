package p126j$.util.stream;

import java.util.List;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5522d;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5536r;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.Consumer;

public final class C5681b implements AbstractC5542x, AbstractC5536r, Consumer, AbstractC5522d {
    public final int f18311a;
    public final Object f18312b;

    public C5681b(Object obj, int i) {
        this.f18311a = i;
        this.f18312b = obj;
    }

    @Override
    public Object get() {
        switch (this.f18311a) {
            case 0:
                return (AbstractC5468G) this.f18312b;
            default:
                return ((AbstractC5686c) this.f18312b).m22294z0();
        }
    }

    @Override
    public void mo22128k(Object obj) {
        switch (this.f18311a) {
            case 3:
                ((AbstractC5759q2) this.f18312b).mo22128k(obj);
                return;
            default:
                ((List) this.f18312b).add(obj);
                return;
        }
    }

    @Override
    public Object mo22209x(long j) {
        int i = C5653U0.f18246k;
        return AbstractC5572D0.m22444F(j, (AbstractC5531m) this.f18312b);
    }
}
