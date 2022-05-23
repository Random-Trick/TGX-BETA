package m3;

import c5.a;
import c5.l0;

public final class g3 {
    public static final g3 f16666c;
    public static final g3 f16667d = new g3(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final g3 f16668e = new g3(Long.MAX_VALUE, 0);
    public static final g3 f16669f = new g3(0, Long.MAX_VALUE);
    public static final g3 f16670g;
    public final long f16671a;
    public final long f16672b;

    static {
        g3 g3Var = new g3(0L, 0L);
        f16666c = g3Var;
        f16670g = g3Var;
    }

    public g3(long j10, long j11) {
        boolean z10 = true;
        a.a(j10 >= 0);
        a.a(j11 < 0 ? false : z10);
        this.f16671a = j10;
        this.f16672b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f16671a;
        if (j13 == 0 && this.f16672b == 0) {
            return j10;
        }
        long D0 = l0.D0(j10, j13, Long.MIN_VALUE);
        long b10 = l0.b(j10, this.f16672b, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = D0 <= j11 && j11 <= b10;
        if (D0 > j12 || j12 > b10) {
            z10 = false;
        }
        return (!z11 || !z10) ? z11 ? j11 : z10 ? j12 : D0 : Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g3.class != obj.getClass()) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return this.f16671a == g3Var.f16671a && this.f16672b == g3Var.f16672b;
    }

    public int hashCode() {
        return (((int) this.f16671a) * 31) + ((int) this.f16672b);
    }
}
