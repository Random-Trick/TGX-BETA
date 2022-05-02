package p126j$.util.stream;

import p126j$.util.AbstractC5466E;
import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.Consumer;

public final class C5669Y0 extends AbstractC5673Z0 implements AbstractC5622N0 {
    public C5669Y0(AbstractC5622N0 n0, AbstractC5622N0 n02) {
        super(n0, n02);
    }

    @Override
    public void mo22177a(Consumer consumer) {
        AbstractC5572D0.m22403u(this, consumer);
    }

    public void mo22155n(Long[] lArr, int i) {
        AbstractC5572D0.m22406r(this, lArr, i);
    }

    public long[] mo22348g(int i) {
        return new long[i];
    }

    public AbstractC5622N0 mo22152q(long j, long j2, AbstractC5531m mVar) {
        return AbstractC5572D0.m22400x(this, j, j2);
    }

    @Override
    public AbstractC5466E mo42632spliterator() {
        return new C5753p1(this);
    }

    @Override
    public AbstractC5468G mo42632spliterator() {
        return new C5753p1(this);
    }
}
