package j$.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public final class List$EL {
    public static void sort(List list, Comparator comparator) {
        if (DesugarCollections.f14315b.isInstance(list)) {
            DesugarCollections.d(list, comparator);
            return;
        }
        Object[] array = list.toArray();
        Arrays.sort(array, comparator);
        ListIterator listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
    }
}
