package p126j$.util.stream;

import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5542x;
import p126j$.util.function.BiConsumer;

public final class C5606K implements AbstractC5542x, BiConsumer, AbstractC5531m {
    public static final C5606K f18169a = new C5606K();
    public static final C5606K f18170b = new C5606K();
    public static final C5606K f18171c = new C5606K();

    @Override
    public Object get() {
        return new C5631P();
    }

    @Override
    public void mo22180p(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        int i = AbstractC5767s0.f18463t;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    @Override
    public Object mo22179w(int i) {
        int i2 = C5779u2.f18484w;
        return new Integer[i];
    }
}
