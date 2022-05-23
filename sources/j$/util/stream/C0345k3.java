package j$.util.stream;

import j$.util.function.n;
import org.thunderdog.challegram.Log;

final class C0345k3 extends AbstractC0355m3 implements n {
    final int[] f14789c = new int[Log.TAG_YOUTUBE];

    @Override
    public final void a(Object obj, long j10) {
        n nVar = (n) obj;
        for (int i10 = 0; i10 < j10; i10++) {
            nVar.d(this.f14789c[i10]);
        }
    }

    @Override
    public final void d(int i10) {
        int[] iArr = this.f14789c;
        int i11 = this.f14820b;
        this.f14820b = i11 + 1;
        iArr[i11] = i10;
    }
}
