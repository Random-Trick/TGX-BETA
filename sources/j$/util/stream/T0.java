package j$.util.stream;

import j$.util.H;
import j$.util.W;
import j$.util.function.Consumer;
import j$.util.function.o;
import java.util.Arrays;

public class T0 implements Q0 {
    final Object[] f14629a;
    int f14630b;

    public T0(long j10, o oVar) {
        if (j10 < 2147483639) {
            this.f14629a = (Object[]) oVar.z((int) j10);
            this.f14630b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public T0(Object[] objArr) {
        this.f14629a = objArr;
        this.f14630b = objArr.length;
    }

    @Override
    public final void a(Consumer consumer) {
        for (int i10 = 0; i10 < this.f14630b; i10++) {
            consumer.l(this.f14629a[i10]);
        }
    }

    @Override
    public final long count() {
        return this.f14630b;
    }

    @Override
    public final Q0 f(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public final void q(Object[] objArr, int i10) {
        System.arraycopy(this.f14629a, 0, objArr, i10, this.f14630b);
    }

    @Override
    public final int s() {
        return 0;
    }

    @Override
    public final H mo31spliterator() {
        return W.m(this.f14629a, 0, this.f14630b);
    }

    public String toString() {
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(this.f14629a.length - this.f14630b), Arrays.toString(this.f14629a));
    }

    @Override
    public final Object[] v(o oVar) {
        Object[] objArr = this.f14629a;
        if (objArr.length == this.f14630b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Q0 w(long j10, long j11, o oVar) {
        return E0.E(this, j10, j11, oVar);
    }
}
