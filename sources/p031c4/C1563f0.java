package p031c4;

import p020b5.C1189b0;
import p020b5.C1205i0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p270t3.AbstractC8959g;
import p270t3.C8971q;

public final class C1563f0 {
    public final int f5575a;
    public boolean f5578d;
    public boolean f5579e;
    public boolean f5580f;
    public final C1205i0 f5576b = new C1205i0(0);
    public long f5581g = -9223372036854775807L;
    public long f5582h = -9223372036854775807L;
    public long f5583i = -9223372036854775807L;
    public final C1189b0 f5577c = new C1189b0();

    public C1563f0(int i) {
        this.f5575a = i;
    }

    public final int m36466a(AbstractC8959g gVar) {
        this.f5577c.m38150M(C1216l0.f4531f);
        this.f5578d = true;
        gVar.mo10808m();
        return 0;
    }

    public long m36465b() {
        return this.f5583i;
    }

    public C1205i0 m36464c() {
        return this.f5576b;
    }

    public boolean m36463d() {
        return this.f5578d;
    }

    public int m36462e(AbstractC8959g gVar, C8971q qVar, int i) {
        if (i <= 0) {
            return m36466a(gVar);
        }
        if (!this.f5580f) {
            return m36459h(gVar, qVar, i);
        }
        if (this.f5582h == -9223372036854775807L) {
            return m36466a(gVar);
        }
        if (!this.f5579e) {
            return m36461f(gVar, qVar, i);
        }
        long j = this.f5581g;
        if (j == -9223372036854775807L) {
            return m36466a(gVar);
        }
        long b = this.f5576b.m38055b(this.f5582h) - this.f5576b.m38055b(j);
        this.f5583i = b;
        if (b < 0) {
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Invalid duration: ");
            sb2.append(b);
            sb2.append(". Using TIME_UNSET instead.");
            C1230s.m37884i("TsDurationReader", sb2.toString());
            this.f5583i = -9223372036854775807L;
        }
        return m36466a(gVar);
    }

    public final int m36461f(AbstractC8959g gVar, C8971q qVar, int i) {
        int min = (int) Math.min(this.f5575a, gVar.mo6046a());
        long j = 0;
        if (gVar.mo6043r() != j) {
            qVar.f28860a = j;
            return 1;
        }
        this.f5577c.m38151L(min);
        gVar.mo10808m();
        gVar.mo10805q(this.f5577c.m38142d(), 0, min);
        this.f5581g = m36460g(this.f5577c, i);
        this.f5579e = true;
        return 0;
    }

    public final long m36460g(C1189b0 b0Var, int i) {
        int f = b0Var.m38140f();
        for (int e = b0Var.m38141e(); e < f; e++) {
            if (b0Var.m38142d()[e] == 71) {
                long c = C1577j0.m36397c(b0Var, e, i);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int m36459h(AbstractC8959g gVar, C8971q qVar, int i) {
        long a = gVar.mo6046a();
        int min = (int) Math.min(this.f5575a, a);
        long j = a - min;
        if (gVar.mo6043r() != j) {
            qVar.f28860a = j;
            return 1;
        }
        this.f5577c.m38151L(min);
        gVar.mo10808m();
        gVar.mo10805q(this.f5577c.m38142d(), 0, min);
        this.f5582h = m36458i(this.f5577c, i);
        this.f5580f = true;
        return 0;
    }

    public final long m36458i(C1189b0 b0Var, int i) {
        int e = b0Var.m38141e();
        int f = b0Var.m38140f();
        for (int i2 = f - 188; i2 >= e; i2--) {
            if (C1577j0.m36398b(b0Var.m38142d(), e, f, i2)) {
                long c = C1577j0.m36397c(b0Var, i2, i);
                if (c != -9223372036854775807L) {
                    return c;
                }
            }
        }
        return -9223372036854775807L;
    }
}
