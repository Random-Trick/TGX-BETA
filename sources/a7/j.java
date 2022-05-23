package a7;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

public final class j<T> extends h0<T> implements Serializable {
    public final Comparator<T> f630a;

    public j(Comparator<T> comparator) {
        this.f630a = (Comparator) z6.j.i(comparator);
    }

    @Override
    public int compare(T t10, T t11) {
        return this.f630a.compare(t10, t11);
    }

    @Override
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f630a.equals(((j) obj).f630a);
        }
        return false;
    }

    public int hashCode() {
        return this.f630a.hashCode();
    }

    public String toString() {
        return this.f630a.toString();
    }
}
