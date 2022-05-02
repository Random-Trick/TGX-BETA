package p355z3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p199o3.C7614g0;
import p270t3.C8972r;

public final class C11244h implements AbstractC11242g {
    public final long[] f36000a;
    public final long[] f36001b;
    public final long f36002c;
    public final long f36003d;

    public C11244h(long[] jArr, long[] jArr2, long j, long j2) {
        this.f36000a = jArr;
        this.f36001b = jArr2;
        this.f36002c = j;
        this.f36003d = j2;
    }

    public static C11244h m1130a(long j, long j2, C7614g0.C7615a aVar, C1189b0 b0Var) {
        int i;
        b0Var.m38146Q(10);
        int n = b0Var.m38132n();
        if (n <= 0) {
            return null;
        }
        int i2 = aVar.f24375d;
        long y0 = C1216l0.m37940y0(n, 1000000 * (i2 >= 32000 ? 1152 : 576), i2);
        int J = b0Var.m38153J();
        int J2 = b0Var.m38153J();
        int J3 = b0Var.m38153J();
        b0Var.m38146Q(2);
        long j3 = j2 + aVar.f24374c;
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        int i3 = 0;
        long j4 = j2;
        while (i3 < J) {
            int i4 = J2;
            long j5 = j3;
            jArr[i3] = (i3 * y0) / J;
            jArr2[i3] = Math.max(j4, j5);
            if (J3 == 1) {
                i = b0Var.m38159D();
            } else if (J3 == 2) {
                i = b0Var.m38153J();
            } else if (J3 == 3) {
                i = b0Var.m38156G();
            } else if (J3 != 4) {
                return null;
            } else {
                i = b0Var.m38155H();
            }
            j4 += i * i4;
            i3++;
            j3 = j5;
            J2 = i4;
        }
        if (!(j == -1 || j == j4)) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("VBRI data size mismatch: ");
            sb2.append(j);
            sb2.append(", ");
            sb2.append(j4);
            C1230s.m37884i("VbriSeeker", sb2.toString());
        }
        return new C11244h(jArr, jArr2, y0, j4);
    }

    @Override
    public long mo1127c() {
        return this.f36003d;
    }

    @Override
    public long mo1126d() {
        return this.f36002c;
    }

    @Override
    public boolean mo1125g() {
        return true;
    }

    @Override
    public long mo1124h(long j) {
        return this.f36000a[C1216l0.m37973i(this.f36001b, j, true, true)];
    }

    @Override
    public AbstractC3470g.C3471a mo1123i(long j) {
        int i = C1216l0.m37973i(this.f36000a, j, true, true);
        C8972r rVar = new C8972r(this.f36000a[i], this.f36001b[i]);
        if (rVar.f28862a >= j || i == this.f36000a.length - 1) {
            return new AbstractC3470g.C3471a(rVar);
        }
        int i2 = i + 1;
        return new AbstractC3470g.C3471a(rVar, new C8972r(this.f36000a[i2], this.f36001b[i2]));
    }
}
