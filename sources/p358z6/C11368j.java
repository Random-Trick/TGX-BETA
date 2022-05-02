package p358z6;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.C10433i;

public final class C11368j<T> extends AbstractC11362g0<T> implements Serializable {
    public final Comparator<T> f36311a;

    public C11368j(Comparator<T> comparator) {
        this.f36311a = (Comparator) C10433i.m5129i(comparator);
    }

    @Override
    public int compare(T t, T t2) {
        return this.f36311a.compare(t, t2);
    }

    @Override
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11368j) {
            return this.f36311a.equals(((C11368j) obj).f36311a);
        }
        return false;
    }

    public int hashCode() {
        return this.f36311a.hashCode();
    }

    public String toString() {
        return this.f36311a.toString();
    }
}
