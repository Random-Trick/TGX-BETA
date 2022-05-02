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

    public static boolean m36307a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long m36296l(C1189b0 b0Var) {
        int e = b0Var.m38138e();
        if (b0Var.m38142a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        b0Var.m38133j(bArr, 0, 9);
        b0Var.m38144P(e);
        if (!m36307a(bArr)) {
            return -9223372036854775807L;
        }
        return m36295m(bArr);
    }

    public static long m36295m(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final int m36306b(AbstractC8959g gVar) {
        this.f5867b.m38147M(C1216l0.f4531f);
        this.f5868c = true;
        gVar.mo10809m();
        return 0;
    }

    public long m36305c() {
        return this.f5873h;
    }

    public C1205i0 m36304d() {
        return this.f5866a;
    }

    public boolean m36303e() {
        return this.f5868c;
    }

    public final int m36302f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public int m36301g(AbstractC8959g gVar, C8971q qVar) {
        if (!this.f5870e) {
            return m36298j(gVar, qVar);
        }
        if (this.f5872g == -9223372036854775807L) {
            return m36306b(gVar);
        }
        if (!this.f5869d) {
            return m36300h(gVar, qVar);
        }
        long j = this.f5871f;
        if (j == -9223372036854775807L) {
            return m36306b(gVar);
        }
        long b = this.f5866a.m38052b(this.f5872g) - this.f5866a.m38052b(j);
        this.f5873h = b;
        if (b < 0) {
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Invalid duration: ");
            sb2.append(b);
            sb2.append(". Using TIME_UNSET instead.");
            C1230s.m37881i("PsDurationReader", sb2.toString());
            this.f5873h = -9223372036854775807L;
        }
        return m36306b(gVar);
    }

    public final int m36300h(AbstractC8959g gVar, C8971q qVar) {
        int min = (int) Math.min(20000L, gVar.mo6046a());
        long j = 0;
        if (gVar.mo6043r() != j) {
            qVar.f28857a = j;
            return 1;
        }
        this.f5867b.m38148L(min);
        gVar.mo10809m();
        gVar.mo10806q(this.f5867b.m38139d(), 0, min);
        this.f5871f = m36299i(this.f5867b);
        this.f5869d = true;
        return 0;
    }

    public final long m36299i(C1189b0 b0Var) {
        int f = b0Var.m38137f();
        for (int e = b0Var.m38138e(); e < f - 3; e++) {
            if (m36302f(b0Var.m38139d(), e) == 442) {
                b0Var.m38144P(e + 4);
                long l = m36296l(b0Var);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int m36298j(AbstractC8959g gVar, C8971q qVar) {
        long a = gVar.mo6046a();
        int min = (int) Math.min(20000L, a);
        long j = a - min;
        if (gVar.mo6043r() != j) {
            qVar.f28857a = j;
            return 1;
        }
        this.f5867b.m38148L(min);
        gVar.mo10809m();
        gVar.mo10806q(this.f5867b.m38139d(), 0, min);
        this.f5872g = m36297k(this.f5867b);
        this.f5870e = true;
        return 0;
    }

    public final long m36297k(C1189b0 b0Var) {
        int e = b0Var.m38138e();
        for (int f = b0Var.m38137f() - 4; f >= e; f--) {
            if (m36302f(b0Var.m38139d(), f) == 442) {
                b0Var.m38144P(f + 4);
                long l = m36296l(b0Var);
                if (l != -9223372036854775807L) {
                    return l;
                }
            }
        }
        return -9223372036854775807L;
    }
}
