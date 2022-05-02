package p216p3;

import p020b5.C1186a;
import p174m3.C6600g1;

public final class C8028h {
    public final String f26138a;
    public final C6600g1 f26139b;
    public final C6600g1 f26140c;
    public final int f26141d;
    public final int f26142e;

    public C8028h(String str, C6600g1 g1Var, C6600g1 g1Var2, int i, int i2) {
        C1186a.m38192a(i == 0 || i2 == 0);
        this.f26138a = C1186a.m38189d(str);
        this.f26139b = (C6600g1) C1186a.m38188e(g1Var);
        this.f26140c = (C6600g1) C1186a.m38188e(g1Var2);
        this.f26141d = i;
        this.f26142e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8028h.class != obj.getClass()) {
            return false;
        }
        C8028h hVar = (C8028h) obj;
        return this.f26141d == hVar.f26141d && this.f26142e == hVar.f26142e && this.f26138a.equals(hVar.f26138a) && this.f26139b.equals(hVar.f26139b) && this.f26140c.equals(hVar.f26140c);
    }

    public int hashCode() {
        return ((((((((527 + this.f26141d) * 31) + this.f26142e) * 31) + this.f26138a.hashCode()) * 31) + this.f26139b.hashCode()) * 31) + this.f26140c.hashCode();
    }
}
