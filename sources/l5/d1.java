package l5;

import j5.c;
import m5.q;

public final class d1 {
    public final b<?> f16057a;
    public final c f16058b;

    public d1(b bVar, c cVar, x0 x0Var) {
        this.f16057a = bVar;
        this.f16058b = cVar;
    }

    public static b a(d1 d1Var) {
        return d1Var.f16057a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof d1)) {
            d1 d1Var = (d1) obj;
            if (q.a(this.f16057a, d1Var.f16057a) && q.a(this.f16058b, d1Var.f16058b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return q.b(this.f16057a, this.f16058b);
    }

    public final String toString() {
        return q.c(this).a("key", this.f16057a).a("feature", this.f16058b).toString();
    }
}
