package p126j$.util.stream;

import p126j$.util.C5543g;
import p126j$.util.C5545i;
import p126j$.util.C5548l;
import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5528j;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5533o;
import p126j$.util.function.AbstractC5536r;
import p126j$.util.function.AbstractC5538t;
import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;
import p126j$.util.function.Consumer;

public final class C5731l implements AbstractC5542x, BiConsumer, AbstractC5538t, AbstractC5541w, AbstractC5531m, AbstractC5528j, AbstractC5533o, AbstractC5536r, AbstractC5521c, Consumer {
    public static final C5731l f18415a = new C5731l();
    public static final C5731l f18416b = new C5731l();
    public static final C5731l f18417c = new C5731l();
    public static final C5731l f18418d = new C5731l();
    public static final C5731l f18419e = new C5731l();
    public static final C5731l f18420f = new C5731l();
    public static final C5731l f18421g = new C5731l();
    public static final C5731l f18422h = new C5731l();
    public static final C5731l f18423i = new C5731l();
    public static final C5731l f18424j = new C5731l();

    @Override
    public void mo22225a(Object obj, double d) {
        double[] dArr = (double[]) obj;
        int i = AbstractC5581F.f18136t;
        AbstractC5736m.m22216b(dArr, d);
        dArr[2] = dArr[2] + d;
    }

    @Override
    public Object get() {
        return new C5545i();
    }

    @Override
    public int mo22224i(int i, int i2) {
        return Math.min(i, i2);
    }

    @Override
    public void mo22129k(Object obj) {
    }

    @Override
    public long mo22223l(long j, long j2) {
        return Math.min(j, j2);
    }

    @Override
    public boolean mo22211n(Object obj) {
        return ((C5548l) obj).m22468c();
    }

    @Override
    public void mo22180p(Object obj, Object obj2) {
        ((C5543g) obj).m22483a((C5543g) obj2);
    }

    @Override
    public Object mo22173u(Object obj, Object obj2) {
        return new C5669Y0((AbstractC5622N0) obj, (AbstractC5622N0) obj2);
    }

    @Override
    public Object mo22179w(int i) {
        int i2 = C5672Z.f18273h;
        return new Object[i];
    }

    @Override
    public Object mo22210x(long j) {
        return AbstractC5572D0.m22430a0(j);
    }
}
