package a7;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import z6.f;

public abstract class h0<T> implements Comparator<T> {
    public static <T> h0<T> a(Comparator<T> comparator) {
        if (comparator instanceof h0) {
            return (h0) comparator;
        }
        return new j(comparator);
    }

    public static <C extends Comparable> h0<C> b() {
        return e0.f621a;
    }

    public <F> h0<F> c(f<F, ? extends T> fVar) {
        return new g(fVar, this);
    }

    @Override
    @CanIgnoreReturnValue
    public abstract int compare(T t10, T t11);

    public <S extends T> h0<S> d() {
        return new n0(this);
    }
}
