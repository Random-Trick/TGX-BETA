package j$.util.stream;

import j$.util.function.C0274b;
import j$.util.function.h;

final class C0409z0 extends A0 implements AbstractC0364o2 {
    final B0 f14908c;
    final h f14909d;

    public C0409z0(B0 b02, h hVar) {
        super(b02);
        this.f14908c = b02;
        this.f14909d = hVar;
    }

    @Override
    public final void c(double d10) {
        boolean z10;
        boolean z11;
        if (!this.f14481a) {
            boolean x10 = ((C0274b) this.f14909d).x(d10);
            z10 = this.f14908c.f14489a;
            if (x10 == z10) {
                this.f14481a = true;
                z11 = this.f14908c.f14490b;
                this.f14482b = z11;
            }
        }
    }

    @Override
    public final void l(Object obj) {
        y((Double) obj);
    }

    @Override
    public final void y(Double d10) {
        E0.j(this, d10);
    }
}
