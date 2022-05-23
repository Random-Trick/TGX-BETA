package c4;

import c5.b0;
import c5.i0;
import c5.l0;
import c5.s;
import t3.g;
import t3.q;

public final class y {
    public boolean f4785c;
    public boolean f4786d;
    public boolean f4787e;
    public final i0 f4783a = new i0(0);
    public long f4788f = -9223372036854775807L;
    public long f4789g = -9223372036854775807L;
    public long f4790h = -9223372036854775807L;
    public final b0 f4784b = new b0();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(b0 b0Var) {
        int e10 = b0Var.e();
        if (b0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        b0Var.j(bArr, 0, 9);
        b0Var.P(e10);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return m(bArr);
    }

    public static long m(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public final int b(g gVar) {
        this.f4784b.M(l0.f4846f);
        this.f4785c = true;
        gVar.m();
        return 0;
    }

    public long c() {
        return this.f4790h;
    }

    public i0 d() {
        return this.f4783a;
    }

    public boolean e() {
        return this.f4785c;
    }

    public final int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public int g(g gVar, q qVar) {
        if (!this.f4787e) {
            return j(gVar, qVar);
        }
        if (this.f4789g == -9223372036854775807L) {
            return b(gVar);
        }
        if (!this.f4786d) {
            return h(gVar, qVar);
        }
        long j10 = this.f4788f;
        if (j10 == -9223372036854775807L) {
            return b(gVar);
        }
        long b10 = this.f4783a.b(this.f4789g) - this.f4783a.b(j10);
        this.f4790h = b10;
        if (b10 < 0) {
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Invalid duration: ");
            sb2.append(b10);
            sb2.append(". Using TIME_UNSET instead.");
            s.i("PsDurationReader", sb2.toString());
            this.f4790h = -9223372036854775807L;
        }
        return b(gVar);
    }

    public final int h(g gVar, q qVar) {
        int min = (int) Math.min(20000L, gVar.a());
        long j10 = 0;
        if (gVar.r() != j10) {
            qVar.f22899a = j10;
            return 1;
        }
        this.f4784b.L(min);
        gVar.m();
        gVar.q(this.f4784b.d(), 0, min);
        this.f4788f = i(this.f4784b);
        this.f4786d = true;
        return 0;
    }

    public final long i(b0 b0Var) {
        int f10 = b0Var.f();
        for (int e10 = b0Var.e(); e10 < f10 - 3; e10++) {
            if (f(b0Var.d(), e10) == 442) {
                b0Var.P(e10 + 4);
                long l10 = l(b0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(g gVar, q qVar) {
        long a10 = gVar.a();
        int min = (int) Math.min(20000L, a10);
        long j10 = a10 - min;
        if (gVar.r() != j10) {
            qVar.f22899a = j10;
            return 1;
        }
        this.f4784b.L(min);
        gVar.m();
        gVar.q(this.f4784b.d(), 0, min);
        this.f4789g = k(this.f4784b);
        this.f4787e = true;
        return 0;
    }

    public final long k(b0 b0Var) {
        int e10 = b0Var.e();
        for (int f10 = b0Var.f() - 4; f10 >= e10; f10--) {
            if (f(b0Var.d(), f10) == 442) {
                b0Var.P(f10 + 4);
                long l10 = l(b0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }
}
