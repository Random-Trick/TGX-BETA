package p126j$.util.stream;

import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5538t;
import p126j$.util.function.AbstractC5539u;
import p126j$.util.function.AbstractC5540v;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.BiFunction;

public class C5583F1 extends AbstractC5679a2 {
    public final int f18137b;
    final Object f18138c;
    final Object f18139d;
    final Object f18140e;

    public C5583F1(int i, Object obj, Object obj2, Object obj3, int i2) {
        super(i);
        this.f18137b = i2;
        this.f18138c = obj;
        this.f18140e = obj2;
        this.f18139d = obj3;
    }

    @Override
    public AbstractC5670Y1 mo22321b() {
        switch (this.f18137b) {
            case 0:
                return new C5588G1((AbstractC5542x) this.f18139d, (AbstractC5540v) this.f18140e, (AbstractC5521c) this.f18138c);
            case 1:
                return new C5613L1((AbstractC5542x) this.f18139d, (AbstractC5538t) this.f18140e, (AbstractC5521c) this.f18138c);
            case 2:
                return new C5618M1(this.f18139d, (BiFunction) this.f18140e, (AbstractC5521c) this.f18138c);
            case 3:
                return new C5638Q1((AbstractC5542x) this.f18139d, (BiConsumer) this.f18140e, (BiConsumer) this.f18138c);
            default:
                return new C5654U1((AbstractC5542x) this.f18139d, (AbstractC5539u) this.f18140e, (AbstractC5521c) this.f18138c);
        }
    }
}
