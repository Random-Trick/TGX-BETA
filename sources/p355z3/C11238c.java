package p355z3;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.AbstractC3470g;
import p020b5.C1216l0;
import p147k4.C6072k;
import p270t3.C8972r;

public final class C11238c implements AbstractC11242g {
    public final long[] f35970a;
    public final long[] f35971b;
    public final long f35972c;

    public C11238c(long[] jArr, long[] jArr2, long j) {
        this.f35970a = jArr;
        this.f35971b = jArr2;
        this.f35972c = j == -9223372036854775807L ? C1216l0.m37953q0(jArr2[jArr2.length - 1]) : j;
    }

    public static C11238c m1158a(long j, C6072k kVar, long j2) {
        int length = kVar.f19294N.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += kVar.f19297c + kVar.f19294N[i3];
            j3 += kVar.f19293M + kVar.f19295O[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C11238c(jArr, jArr2, j2);
    }

    public static Pair<Long, Long> m1157b(long j, long[] jArr, long[] jArr2) {
        int i = C1216l0.m37970i(jArr, j, true, true);
        long j2 = jArr[i];
        long j3 = jArr2[i];
        int i2 = i + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i2];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i2] - j3))) + j3));
    }

    @Override
    public long mo1127c() {
        return -1L;
    }

    @Override
    public long mo1126d() {
        return this.f35972c;
    }

    @Override
    public boolean mo1125g() {
        return true;
    }

    @Override
    public long mo1124h(long j) {
        return C1216l0.m37953q0(((Long) m1157b(j, this.f35970a, this.f35971b).second).longValue());
    }

    @Override
    public AbstractC3470g.C3471a mo1123i(long j) {
        Pair<Long, Long> b = m1157b(C1216l0.m38006H0(C1216l0.m37954q(j, 0L, this.f35972c)), this.f35971b, this.f35970a);
        return new AbstractC3470g.C3471a(new C8972r(C1216l0.m37953q0(((Long) b.first).longValue()), ((Long) b.second).longValue()));
    }
}
