package a7;

import java.io.Serializable;
import z6.j;

public final class e0 extends h0<Comparable<?>> implements Serializable {
    public static final e0 f621a = new e0();

    @Override
    public <S extends Comparable<?>> h0<S> d() {
        return m0.f641a;
    }

    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        j.i(comparable);
        j.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
