package p358z6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.C10432h;
import p343y6.C10433i;

public final class C11412w {
    public static boolean m696a(List<?> list, @NullableDecl Object obj) {
        if (obj == C10433i.m5129i(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C11407u.m708e(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!C10432h.m5139a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int m695b(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return m694c(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C10432h.m5139a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int m694c(List<?> list, @NullableDecl Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int m693d(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return m692e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C10432h.m5139a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int m692e(List<?> list, @NullableDecl Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> m691f() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> m690g(Iterator<? extends E> it) {
        ArrayList<E> f = m691f();
        C11407u.m712a(f, it);
        return f;
    }
}
