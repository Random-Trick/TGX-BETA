package p126j$.util.stream;

import java.util.Arrays;
import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5482V;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.Consumer;

public class C5773t1 implements AbstractC5622N0 {
    final long[] f18475a;
    int f18476b;

    public C5773t1(long j) {
        if (j < 2147483639) {
            this.f18475a = new long[(int) j];
            this.f18476b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public C5773t1(long[] jArr) {
        this.f18475a = jArr;
        this.f18476b = jArr.length;
    }

    @Override
    public void mo22177a(Consumer consumer) {
        AbstractC5572D0.m22403u(this, consumer);
    }

    @Override
    public long count() {
        return this.f18476b;
    }

    @Override
    public AbstractC5627O0 mo22159f(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void mo22158i(Object obj, int i) {
        System.arraycopy(this.f18475a, 0, (long[]) obj, i, this.f18476b);
    }

    @Override
    public Object mo22157l() {
        long[] jArr = this.f18475a;
        int length = jArr.length;
        int i = this.f18476b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override
    public void mo22156m(Object obj) {
        AbstractC5535q qVar = (AbstractC5535q) obj;
        for (int i = 0; i < this.f18476b; i++) {
            qVar.mo22128e(this.f18475a[i]);
        }
    }

    @Override
    public int mo22154o() {
        return 0;
    }

    @Override
    public Object[] mo22153p(AbstractC5531m mVar) {
        return AbstractC5572D0.m22411o(this, mVar);
    }

    public void mo22155n(Long[] lArr, int i) {
        AbstractC5572D0.m22406r(this, lArr, i);
    }

    @Override
    public AbstractC5466E mo42632spliterator() {
        return AbstractC5482V.m22589l(this.f18475a, 0, this.f18476b, 1040);
    }

    public String toString() {
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(this.f18475a.length - this.f18476b), Arrays.toString(this.f18475a));
    }

    public AbstractC5622N0 mo22152q(long j, long j2, AbstractC5531m mVar) {
        return AbstractC5572D0.m22400x(this, j, j2);
    }

    @Override
    public AbstractC5468G mo42632spliterator() {
        return AbstractC5482V.m22589l(this.f18475a, 0, this.f18476b, 1040);
    }
}
