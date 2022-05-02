package p358z6;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.AbstractC10430f;

public abstract class AbstractC11362g0<T> implements Comparator<T> {
    public static <T> AbstractC11362g0<T> m823a(Comparator<T> comparator) {
        return comparator instanceof AbstractC11362g0 ? (AbstractC11362g0) comparator : new C11368j(comparator);
    }

    public static <C extends Comparable> AbstractC11362g0<C> m822b() {
        return C11357e0.f36299a;
    }

    public <F> AbstractC11362g0<F> m821c(AbstractC10430f<F, ? extends T> fVar) {
        return new C11361g(fVar, this);
    }

    @Override
    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);

    public <S extends T> AbstractC11362g0<S> mo788d() {
        return new C11381m0(this);
    }
}
