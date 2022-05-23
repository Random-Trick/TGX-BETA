package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.F;
import j$.util.function.o;

public final class C0384t implements F, BiConsumer, o {
    public static final C0384t f14854a = new C0384t();
    public static final C0384t f14855b = new C0384t();
    public static final C0384t f14856c = new C0384t();

    @Override
    public Object get() {
        int i10 = G.f14531t;
        return new double[4];
    }

    @Override
    public void q(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        int i10 = G.f14531t;
        AbstractC0356n.b(dArr, dArr2[0]);
        AbstractC0356n.b(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
    }

    @Override
    public Object z(int i10) {
        int i11 = AbstractC0342k0.f14787t;
        return new Integer[i10];
    }
}
