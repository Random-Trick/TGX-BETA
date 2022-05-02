package p046d6;

import java.io.UnsupportedEncodingException;
import p120i7.C5258d;
import p163l5.C6378r;

public final class C3682g7 {
    public final C3620a5 f12542a;
    public C3749n6 f12543b = new C3749n6();

    public C3682g7(C3620a5 a5Var, int i) {
        this.f12542a = a5Var;
        C3804t7.m29748a();
    }

    public static C3682g7 m29829c(C3620a5 a5Var) {
        return new C3682g7(a5Var, 0);
    }

    public final String m29831a() {
        C3758o6 c = this.f12542a.m29854f().m29849c();
        return (c == null || C3680g5.m29832b(c.m29777j())) ? "NA" : (String) C6378r.m20507k(c.m29777j());
    }

    public final byte[] m29830b(int i, boolean z) {
        this.f12543b.m29802f(Boolean.valueOf(i == 0));
        this.f12543b.m29803e(Boolean.FALSE);
        this.f12542a.m29855e(this.f12543b.m29796l());
        try {
            C3804t7.m29748a();
            if (i == 0) {
                return new C5258d().m23520j(C3773q3.f12787a).m23519k(true).m23521i().mo23512b(this.f12542a.m29854f()).getBytes("utf-8");
            }
            C3630b5 f = this.f12542a.m29854f();
            C3634c cVar = new C3634c();
            C3773q3.f12787a.mo5164a(cVar);
            return cVar.m29848b().m29847a(f);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public final C3682g7 m29828d(EnumC3846y4 y4Var) {
        this.f12542a.m29857c(y4Var);
        return this;
    }

    public final C3682g7 m29827e(C3749n6 n6Var) {
        this.f12543b = n6Var;
        return this;
    }
}
