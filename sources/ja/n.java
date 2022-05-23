package ja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ka.a;
import ra.k;

public class n extends m {
    public static final <T> Collection<T> c(T[] tArr) {
        k.e(tArr, "<this>");
        return new d(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int d(List<? extends T> list, T t10, int i10, int i11) {
        k.e(list, "<this>");
        l(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int a10 = a.a(list.get(i13), t10);
            if (a10 < 0) {
                i10 = i13 + 1;
            } else if (a10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static int e(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return d(list, comparable, i10, i11);
    }

    public static final <T> List<T> f() {
        return x.f15178a;
    }

    public static final <T> int g(List<? extends T> list) {
        k.e(list, "<this>");
        return list.size() - 1;
    }

    public static final <T> List<T> h(T... tArr) {
        k.e(tArr, "elements");
        return tArr.length > 0 ? h.c(tArr) : f();
    }

    public static final <T> List<T> i(T... tArr) {
        k.e(tArr, "elements");
        return i.p(tArr);
    }

    public static final <T> List<T> j(T... tArr) {
        k.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new d(tArr, true));
    }

    public static final <T> List<T> k(List<? extends T> list) {
        k.e(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : m.b(list.get(0));
        }
        return f();
    }

    public static final void l(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        } else if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        } else if (i12 > i10) {
            throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
        }
    }

    public static final void m() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void n() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
