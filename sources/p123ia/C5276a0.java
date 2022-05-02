package p123ia;

import qa.C8298k;

public final class C5276a0<T> {
    public final int f17467a;
    public final T f17468b;

    public C5276a0(int i, T t) {
        this.f17467a = i;
        this.f17468b = t;
    }

    public final int m23468a() {
        return this.f17467a;
    }

    public final T m23467b() {
        return this.f17468b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5276a0)) {
            return false;
        }
        C5276a0 a0Var = (C5276a0) obj;
        return this.f17467a == a0Var.f17467a && C8298k.m12936b(this.f17468b, a0Var.f17468b);
    }

    public int hashCode() {
        int i = this.f17467a * 31;
        T t = this.f17468b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f17467a + ", value=" + this.f17468b + ')';
    }
}
