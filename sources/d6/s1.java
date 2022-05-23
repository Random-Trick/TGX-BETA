package d6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public final class s1 {
    public static boolean a(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof p1) {
            collection = ((p1) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return b(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean b(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
