package p126j$.util.stream;

import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;

public final class C5596I implements AbstractC5542x, BiConsumer, AbstractC5531m {
    public static final C5596I f18152a = new C5596I();
    public static final C5596I f18153b = new C5596I();
    public static final C5596I f18154c = new C5596I();

    @Override
    public Object get() {
        return new C5621N();
    }

    @Override
    public void mo22179p(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        int i = AbstractC5722j0.f18393t;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    @Override
    public Object mo22178w(int i) {
        int i2 = AbstractC5719i2.f18390t;
        return new Object[i];
    }
}
