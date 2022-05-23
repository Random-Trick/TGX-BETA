package j$.util.stream;

import j$.util.function.C0274b;
import j$.util.function.x;

final class C0405y0 extends A0 implements AbstractC0374q2 {
    final B0 f14899c;
    final x f14900d;

    public C0405y0(B0 b02, x xVar) {
        super(b02);
        this.f14899c = b02;
        this.f14900d = xVar;
    }

    @Override
    public final void e(long j10) {
        boolean z10;
        boolean z11;
        if (!this.f14481a) {
            boolean E = ((C0274b) this.f14900d).E(j10);
            z10 = this.f14899c.f14489a;
            if (E == z10) {
                this.f14481a = true;
                z11 = this.f14899c.f14490b;
                this.f14482b = z11;
            }
        }
    }

    @Override
    public final void l(Object obj) {
        x((Long) obj);
    }

    @Override
    public final void x(Long l10) {
        E0.n(this, l10);
    }
}
