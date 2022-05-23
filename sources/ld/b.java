package ld;

import android.view.View;
import k0.e;
import kb.c;
import kb.j;
import md.m;

public class b implements c {
    public boolean O;
    public final View f16341a;
    public boolean N = true;
    public final e<p> f16342b = new e<>(10);
    public final e<m> f16343c = new e<>(10);
    public final e<c> M = new e<>(10);

    public interface a {
        boolean j(int i10, v vVar, long j10);
    }

    public b(View view) {
        this.f16341a = view;
    }

    public static <T extends v> void c(e<T> eVar, boolean z10) {
        int p10 = eVar.p();
        int i10 = 0;
        if (z10) {
            while (i10 < p10) {
                eVar.q(i10).e();
                i10++;
            }
            return;
        }
        while (i10 < p10) {
            eVar.q(i10).b();
            i10++;
        }
    }

    public static <T extends v> void e(e<T> eVar, int i10, a aVar) {
        int p10 = eVar.p();
        for (int i11 = 0; i11 < p10; i11++) {
            T q10 = eVar.q(i11);
            if (aVar == null || !aVar.j(i10, q10, eVar.j(i11))) {
                q10.clear();
            }
        }
    }

    public static <T extends v> void h(e<T> eVar, long j10) {
        int p10 = eVar.p();
        for (int i10 = 0; i10 < p10; i10++) {
            if (eVar.j(i10) >= j10) {
                eVar.q(i10).clear();
            }
        }
    }

    public static <T extends v> T n(e<T> eVar, View view, boolean z10, boolean z11, long j10, int i10) {
        T t10;
        int h10 = eVar.h(j10);
        if (h10 >= 0) {
            return eVar.q(h10);
        }
        if (i10 == 1) {
            t10 = new c(view, 0);
        } else if (i10 == 2) {
            t10 = new p(view, 0);
        } else if (i10 == 3) {
            t10 = new m(view);
        } else {
            throw new IllegalArgumentException("type == " + i10);
        }
        if (!z10) {
            t10.b();
        }
        if (z11) {
            t10.S0(z11);
        }
        eVar.a(j10, t10);
        return t10;
    }

    public static <T extends v> void o(e<T> eVar, j<v> jVar) {
        int p10 = eVar.p();
        for (int i10 = 0; i10 < p10; i10++) {
            jVar.a(eVar.q(i10));
        }
    }

    @Override
    public void Q2() {
        d();
    }

    public void b() {
        this.N = true;
        c(this.f16342b, true);
        c(this.f16343c, true);
        c(this.M, true);
    }

    public void d() {
        f(null);
    }

    public void f(a aVar) {
        e(this.f16342b, 1, aVar);
        e(this.f16343c, 2, aVar);
        e(this.M, 0, aVar);
    }

    public void g(int i10) {
        long j10 = i10;
        h(this.f16342b, j10);
        h(this.f16343c, j10);
        h(this.M, j10);
    }

    public void i() {
        this.N = false;
        c(this.f16342b, false);
        c(this.f16343c, false);
        c(this.M, false);
    }

    public m j(long j10) {
        return (m) n(this.f16343c, this.f16341a, this.N, this.O, j10, 3);
    }

    public p k(long j10) {
        return (p) n(this.f16342b, this.f16341a, this.N, this.O, j10, 2);
    }

    public c l(int i10) {
        return (c) n(this.M, this.f16341a, this.N, this.O, i10, 1);
    }

    public v m(long j10, boolean z10) {
        if (z10) {
            return j(j10);
        }
        return k(j10);
    }

    public final void p(j<v> jVar) {
        o(this.f16342b, jVar);
        o(this.f16343c, jVar);
        o(this.M, jVar);
    }

    public void r(final boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            p(new j() {
                @Override
                public final void a(Object obj) {
                    ((v) obj).S0(z10);
                }
            });
        }
    }
}
