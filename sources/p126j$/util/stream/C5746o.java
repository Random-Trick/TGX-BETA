package p126j$.util.stream;

import java.util.LinkedHashSet;
import p126j$.util.C5549m;
import p126j$.util.function.AbstractC5521c;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5536r;
import p126j$.util.function.AbstractC5541w;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;

public final class C5746o implements AbstractC5542x, BiConsumer, AbstractC5541w, AbstractC5531m, AbstractC5536r, AbstractC5521c {
    public static final C5746o f18436a = new C5746o();
    public static final C5746o f18437b = new C5746o();
    public static final C5746o f18438c = new C5746o();
    public static final C5746o f18439d = new C5746o();
    public static final C5746o f18440e = new C5746o();
    public static final C5746o f18441f = new C5746o();

    @Override
    public Object get() {
        return new LinkedHashSet();
    }

    @Override
    public boolean mo22210n(Object obj) {
        return ((C5549m) obj).m22463c();
    }

    @Override
    public void mo22179p(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        int i = AbstractC5581F.f18136t;
        AbstractC5736m.m22215b(dArr, dArr2[0]);
        AbstractC5736m.m22215b(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
    }

    @Override
    public Object mo22172u(Object obj, Object obj2) {
        return new C5678a1((AbstractC5632P0) obj, (AbstractC5632P0) obj2);
    }

    @Override
    public Object mo22178w(int i) {
        return Integer.valueOf(i);
    }

    @Override
    public Object mo22209x(long j) {
        return AbstractC5572D0.m22427c0(j);
    }
}
