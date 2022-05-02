package p123ia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import qa.C8298k;

public final class C5301k {
    public static final <T> Collection<T> m23373a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C8298k.m12934e(iterable, "<this>");
        C8298k.m12934e(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return C5302l.f17488b ? C5312v.m23330R(iterable) : C5312v.m23329S(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        return m23372b(collection) ? C5312v.m23330R(iterable) : collection;
    }

    public static final <T> boolean m23372b(Collection<? extends T> collection) {
        return C5302l.f17488b && collection.size() > 2 && (collection instanceof ArrayList);
    }
}
