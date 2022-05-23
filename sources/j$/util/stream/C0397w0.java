package j$.util.stream;

import j$.util.function.E;

final class C0397w0 extends A0 {
    final B0 f14883c;
    final E f14884d;

    public C0397w0(B0 b02, E e10) {
        super(b02);
        this.f14883c = b02;
        this.f14884d = e10;
    }

    @Override
    public final void l(Object obj) {
        boolean z10;
        boolean z11;
        if (!this.f14481a) {
            boolean n10 = this.f14884d.n(obj);
            z10 = this.f14883c.f14489a;
            if (n10 == z10) {
                this.f14481a = true;
                z11 = this.f14883c.f14490b;
                this.f14482b = z11;
            }
        }
    }
}
