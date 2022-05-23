package a4;

import c5.b0;
import t3.g;

public final class q {
    public c f374a;
    public long f375b;
    public long f376c;
    public long f377d;
    public int f378e;
    public int f379f;
    public boolean f385l;
    public p f387n;
    public boolean f389p;
    public long f390q;
    public boolean f391r;
    public long[] f380g = new long[0];
    public int[] f381h = new int[0];
    public int[] f382i = new int[0];
    public long[] f383j = new long[0];
    public boolean[] f384k = new boolean[0];
    public boolean[] f386m = new boolean[0];
    public final b0 f388o = new b0();

    public void a(b0 b0Var) {
        b0Var.j(this.f388o.d(), 0, this.f388o.f());
        this.f388o.P(0);
        this.f389p = false;
    }

    public void b(g gVar) {
        gVar.readFully(this.f388o.d(), 0, this.f388o.f());
        this.f388o.P(0);
        this.f389p = false;
    }

    public long c(int i10) {
        return this.f383j[i10];
    }

    public void d(int i10) {
        this.f388o.L(i10);
        this.f385l = true;
        this.f389p = true;
    }

    public void e(int i10, int i11) {
        this.f378e = i10;
        this.f379f = i11;
        if (this.f381h.length < i10) {
            this.f380g = new long[i10];
            this.f381h = new int[i10];
        }
        if (this.f382i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f382i = new int[i12];
            this.f383j = new long[i12];
            this.f384k = new boolean[i12];
            this.f386m = new boolean[i12];
        }
    }

    public void f() {
        this.f378e = 0;
        this.f390q = 0L;
        this.f391r = false;
        this.f385l = false;
        this.f389p = false;
        this.f387n = null;
    }

    public boolean g(int i10) {
        return this.f385l && this.f386m[i10];
    }
}
