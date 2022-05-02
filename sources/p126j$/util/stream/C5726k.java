package p126j$.util.stream;

import java.util.LinkedHashSet;
import p126j$.util.C5544h;
import p126j$.util.C5547k;
import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5523e;
import p126j$.util.function.AbstractC5528j;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5533o;
import p126j$.util.function.AbstractC5536r;
import p126j$.util.function.AbstractC5538t;
import p126j$.util.function.AbstractC5539u;
import p126j$.util.function.AbstractC5540v;
import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.Consumer;
import p126j$.util.function.ToLongFunction;

public final class C5726k implements AbstractC5542x, BiConsumer, AbstractC5538t, AbstractC5523e, AbstractC5531m, AbstractC5541w, AbstractC5539u, AbstractC5528j, AbstractC5540v, AbstractC5533o, AbstractC5536r, AbstractC5521c, ToLongFunction, Consumer {
    public static final C5726k f18396a = new C5726k();
    public static final C5726k f18397b = new C5726k();
    public static final C5726k f18398c = new C5726k();
    public static final C5726k f18399d = new C5726k();
    public static final C5726k f18400e = new C5726k();
    public static final C5726k f18401f = new C5726k();
    public static final C5726k f18402g = new C5726k();
    public static final C5726k f18403h = new C5726k();
    public static final C5726k f18404i = new C5726k();
    public static final C5726k f18405j = new C5726k();
    public static final C5726k f18406k = new C5726k();
    public static final C5726k f18407l = new C5726k();
    public static final C5726k f18408m = new C5726k();
    public static final C5726k f18409n = new C5726k();

    @Override
    public void mo22225a(Object obj, double d) {
        double[] dArr = (double[]) obj;
        int i = AbstractC5581F.f18136t;
        dArr[2] = dArr[2] + 1.0d;
        AbstractC5736m.m22216b(dArr, d);
        dArr[3] = dArr[3] + d;
    }

    @Override
    public long mo22233g(Object obj) {
        int i = AbstractC5719i2.f18390t;
        return 1L;
    }

    @Override
    public Object get() {
        return new C5544h();
    }

    @Override
    public int mo22224i(int i, int i2) {
        return Math.max(i, i2);
    }

    @Override
    public void mo22129k(Object obj) {
    }

    @Override
    public long mo22223l(long j, long j2) {
        return Math.max(j, j2);
    }

    @Override
    public double mo22232m(double d, double d2) {
        return Math.min(d, d2);
    }

    @Override
    public boolean mo22211n(Object obj) {
        return ((C5547k) obj).m22472c();
    }

    @Override
    public void mo22231o(Object obj, int i) {
        long[] jArr = (long[]) obj;
        int i2 = AbstractC5722j0.f18393t;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i;
    }

    @Override
    public void mo22180p(Object obj, Object obj2) {
        ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
    }

    @Override
    public void mo22230q(Object obj, long j) {
        long[] jArr = (long[]) obj;
        int i = AbstractC5767s0.f18463t;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    @Override
    public Object mo22173u(Object obj, Object obj2) {
        return new C5665X0((AbstractC5612L0) obj, (AbstractC5612L0) obj2);
    }

    @Override
    public Object mo22179w(int i) {
        int i2 = AbstractC5581F.f18136t;
        return new Double[i];
    }

    @Override
    public Object mo22210x(long j) {
        return AbstractC5572D0.m22438O(j);
    }
}
