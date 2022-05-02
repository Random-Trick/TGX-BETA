package p126j$.util.stream;

import p126j$.util.AbstractC5468G;

abstract class AbstractC5668Y implements AbstractC5625N3, AbstractC5630O3 {
    private final boolean f18266a;

    public AbstractC5668Y(boolean z) {
        this.f18266a = z;
    }

    @Override
    public int mo22321a() {
        if (this.f18266a) {
            return 0;
        }
        return EnumC5705f3.f18368r;
    }

    public void mo22135c(double d) {
        AbstractC5572D0.m22421i();
        throw null;
    }

    public void mo22134d(int i) {
        AbstractC5572D0.m22414m();
        throw null;
    }

    public void mo22133e(long j) {
        AbstractC5572D0.m22412n();
        throw null;
    }

    @Override
    public Object mo22319f(AbstractC5572D0 d0, AbstractC5468G g) {
        (this.f18266a ? new C5672Z(d0, g, this) : new C5677a0(d0, g, d0.mo22299r0(this))).invoke();
        return null;
    }

    @Override
    public Object mo22318g(AbstractC5572D0 d0, AbstractC5468G g) {
        AbstractC5686c cVar = (AbstractC5686c) d0;
        cVar.mo22306M(cVar.mo22299r0(this), g);
        return null;
    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public void mo22132h() {
    }

    @Override
    public void mo22131j(long j) {
    }

    @Override
    public boolean mo22130t() {
        return false;
    }
}
