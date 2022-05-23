package ae;

import gd.w;
import ib.i;
import org.thunderdog.challegram.R;
import zd.o6;

public class r {
    public int f1050a;
    public String f1051b;
    public String f1052c;
    public int f1053d;
    public n f1054e;
    public int f1055f;

    public r(int i10) {
        this.f1050a = i10;
        if (!z.A(i10)) {
            this.f1053d = (int) c0.f(i10, R.id.theme_property_parentTheme);
        }
    }

    public void a(n nVar) {
        this.f1054e = new n(this.f1050a, nVar);
    }

    public int b() {
        return this.f1055f;
    }

    public int c() {
        return this.f1050a;
    }

    public String d() {
        if (z.A(this.f1050a)) {
            return this.f1051b;
        }
        return w.i1(z.p(this.f1050a));
    }

    public p e() {
        if (!z.A(this.f1050a)) {
            return c0.a(this.f1050a);
        }
        p j10 = z.u().j(false);
        int a10 = j10.a();
        int i10 = this.f1050a;
        if (a10 == i10) {
            n nVar = (n) j10;
            this.f1054e = nVar;
            return nVar;
        }
        if (this.f1054e == null) {
            this.f1054e = (n) c0.d(i10, true);
        }
        return this.f1054e;
    }

    public String f() {
        if (z.A(this.f1050a)) {
            return this.f1052c;
        }
        return null;
    }

    public String g(o6 o6Var) {
        String f10 = f();
        if (i.i(f10)) {
            return null;
        }
        return o6Var.Pc(f10);
    }

    public boolean h() {
        return !z.A(this.f1050a) || this.f1054e != null;
    }

    public boolean i() {
        return this.f1053d != 0;
    }

    public boolean j() {
        return z.v(this.f1050a);
    }

    public boolean k() {
        return z.A(this.f1050a);
    }

    public boolean l() {
        if (k()) {
            int i10 = this.f1055f;
            if ((i10 & 1) != 0 && (i10 & 2) == 0) {
                return true;
            }
        }
        return false;
    }

    public int m() {
        return this.f1053d;
    }

    public void n(n nVar) {
        this.f1054e = nVar;
    }

    public void o(String str) {
        if (z.A(this.f1050a)) {
            this.f1051b = str;
            return;
        }
        throw new IllegalStateException();
    }

    public void p(String str) {
        if (z.A(this.f1050a)) {
            this.f1052c = str;
            return;
        }
        throw new IllegalStateException();
    }

    public r(int i10, String str, String str2, int i11, int i12) {
        this.f1050a = i10;
        this.f1051b = str;
        this.f1052c = str2;
        this.f1053d = i11;
        this.f1055f = i12;
    }
}
