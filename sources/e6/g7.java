package e6;

import j7.d;
import java.io.UnsupportedEncodingException;
import m5.r;

public final class g7 {
    public final a5 f10804a;
    public n6 f10805b = new n6();

    public g7(a5 a5Var, int i10) {
        this.f10804a = a5Var;
        t7.a();
    }

    public static g7 c(a5 a5Var) {
        return new g7(a5Var, 0);
    }

    public final String a() {
        o6 c10 = this.f10804a.f().c();
        return (c10 == null || g5.b(c10.j())) ? "NA" : (String) r.k(c10.j());
    }

    public final byte[] b(int i10, boolean z10) {
        this.f10805b.f(Boolean.valueOf(i10 == 0));
        this.f10805b.e(Boolean.FALSE);
        this.f10804a.e(this.f10805b.l());
        try {
            t7.a();
            if (i10 == 0) {
                return new d().j(q3.f11039a).k(true).i().b(this.f10804a.f()).getBytes("utf-8");
            }
            b5 f10 = this.f10804a.f();
            c cVar = new c();
            q3.f11039a.a(cVar);
            return cVar.b().a(f10);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    public final g7 d(y4 y4Var) {
        this.f10804a.c(y4Var);
        return this;
    }

    public final g7 e(n6 n6Var) {
        this.f10805b = n6Var;
        return this;
    }
}
