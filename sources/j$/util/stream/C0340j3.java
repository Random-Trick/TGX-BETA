package j$.util.stream;

import j$.util.function.AbstractC0278f;
import org.thunderdog.challegram.Log;

final class C0340j3 extends AbstractC0355m3 implements AbstractC0278f {
    final double[] f14786c = new double[Log.TAG_YOUTUBE];

    @Override
    public final void a(Object obj, long j10) {
        AbstractC0278f fVar = (AbstractC0278f) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            fVar.c(this.f14786c[i10]);
        }
    }

    @Override
    public final void c(double d10) {
        double[] dArr = this.f14786c;
        int i10 = this.f14820b;
        this.f14820b = i10 + 1;
        dArr[i10] = d10;
    }
}
