package p126j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p126j$.util.function.Function;

public final class C5487c implements Comparator, Serializable {
    public final int f17973a;
    public final Comparator f17974b;
    public final Object f17975c;

    public C5487c(Comparator comparator, Object obj, int i) {
        this.f17973a = i;
        this.f17974b = comparator;
        this.f17975c = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f17973a) {
            case 0:
                Comparator comparator = this.f17974b;
                Comparator comparator2 = (Comparator) this.f17975c;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Comparator comparator3 = this.f17974b;
                Function function = (Function) this.f17975c;
                return comparator3.compare(function.mo22503a(obj), function.mo22503a(obj2));
        }
    }
}
