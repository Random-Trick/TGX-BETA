package p126j$.util.stream;

import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;

public final class C5766s implements AbstractC5542x, BiConsumer, AbstractC5531m {
    public static final C5766s f18460a = new C5766s();
    public static final C5766s f18461b = new C5766s();
    public static final C5766s f18462c = new C5766s();

    @Override
    public Object get() {
        int i = AbstractC5581F.f18136t;
        return new double[4];
    }

    @Override
    public void mo22179p(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        int i = AbstractC5581F.f18136t;
        AbstractC5736m.m22215b(dArr, dArr2[0]);
        AbstractC5736m.m22215b(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
    }

    @Override
    public Object mo22178w(int i) {
        int i2 = AbstractC5722j0.f18393t;
        return new Integer[i];
    }
}
