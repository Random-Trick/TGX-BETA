package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.F;
import j$.util.function.o;

public final class J implements F, BiConsumer, o {
    public static final J f14547a = new J();
    public static final J f14548b = new J();
    public static final J f14549c = new J();

    @Override
    public Object get() {
        return new O();
    }

    @Override
    public void q(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        int i10 = AbstractC0342k0.f14787t;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    @Override
    public Object z(int i10) {
        int i11 = AbstractC0339j2.f14785t;
        return new Object[i10];
    }
}
