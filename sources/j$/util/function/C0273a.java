package j$.util.function;

import java.util.Comparator;

public final class C0273a implements AbstractC0275c {
    public final int f14456a;
    public final Comparator f14457b;

    public C0273a(Comparator comparator, int i10) {
        this.f14456a = i10;
        this.f14457b = comparator;
    }

    @Override
    public final Object v(Object obj, Object obj2) {
        switch (this.f14456a) {
            case 0:
                return this.f14457b.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return this.f14457b.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
