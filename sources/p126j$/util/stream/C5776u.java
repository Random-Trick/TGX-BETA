package p126j$.util.stream;

import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.BiConsumer;

public final class C5776u implements AbstractC5521c {
    public final int f18482a;
    public final BiConsumer f18483b;

    public C5776u(BiConsumer biConsumer, int i) {
        this.f18482a = i;
        this.f18483b = biConsumer;
    }

    @Override
    public final Object mo22172u(Object obj, Object obj2) {
        switch (this.f18482a) {
            case 0:
                this.f18483b.mo22179p(obj, obj2);
                return obj;
            case 1:
                BiConsumer biConsumer = this.f18483b;
                int i = AbstractC5722j0.f18393t;
                biConsumer.mo22179p(obj, obj2);
                return obj;
            default:
                BiConsumer biConsumer2 = this.f18483b;
                int i2 = AbstractC5767s0.f18463t;
                biConsumer2.mo22179p(obj, obj2);
                return obj;
        }
    }
}
