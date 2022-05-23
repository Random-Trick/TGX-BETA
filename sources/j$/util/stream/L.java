package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.F;
import j$.util.function.o;

public final class L implements F, BiConsumer, o {
    public static final L f14564a = new L();
    public static final L f14565b = new L();
    public static final L f14566c = new L();

    @Override
    public Object get() {
        return new Q();
    }

    @Override
    public void q(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        int i10 = AbstractC0385t0.f14857t;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    @Override
    public Object z(int i10) {
        int i11 = C0395v2.f14878w;
        return new Integer[i10];
    }
}
