package j$.util.stream;

import j$.util.function.AbstractC0275c;
import j$.util.function.AbstractC0276d;
import j$.util.function.l;
import j$.util.function.t;

public final class K1 extends AbstractC0299b2 {
    public final int f14558b;
    final Object f14559c;

    public K1(int i10, Object obj, int i11) {
        super(i10);
        this.f14558b = i11;
        this.f14559c = obj;
    }

    @Override
    public final Z1 b() {
        switch (this.f14558b) {
            case 0:
                return new L1((AbstractC0276d) this.f14559c);
            case 1:
                return new O1((AbstractC0275c) this.f14559c);
            case 2:
                return new U1((l) this.f14559c);
            default:
                return new Y1((t) this.f14559c);
        }
    }
}
