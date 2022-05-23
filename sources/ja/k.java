package ja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public final class k {
    public static final <T> Collection<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        ra.k.e(iterable, "<this>");
        ra.k.e(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return l.f15175b ? v.R(iterable) : v.S(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        return b(collection) ? v.R(iterable) : collection;
    }

    public static final <T> boolean b(Collection<? extends T> collection) {
        return l.f15175b && collection.size() > 2 && (collection instanceof ArrayList);
    }
}
