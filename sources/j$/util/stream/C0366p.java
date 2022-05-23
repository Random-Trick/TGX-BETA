package j$.util.stream;

import j$.util.C0286n;
import j$.util.function.AbstractC0275c;
import j$.util.function.BiConsumer;
import j$.util.function.E;
import j$.util.function.F;
import j$.util.function.o;
import j$.util.function.w;
import java.util.LinkedHashSet;

public final class C0366p implements F, BiConsumer, E, o, w, AbstractC0275c {
    public static final C0366p f14830a = new C0366p();
    public static final C0366p f14831b = new C0366p();
    public static final C0366p f14832c = new C0366p();
    public static final C0366p f14833d = new C0366p();
    public static final C0366p f14834e = new C0366p();
    public static final C0366p f14835f = new C0366p();

    @Override
    public Object A(long j10) {
        return E0.h0(j10);
    }

    @Override
    public Object get() {
        return new LinkedHashSet();
    }

    @Override
    public boolean n(Object obj) {
        return ((C0286n) obj).c();
    }

    @Override
    public void q(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        int i10 = G.f14531t;
        AbstractC0356n.b(dArr, dArr2[0]);
        AbstractC0356n.b(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
    }

    @Override
    public Object v(Object obj, Object obj2) {
        return new C0298b1((Q0) obj, (Q0) obj2);
    }

    @Override
    public Object z(int i10) {
        return Integer.valueOf(i10);
    }
}
