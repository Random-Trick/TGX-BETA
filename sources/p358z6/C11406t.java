package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.AbstractC10434j;
import p343y6.C10433i;

public final class C11406t {
    public static <T> boolean m719a(Iterable<T> iterable, AbstractC10434j<? super T> jVar) {
        return C11407u.m711b(iterable.iterator(), jVar);
    }

    @NullableDecl
    public static <T> T m718b(Iterable<? extends T> iterable, @NullableDecl T t) {
        return (T) C11407u.m703j(iterable.iterator(), t);
    }

    public static <T> T m717c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) C11407u.m704i(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return (T) m716d(list);
        }
        throw new NoSuchElementException();
    }

    public static <T> T m716d(List<T> list) {
        return list.get(list.size() - 1);
    }

    @CanIgnoreReturnValue
    public static <T> boolean m715e(Iterable<T> iterable, AbstractC10434j<? super T> jVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return C11407u.m699n(iterable.iterator(), jVar);
        }
        return m714f((List) iterable, (AbstractC10434j) C10433i.m5129i(jVar));
    }

    public static <T> boolean m714f(List<T> list, AbstractC10434j<? super T> jVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!jVar.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        m713g(list, jVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m713g(list, jVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static <T> void m713g(List<T> list, AbstractC10434j<? super T> jVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (jVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
