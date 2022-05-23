package c4;

import c5.b0;
import c5.i0;
import c5.l0;
import c5.s;
import t3.g;
import t3.q;

public final class f0 {
    public final int f4492a;
    public boolean f4495d;
    public boolean f4496e;
    public boolean f4497f;
    public final i0 f4493b = new i0(0);
    public long f4498g = -9223372036854775807L;
    public long f4499h = -9223372036854775807L;
    public long f4500i = -9223372036854775807L;
    public final b0 f4494c = new b0();

    public f0(int i10) {
        this.f4492a = i10;
    }

    public final int a(g gVar) {
        this.f4494c.M(l0.f4846f);
        this.f4495d = true;
        gVar.m();
        return 0;
    }

    public long b() {
        return this.f4500i;
    }

    public i0 c() {
        return this.f4493b;
    }

    public boolean d() {
        return this.f4495d;
    }

    public int e(g gVar, q qVar, int i10) {
        if (i10 <= 0) {
            return a(gVar);
        }
        if (!this.f4497f) {
            return h(gVar, qVar, i10);
        }
        if (this.f4499h == -9223372036854775807L) {
            return a(gVar);
        }
        if (!this.f4496e) {
            return f(gVar, qVar, i10);
        }
        long j10 = this.f4498g;
        if (j10 == -9223372036854775807L) {
            return a(gVar);
        }
        long b10 = this.f4493b.b(this.f4499h) - this.f4493b.b(j10);
        this.f4500i = b10;
        if (b10 < 0) {
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Invalid duration: ");
            sb2.append(b10);
            sb2.append(". Using TIME_UNSET instead.");
            s.i("TsDurationReader", sb2.toString());
            this.f4500i = -9223372036854775807L;
        }
        return a(gVar);
    }

    public final int f(g gVar, q qVar, int i10) {
        int min = (int) Math.min(this.f4492a, gVar.a());
        long j10 = 0;
        if (gVar.r() != j10) {
            qVar.f22899a = j10;
            return 1;
        }
        this.f4494c.L(min);
        gVar.m();
        gVar.q(this.f4494c.d(), 0, min);
        this.f4498g = g(this.f4494c, i10);
        this.f4496e = true;
        return 0;
    }

    public final long g(b0 b0Var, int i10) {
        int f10 = b0Var.f();
        for (int e10 = b0Var.e(); e10 < f10; e10++) {
            if (b0Var.d()[e10] == 71) {
                long c10 = j0.c(b0Var, e10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(g gVar, q qVar, int i10) {
        long a10 = gVar.a();
        int min = (int) Math.min(this.f4492a, a10);
        long j10 = a10 - min;
        if (gVar.r() != j10) {
            qVar.f22899a = j10;
            return 1;
        }
        this.f4494c.L(min);
        gVar.m();
        gVar.q(this.f4494c.d(), 0, min);
        this.f4499h = i(this.f4494c, i10);
        this.f4497f = true;
        return 0;
    }

    public final long i(b0 b0Var, int i10) {
        int e10 = b0Var.e();
        int f10 = b0Var.f();
        for (int i11 = f10 - 188; i11 >= e10; i11--) {
            if (j0.b(b0Var.d(), e10, f10, i11)) {
                long c10 = j0.c(b0Var, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }
}
