package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.H;
import j$.util.function.AbstractC0278f;
import j$.util.function.Consumer;
import j$.util.function.F;
import j$.util.z;
import java.util.Objects;

final class C0379r3 extends AbstractC0335i3 implements z {
    C0379r3(E0 e02, H h10, boolean z10) {
        super(e02, h10, z10);
    }

    public C0379r3(E0 e02, F f10, boolean z10) {
        super(e02, f10, z10);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.q(this, consumer);
    }

    @Override
    final void e() {
        U2 u22 = new U2();
        this.f14782h = u22;
        this.f14779e = this.f14776b.v0(new C0375q3(u22, 1));
        this.f14780f = new C0296b(this, 4);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.c(this, consumer);
    }

    @Override
    final AbstractC0335i3 h(H h10) {
        return new C0379r3(this.f14776b, h10, this.f14775a);
    }

    @Override
    public final boolean tryAdvance(AbstractC0278f fVar) {
        Objects.requireNonNull(fVar);
        boolean b10 = b();
        if (b10) {
            U2 u22 = (U2) this.f14782h;
            long j10 = this.f14781g;
            int D = u22.D(j10);
            fVar.c((u22.f14734c == 0 && D == 0) ? ((double[]) u22.f14697e)[(int) j10] : ((double[][]) u22.f14698f)[D][(int) (j10 - u22.f14735d[D])]);
        }
        return b10;
    }

    @Override
    public final void forEachRemaining(AbstractC0278f fVar) {
        if (this.f14782h != null || this.f14783i) {
            do {
            } while (tryAdvance(fVar));
            return;
        }
        Objects.requireNonNull(fVar);
        d();
        this.f14776b.u0(new C0375q3(fVar, 0), this.f14778d);
        this.f14783i = true;
    }

    @Override
    public final z trySplit() {
        return (z) super.trySplit();
    }
}
