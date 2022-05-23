package j$.util.stream;

import j$.util.function.AbstractC0275c;
import j$.util.function.BiConsumer;

public final class C0392v implements AbstractC0275c {
    public final int f14876a;
    public final BiConsumer f14877b;

    public C0392v(BiConsumer biConsumer, int i10) {
        this.f14876a = i10;
        this.f14877b = biConsumer;
    }

    @Override
    public final Object v(Object obj, Object obj2) {
        switch (this.f14876a) {
            case 0:
                this.f14877b.q(obj, obj2);
                return obj;
            case 1:
                BiConsumer biConsumer = this.f14877b;
                int i10 = AbstractC0342k0.f14787t;
                biConsumer.q(obj, obj2);
                return obj;
            default:
                BiConsumer biConsumer2 = this.f14877b;
                int i11 = AbstractC0385t0.f14857t;
                biConsumer2.q(obj, obj2);
                return obj;
        }
    }
}
