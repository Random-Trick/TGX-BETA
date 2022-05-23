package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.D;
import j$.util.H;
import j$.util.function.Consumer;
import j$.util.function.F;
import j$.util.function.v;
import java.util.Objects;

final class v3 extends AbstractC0335i3 implements D {
    v3(E0 e02, H h10, boolean z10) {
        super(e02, h10, z10);
    }

    public v3(E0 e02, F f10, boolean z10) {
        super(e02, f10, z10);
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.s(this, consumer);
    }

    @Override
    final void e() {
        Y2 y22 = new Y2();
        this.f14782h = y22;
        this.f14779e = this.f14776b.v0(new u3(y22, 1));
        this.f14780f = new C0296b(this, 6);
    }

    @Override
    public final void forEachRemaining(v vVar) {
        if (this.f14782h != null || this.f14783i) {
            do {
            } while (tryAdvance(vVar));
            return;
        }
        Objects.requireNonNull(vVar);
        d();
        this.f14776b.u0(new u3(vVar, 0), this.f14778d);
        this.f14783i = true;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.e(this, consumer);
    }

    @Override
    public final boolean tryAdvance(v vVar) {
        Objects.requireNonNull(vVar);
        boolean b10 = b();
        if (b10) {
            Y2 y22 = (Y2) this.f14782h;
            long j10 = this.f14781g;
            int D = y22.D(j10);
            vVar.e((y22.f14734c == 0 && D == 0) ? ((long[]) y22.f14697e)[(int) j10] : ((long[][]) y22.f14698f)[D][(int) (j10 - y22.f14735d[D])]);
        }
        return b10;
    }

    @Override
    final AbstractC0335i3 h(H h10) {
        return new v3(this.f14776b, h10, this.f14775a);
    }

    @Override
    public final D trySplit() {
        return (D) super.trySplit();
    }
}
