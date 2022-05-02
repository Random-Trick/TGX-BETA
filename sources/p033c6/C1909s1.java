package p033c6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public final class C1909s1 {
    public static boolean m35911a(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof AbstractC1867p1) {
            collection = ((AbstractC1867p1) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m35910b(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean m35910b(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
