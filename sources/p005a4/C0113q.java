package p005a4;

import p020b5.C1189b0;
import p270t3.AbstractC8959g;

public final class C0113q {
    public C0092c f433a;
    public long f434b;
    public long f435c;
    public long f436d;
    public int f437e;
    public int f438f;
    public boolean f444l;
    public C0112p f446n;
    public boolean f448p;
    public long f449q;
    public boolean f450r;
    public long[] f439g = new long[0];
    public int[] f440h = new int[0];
    public int[] f441i = new int[0];
    public long[] f442j = new long[0];
    public boolean[] f443k = new boolean[0];
    public boolean[] f445m = new boolean[0];
    public final C1189b0 f447o = new C1189b0();

    public void m42265a(C1189b0 b0Var) {
        b0Var.m38133j(this.f447o.m38139d(), 0, this.f447o.m38137f());
        this.f447o.m38144P(0);
        this.f448p = false;
    }

    public void m42264b(AbstractC8959g gVar) {
        gVar.readFully(this.f447o.m38139d(), 0, this.f447o.m38137f());
        this.f447o.m38144P(0);
        this.f448p = false;
    }

    public long m42263c(int i) {
        return this.f442j[i];
    }

    public void m42262d(int i) {
        this.f447o.m38148L(i);
        this.f444l = true;
        this.f448p = true;
    }

    public void m42261e(int i, int i2) {
        this.f437e = i;
        this.f438f = i2;
        if (this.f440h.length < i) {
            this.f439g = new long[i];
            this.f440h = new int[i];
        }
        if (this.f441i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f441i = new int[i3];
            this.f442j = new long[i3];
            this.f443k = new boolean[i3];
            this.f445m = new boolean[i3];
        }
    }

    public void m42260f() {
        this.f437e = 0;
        this.f449q = 0L;
        this.f450r = false;
        this.f444l = false;
        this.f448p = false;
        this.f446n = null;
    }

    public boolean m42259g(int i) {
        return this.f444l && this.f445m[i];
    }
}
