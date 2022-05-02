package p033c6;

import java.io.UnsupportedEncodingException;
import p120i7.C5258d;
import p163l5.C6378r;

public final class C1731fb {
    public final C1874p8 f6285a;
    public C1760ha f6286b = new C1760ha();
    public final int f6287c;

    public C1731fb(C1874p8 p8Var, int i) {
        this.f6285a = p8Var;
        C1877pb.m35950a();
        this.f6287c = i;
    }

    public static C1731fb m36051d(C1874p8 p8Var) {
        return new C1731fb(p8Var, 0);
    }

    public static C1731fb m36050e(C1874p8 p8Var, int i) {
        return new C1731fb(p8Var, 1);
    }

    public final int m36054a() {
        return this.f6287c;
    }

    public final String m36053b() {
        C1790ja f = this.f6285a.m35955j().m35917f();
        return (f == null || C1907s.m35913b(f.m35982j())) ? "NA" : (String) C6378r.m20507k(f.m35982j());
    }

    public final byte[] m36052c(int i, boolean z) {
        this.f6286b.m36015f(Boolean.valueOf(i == 0));
        this.f6286b.m36016e(Boolean.FALSE);
        this.f6285a.m35956i(this.f6286b.m36009l());
        try {
            C1877pb.m35950a();
            if (i == 0) {
                return new C5258d().m23520j(C1652a7.f6080a).m23519k(true).m23521i().mo23512b(this.f6285a.m35955j()).getBytes("utf-8");
            }
            C1902r8 j = this.f6285a.m35955j();
            C1767i2 i2Var = new C1767i2();
            C1652a7.f6080a.mo5164a(i2Var);
            return i2Var.m35996b().m35992a(j);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public final C1731fb m36049f(EnumC1860o8 o8Var) {
        this.f6285a.m35959f(o8Var);
        return this;
    }

    public final C1731fb m36048g(C1760ha haVar) {
        this.f6286b = haVar;
        return this;
    }
}
