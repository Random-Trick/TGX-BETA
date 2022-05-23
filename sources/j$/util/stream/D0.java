package j$.util.stream;

import j$.util.H;

final class D0 extends AbstractC0306d {
    private final C0 f14509j;

    public D0(C0 c02, E0 e02, H h10) {
        super(e02, h10);
        this.f14509j = c02;
    }

    D0(D0 d02, H h10) {
        super(d02, h10);
        this.f14509j = d02.f14509j;
    }

    @Override
    public final Object a() {
        boolean z10;
        E0 e02 = this.f14740a;
        A0 a02 = (A0) this.f14509j.f14507c.get();
        e02.u0(a02, this.f14741b);
        boolean z11 = a02.f14482b;
        z10 = this.f14509j.f14506b.f14490b;
        if (z11 != z10) {
            return null;
        }
        l(Boolean.valueOf(z11));
        return null;
    }

    @Override
    public final AbstractC0316f f(H h10) {
        return new D0(this, h10);
    }

    @Override
    protected final Object k() {
        boolean z10;
        z10 = this.f14509j.f14506b.f14490b;
        return Boolean.valueOf(!z10);
    }
}
