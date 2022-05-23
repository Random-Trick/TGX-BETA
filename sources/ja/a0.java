package ja;

import ra.k;

public final class a0<T> {
    public final int f15157a;
    public final T f15158b;

    public a0(int i10, T t10) {
        this.f15157a = i10;
        this.f15158b = t10;
    }

    public final int a() {
        return this.f15157a;
    }

    public final T b() {
        return this.f15158b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f15157a == a0Var.f15157a && k.b(this.f15158b, a0Var.f15158b);
    }

    public int hashCode() {
        int i10 = this.f15157a * 31;
        T t10 = this.f15158b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f15157a + ", value=" + this.f15158b + ')';
    }
}
