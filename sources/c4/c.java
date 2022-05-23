package c4;

import c4.i0;
import c5.a;
import c5.a0;
import c5.b0;
import c5.l0;
import m3.q1;
import o3.b;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.thunderdog.challegram.Log;
import t3.h;
import t3.t;

public final class c implements m {
    public final a0 f4450a;
    public final b0 f4451b;
    public final String f4452c;
    public String f4453d;
    public t f4454e;
    public int f4455f;
    public int f4456g;
    public boolean f4457h;
    public long f4458i;
    public q1 f4459j;
    public int f4460k;
    public long f4461l;

    public c() {
        this(null);
    }

    @Override
    public void a(b0 b0Var) {
        a.h(this.f4454e);
        while (b0Var.a() > 0) {
            int i10 = this.f4455f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(b0Var.a(), this.f4460k - this.f4456g);
                        this.f4454e.d(b0Var, min);
                        int i11 = this.f4456g + min;
                        this.f4456g = i11;
                        int i12 = this.f4460k;
                        if (i11 == i12) {
                            long j10 = this.f4461l;
                            if (j10 != -9223372036854775807L) {
                                this.f4454e.f(j10, 1, i12, 0, null);
                                this.f4461l += this.f4458i;
                            }
                            this.f4455f = 0;
                        }
                    }
                } else if (b(b0Var, this.f4451b.d(), Log.TAG_YOUTUBE)) {
                    g();
                    this.f4451b.P(0);
                    this.f4454e.d(this.f4451b, Log.TAG_YOUTUBE);
                    this.f4455f = 2;
                }
            } else if (h(b0Var)) {
                this.f4455f = 1;
                this.f4451b.d()[0] = 11;
                this.f4451b.d()[1] = 119;
                this.f4456g = 2;
            }
        }
    }

    public final boolean b(b0 b0Var, byte[] bArr, int i10) {
        int min = Math.min(b0Var.a(), i10 - this.f4456g);
        b0Var.j(bArr, this.f4456g, min);
        int i11 = this.f4456g + min;
        this.f4456g = i11;
        return i11 == i10;
    }

    @Override
    public void c() {
        this.f4455f = 0;
        this.f4456g = 0;
        this.f4457h = false;
        this.f4461l = -9223372036854775807L;
    }

    @Override
    public void d() {
    }

    @Override
    public void e(h hVar, i0.d dVar) {
        dVar.a();
        this.f4453d = dVar.b();
        this.f4454e = hVar.q(dVar.c(), 1);
    }

    @Override
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f4461l = j10;
        }
    }

    @RequiresNonNull({"output"})
    public final void g() {
        this.f4450a.p(0);
        b.C0166b e10 = b.e(this.f4450a);
        q1 q1Var = this.f4459j;
        if (q1Var == null || e10.f18678d != q1Var.f16908h0 || e10.f18677c != q1Var.f16909i0 || !l0.c(e10.f18675a, q1Var.U)) {
            q1 E = new q1.b().S(this.f4453d).e0(e10.f18675a).H(e10.f18678d).f0(e10.f18677c).V(this.f4452c).E();
            this.f4459j = E;
            this.f4454e.a(E);
        }
        this.f4460k = e10.f18679e;
        this.f4458i = (e10.f18680f * 1000000) / this.f4459j.f16909i0;
    }

    public final boolean h(b0 b0Var) {
        while (true) {
            boolean z10 = false;
            if (b0Var.a() <= 0) {
                return false;
            }
            if (!this.f4457h) {
                if (b0Var.D() == 11) {
                    z10 = true;
                }
                this.f4457h = z10;
            } else {
                int D = b0Var.D();
                if (D == 119) {
                    this.f4457h = false;
                    return true;
                }
                if (D == 11) {
                    z10 = true;
                }
                this.f4457h = z10;
            }
        }
    }

    public c(String str) {
        a0 a0Var = new a0(new byte[Log.TAG_YOUTUBE]);
        this.f4450a = a0Var;
        this.f4451b = new b0(a0Var.f4792a);
        this.f4455f = 0;
        this.f4461l = -9223372036854775807L;
        this.f4452c = str;
    }
}
