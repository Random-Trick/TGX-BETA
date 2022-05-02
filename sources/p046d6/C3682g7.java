package p046d6;

import java.io.UnsupportedEncodingException;
import p120i7.C5258d;
import p163l5.C6378r;

public final class C3682g7 {
    public final C3620a5 f12542a;
    public C3749n6 f12543b = new C3749n6();

    public C3682g7(C3620a5 a5Var, int i) {
        this.f12542a = a5Var;
        C3804t7.m29746a();
    }

    public static C3682g7 m29827c(C3620a5 a5Var) {
        return new C3682g7(a5Var, 0);
    }

    public final String m29829a() {
        C3758o6 c = this.f12542a.m29852f().m29847c();
        return (c == null || C3680g5.m29830b(c.m29775j())) ? "NA" : (String) C6378r.m20506k(c.m29775j());
    }

    public final byte[] m29828b(int i, boolean z) {
        this.f12543b.m29800f(Boolean.valueOf(i == 0));
        this.f12543b.m29801e(Boolean.FALSE);
        this.f12542a.m29853e(this.f12543b.m29794l());
        try {
            C3804t7.m29746a();
            if (i == 0) {
                return new C5258d().m23519j(C3773q3.f12787a).m23518k(true).m23520i().mo23511b(this.f12542a.m29852f()).getBytes("utf-8");
            }
            C3630b5 f = this.f12542a.m29852f();
            C3634c cVar = new C3634c();
            C3773q3.f12787a.mo5164a(cVar);
            return cVar.m29846b().m29845a(f);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public final C3682g7 m29826d(EnumC3846y4 y4Var) {
        this.f12542a.m29855c(y4Var);
        return this;
    }

    public final C3682g7 m29825e(C3749n6 n6Var) {
        this.f12543b = n6Var;
        return this;
    }
}
