package j$.util.stream;

import java.util.Arrays;

final class I2 extends E2 {
    private Y2 f14546c;

    public I2(AbstractC0378r2 r2Var) {
        super(r2Var);
    }

    @Override
    public final void e(long j10) {
        this.f14546c.e(j10);
    }

    @Override
    public final void h() {
        long[] jArr = (long[]) this.f14546c.m();
        Arrays.sort(jArr);
        this.f14819a.k(jArr.length);
        int i10 = 0;
        if (!this.f14520b) {
            int length = jArr.length;
            while (i10 < length) {
                this.f14819a.e(jArr[i10]);
                i10++;
            }
        } else {
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                if (this.f14819a.u()) {
                    break;
                }
                this.f14819a.e(j10);
                i10++;
            }
        }
        this.f14819a.h();
    }

    @Override
    public final void k(long j10) {
        if (j10 < 2147483639) {
            this.f14546c = j10 > 0 ? new Y2((int) j10) : new Y2();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
