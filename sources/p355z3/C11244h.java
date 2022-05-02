package p355z3;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p199o3.C7614g0;
import p270t3.C8972r;

public final class C11244h implements AbstractC11242g {
    public final long[] f35997a;
    public final long[] f35998b;
    public final long f35999c;
    public final long f36000d;

    public C11244h(long[] jArr, long[] jArr2, long j, long j2) {
        this.f35997a = jArr;
        this.f35998b = jArr2;
        this.f35999c = j;
        this.f36000d = j2;
    }

    public static C11244h m1130a(long j, long j2, C7614g0.C7615a aVar, C1189b0 b0Var) {
        int i;
        b0Var.m38143Q(10);
        int n = b0Var.m38129n();
        if (n <= 0) {
            return null;
        }
        int i2 = aVar.f24372d;
        long y0 = C1216l0.m37937y0(n, 1000000 * (i2 >= 32000 ? 1152 : 576), i2);
        int J = b0Var.m38150J();
        int J2 = b0Var.m38150J();
        int J3 = b0Var.m38150J();
        b0Var.m38143Q(2);
        long j3 = j2 + aVar.f24371c;
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
                i = b0Var.m38156D();
            } else if (J3 == 2) {
                i = b0Var.m38150J();
            } else if (J3 == 3) {
                i = b0Var.m38153G();
            } else if (J3 != 4) {
                return null;
            } else {
                i = b0Var.m38152H();
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
            C1230s.m37881i("VbriSeeker", sb2.toString());
        }
        return new C11244h(jArr, jArr2, y0, j4);
    }

    @Override
    public long mo1127c() {
        return this.f36000d;
    }

    @Override
    public long mo1126d() {
        return this.f35999c;
    }

    @Override
    public boolean mo1125g() {
        return true;
    }

    @Override
    public long mo1124h(long j) {
        return this.f35997a[C1216l0.m37970i(this.f35998b, j, true, true)];
    }

    @Override
    public AbstractC3470g.C3471a mo1123i(long j) {
        int i = C1216l0.m37970i(this.f35997a, j, true, true);
        C8972r rVar = new C8972r(this.f35997a[i], this.f35998b[i]);
        if (rVar.f28859a >= j || i == this.f35997a.length - 1) {
            return new AbstractC3470g.C3471a(rVar);
        }
        int i2 = i + 1;
        return new AbstractC3470g.C3471a(rVar, new C8972r(this.f35997a[i2], this.f35998b[i2]));
    }
}
