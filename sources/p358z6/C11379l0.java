package p358z6;

import java.io.Serializable;
import p343y6.C10433i;

public final class C11379l0 extends AbstractC11362g0<Comparable> implements Serializable {
    public static final C11379l0 f36336a = new C11379l0();

    @Override
    public <S extends Comparable> AbstractC11362g0<S> mo788d() {
        return AbstractC11362g0.m822b();
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        C10433i.m5129i(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
