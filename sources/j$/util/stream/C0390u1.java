package j$.util.stream;

import j$.util.F;
import j$.util.H;
import j$.util.W;
import j$.util.function.Consumer;
import j$.util.function.o;
import j$.util.function.v;
import java.util.Arrays;

public class C0390u1 implements O0 {
    final long[] f14869a;
    int f14870b;

    public C0390u1(long j10) {
        if (j10 < 2147483639) {
            this.f14869a = new long[(int) j10];
            this.f14870b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public C0390u1(long[] jArr) {
        this.f14869a = jArr;
        this.f14870b = jArr.length;
    }

    @Override
    public final void a(Consumer consumer) {
        E0.A(this, consumer);
    }

    @Override
    public final long count() {
        return this.f14870b;
    }

    @Override
    public final P0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final void j(Object obj, int i10) {
        System.arraycopy(this.f14869a, 0, (long[]) obj, i10, this.f14870b);
    }

    @Override
    public final Object m() {
        long[] jArr = this.f14869a;
        int length = jArr.length;
        int i10 = this.f14870b;
        return length == i10 ? jArr : Arrays.copyOf(jArr, i10);
    }

    @Override
    public final void n(Object obj) {
        v vVar = (v) obj;
        for (int i10 = 0; i10 < this.f14870b; i10++) {
            vVar.e(this.f14869a[i10]);
        }
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        r((Long[]) objArr, i10);
    }

    @Override
    public final void r(Long[] lArr, int i10) {
        E0.w(this, lArr, i10);
    }

    @Override
    public final int s() {
        return 0;
    }

    @Override
    public final F mo31spliterator() {
        return W.l(this.f14869a, 0, this.f14870b);
    }

    public String toString() {
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(this.f14869a.length - this.f14870b), Arrays.toString(this.f14869a));
    }

    @Override
    public final Object[] v(o oVar) {
        return E0.r(this, oVar);
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.D(this, j10, j11);
    }

    @Override
    public final H mo31spliterator() {
        return W.l(this.f14869a, 0, this.f14870b);
    }
}
