package p126j$.util.function;

import java.util.Comparator;

public final class C5519a implements AbstractC5521c {
    public final int f18068a;
    public final Comparator f18069b;

    public C5519a(Comparator comparator, int i) {
        this.f18068a = i;
        this.f18069b = comparator;
    }

    @Override
    public final Object mo22173u(Object obj, Object obj2) {
        switch (this.f18068a) {
            case 0:
                return this.f18069b.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return this.f18069b.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
