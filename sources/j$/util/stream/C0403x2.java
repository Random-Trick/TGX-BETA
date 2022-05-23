package j$.util.stream;

import j$.util.D;
import j$.util.H;
import j$.util.function.o;
import org.thunderdog.challegram.Log;

public final class C0403x2 extends AbstractC0376r0 {
    public static final int f14894w = 0;
    final long f14895u;
    final long f14896v;

    public C0403x2(AbstractC0301c cVar, int i10, int i11, long j10, long j11) {
        super(cVar, i11);
        this.f14895u = j10;
        this.f14896v = j11;
    }

    @Override
    final Q0 F0(E0 e02, H h10, o oVar) {
        long X = e02.X(h10);
        if (X > 0 && h10.hasCharacteristics(Log.TAG_VIDEO)) {
            return E0.P(e02, E0.G(e02.d0(), h10, this.f14895u, this.f14896v), true);
        }
        return !EnumC0325g3.ORDERED.d(e02.e0()) ? E0.P(this, W0((D) e02.w0(h10), this.f14895u, this.f14896v, X), true) : (Q0) new B2(this, e02, h10, oVar, this.f14895u, this.f14896v).invoke();
    }

    @Override
    final H G0(E0 e02, H h10) {
        long X = e02.X(h10);
        if (X > 0 && h10.hasCharacteristics(Log.TAG_VIDEO)) {
            long j10 = this.f14895u;
            return new B3((D) e02.w0(h10), j10, E0.F(j10, this.f14896v));
        }
        return !EnumC0325g3.ORDERED.d(e02.e0()) ? W0((D) e02.w0(h10), this.f14895u, this.f14896v, X) : ((Q0) new B2(this, e02, h10, M.f14574b, this.f14895u, this.f14896v).invoke()).mo31spliterator();
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        return new C0399w2(this, r2Var);
    }

    final D W0(D d10, long j10, long j11, long j12) {
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
        return new H3(d10, j14, j13);
    }
}
