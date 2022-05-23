package z3;

import c5.a;
import c5.b0;
import c5.l0;
import c5.s;
import com.google.android.exoplayer2.extractor.g;
import o3.h0;
import t3.r;

public final class i implements g {
    public final long f26875a;
    public final int f26876b;
    public final long f26877c;
    public final long f26878d;
    public final long f26879e;
    public final long[] f26880f;

    public i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public static i a(long j10, long j11, h0.a aVar, b0 b0Var) {
        int H;
        int i10 = aVar.f18812g;
        int i11 = aVar.f18809d;
        int n10 = b0Var.n();
        if ((n10 & 1) != 1 || (H = b0Var.H()) == 0) {
            return null;
        }
        long z02 = l0.z0(H, i10 * 1000000, i11);
        if ((n10 & 6) != 6) {
            return new i(j11, aVar.f18808c, z02);
        }
        long F = b0Var.F();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = b0Var.D();
        }
        if (j10 != -1) {
            long j12 = j11 + F;
            if (j10 != j12) {
                StringBuilder sb2 = new StringBuilder(67);
                sb2.append("XING data size mismatch: ");
                sb2.append(j10);
                sb2.append(", ");
                sb2.append(j12);
                s.i("XingSeeker", sb2.toString());
            }
        }
        return new i(j11, aVar.f18808c, z02, F, jArr);
    }

    public final long b(int i10) {
        return (this.f26877c * i10) / 100;
    }

    @Override
    public long c() {
        return this.f26879e;
    }

    @Override
    public long d() {
        return this.f26877c;
    }

    @Override
    public boolean g() {
        return this.f26880f != null;
    }

    @Override
    public long h(long j10) {
        long j11 = j10 - this.f26875a;
        if (!g() || j11 <= this.f26876b) {
            return 0L;
        }
        long[] jArr = (long[]) a.h(this.f26880f);
        double d10 = (j11 * 256.0d) / this.f26878d;
        int i10 = l0.i(jArr, (long) d10, true, true);
        long b10 = b(i10);
        long j12 = jArr[i10];
        int i11 = i10 + 1;
        long b11 = b(i11);
        long j13 = i10 == 99 ? 256L : jArr[i11];
        return b10 + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (b11 - b10));
    }

    @Override
    public g.a i(long j10) {
        long[] jArr;
        if (!g()) {
            return new g.a(new r(0L, this.f26875a + this.f26876b));
        }
        long q10 = l0.q(j10, 0L, this.f26877c);
        double d10 = (q10 * 100.0d) / this.f26877c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) a.h(this.f26880f))[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        return new g.a(new r(q10, this.f26875a + l0.q(Math.round((d11 / 256.0d) * this.f26878d), this.f26876b, this.f26878d - 1)));
    }

    public i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f26875a = j10;
        this.f26876b = i10;
        this.f26877c = j11;
        this.f26880f = jArr;
        this.f26878d = j12;
        this.f26879e = j12 != -1 ? j10 + j12 : -1L;
    }
}
