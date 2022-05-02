package p364zd;

import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p350yd.C10930q6;

public class C11533r {
    public int f36965a;
    public String f36966b;
    public String f36967c;
    public int f36968d;
    public C11529n f36969e;
    public int f36970f;

    public C11533r(int i) {
        this.f36965a = i;
        if (!C11541z.m1y(i)) {
            this.f36968d = (int) C11514c0.m343f(i, R.id.theme_property_parentTheme);
        }
    }

    public void m112a(C11529n nVar) {
        this.f36969e = new C11529n(this.f36965a, nVar);
    }

    public int m111b() {
        return this.f36970f;
    }

    public int m110c() {
        return this.f36965a;
    }

    public String m109d() {
        if (C11541z.m1y(this.f36965a)) {
            return this.f36966b;
        }
        return C4403w.m27869i1(C11541z.m14o(this.f36965a));
    }

    public AbstractC11531p m108e() {
        if (!C11541z.m1y(this.f36965a)) {
            return C11514c0.m348a(this.f36965a);
        }
        AbstractC11531p j = C11541z.m7t().m19j(false);
        int a = j.mo96a();
        int i = this.f36965a;
        if (a == i) {
            C11529n nVar = (C11529n) j;
            this.f36969e = nVar;
            return nVar;
        }
        if (this.f36969e == null) {
            this.f36969e = (C11529n) C11514c0.m345d(i, true);
        }
        return this.f36969e;
    }

    public String m107f() {
        if (C11541z.m1y(this.f36965a)) {
            return this.f36967c;
        }
        return null;
    }

    public String m106g(C10930q6 q6Var) {
        String f = m107f();
        if (C5070i.m24061i(f)) {
            return null;
        }
        return q6Var.m2762Lc(f);
    }

    public boolean m105h() {
        return !C11541z.m1y(this.f36965a) || this.f36969e != null;
    }

    public boolean m104i() {
        return this.f36968d != 0;
    }

    public boolean m103j() {
        return C11541z.m6u(this.f36965a);
    }

    public boolean m102k() {
        return C11541z.m1y(this.f36965a);
    }

    public boolean m101l() {
        if (m102k()) {
            int i = this.f36970f;
            if ((i & 1) != 0 && (i & 2) == 0) {
                return true;
            }
        }
        return false;
    }

    public int m100m() {
        return this.f36968d;
    }

    public void m99n(C11529n nVar) {
        this.f36969e = nVar;
    }

    public void m98o(String str) {
        if (C11541z.m1y(this.f36965a)) {
            this.f36966b = str;
            return;
        }
        throw new IllegalStateException();
    }

    public void m97p(String str) {
        if (C11541z.m1y(this.f36965a)) {
            this.f36967c = str;
            return;
        }
        throw new IllegalStateException();
    }

    public C11533r(int i, String str, String str2, int i2, int i3) {
        this.f36965a = i;
        this.f36966b = str;
        this.f36967c = str2;
        this.f36968d = i2;
        this.f36970f = i3;
    }
}
