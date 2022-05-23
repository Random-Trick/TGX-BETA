package ia;

import java.io.Serializable;
import ra.k;

public final class h<A, B> implements Serializable {
    public final A f14150a;
    public final B f14151b;

    public h(A a10, B b10) {
        this.f14150a = a10;
        this.f14151b = b10;
    }

    public final A a() {
        return this.f14150a;
    }

    public final B b() {
        return this.f14151b;
    }

    public final A c() {
        return this.f14150a;
    }

    public final B d() {
        return this.f14151b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.b(this.f14150a, hVar.f14150a) && k.b(this.f14151b, hVar.f14151b);
    }

    public int hashCode() {
        A a10 = this.f14150a;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f14151b;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return '(' + this.f14150a + ", " + this.f14151b + ')';
    }
}
