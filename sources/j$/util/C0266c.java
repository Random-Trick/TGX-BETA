package j$.util;

import j$.util.function.Function;
import java.io.Serializable;
import java.util.Comparator;

public final class C0266c implements Comparator, Serializable {
    public final int f14361a;
    public final Comparator f14362b;
    public final Object f14363c;

    public C0266c(Comparator comparator, Object obj, int i10) {
        this.f14361a = i10;
        this.f14362b = comparator;
        this.f14363c = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f14361a) {
            case 0:
                Comparator comparator = this.f14362b;
                Comparator comparator2 = (Comparator) this.f14363c;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Comparator comparator3 = this.f14362b;
                Function function = (Function) this.f14363c;
                return comparator3.compare(function.a(obj), function.a(obj2));
        }
    }
}
