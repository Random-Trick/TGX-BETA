package p126j$.util.stream;

import p126j$.util.C5549m;
import p126j$.util.function.AbstractC5533o;

class C5666X1 implements AbstractC5670Y1, AbstractC5754p2 {
    private boolean f18263a;
    private long f18264b;
    final AbstractC5533o f18265c;

    public C5666X1(AbstractC5533o oVar) {
        this.f18265c = oVar;
    }

    public void mo22128k(Long l) {
        AbstractC5572D0.m22416l(this, l);
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
        if (this.f18263a) {
            this.f18263a = false;
        } else {
            j = this.f18265c.mo22222l(this.f18264b, j);
        }
        this.f18264b = j;
    }

    @Override
    public Object get() {
        return this.f18263a ? C5549m.m22465a() : C5549m.m22462d(this.f18264b);
    }

    @Override
    public void mo22132h() {
    }

    @Override
    public void mo22131j(long j) {
        this.f18263a = true;
        this.f18264b = 0L;
    }

    @Override
    public void mo22346s(AbstractC5670Y1 y1) {
        C5666X1 x1 = (C5666X1) y1;
        if (!x1.f18263a) {
            mo22133e(x1.f18264b);
        }
    }

    @Override
    public boolean mo22130t() {
        return false;
    }
}
