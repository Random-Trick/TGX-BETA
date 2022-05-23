package j$.util.stream;

import j$.util.function.AbstractC0275c;
import j$.util.function.B;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C;
import j$.util.function.D;
import j$.util.function.F;

public final class G1 extends AbstractC0299b2 {
    public final int f14532b;
    final Object f14533c;
    final Object f14534d;
    final Object f14535e;

    public G1(int i10, Object obj, Object obj2, Object obj3, int i11) {
        super(i10);
        this.f14532b = i11;
        this.f14533c = obj;
        this.f14535e = obj2;
        this.f14534d = obj3;
    }

    @Override
    public final Z1 b() {
        switch (this.f14532b) {
            case 0:
                return new H1((F) this.f14534d, (D) this.f14535e, (AbstractC0275c) this.f14533c);
            case 1:
                return new M1((F) this.f14534d, (B) this.f14535e, (AbstractC0275c) this.f14533c);
            case 2:
                return new N1(this.f14534d, (BiFunction) this.f14535e, (AbstractC0275c) this.f14533c);
            case 3:
                return new R1((F) this.f14534d, (BiConsumer) this.f14535e, (BiConsumer) this.f14533c);
            default:
                return new V1((F) this.f14534d, (C) this.f14535e, (AbstractC0275c) this.f14533c);
        }
    }
}
