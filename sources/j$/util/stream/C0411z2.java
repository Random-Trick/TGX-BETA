package j$.util.stream;

import j$.util.H;
import j$.util.function.o;
import j$.util.z;
import org.thunderdog.challegram.Log;

public final class C0411z2 extends E {
    public static final int f14911w = 0;
    final long f14912u;
    final long f14913v;

    public C0411z2(AbstractC0301c cVar, int i10, int i11, long j10, long j11) {
        super(cVar, i11);
        this.f14912u = j10;
        this.f14913v = j11;
    }

    @Override
    final Q0 F0(E0 e02, H h10, o oVar) {
        long X = e02.X(h10);
        if (X > 0 && h10.hasCharacteristics(Log.TAG_VIDEO)) {
            return E0.N(e02, E0.G(e02.d0(), h10, this.f14912u, this.f14913v), true);
        }
        return !EnumC0325g3.ORDERED.d(e02.e0()) ? E0.N(this, V0((z) e02.w0(h10), this.f14912u, this.f14913v, X), true) : (Q0) new B2(this, e02, h10, oVar, this.f14912u, this.f14913v).invoke();
    }

    @Override
    final H G0(E0 e02, H h10) {
        long X = e02.X(h10);
        if (X > 0 && h10.hasCharacteristics(Log.TAG_VIDEO)) {
            long j10 = this.f14912u;
            return new x3((z) e02.w0(h10), j10, E0.F(j10, this.f14913v));
        }
        return !EnumC0325g3.ORDERED.d(e02.e0()) ? V0((z) e02.w0(h10), this.f14912u, this.f14913v, X) : ((Q0) new B2(this, e02, h10, C0302c0.f14721b, this.f14912u, this.f14913v).invoke()).mo31spliterator();
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        return new C0407y2(this, r2Var);
    }

    final z V0(z zVar, long j10, long j11, long j12) {
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
        return new F3(zVar, j14, j13);
    }
}
