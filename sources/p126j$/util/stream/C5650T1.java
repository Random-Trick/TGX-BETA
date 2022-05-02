package p126j$.util.stream;

import p126j$.util.C5548l;
import p126j$.util.function.AbstractC5528j;

class C5650T1 implements AbstractC5670Y1, AbstractC5749o2 {
    private boolean f18242a;
    private int f18243b;
    final AbstractC5528j f18244c;

    public C5650T1(AbstractC5528j jVar) {
        this.f18244c = jVar;
    }

    public void mo22128k(Integer num) {
        AbstractC5572D0.m22417k(this, num);
    }

    @Override
    public void mo22135c(double d) {
        AbstractC5572D0.m22421i();
        throw null;
    }

    @Override
    public void mo22134d(int i) {
        if (this.f18242a) {
            this.f18242a = false;
        } else {
            i = this.f18244c.mo22223i(this.f18243b, i);
        }
        this.f18243b = i;
    }

    @Override
    public void mo22133e(long j) {
        AbstractC5572D0.m22412n();
        throw null;
    }

    @Override
    public Object get() {
        return this.f18242a ? C5548l.m22469a() : C5548l.m22466d(this.f18243b);
    }

    @Override
    public void mo22132h() {
    }

    @Override
    public void mo22131j(long j) {
        this.f18242a = true;
        this.f18243b = 0;
    }

    @Override
    public void mo22346s(AbstractC5670Y1 y1) {
        C5650T1 t1 = (C5650T1) y1;
        if (!t1.f18242a) {
            mo22134d(t1.f18243b);
        }
    }

    @Override
    public boolean mo22130t() {
        return false;
    }
}
