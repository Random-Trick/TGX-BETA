package j$.util.stream;

import j$.util.function.Consumer;
import org.thunderdog.challegram.Log;

final class C0360n3 extends AbstractC0365o3 implements Consumer {
    final Object[] f14823b = new Object[Log.TAG_YOUTUBE];

    @Override
    public final void l(Object obj) {
        Object[] objArr = this.f14823b;
        int i10 = this.f14829a;
        this.f14829a = i10 + 1;
        objArr[i10] = obj;
    }
}
