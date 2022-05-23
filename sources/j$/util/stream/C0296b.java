package j$.util.stream;

import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.F;
import j$.util.function.o;
import j$.util.function.w;
import java.util.List;

public final class C0296b implements F, w, Consumer {
    public final int f14699a;
    public final Object f14700b;

    public C0296b(Object obj, int i10) {
        this.f14699a = i10;
        this.f14700b = obj;
    }

    @Override
    public final Object A(long j10) {
        int i10 = V0.f14641k;
        return E0.L(j10, (o) this.f14700b);
    }

    @Override
    public final Object get() {
        switch (this.f14699a) {
            case 0:
                return (H) this.f14700b;
            default:
                return ((AbstractC0301c) this.f14700b).D0();
        }
    }

    @Override
    public final void l(Object obj) {
        switch (this.f14699a) {
            case 3:
                ((AbstractC0378r2) this.f14700b).l(obj);
                return;
            default:
                ((List) this.f14700b).add(obj);
                return;
        }
    }
}
