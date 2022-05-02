package p126j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p126j$.util.function.Function;
import p126j$.util.function.ToDoubleFunction;
import p126j$.util.function.ToIntFunction;
import p126j$.util.function.ToLongFunction;

public final class C5516d implements Comparator, Serializable {
    public final int f18053a;
    public final Object f18054b;

    public C5516d(Object obj, int i) {
        this.f18053a = i;
        this.f18054b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f18053a) {
            case 0:
                Function function = (Function) this.f18054b;
                return ((Comparable) function.mo22502a(obj)).compareTo(function.mo22502a(obj2));
            case 1:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) this.f18054b;
                return Double.compare(toDoubleFunction.mo22324v(obj), toDoubleFunction.mo22324v(obj2));
            case 2:
                ToIntFunction toIntFunction = (ToIntFunction) this.f18054b;
                return Integer.compare(toIntFunction.mo22326f(obj), toIntFunction.mo22326f(obj2));
            default:
                ToLongFunction toLongFunction = (ToLongFunction) this.f18054b;
                return Long.compare(toLongFunction.mo22232g(obj), toLongFunction.mo22232g(obj2));
        }
    }
}
