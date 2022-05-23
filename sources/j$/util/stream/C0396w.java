package j$.util.stream;

import j$.util.function.AbstractC0278f;

public final class C0396w implements AbstractC0278f {
    public final int f14881a;
    public final Object f14882b;

    public C0396w(Object obj, int i10) {
        this.f14881a = i10;
        this.f14882b = obj;
    }

    @Override
    public final void c(double d10) {
        switch (this.f14881a) {
            case 0:
                ((AbstractC0378r2) this.f14882b).c(d10);
                return;
            default:
                ((C0400x) this.f14882b).f14788a.c(d10);
                return;
        }
    }
}
