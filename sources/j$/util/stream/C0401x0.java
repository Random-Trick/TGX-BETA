package j$.util.stream;

import j$.util.function.C0274b;
import j$.util.function.p;

final class C0401x0 extends A0 implements AbstractC0369p2 {
    final B0 f14891c;
    final p f14892d;

    public C0401x0(B0 b02, p pVar) {
        super(b02);
        this.f14891c = b02;
        this.f14892d = pVar;
    }

    @Override
    public final void d(int i10) {
        boolean z10;
        boolean z11;
        if (!this.f14481a) {
            boolean y10 = ((C0274b) this.f14892d).y(i10);
            z10 = this.f14891c.f14489a;
            if (y10 == z10) {
                this.f14481a = true;
                z11 = this.f14891c.f14490b;
                this.f14482b = z11;
            }
        }
    }

    @Override
    public final void l(Object obj) {
        p((Integer) obj);
    }

    @Override
    public final void p(Integer num) {
        E0.l(this, num);
    }
}
