package j$.util.stream;

import j$.util.C0279g;
import j$.util.C0281i;
import j$.util.C0285m;
import j$.util.function.AbstractC0275c;
import j$.util.function.B;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.E;
import j$.util.function.F;
import j$.util.function.l;
import j$.util.function.o;
import j$.util.function.t;
import j$.util.function.w;

public final class C0351m implements F, BiConsumer, B, E, o, l, t, w, AbstractC0275c, Consumer {
    public static final C0351m f14809a = new C0351m();
    public static final C0351m f14810b = new C0351m();
    public static final C0351m f14811c = new C0351m();
    public static final C0351m f14812d = new C0351m();
    public static final C0351m f14813e = new C0351m();
    public static final C0351m f14814f = new C0351m();
    public static final C0351m f14815g = new C0351m();
    public static final C0351m f14816h = new C0351m();
    public static final C0351m f14817i = new C0351m();
    public static final C0351m f14818j = new C0351m();

    @Override
    public Object A(long j10) {
        return E0.f0(j10);
    }

    @Override
    public void a(Object obj, double d10) {
        double[] dArr = (double[]) obj;
        int i10 = G.f14531t;
        AbstractC0356n.b(dArr, d10);
        dArr[2] = dArr[2] + d10;
    }

    @Override
    public Object get() {
        return new C0281i();
    }

    @Override
    public int i(int i10, int i11) {
        return Math.min(i10, i11);
    }

    @Override
    public long j(long j10, long j11) {
        return Math.min(j10, j11);
    }

    @Override
    public void l(Object obj) {
    }

    @Override
    public boolean n(Object obj) {
        return ((C0285m) obj).c();
    }

    @Override
    public void q(Object obj, Object obj2) {
        ((C0279g) obj).a((C0279g) obj2);
    }

    @Override
    public Object v(Object obj, Object obj2) {
        return new Z0((O0) obj, (O0) obj2);
    }

    @Override
    public Object z(int i10) {
        int i11 = C0292a0.f14688h;
        return new Object[i10];
    }
}
