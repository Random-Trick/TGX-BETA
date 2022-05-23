package j$.util.stream;

import j$.util.function.v;
import org.thunderdog.challegram.Log;

final class C0350l3 extends AbstractC0355m3 implements v {
    final long[] f14808c = new long[Log.TAG_YOUTUBE];

    @Override
    public final void a(Object obj, long j10) {
        v vVar = (v) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            vVar.e(this.f14808c[i10]);
        }
    }

    @Override
    public final void e(long j10) {
        long[] jArr = this.f14808c;
        int i10 = this.f14820b;
        this.f14820b = i10 + 1;
        jArr[i10] = j10;
    }
}
