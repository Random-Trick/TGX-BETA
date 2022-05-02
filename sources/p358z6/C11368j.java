package p358z6;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.C10433i;

public final class C11368j<T> extends AbstractC11362g0<T> implements Serializable {
    public final Comparator<T> f36314a;

    public C11368j(Comparator<T> comparator) {
        this.f36314a = (Comparator) C10433i.m5129i(comparator);
    }

    @Override
    public int compare(T t, T t2) {
        return this.f36314a.compare(t, t2);
    }

    @Override
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11368j) {
            return this.f36314a.equals(((C11368j) obj).f36314a);
        }
        return false;
    }

    public int hashCode() {
        return this.f36314a.hashCode();
    }

    public String toString() {
        return this.f36314a.toString();
    }
}
