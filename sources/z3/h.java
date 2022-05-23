package z3;

import c5.b0;
import c5.l0;
import c5.s;
import com.google.android.exoplayer2.extractor.g;
import o3.h0;
import t3.r;

public final class h implements g {
    public final long[] f26871a;
    public final long[] f26872b;
    public final long f26873c;
    public final long f26874d;

    public h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f26871a = jArr;
        this.f26872b = jArr2;
        this.f26873c = j10;
        this.f26874d = j11;
    }

    public static h a(long j10, long j11, h0.a aVar, b0 b0Var) {
        int i10;
        b0Var.Q(10);
        int n10 = b0Var.n();
        if (n10 <= 0) {
            return null;
        }
        int i11 = aVar.f18809d;
        long z02 = l0.z0(n10, 1000000 * (i11 >= 32000 ? 1152 : 576), i11);
        int J = b0Var.J();
        int J2 = b0Var.J();
        int J3 = b0Var.J();
        b0Var.Q(2);
        long j12 = j11 + aVar.f18808c;
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        int i12 = 0;
        long j13 = j11;
        while (i12 < J) {
            int i13 = J2;
            long j14 = j12;
            jArr[i12] = (i12 * z02) / J;
            jArr2[i12] = Math.max(j13, j14);
            if (J3 == 1) {
                i10 = b0Var.D();
            } else if (J3 == 2) {
                i10 = b0Var.J();
            } else if (J3 == 3) {
                i10 = b0Var.G();
            } else if (J3 != 4) {
                return null;
            } else {
                i10 = b0Var.H();
            }
            j13 += i10 * i13;
            i12++;
            j12 = j14;
            J2 = i13;
        }
        if (!(j10 == -1 || j10 == j13)) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("VBRI data size mismatch: ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j13);
            s.i("VbriSeeker", sb2.toString());
        }
        return new h(jArr, jArr2, z02, j13);
    }

    @Override
    public long c() {
        return this.f26874d;
    }

    @Override
    public long d() {
        return this.f26873c;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public long h(long j10) {
        return this.f26871a[l0.i(this.f26872b, j10, true, true)];
    }

    @Override
    public g.a i(long j10) {
        int i10 = l0.i(this.f26871a, j10, true, true);
        r rVar = new r(this.f26871a[i10], this.f26872b[i10]);
        if (rVar.f22901a >= j10 || i10 == this.f26871a.length - 1) {
            return new g.a(rVar);
        }
        int i11 = i10 + 1;
        return new g.a(rVar, new r(this.f26871a[i11], this.f26872b[i11]));
    }
}
