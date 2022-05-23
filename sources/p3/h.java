package p3;

import c5.a;
import m3.q1;

public final class h {
    public final String f20491a;
    public final q1 f20492b;
    public final q1 f20493c;
    public final int f20494d;
    public final int f20495e;

    public h(String str, q1 q1Var, q1 q1Var2, int i10, int i11) {
        a.a(i10 == 0 || i11 == 0);
        this.f20491a = a.d(str);
        this.f20492b = (q1) a.e(q1Var);
        this.f20493c = (q1) a.e(q1Var2);
        this.f20494d = i10;
        this.f20495e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f20494d == hVar.f20494d && this.f20495e == hVar.f20495e && this.f20491a.equals(hVar.f20491a) && this.f20492b.equals(hVar.f20492b) && this.f20493c.equals(hVar.f20493c);
    }

    public int hashCode() {
        return ((((((((527 + this.f20494d) * 31) + this.f20495e) * 31) + this.f20491a.hashCode()) * 31) + this.f20492b.hashCode()) * 31) + this.f20493c.hashCode();
    }
}
