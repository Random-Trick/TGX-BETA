package j$.util.stream;

import j$.util.C0280h;
import j$.util.C0284l;
import j$.util.function.AbstractC0275c;
import j$.util.function.AbstractC0276d;
import j$.util.function.B;
import j$.util.function.BiConsumer;
import j$.util.function.C;
import j$.util.function.Consumer;
import j$.util.function.D;
import j$.util.function.E;
import j$.util.function.F;
import j$.util.function.ToLongFunction;
import j$.util.function.l;
import j$.util.function.o;
import j$.util.function.t;
import j$.util.function.w;
import java.util.LinkedHashSet;

public final class C0346l implements F, BiConsumer, B, AbstractC0276d, o, E, C, l, D, t, w, AbstractC0275c, ToLongFunction, Consumer {
    public static final C0346l f14790a = new C0346l();
    public static final C0346l f14791b = new C0346l();
    public static final C0346l f14792c = new C0346l();
    public static final C0346l f14793d = new C0346l();
    public static final C0346l f14794e = new C0346l();
    public static final C0346l f14795f = new C0346l();
    public static final C0346l f14796g = new C0346l();
    public static final C0346l f14797h = new C0346l();
    public static final C0346l f14798i = new C0346l();
    public static final C0346l f14799j = new C0346l();
    public static final C0346l f14800k = new C0346l();
    public static final C0346l f14801l = new C0346l();
    public static final C0346l f14802m = new C0346l();
    public static final C0346l f14803n = new C0346l();

    @Override
    public Object A(long j10) {
        return E0.T(j10);
    }

    @Override
    public void a(Object obj, double d10) {
        double[] dArr = (double[]) obj;
        int i10 = G.f14531t;
        dArr[2] = dArr[2] + 1.0d;
        AbstractC0356n.b(dArr, d10);
        dArr[3] = dArr[3] + d10;
    }

    @Override
    public long g(Object obj) {
        int i10 = AbstractC0339j2.f14785t;
        return 1L;
    }

    @Override
    public Object get() {
        return new C0280h();
    }

    @Override
    public int i(int i10, int i11) {
        return Math.max(i10, i11);
    }

    @Override
    public long j(long j10, long j11) {
        return Math.max(j10, j11);
    }

    @Override
    public void l(Object obj) {
    }

    @Override
    public double m(double d10, double d11) {
        return Math.min(d10, d11);
    }

    @Override
    public boolean n(Object obj) {
        return ((C0284l) obj).c();
    }

    @Override
    public void o(Object obj, int i10) {
        long[] jArr = (long[]) obj;
        int i11 = AbstractC0342k0.f14787t;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i10;
    }

    @Override
    public void q(Object obj, Object obj2) {
        ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
    }

    @Override
    public void r(Object obj, long j10) {
        long[] jArr = (long[]) obj;
        int i10 = AbstractC0385t0.f14857t;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j10;
    }

    @Override
    public Object v(Object obj, Object obj2) {
        return new Y0((M0) obj, (M0) obj2);
    }

    @Override
    public Object z(int i10) {
        int i11 = G.f14531t;
        return new Double[i10];
    }
}
