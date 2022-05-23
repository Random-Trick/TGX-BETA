package j$.util.stream;

import j$.util.B;
import j$.util.H;
import j$.util.function.o;
import org.thunderdog.challegram.Log;

public final class C0395v2 extends AbstractC0332i0 {
    public static final int f14878w = 0;
    final long f14879u;
    final long f14880v;

    public C0395v2(AbstractC0301c cVar, int i10, int i11, long j10, long j11) {
        super(cVar, i11);
        this.f14879u = j10;
        this.f14880v = j11;
    }

    @Override
    final Q0 F0(E0 e02, H h10, o oVar) {
        long X = e02.X(h10);
        if (X > 0 && h10.hasCharacteristics(Log.TAG_VIDEO)) {
            return E0.O(e02, E0.G(e02.d0(), h10, this.f14879u, this.f14880v), true);
        }
        return !EnumC0325g3.ORDERED.d(e02.e0()) ? E0.O(this, W0((B) e02.w0(h10), this.f14879u, this.f14880v, X), true) : (Q0) new B2(this, e02, h10, oVar, this.f14879u, this.f14880v).invoke();
    }

    @Override
    final H G0(E0 e02, H h10) {
        long X = e02.X(h10);
        if (X > 0 && h10.hasCharacteristics(Log.TAG_VIDEO)) {
            long j10 = this.f14879u;
            return new z3((B) e02.w0(h10), j10, E0.F(j10, this.f14880v));
        }
        return !EnumC0325g3.ORDERED.d(e02.e0()) ? W0((B) e02.w0(h10), this.f14879u, this.f14880v, X) : ((Q0) new B2(this, e02, h10, L.f14566c, this.f14879u, this.f14880v).invoke()).mo31spliterator();
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        return new C0391u2(this, r2Var);
    }

    final B W0(B b10, long j10, long j11, long j12) {
        long j13;
        long j14;
        if (j10 <= j12) {
            long j15 = j12 - j10;
            j13 = j11 >= 0 ? Math.min(j11, j15) : j15;
            j14 = 0;
        } else {
            j14 = j10;
            j13 = j11;
        }
        return new G3(b10, j14, j13);
    }
}
