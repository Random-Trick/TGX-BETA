package j$.util.stream;

import j$.util.F;
import j$.util.H;
import j$.util.W;
import j$.util.function.Consumer;
import j$.util.function.n;
import j$.util.function.o;
import java.util.Arrays;

public class C0348l1 implements M0 {
    final int[] f14805a;
    int f14806b;

    public C0348l1(long j10) {
        if (j10 < 2147483639) {
            this.f14805a = new int[(int) j10];
            this.f14806b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public C0348l1(int[] iArr) {
        this.f14805a = iArr;
        this.f14806b = iArr.length;
    }

    @Override
    public final void a(Consumer consumer) {
        E0.z(this, consumer);
    }

    @Override
    public final long count() {
        return this.f14806b;
    }

    @Override
    public final P0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final void j(Object obj, int i10) {
        System.arraycopy(this.f14805a, 0, (int[]) obj, i10, this.f14806b);
    }

    @Override
    public final Object m() {
        int[] iArr = this.f14805a;
        int length = iArr.length;
        int i10 = this.f14806b;
        return length == i10 ? iArr : Arrays.copyOf(iArr, i10);
    }

    @Override
    public final void n(Object obj) {
        n nVar = (n) obj;
        for (int i10 = 0; i10 < this.f14806b; i10++) {
            nVar.d(this.f14805a[i10]);
        }
    }

    @Override
    public final void o(Integer[] numArr, int i10) {
        E0.u(this, numArr, i10);
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        o((Integer[]) objArr, i10);
    }

    @Override
    public final int s() {
        return 0;
    }

    @Override
    public final F mo31spliterator() {
        return W.k(this.f14805a, 0, this.f14806b);
    }

    public String toString() {
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(this.f14805a.length - this.f14806b), Arrays.toString(this.f14805a));
    }

    @Override
    public final Object[] v(o oVar) {
        return E0.r(this, oVar);
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.C(this, j10, j11);
    }

    @Override
    public final H mo31spliterator() {
        return W.k(this.f14805a, 0, this.f14806b);
    }
}
