package p126j$.util.stream;

import java.util.Arrays;
import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5468G;
import p126j$.util.AbstractC5482V;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.Consumer;

public class C5728k1 implements AbstractC5612L0 {
    final int[] f18411a;
    int f18412b;

    public C5728k1(long j) {
        if (j < 2147483639) {
            this.f18411a = new int[(int) j];
            this.f18412b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public C5728k1(int[] iArr) {
        this.f18411a = iArr;
        this.f18412b = iArr.length;
    }

    @Override
    public void mo22176a(Consumer consumer) {
        AbstractC5572D0.m22403t(this, consumer);
    }

    @Override
    public long count() {
        return this.f18412b;
    }

    @Override
    public AbstractC5627O0 mo22158f(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void mo22157i(Object obj, int i) {
        System.arraycopy(this.f18411a, 0, (int[]) obj, i, this.f18412b);
    }

    @Override
    public Object mo22156l() {
        int[] iArr = this.f18411a;
        int length = iArr.length;
        int i = this.f18412b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override
    public void mo22155m(Object obj) {
        AbstractC5530l lVar = (AbstractC5530l) obj;
        for (int i = 0; i < this.f18412b; i++) {
            lVar.mo22144d(this.f18411a[i]);
        }
    }

    @Override
    public int mo22153o() {
        return 0;
    }

    @Override
    public Object[] mo22152p(AbstractC5531m mVar) {
        return AbstractC5572D0.m22410o(this, mVar);
    }

    public void mo22154n(Integer[] numArr, int i) {
        AbstractC5572D0.m22406q(this, numArr, i);
    }

    @Override
    public AbstractC5466E mo42629spliterator() {
        return AbstractC5482V.m22589k(this.f18411a, 0, this.f18412b, 1040);
    }

    public String toString() {
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(this.f18411a.length - this.f18412b), Arrays.toString(this.f18411a));
    }

    public AbstractC5612L0 mo22151q(long j, long j2, AbstractC5531m mVar) {
        return AbstractC5572D0.m22400w(this, j, j2);
    }

    @Override
    public AbstractC5468G mo42629spliterator() {
        return AbstractC5482V.m22589k(this.f18411a, 0, this.f18412b, 1040);
    }
}
