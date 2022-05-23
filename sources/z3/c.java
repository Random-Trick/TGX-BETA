package z3;

import android.util.Pair;
import c5.l0;
import com.google.android.exoplayer2.extractor.g;
import k4.k;
import t3.r;

public final class c implements g {
    public final long[] f26844a;
    public final long[] f26845b;
    public final long f26846c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f26844a = jArr;
        this.f26845b = jArr2;
        this.f26846c = j10 == -9223372036854775807L ? l0.r0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, k kVar, long j11) {
        int length = kVar.N.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += kVar.f15651c + kVar.N[i12];
            j12 += kVar.M + kVar.O[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    public static Pair<Long, Long> b(long j10, long[] jArr, long[] jArr2) {
        int i10 = l0.i(jArr, j10, true, true);
        long j11 = jArr[i10];
        long j12 = jArr2[i10];
        int i11 = i10 + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i11];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i11] - j12))) + j12));
    }

    @Override
    public long c() {
        return -1L;
    }

    @Override
    public long d() {
        return this.f26846c;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public long h(long j10) {
        return l0.r0(((Long) b(j10, this.f26844a, this.f26845b).second).longValue());
    }

    @Override
    public g.a i(long j10) {
        Pair<Long, Long> b10 = b(l0.I0(l0.q(j10, 0L, this.f26846c)), this.f26845b, this.f26844a);
        return new g.a(new r(l0.r0(((Long) b10.first).longValue()), ((Long) b10.second).longValue()));
    }
}
