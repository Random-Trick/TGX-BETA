package j$.util.stream;

import java.util.Arrays;

final class Q2 extends E2 {
    private long[] f14606c;
    private int f14607d;

    public Q2(AbstractC0378r2 r2Var) {
        super(r2Var);
    }

    @Override
    public final void e(long j10) {
        long[] jArr = this.f14606c;
        int i10 = this.f14607d;
        this.f14607d = i10 + 1;
        jArr[i10] = j10;
    }

    @Override
    public final void h() {
        int i10 = 0;
        Arrays.sort(this.f14606c, 0, this.f14607d);
        this.f14819a.k(this.f14607d);
        if (!this.f14520b) {
            while (i10 < this.f14607d) {
                this.f14819a.e(this.f14606c[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f14607d && !this.f14819a.u()) {
                this.f14819a.e(this.f14606c[i10]);
                i10++;
            }
        }
        this.f14819a.h();
        this.f14606c = null;
    }

    @Override
    public final void k(long j10) {
        if (j10 < 2147483639) {
            this.f14606c = new long[(int) j10];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
