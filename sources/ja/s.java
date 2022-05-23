package ja;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import qa.l;
import ra.k;
import ra.w;

public class s extends r {
    public static final <T> boolean r(Collection<? super T> collection, Iterable<? extends T> iterable) {
        k.e(collection, "<this>");
        k.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> boolean s(Collection<? super T> collection, T[] tArr) {
        k.e(collection, "<this>");
        k.e(tArr, "elements");
        return collection.addAll(h.c(tArr));
    }

    public static final <T> boolean t(Iterable<? extends T> iterable, l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.a((T) it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static final <T> boolean u(List<T> list, l<? super T, Boolean> lVar, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            return t(w.b(list), lVar, z10);
        }
        int g10 = n.g(list);
        if (g10 >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                T t10 = list.get(i11);
                if (lVar.a(t10).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, t10);
                    }
                    i10++;
                }
                if (i11 == g10) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int g11 = n.g(list);
        if (i10 > g11) {
            return true;
        }
        while (true) {
            list.remove(g11);
            if (g11 == i10) {
                return true;
            }
            g11--;
        }
    }

    public static final <T> boolean v(List<T> list, l<? super T, Boolean> lVar) {
        k.e(list, "<this>");
        k.e(lVar, "predicate");
        return u(list, lVar, true);
    }

    public static final <T> boolean w(Collection<? super T> collection, Iterable<? extends T> iterable) {
        k.e(collection, "<this>");
        k.e(iterable, "elements");
        return w.a(collection).retainAll(k.a(iterable, collection));
    }
}
