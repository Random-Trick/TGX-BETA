package p216p3;

import p020b5.C1186a;
import p174m3.C6600g1;

public final class C8028h {
    public final String f26135a;
    public final C6600g1 f26136b;
    public final C6600g1 f26137c;
    public final int f26138d;
    public final int f26139e;

    public C8028h(String str, C6600g1 g1Var, C6600g1 g1Var2, int i, int i2) {
        C1186a.m38189a(i == 0 || i2 == 0);
        this.f26135a = C1186a.m38186d(str);
        this.f26136b = (C6600g1) C1186a.m38185e(g1Var);
        this.f26137c = (C6600g1) C1186a.m38185e(g1Var2);
        this.f26138d = i;
        this.f26139e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8028h.class != obj.getClass()) {
            return false;
        }
        C8028h hVar = (C8028h) obj;
        return this.f26138d == hVar.f26138d && this.f26139e == hVar.f26139e && this.f26135a.equals(hVar.f26135a) && this.f26136b.equals(hVar.f26136b) && this.f26137c.equals(hVar.f26137c);
    }

    public int hashCode() {
        return ((((((((527 + this.f26138d) * 31) + this.f26139e) * 31) + this.f26135a.hashCode()) * 31) + this.f26136b.hashCode()) * 31) + this.f26137c.hashCode();
    }
}
