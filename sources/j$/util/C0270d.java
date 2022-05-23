package j$.util;

import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.io.Serializable;
import java.util.Comparator;

public final class C0270d implements Comparator, Serializable {
    public final int f14441a;
    public final Object f14442b;

    public C0270d(Object obj, int i10) {
        this.f14441a = i10;
        this.f14442b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f14441a) {
            case 0:
                Function function = (Function) this.f14442b;
                return ((Comparable) function.a(obj)).compareTo(function.a(obj2));
            case 1:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) this.f14442b;
                return Double.compare(toDoubleFunction.w(obj), toDoubleFunction.w(obj2));
            case 2:
                ToIntFunction toIntFunction = (ToIntFunction) this.f14442b;
                return Integer.compare(toIntFunction.f(obj), toIntFunction.f(obj2));
            default:
                ToLongFunction toLongFunction = (ToLongFunction) this.f14442b;
                return Long.compare(toLongFunction.g(obj), toLongFunction.g(obj2));
        }
    }
}
