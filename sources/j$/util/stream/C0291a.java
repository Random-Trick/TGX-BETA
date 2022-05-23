package j$.util.stream;

import j$.util.C0279g;
import j$.util.C0280h;
import j$.util.C0281i;
import j$.util.C0282j;
import j$.util.function.A;
import j$.util.function.AbstractC0275c;
import j$.util.function.AbstractC0276d;
import j$.util.function.B;
import j$.util.function.BiConsumer;
import j$.util.function.C;
import j$.util.function.Consumer;
import j$.util.function.D;
import j$.util.function.E;
import j$.util.function.F;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.function.g;
import j$.util.function.j;
import j$.util.function.l;
import j$.util.function.o;
import j$.util.function.r;
import j$.util.function.t;
import j$.util.function.w;
import java.util.LinkedHashSet;

public final class C0291a implements o, F, BiConsumer, B, ToDoubleFunction, AbstractC0276d, g, j, E, C, ToIntFunction, l, r, D, ToLongFunction, t, w, A, Consumer, AbstractC0275c {
    public static final C0291a f14668a = new C0291a();
    public static final C0291a f14669b = new C0291a();
    public static final C0291a f14670c = new C0291a();
    public static final C0291a f14671d = new C0291a();
    public static final C0291a f14672e = new C0291a();
    public static final C0291a f14673f = new C0291a();
    public static final C0291a f14674g = new C0291a();
    public static final C0291a f14675h = new C0291a();
    public static final C0291a f14676i = new C0291a();
    public static final C0291a f14677j = new C0291a();
    public static final C0291a f14678k = new C0291a();
    public static final C0291a f14679l = new C0291a();
    public static final C0291a f14680m = new C0291a();
    public static final C0291a f14681n = new C0291a();
    public static final C0291a f14682o = new C0291a();
    public static final C0291a f14683p = new C0291a();
    public static final C0291a f14684q = new C0291a();
    public static final C0291a f14685r = new C0291a();
    public static final C0291a f14686s = new C0291a();
    public static final C0291a f14687t = new C0291a();

    @Override
    public Object A(long j10) {
        return Long.valueOf(j10);
    }

    @Override
    public long B(long j10) {
        int i10 = AbstractC0385t0.f14857t;
        return 1L;
    }

    @Override
    public Object C(double d10) {
        return Double.valueOf(d10);
    }

    @Override
    public long D(int i10) {
        int i11 = AbstractC0342k0.f14787t;
        return 1L;
    }

    @Override
    public void a(Object obj, double d10) {
        ((C0279g) obj).c(d10);
    }

    @Override
    public int f(Object obj) {
        int i10 = AbstractC0342k0.f14787t;
        return ((Integer) obj).intValue();
    }

    @Override
    public long g(Object obj) {
        int i10 = AbstractC0385t0.f14857t;
        return ((Long) obj).longValue();
    }

    @Override
    public Object get() {
        return new C0279g();
    }

    @Override
    public int i(int i10, int i11) {
        return i10 + i11;
    }

    @Override
    public long j(long j10, long j11) {
        return j10 + j11;
    }

    @Override
    public void l(Object obj) {
    }

    @Override
    public double m(double d10, double d11) {
        return Math.max(d10, d11);
    }

    @Override
    public boolean n(Object obj) {
        return ((C0282j) obj).c();
    }

    @Override
    public void o(Object obj, int i10) {
        ((C0280h) obj).d(i10);
    }

    @Override
    public void q(Object obj, Object obj2) {
        ((LinkedHashSet) obj).add(obj2);
    }

    @Override
    public void r(Object obj, long j10) {
        ((C0281i) obj).e(j10);
    }

    @Override
    public long s(double d10) {
        int i10 = G.f14531t;
        return 1L;
    }

    @Override
    public Object v(Object obj, Object obj2) {
        return new X0((K0) obj, (K0) obj2);
    }

    @Override
    public double w(Object obj) {
        int i10 = G.f14531t;
        return ((Double) obj).doubleValue();
    }

    @Override
    public Object z(int i10) {
        int i11 = AbstractC0301c.f14708s;
        return new Object[i10];
    }
}
