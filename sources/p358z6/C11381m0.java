package p358z6;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.C10433i;

public final class C11381m0<T> extends AbstractC11362g0<T> implements Serializable {
    public final AbstractC11362g0<? super T> f36337a;

    public C11381m0(AbstractC11362g0<? super T> g0Var) {
        this.f36337a = (AbstractC11362g0) C10433i.m5129i(g0Var);
    }

    @Override
    public int compare(T t, T t2) {
        return this.f36337a.compare(t2, t);
    }

    @Override
    public <S extends T> AbstractC11362g0<S> mo788d() {
        return (AbstractC11362g0<? super T>) this.f36337a;
    }

    @Override
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11381m0) {
            return this.f36337a.equals(((C11381m0) obj).f36337a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f36337a.hashCode();
    }

    public String toString() {
        return this.f36337a + ".reverse()";
    }
}
