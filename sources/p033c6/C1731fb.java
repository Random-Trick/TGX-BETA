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
        C1877pb.m35947a();
        this.f6287c = i;
    }

    public static C1731fb m36048d(C1874p8 p8Var) {
        return new C1731fb(p8Var, 0);
    }

    public static C1731fb m36047e(C1874p8 p8Var, int i) {
        return new C1731fb(p8Var, 1);
    }

    public final int m36051a() {
        return this.f6287c;
    }

    public final String m36050b() {
        C1790ja f = this.f6285a.m35952j().m35914f();
        return (f == null || C1907s.m35910b(f.m35979j())) ? "NA" : (String) C6378r.m20506k(f.m35979j());
    }

    public final byte[] m36049c(int i, boolean z) {
        this.f6286b.m36012f(Boolean.valueOf(i == 0));
        this.f6286b.m36013e(Boolean.FALSE);
        this.f6285a.m35953i(this.f6286b.m36006l());
        try {
            C1877pb.m35947a();
            if (i == 0) {
                return new C5258d().m23519j(C1652a7.f6080a).m23518k(true).m23520i().mo23511b(this.f6285a.m35952j()).getBytes("utf-8");
            }
            C1902r8 j = this.f6285a.m35952j();
            C1767i2 i2Var = new C1767i2();
            C1652a7.f6080a.mo5164a(i2Var);
            return i2Var.m35993b().m35989a(j);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public final C1731fb m36046f(EnumC1860o8 o8Var) {
        this.f6285a.m35956f(o8Var);
        return this;
    }

    public final C1731fb m36045g(C1760ha haVar) {
        this.f6286b = haVar;
        return this;
    }
}
