package b4;

import c5.a;
import c5.b0;
import m3.k2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import t3.f;
import t3.g;
import t3.h;
import t3.l;
import t3.q;
import t3.t;

public class d implements f {
    public static final l f3774d = c.f3773b;
    public h f3775a;
    public i f3776b;
    public boolean f3777c;

    public static f[] d() {
        return new f[]{new d()};
    }

    public static b0 g(b0 b0Var) {
        b0Var.P(0);
        return b0Var;
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        i iVar = this.f3776b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    @Override
    public int e(g gVar, q qVar) {
        a.h(this.f3775a);
        if (this.f3776b == null) {
            if (h(gVar)) {
                gVar.m();
            } else {
                throw k2.a("Failed to determine bitstream type", null);
            }
        }
        if (!this.f3777c) {
            t q10 = this.f3775a.q(0, 1);
            this.f3775a.k();
            this.f3776b.d(this.f3775a, q10);
            this.f3777c = true;
        }
        return this.f3776b.g(gVar, qVar);
    }

    @Override
    public void f(h hVar) {
        this.f3775a = hVar;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean h(g gVar) {
        f fVar = new f();
        if (fVar.a(gVar, true) && (fVar.f3784b & 2) == 2) {
            int min = Math.min(fVar.f3791i, 8);
            b0 b0Var = new b0(min);
            gVar.q(b0Var.d(), 0, min);
            if (b.p(g(b0Var))) {
                this.f3776b = new b();
            } else if (j.r(g(b0Var))) {
                this.f3776b = new j();
            } else if (h.p(g(b0Var))) {
                this.f3776b = new h();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean j(g gVar) {
        try {
            return h(gVar);
        } catch (k2 unused) {
            return false;
        }
    }
}
