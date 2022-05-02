package p123ia;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import pa.AbstractC8088l;
import qa.C8298k;

public class C5309s extends C5308r {
    public static final <T> boolean m23354r(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C8298k.m12934e(collection, "<this>");
        C8298k.m12934e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <T> boolean m23353s(Collection<? super T> collection, T[] tArr) {
        C8298k.m12934e(collection, "<this>");
        C8298k.m12934e(tArr, "elements");
        return collection.addAll(C5294h.m23433c(tArr));
    }

    public static final <T> boolean m23352t(Iterable<? extends T> iterable, AbstractC8088l<? super T, Boolean> lVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (lVar.mo568a((T) it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final <T> boolean m23351u(List<T> list, AbstractC8088l<? super T, Boolean> lVar, boolean z) {
        int i;
        if (!(list instanceof RandomAccess)) {
            return m23352t(list, lVar, z);
        }
        int g = C5304n.m23365g(list);
        if (g >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                i2++;
                T t = list.get(i2);
                if (lVar.mo568a(t).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == g) {
                    break;
                }
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int g2 = C5304n.m23365g(list);
        if (i > g2) {
            return true;
        }
        while (true) {
            g2--;
            list.remove(g2);
            if (g2 == i) {
                return true;
            }
        }
    }

    public static final <T> boolean m23350v(List<T> list, AbstractC8088l<? super T, Boolean> lVar) {
        C8298k.m12934e(list, "<this>");
        C8298k.m12934e(lVar, "predicate");
        return m23351u(list, lVar, true);
    }

    public static final <T> boolean m23349w(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C8298k.m12934e(collection, "<this>");
        C8298k.m12934e(iterable, "elements");
        return collection.retainAll(C5301k.m23373a(iterable, collection));
    }
}
