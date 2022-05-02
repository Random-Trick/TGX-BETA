package p126j$.util.stream;

import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5523e;
import p126j$.util.function.AbstractC5528j;
import p126j$.util.function.AbstractC5533o;

public class C5603J1 extends AbstractC5679a2 {
    public final int f18163b;
    final Object f18164c;

    public C5603J1(int i, Object obj, int i2) {
        super(i);
        this.f18163b = i2;
        this.f18164c = obj;
    }

    @Override
    public AbstractC5670Y1 mo22321b() {
        switch (this.f18163b) {
            case 0:
                return new C5608K1((AbstractC5523e) this.f18164c);
            case 1:
                return new C5623N1((AbstractC5521c) this.f18164c);
            case 2:
                return new C5650T1((AbstractC5528j) this.f18164c);
            default:
                return new C5666X1((AbstractC5533o) this.f18164c);
        }
    }
}
