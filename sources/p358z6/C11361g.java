package p358z6;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.AbstractC10430f;
import p343y6.C10432h;
import p343y6.C10433i;

public final class C11361g<F, T> extends AbstractC11362g0<F> implements Serializable {
    public final AbstractC10430f<F, ? extends T> f36304a;
    public final AbstractC11362g0<T> f36305b;

    public C11361g(AbstractC10430f<F, ? extends T> fVar, AbstractC11362g0<T> g0Var) {
        this.f36304a = (AbstractC10430f) C10433i.m5129i(fVar);
        this.f36305b = (AbstractC11362g0) C10433i.m5129i(g0Var);
    }

    @Override
    public int compare(F f, F f2) {
        return this.f36305b.compare(this.f36304a.apply(f), this.f36304a.apply(f2));
    }

    @Override
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11361g)) {
            return false;
        }
        C11361g gVar = (C11361g) obj;
        return this.f36304a.equals(gVar.f36304a) && this.f36305b.equals(gVar.f36305b);
    }

    public int hashCode() {
        return C10432h.m5138b(this.f36304a, this.f36305b);
    }

    public String toString() {
        return this.f36305b + ".onResultOf(" + this.f36304a + ")";
    }
}