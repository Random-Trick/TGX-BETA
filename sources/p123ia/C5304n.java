package p123ia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p138ja.C5906a;
import qa.C8298k;

public class C5304n extends C5303m {
    public static final <T> Collection<T> m23369c(T[] tArr) {
        C8298k.m12934e(tArr, "<this>");
        return new C5285d(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int m23368d(List<? extends T> list, T t, int i, int i2) {
        C8298k.m12934e(list, "<this>");
        m23360l(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = C5906a.m21862a(list.get(i4), t);
            if (a < 0) {
                i = i4 + 1;
            } else if (a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static int m23367e(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m23368d(list, comparable, i, i2);
    }

    public static final <T> List<T> m23366f() {
        return C5315x.f17491a;
    }

    public static final <T> int m23365g(List<? extends T> list) {
        C8298k.m12934e(list, "<this>");
        return list.size() - 1;
    }

    public static final <T> List<T> m23364h(T... tArr) {
        C8298k.m12934e(tArr, "elements");
        return tArr.length > 0 ? C5294h.m23433c(tArr) : m23366f();
    }

    public static final <T> List<T> m23363i(T... tArr) {
        C8298k.m12934e(tArr, "elements");
        return C5296i.m23391p(tArr);
    }

    public static final <T> List<T> m23362j(T... tArr) {
        C8298k.m12934e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C5285d(tArr, true));
    }

    public static final <T> List<T> m23361k(List<? extends T> list) {
        C8298k.m12934e(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : C5303m.m23370b(list.get(0));
        }
        return m23366f();
    }

    public static final void m23360l(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    public static final void m23359m() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void m23358n() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
