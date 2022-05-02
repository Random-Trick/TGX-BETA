package p358z6;

import java.io.Serializable;
import p343y6.C10433i;

public final class C11357e0 extends AbstractC11362g0<Comparable> implements Serializable {
    public static final C11357e0 f36299a = new C11357e0();

    @Override
    public <S extends Comparable> AbstractC11362g0<S> mo788d() {
        return C11379l0.f36336a;
    }

    public int compare(Comparable comparable, Comparable comparable2) {
        C10433i.m5129i(comparable);
        C10433i.m5129i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
