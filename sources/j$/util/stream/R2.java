package j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

final class R2 extends F2 {
    private Object[] f14613d;
    private int f14614e;

    public R2(AbstractC0378r2 r2Var, Comparator comparator) {
        super(r2Var, comparator);
    }

    @Override
    public final void h() {
        int i10 = 0;
        Arrays.sort(this.f14613d, 0, this.f14614e, this.f14528b);
        this.f14822a.k(this.f14614e);
        if (!this.f14529c) {
            while (i10 < this.f14614e) {
                this.f14822a.l(this.f14613d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f14614e && !this.f14822a.u()) {
                this.f14822a.l(this.f14613d[i10]);
                i10++;
            }
        }
        this.f14822a.h();
        this.f14613d = null;
    }

    @Override
    public final void k(long j10) {
        if (j10 < 2147483639) {
            this.f14613d = new Object[(int) j10];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public final void l(Object obj) {
        Object[] objArr = this.f14613d;
        int i10 = this.f14614e;
        this.f14614e = i10 + 1;
        objArr[i10] = obj;
    }
}
