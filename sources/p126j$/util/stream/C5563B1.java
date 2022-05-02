package p126j$.util.stream;

import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.Consumer;

public final class C5563B1 extends C5680a3 implements AbstractC5632P0, AbstractC5592H0 {
    @Override
    public void mo22176a(Consumer consumer) {
        super.mo22176a(consumer);
    }

    @Override
    public AbstractC5632P0 mo42630b() {
        return this;
    }

    @Override
    public void mo22135c(double d) {
        AbstractC5572D0.m22421i();
        throw null;
    }

    @Override
    public void mo22134d(int i) {
        AbstractC5572D0.m22414m();
        throw null;
    }

    @Override
    public void mo22133e(long j) {
        AbstractC5572D0.m22412n();
        throw null;
    }

    @Override
    public AbstractC5632P0 mo22158f(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void mo22132h() {
    }

    @Override
    public void mo22131j(long j) {
        clear();
        m22316v(j);
    }

    @Override
    public void mo22128k(Object obj) {
        super.mo22128k(obj);
    }

    @Override
    public void mo22154n(Object[] objArr, int i) {
        super.mo22154n(objArr, i);
    }

    @Override
    public int mo22153o() {
        return 0;
    }

    @Override
    public Object[] mo22152p(AbstractC5531m mVar) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) mVar.mo22178w((int) count);
            mo22154n(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public AbstractC5632P0 mo22151q(long j, long j2, AbstractC5531m mVar) {
        return AbstractC5572D0.m22398y(this, j, j2, mVar);
    }

    @Override
    public AbstractC5468G mo42629spliterator() {
        return super.mo42629spliterator();
    }

    @Override
    public boolean mo22130t() {
        return false;
    }
}
