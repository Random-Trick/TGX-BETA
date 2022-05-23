package j$.util.stream;

import j$.util.function.n;

public final class C0307d0 implements n {
    public final int f14728a;
    public final Object f14729b;

    public C0307d0(Object obj, int i10) {
        this.f14728a = i10;
        this.f14729b = obj;
    }

    @Override
    public final void d(int i10) {
        switch (this.f14728a) {
            case 0:
                ((AbstractC0378r2) this.f14729b).d(i10);
                return;
            default:
                ((C0312e0) this.f14729b).f14807a.d(i10);
                return;
        }
    }
}
