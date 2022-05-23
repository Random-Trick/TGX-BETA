package a7;

import java.io.Serializable;
import javax.annotation.CheckForNull;
import z6.j;

public final class n0<T> extends h0<T> implements Serializable {
    public final h0<? super T> f642a;

    public n0(h0<? super T> h0Var) {
        this.f642a = (h0) j.i(h0Var);
    }

    @Override
    public int compare(T t10, T t11) {
        return this.f642a.compare(t11, t10);
    }

    @Override
    public <S extends T> h0<S> d() {
        return (h0<? super T>) this.f642a;
    }

    @Override
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n0) {
            return this.f642a.equals(((n0) obj).f642a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f642a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f642a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
