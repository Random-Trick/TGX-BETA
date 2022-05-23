package xa;

import java.lang.Comparable;

public interface c<T extends Comparable<? super T>> extends d<T> {
    boolean f(T t10, T t11);

    boolean isEmpty();
}
