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

    public void mo22129k(Long l) {
        AbstractC5572D0.m22417l(this, l);
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
        if (this.f18263a) {
            this.f18263a = false;
        } else {
            j = this.f18265c.mo22223l(this.f18264b, j);
        }
        this.f18264b = j;
    }

    @Override
    public Object get() {
        return this.f18263a ? C5549m.m22466a() : C5549m.m22463d(this.f18264b);
    }

    @Override
    public void mo22133h() {
    }

    @Override
    public void mo22132j(long j) {
        this.f18263a = true;
        this.f18264b = 0L;
    }

    @Override
    public void mo22347s(AbstractC5670Y1 y1) {
        C5666X1 x1 = (C5666X1) y1;
        if (!x1.f18263a) {
            mo22134e(x1.f18264b);
        }
    }

    @Override
    public boolean mo22131t() {
        return false;
    }
}
