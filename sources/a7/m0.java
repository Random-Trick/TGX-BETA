package a7;

import java.io.Serializable;
import z6.j;

public final class m0 extends h0<Comparable<?>> implements Serializable {
    public static final m0 f641a = new m0();

    @Override
    public <S extends Comparable<?>> h0<S> d() {
        return h0.b();
    }

    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        j.i(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
