package j$.util.stream;

import j$.util.H;
import j$.util.function.o;
import org.thunderdog.challegram.Log;

public final class C0387t2 extends AbstractC0329h2 {
    final long f14863u;
    final long f14864v;

    public C0387t2(AbstractC0301c cVar, int i10, int i11, long j10, long j11) {
        super(cVar, i11);
        this.f14863u = j10;
        this.f14864v = j11;
    }

    @Override
    final Q0 F0(E0 e02, H h10, o oVar) {
        long X = e02.X(h10);
        if (X > 0 && h10.hasCharacteristics(Log.TAG_VIDEO)) {
            return E0.M(e02, E0.G(e02.d0(), h10, this.f14863u, this.f14864v), true, oVar);
        }
        return !EnumC0325g3.ORDERED.d(e02.e0()) ? E0.M(this, T0(e02.w0(h10), this.f14863u, this.f14864v, X), true, oVar) : (Q0) new B2(this, e02, h10, oVar, this.f14863u, this.f14864v).invoke();
    }

    @Override
    final H G0(E0 e02, H h10) {
        long X = e02.X(h10);
        if (X > 0 && h10.hasCharacteristics(Log.TAG_VIDEO)) {
            H w02 = e02.w0(h10);
            long j10 = this.f14863u;
            return new D3(w02, j10, E0.F(j10, this.f14864v));
        }
        return !EnumC0325g3.ORDERED.d(e02.e0()) ? T0(e02.w0(h10), this.f14863u, this.f14864v, X) : ((Q0) new B2(this, e02, h10, K.f14557c, this.f14863u, this.f14864v).invoke()).mo31spliterator();
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        return new C0383s2(this, r2Var);
    }

    final H T0(H h10, long j10, long j11, long j12) {
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
        return new J3(h10, j14, j13);
    }
}
