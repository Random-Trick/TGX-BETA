package d6;

import m5.q;

public final class b8 {
    public final z7 f6380a;
    public final Integer f6381b;
    public final Integer f6382c = null;
    public final Boolean f6383d = null;

    public b8(y7 y7Var, a8 a8Var) {
        z7 z7Var;
        Integer num;
        z7Var = y7Var.f7164a;
        this.f6380a = z7Var;
        num = y7Var.f7165b;
        this.f6381b = num;
    }

    @e2(zza = 1)
    public final z7 a() {
        return this.f6380a;
    }

    @e2(zza = 2)
    public final Integer b() {
        return this.f6381b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return q.a(this.f6380a, b8Var.f6380a) && q.a(this.f6381b, b8Var.f6381b) && q.a(null, null) && q.a(null, null);
    }

    public final int hashCode() {
        return q.b(this.f6380a, this.f6381b, null, null);
    }
}
