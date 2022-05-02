package p148k5;

import p118i5.C5219c;
import p163l5.C6374q;

public final class C6098d1 {
    public final C6085b<?> f19345a;
    public final C5219c f19346b;

    public C6098d1(C6085b bVar, C5219c cVar, C6185x0 x0Var) {
        this.f19345a = bVar;
        this.f19346b = cVar;
    }

    public static C6085b m21334a(C6098d1 d1Var) {
        return d1Var.f19345a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C6098d1)) {
            C6098d1 d1Var = (C6098d1) obj;
            if (C6374q.m20524a(this.f19345a, d1Var.f19345a) && C6374q.m20524a(this.f19346b, d1Var.f19346b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6374q.m20523b(this.f19345a, this.f19346b);
    }

    public final String toString() {
        return C6374q.m20522c(this).m20521a("key", this.f19345a).m20521a("feature", this.f19346b).toString();
    }
}
