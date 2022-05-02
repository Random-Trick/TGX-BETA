package p126j$.util.stream;

import java.util.Arrays;
import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5482V;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.Consumer;

public class C5683b1 implements AbstractC5602J0 {
    final double[] f18315a;
    int f18316b;

    public C5683b1(long j) {
        if (j < 2147483639) {
            this.f18315a = new double[(int) j];
            this.f18316b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public C5683b1(double[] dArr) {
        this.f18315a = dArr;
        this.f18316b = dArr.length;
    }

    @Override
    public void mo22177a(Consumer consumer) {
        AbstractC5572D0.m22405s(this, consumer);
    }

    @Override
    public long count() {
        return this.f18316b;
    }

    @Override
    public AbstractC5627O0 mo22159f(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void mo22158i(Object obj, int i) {
        System.arraycopy(this.f18315a, 0, (double[]) obj, i, this.f18316b);
    }

    @Override
    public Object mo22157l() {
        double[] dArr = this.f18315a;
        int length = dArr.length;
        int i = this.f18316b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override
    public void mo22156m(Object obj) {
        AbstractC5525g gVar = (AbstractC5525g) obj;
        for (int i = 0; i < this.f18316b; i++) {
            gVar.mo22151c(this.f18315a[i]);
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

    public void mo22155n(Double[] dArr, int i) {
        AbstractC5572D0.m22409p(this, dArr, i);
    }

    @Override
    public AbstractC5466E mo42632spliterator() {
        return AbstractC5482V.m22591j(this.f18315a, 0, this.f18316b, 1040);
    }

    public String toString() {
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(this.f18315a.length - this.f18316b), Arrays.toString(this.f18315a));
    }

    public AbstractC5602J0 mo22152q(long j, long j2, AbstractC5531m mVar) {
        return AbstractC5572D0.m22402v(this, j, j2);
    }

    @Override
    public AbstractC5468G mo42632spliterator() {
        return AbstractC5482V.m22591j(this.f18315a, 0, this.f18316b, 1040);
    }
}
