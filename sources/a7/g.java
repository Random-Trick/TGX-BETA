package a7;

import java.io.Serializable;
import javax.annotation.CheckForNull;
import z6.f;
import z6.i;
import z6.j;

public final class g<F, T> extends h0<F> implements Serializable {
    public final f<F, ? extends T> f626a;
    public final h0<T> f627b;

    public g(f<F, ? extends T> fVar, h0<T> h0Var) {
        this.f626a = (f) j.i(fVar);
        this.f627b = (h0) j.i(h0Var);
    }

    @Override
    public int compare(F f10, F f11) {
        return this.f627b.compare(this.f626a.apply(f10), this.f626a.apply(f11));
    }

    @Override
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f626a.equals(gVar.f626a) && this.f627b.equals(gVar.f627b);
    }

    public int hashCode() {
        return i.b(this.f626a, this.f627b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f627b);
        String valueOf2 = String.valueOf(this.f626a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
