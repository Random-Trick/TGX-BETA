package p355z3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p199o3.C7614g0;
import p270t3.C8972r;

public final class C11245i implements AbstractC11242g {
    public final long f36001a;
    public final int f36002b;
    public final long f36003c;
    public final long f36004d;
    public final long f36005e;
    public final long[] f36006f;

    public C11245i(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public static C11245i m1129a(long j, long j2, C7614g0.C7615a aVar, C1189b0 b0Var) {
        int H;
        int i = aVar.f24375g;
        int i2 = aVar.f24372d;
        int n = b0Var.m38129n();
        if ((n & 1) != 1 || (H = b0Var.m38152H()) == 0) {
            return null;
        }
        long y0 = C1216l0.m37937y0(H, i * 1000000, i2);
        if ((n & 6) != 6) {
            return new C11245i(j2, aVar.f24371c, y0);
        }
        long F = b0Var.m38154F();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = b0Var.m38156D();
        }
        if (j != -1) {
            long j3 = j2 + F;
            if (j != j3) {
                StringBuilder sb2 = new StringBuilder(67);
                sb2.append("XING data size mismatch: ");
                sb2.append(j);
                sb2.append(", ");
                sb2.append(j3);
                C1230s.m37881i("XingSeeker", sb2.toString());
            }
        }
        return new C11245i(j2, aVar.f24371c, y0, F, jArr);
    }

    public final long m1128b(int i) {
        return (this.f36003c * i) / 100;
    }

    @Override
    public long mo1127c() {
        return this.f36005e;
    }

    @Override
    public long mo1126d() {
        return this.f36003c;
    }

    @Override
    public boolean mo1125g() {
        return this.f36006f != null;
    }

    @Override
    public long mo1124h(long j) {
        long j2 = j - this.f36001a;
        if (!mo1125g() || j2 <= this.f36002b) {
            return 0L;
        }
        long[] jArr = (long[]) C1186a.m38182h(this.f36006f);
        double d = (j2 * 256.0d) / this.f36004d;
        int i = C1216l0.m37970i(jArr, (long) d, true, true);
        long b = m1128b(i);
        long j3 = jArr[i];
        int i2 = i + 1;
        long b2 = m1128b(i2);
        long j4 = i == 99 ? 256L : jArr[i2];
        return b + Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (b2 - b));
    }

    @Override
    public AbstractC3470g.C3471a mo1123i(long j) {
        long[] jArr;
        if (!mo1125g()) {
            return new AbstractC3470g.C3471a(new C8972r(0L, this.f36001a + this.f36002b));
        }
        long q = C1216l0.m37954q(j, 0L, this.f36003c);
        double d = (q * 100.0d) / this.f36003c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) C1186a.m38182h(this.f36006f))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        return new AbstractC3470g.C3471a(new C8972r(q, this.f36001a + C1216l0.m37954q(Math.round((d2 / 256.0d) * this.f36004d), this.f36002b, this.f36004d - 1)));
    }

    public C11245i(long j, int i, long j2, long j3, long[] jArr) {
        this.f36001a = j;
        this.f36002b = i;
        this.f36003c = j2;
        this.f36006f = jArr;
        this.f36004d = j3;
        this.f36005e = j3 != -1 ? j + j3 : -1L;
    }
}
