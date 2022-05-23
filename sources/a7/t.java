package a7;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import z6.j;
import z6.k;

public final class t {
    public static <T> boolean a(Iterable<T> iterable, k<? super T> kVar) {
        return u.b(iterable.iterator(), kVar);
    }

    public static <T> T b(Iterable<? extends T> iterable, T t10) {
        return (T) u.j(iterable.iterator(), t10);
    }

    public static <T> T c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) u.i(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return (T) d(list);
        }
        throw new NoSuchElementException();
    }

    public static <T> T d(List<T> list) {
        return list.get(list.size() - 1);
    }

    @CanIgnoreReturnValue
    public static <T> boolean e(Iterable<T> iterable, k<? super T> kVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return u.n(iterable.iterator(), kVar);
        }
        return f((List) iterable, (k) j.i(kVar));
    }

    public static <T> boolean f(List<T> list, k<? super T> kVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!kVar.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        g(list, kVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        g(list, kVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    public static <T> void g(List<T> list, k<? super T> kVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (kVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }
}
