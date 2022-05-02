package p107ha;

import java.io.Serializable;
import qa.C8298k;

public final class C5048h<A, B> implements Serializable {
    public final A f17057a;
    public final B f17058b;

    public C5048h(A a, B b) {
        this.f17057a = a;
        this.f17058b = b;
    }

    public final A m24197a() {
        return this.f17057a;
    }

    public final B m24196b() {
        return this.f17058b;
    }

    public final A m24195c() {
        return this.f17057a;
    }

    public final B m24194d() {
        return this.f17058b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5048h)) {
            return false;
        }
        C5048h hVar = (C5048h) obj;
        return C8298k.m12936b(this.f17057a, hVar.f17057a) && C8298k.m12936b(this.f17058b, hVar.f17058b);
    }

    public int hashCode() {
        A a = this.f17057a;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f17058b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.f17057a + ", " + this.f17058b + ')';
    }
}
