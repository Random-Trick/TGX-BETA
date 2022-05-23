package m3;

import a5.b0;
import a5.c0;
import a5.r;
import b5.b;
import c5.a;
import o4.c;
import o4.h;
import o4.j0;
import o4.p;
import o4.r0;
import o4.s;

public final class d2 {
    public final p f16613a;
    public final Object f16614b;
    public final j0[] f16615c;
    public boolean f16616d;
    public boolean f16617e;
    public e2 f16618f;
    public boolean f16619g;
    public final boolean[] f16620h;
    public final d3[] f16621i;
    public final b0 f16622j;
    public final j2 f16623k;
    public d2 f16624l;
    public r0 f16625m = r0.M;
    public c0 f16626n;
    public long f16627o;

    public d2(d3[] d3VarArr, long j10, b0 b0Var, b bVar, j2 j2Var, e2 e2Var, c0 c0Var) {
        this.f16621i = d3VarArr;
        this.f16627o = j10;
        this.f16622j = b0Var;
        this.f16623k = j2Var;
        s.b bVar2 = e2Var.f16631a;
        this.f16614b = bVar2.f19169a;
        this.f16618f = e2Var;
        this.f16626n = c0Var;
        this.f16615c = new j0[d3VarArr.length];
        this.f16620h = new boolean[d3VarArr.length];
        this.f16613a = e(bVar2, j2Var, bVar, e2Var.f16632b, e2Var.f16634d);
    }

    public static p e(s.b bVar, j2 j2Var, b bVar2, long j10, long j11) {
        p h10 = j2Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new c(h10, true, 0L, j11) : h10;
    }

    public static void u(j2 j2Var, p pVar) {
        try {
            if (pVar instanceof c) {
                j2Var.z(((c) pVar).f18963a);
            } else {
                j2Var.z(pVar);
            }
        } catch (RuntimeException e10) {
            c5.s.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A() {
        p pVar = this.f16613a;
        if (pVar instanceof c) {
            long j10 = this.f16618f.f16634d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((c) pVar).t(0L, j10);
        }
    }

    public long a(c0 c0Var, long j10, boolean z10) {
        return b(c0Var, j10, z10, new boolean[this.f16621i.length]);
    }

    public long b(c0 c0Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c0Var.f473a) {
                break;
            }
            boolean[] zArr2 = this.f16620h;
            if (z10 || !c0Var.b(this.f16626n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f16615c);
        f();
        this.f16626n = c0Var;
        h();
        long o10 = this.f16613a.o(c0Var.f475c, this.f16620h, this.f16615c, zArr, j10);
        c(this.f16615c);
        this.f16617e = false;
        int i11 = 0;
        while (true) {
            j0[] j0VarArr = this.f16615c;
            if (i11 >= j0VarArr.length) {
                return o10;
            }
            if (j0VarArr[i11] != null) {
                a.f(c0Var.c(i11));
                if (this.f16621i[i11].k() != -2) {
                    this.f16617e = true;
                }
            } else {
                a.f(c0Var.f475c[i11] == null);
            }
            i11++;
        }
    }

    public final void c(j0[] j0VarArr) {
        int i10 = 0;
        while (true) {
            d3[] d3VarArr = this.f16621i;
            if (i10 < d3VarArr.length) {
                if (d3VarArr[i10].k() == -2 && this.f16626n.c(i10)) {
                    j0VarArr[i10] = new h();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void d(long j10) {
        a.f(r());
        this.f16613a.i(y(j10));
    }

    public final void f() {
        if (r()) {
            int i10 = 0;
            while (true) {
                c0 c0Var = this.f16626n;
                if (i10 < c0Var.f473a) {
                    boolean c10 = c0Var.c(i10);
                    r rVar = this.f16626n.f475c[i10];
                    if (c10 && rVar != null) {
                        rVar.h();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(j0[] j0VarArr) {
        int i10 = 0;
        while (true) {
            d3[] d3VarArr = this.f16621i;
            if (i10 < d3VarArr.length) {
                if (d3VarArr[i10].k() == -2) {
                    j0VarArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void h() {
        if (r()) {
            int i10 = 0;
            while (true) {
                c0 c0Var = this.f16626n;
                if (i10 < c0Var.f473a) {
                    boolean c10 = c0Var.c(i10);
                    r rVar = this.f16626n.f475c[i10];
                    if (c10 && rVar != null) {
                        rVar.k();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public long i() {
        if (!this.f16616d) {
            return this.f16618f.f16632b;
        }
        long r10 = this.f16617e ? this.f16613a.r() : Long.MIN_VALUE;
        return r10 == Long.MIN_VALUE ? this.f16618f.f16635e : r10;
    }

    public d2 j() {
        return this.f16624l;
    }

    public long k() {
        if (!this.f16616d) {
            return 0L;
        }
        return this.f16613a.c();
    }

    public long l() {
        return this.f16627o;
    }

    public long m() {
        return this.f16618f.f16632b + this.f16627o;
    }

    public r0 n() {
        return this.f16625m;
    }

    public c0 o() {
        return this.f16626n;
    }

    public void p(float f10, o3 o3Var) {
        this.f16616d = true;
        this.f16625m = this.f16613a.p();
        c0 v10 = v(f10, o3Var);
        e2 e2Var = this.f16618f;
        long j10 = e2Var.f16632b;
        long j11 = e2Var.f16635e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(v10, j10, false);
        long j12 = this.f16627o;
        e2 e2Var2 = this.f16618f;
        this.f16627o = j12 + (e2Var2.f16632b - a10);
        this.f16618f = e2Var2.b(a10);
    }

    public boolean q() {
        return this.f16616d && (!this.f16617e || this.f16613a.r() == Long.MIN_VALUE);
    }

    public final boolean r() {
        return this.f16624l == null;
    }

    public void s(long j10) {
        a.f(r());
        if (this.f16616d) {
            this.f16613a.u(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f16623k, this.f16613a);
    }

    public c0 v(float f10, o3 o3Var) {
        r[] rVarArr;
        c0 e10 = this.f16622j.e(this.f16621i, n(), this.f16618f.f16631a, o3Var);
        for (r rVar : e10.f475c) {
            if (rVar != null) {
                rVar.m(f10);
            }
        }
        return e10;
    }

    public void w(d2 d2Var) {
        if (d2Var != this.f16624l) {
            f();
            this.f16624l = d2Var;
            h();
        }
    }

    public void x(long j10) {
        this.f16627o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
