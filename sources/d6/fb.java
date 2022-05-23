package d6;

import j7.d;
import java.io.UnsupportedEncodingException;
import m5.r;

public final class fb {
    public final p8 f6505a;
    public ha f6506b = new ha();
    public final int f6507c;

    public fb(p8 p8Var, int i10) {
        this.f6505a = p8Var;
        pb.a();
        this.f6507c = i10;
    }

    public static fb d(p8 p8Var) {
        return new fb(p8Var, 0);
    }

    public static fb e(p8 p8Var, int i10) {
        return new fb(p8Var, 1);
    }

    public final int a() {
        return this.f6507c;
    }

    public final String b() {
        ja f10 = this.f6505a.j().f();
        return (f10 == null || s.b(f10.j())) ? "NA" : (String) r.k(f10.j());
    }

    public final byte[] c(int i10, boolean z10) {
        this.f6506b.f(Boolean.valueOf(i10 == 0));
        this.f6506b.e(Boolean.FALSE);
        this.f6505a.i(this.f6506b.l());
        try {
            pb.a();
            if (i10 == 0) {
                return new d().j(a7.f6354a).k(true).i().b(this.f6505a.j()).getBytes("utf-8");
            }
            r8 j10 = this.f6505a.j();
            i2 i2Var = new i2();
            a7.f6354a.a(i2Var);
            return i2Var.b().a(j10);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }

    public final fb f(o8 o8Var) {
        this.f6505a.f(o8Var);
        return this;
    }

    public final fb g(ha haVar) {
        this.f6506b = haVar;
        return this;
    }
}
