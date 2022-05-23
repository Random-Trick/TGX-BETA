package j$.util.stream;

import java.util.Arrays;

public final class C0308d1 extends C0303c1 implements F0 {
    public C0308d1(long j10) {
        super(j10);
    }

    @Override
    public final K0 mo32b() {
        if (this.f14723b >= this.f14722a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f14723b), Integer.valueOf(this.f14722a.length)));
    }

    @Override
    public final void c(double d10) {
        int i10 = this.f14723b;
        double[] dArr = this.f14722a;
        if (i10 < dArr.length) {
            this.f14723b = i10 + 1;
            dArr[i10] = d10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.f14722a.length)));
    }

    @Override
    public final void d(int i10) {
        E0.p();
        throw null;
    }

    @Override
    public final void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public final void h() {
        if (this.f14723b < this.f14722a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f14723b), Integer.valueOf(this.f14722a.length)));
        }
    }

    @Override
    public final void k(long j10) {
        if (j10 == this.f14722a.length) {
            this.f14723b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j10), Integer.valueOf(this.f14722a.length)));
    }

    @Override
    public final void l(Object obj) {
        y((Double) obj);
    }

    @Override
    public final String toString() {
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(this.f14722a.length - this.f14723b), Arrays.toString(this.f14722a));
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void y(Double d10) {
        E0.j(this, d10);
    }
}
