package j$.util.stream;

import j$.util.F;
import j$.util.H;
import j$.util.W;
import j$.util.function.AbstractC0278f;
import j$.util.function.Consumer;
import j$.util.function.o;
import java.util.Arrays;

public class C0303c1 implements K0 {
    final double[] f14722a;
    int f14723b;

    public C0303c1(long j10) {
        if (j10 < 2147483639) {
            this.f14722a = new double[(int) j10];
            this.f14723b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public C0303c1(double[] dArr) {
        this.f14722a = dArr;
        this.f14723b = dArr.length;
    }

    @Override
    public final void a(Consumer consumer) {
        E0.y(this, consumer);
    }

    @Override
    public final long count() {
        return this.f14723b;
    }

    @Override
    public final P0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final void i(Double[] dArr, int i10) {
        E0.s(this, dArr, i10);
    }

    @Override
    public final void j(Object obj, int i10) {
        System.arraycopy(this.f14722a, 0, (double[]) obj, i10, this.f14723b);
    }

    @Override
    public final Object m() {
        double[] dArr = this.f14722a;
        int length = dArr.length;
        int i10 = this.f14723b;
        return length == i10 ? dArr : Arrays.copyOf(dArr, i10);
    }

    @Override
    public final void n(Object obj) {
        AbstractC0278f fVar = (AbstractC0278f) obj;
        for (int i10 = 0; i10 < this.f14723b; i10++) {
            fVar.c(this.f14722a[i10]);
        }
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        i((Double[]) objArr, i10);
    }

    @Override
    public final int s() {
        return 0;
    }

    @Override
    public final F mo31spliterator() {
        return W.j(this.f14722a, 0, this.f14723b);
    }

    public String toString() {
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(this.f14722a.length - this.f14723b), Arrays.toString(this.f14722a));
    }

    @Override
    public final Object[] v(o oVar) {
        return E0.r(this, oVar);
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.B(this, j10, j11);
    }

    @Override
    public final H mo31spliterator() {
        return W.j(this.f14722a, 0, this.f14723b);
    }
}
