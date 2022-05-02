package p126j$.util.stream;

import p126j$.util.AbstractC5468G;
import p126j$.util.function.AbstractC5531m;
import p126j$.util.function.Consumer;

public final class C5563B1 extends C5680a3 implements AbstractC5632P0, AbstractC5592H0 {
    @Override
    public void mo22177a(Consumer consumer) {
        super.mo22177a(consumer);
    }

    @Override
    public AbstractC5632P0 mo42633b() {
        return this;
    }

    @Override
    public void mo22136c(double d) {
        AbstractC5572D0.m22422i();
        throw null;
    }

    @Override
    public void mo22135d(int i) {
        AbstractC5572D0.m22415m();
        throw null;
    }

    @Override
    public void mo22134e(long j) {
        AbstractC5572D0.m22413n();
        throw null;
    }

    @Override
    public AbstractC5632P0 mo22159f(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void mo22133h() {
    }

    @Override
    public void mo22132j(long j) {
        clear();
        m22317v(j);
    }

    @Override
    public void mo22129k(Object obj) {
        super.mo22129k(obj);
    }

    @Override
    public void mo22155n(Object[] objArr, int i) {
        super.mo22155n(objArr, i);
    }

    @Override
    public int mo22154o() {
        return 0;
    }

    @Override
    public Object[] mo22153p(AbstractC5531m mVar) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) mVar.mo22179w((int) count);
            mo22155n(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override
    public AbstractC5632P0 mo22152q(long j, long j2, AbstractC5531m mVar) {
        return AbstractC5572D0.m22399y(this, j, j2, mVar);
    }

    @Override
    public AbstractC5468G mo42632spliterator() {
        return super.mo42632spliterator();
    }

    @Override
    public boolean mo22131t() {
        return false;
    }
}
