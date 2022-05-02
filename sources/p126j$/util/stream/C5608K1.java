package p126j$.util.stream;

import p126j$.util.C5547k;
import p126j$.util.function.AbstractC5523e;

class C5608K1 implements AbstractC5670Y1, AbstractC5744n2 {
    private boolean f18173a;
    private double f18174b;
    final AbstractC5523e f18175c;

    public C5608K1(AbstractC5523e eVar) {
        this.f18175c = eVar;
    }

    public void mo22129k(Double d) {
        AbstractC5572D0.m22420j(this, d);
    }

    @Override
    public void mo22136c(double d) {
        if (this.f18173a) {
            this.f18173a = false;
        } else {
            d = this.f18175c.mo22232m(this.f18174b, d);
        }
        this.f18174b = d;
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
    public Object get() {
        return this.f18173a ? C5547k.m22474a() : C5547k.m22471d(this.f18174b);
    }

    @Override
    public void mo22133h() {
    }

    @Override
    public void mo22132j(long j) {
        this.f18173a = true;
        this.f18174b = 0.0d;
    }

    @Override
    public void mo22347s(AbstractC5670Y1 y1) {
        C5608K1 k1 = (C5608K1) y1;
        if (!k1.f18173a) {
            mo22136c(k1.f18174b);
        }
    }

    @Override
    public boolean mo22131t() {
        return false;
    }
}
