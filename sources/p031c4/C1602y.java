package p031c4;

import p020b5.C1189b0;
import p020b5.C1205i0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p270t3.AbstractC8959g;
import p270t3.C8971q;

public final class C1602y {
    public boolean f5868c;
    public boolean f5869d;
    public boolean f5870e;
    public final C1205i0 f5866a = new C1205i0(0);
    public long f5871f = -9223372036854775807L;
    public long f5872g = -9223372036854775807L;
    public long f5873h = -9223372036854775807L;
    public final C1189b0 f5867b = new C1189b0();

    public static boolean m36310a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long m36299l(C1189b0 b0Var) {
        int e = b0Var.m38141e();
        if (b0Var.m38145a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        b0Var.m38136j(bArr, 0, 9);
        b0Var.m38147P(e);
        if (!m36310a(bArr)) {
            return -9223372036854775807L;
        }
        return m36298m(bArr);
    }

    public static long m36298m(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final int m36309b(AbstractC8959g gVar) {
        this.f5867b.m38150M(C1216l0.f4531f);
        this.f5868c = true;
        gVar.mo10808m();
        return 0;
    }

    public long m36308c() {
        return this.f5873h;
    }

    public C1205i0 m36307d() {
        return this.f5866a;
    }

    public boolean m36306e() {
        return this.f5868c;
    }

    public final int m36305f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public int m36304g(AbstractC8959g gVar, C8971q qVar) {
        if (!this.f5870e) {
            return m36301j(gVar, qVar);
        }
        if (this.f5872g == -9223372036854775807L) {
            return m36309b(gVar);
        }
        if (!this.f5869d) {
            return m36303h(gVar, qVar);
        }
        long j = this.f5871f;
        if (j == -9223372036854775807L) {
            return m36309b(gVar);
        }
        long b = this.f5866a.m38055b(this.f5872g) - this.f5866a.m38055b(j);
        this.f5873h = b;
        if (b < 0) {
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Invalid duration: ");
            sb2.append(b);
            sb2.append(". Using TIME_UNSET instead.");
            C1230s.m37884i("PsDurationReader", sb2.toString());
            this.f5873h = -9223372036854775807L;
        }
        return m36309b(gVar);
    }

    public final int m36303h(AbstractC8959g gVar, C8971q qVar) {
        int min = (int) Math.min(20000L, gVar.mo6046a());
        long j = 0;
        if (gVar.mo6043r() != j) {
            qVar.f28860a = j;
            return 1;
        }
        this.f5867b.m38151L(min);
        gVar.mo10808m();
        gVar.mo10805q(this.f5867b.m38142d(), 0, min);
        this.f5871f = m36302i(this.f5867b);
        this.f5869d = true;
        return 0;
    }

    public final long m36302i(C1189b0 b0Var) {
        int f = b0Var.m38140f();
        for (int e = b0Var.m38141e(); e < f - 3; e++) {
            if (m36305f(b0Var.m38142d(), e) == 442) {
                b0Var.m38147P(e + 4);
                long l = m36299l(b0Var);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int m36301j(AbstractC8959g gVar, C8971q qVar) {
        long a = gVar.mo6046a();
        int min = (int) Math.min(20000L, a);
        long j = a - min;
        if (gVar.mo6043r() != j) {
            qVar.f28860a = j;
            return 1;
        }
        this.f5867b.m38151L(min);
        gVar.mo10808m();
        gVar.mo10805q(this.f5867b.m38142d(), 0, min);
        this.f5872g = m36300k(this.f5867b);
        this.f5870e = true;
        return 0;
    }

    public final long m36300k(C1189b0 b0Var) {
        int e = b0Var.m38141e();
        for (int f = b0Var.m38140f() - 4; f >= e; f--) {
            if (m36305f(b0Var.m38142d(), f) == 442) {
                b0Var.m38147P(f + 4);
                long l = m36299l(b0Var);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }
}
