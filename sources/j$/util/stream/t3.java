package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.B;
import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.F;
import j$.util.function.n;
import java.util.Objects;

final class t3 extends AbstractC0335i3 implements B {
    t3(E0 e02, H h10, boolean z10) {
        super(e02, h10, z10);
    }

    public t3(E0 e02, F f10, boolean z10) {
        super(e02, f10, z10);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.r(this, consumer);
    }

    @Override
    final void e() {
        W2 w22 = new W2();
        this.f14782h = w22;
        this.f14779e = this.f14776b.v0(new s3(w22, 1));
        this.f14780f = new C0296b(this, 5);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.d(this, consumer);
    }

    @Override
    final AbstractC0335i3 h(H h10) {
        return new t3(this.f14776b, h10, this.f14775a);
    }

    @Override
    public final boolean tryAdvance(n nVar) {
        Objects.requireNonNull(nVar);
        boolean b10 = b();
        if (b10) {
            W2 w22 = (W2) this.f14782h;
            long j10 = this.f14781g;
            int D = w22.D(j10);
            nVar.d((w22.f14734c == 0 && D == 0) ? ((int[]) w22.f14697e)[(int) j10] : ((int[][]) w22.f14698f)[D][(int) (j10 - w22.f14735d[D])]);
        }
        return b10;
    }

    @Override
    public final void forEachRemaining(n nVar) {
        if (this.f14782h != null || this.f14783i) {
            do {
            } while (tryAdvance(nVar));
            return;
        }
        Objects.requireNonNull(nVar);
        d();
        this.f14776b.u0(new s3(nVar, 0), this.f14778d);
        this.f14783i = true;
    }

    @Override
    public final B trySplit() {
        return (B) super.trySplit();
    }
}
