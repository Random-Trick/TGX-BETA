package p126j$.util.stream;

import p126j$.util.C5546j;
import p126j$.util.function.AbstractC5521c;

class C5623N1 implements AbstractC5670Y1 {
    private boolean f18197a;
    private Object f18198b;
    final AbstractC5521c f18199c;

    public C5623N1(AbstractC5521c cVar) {
        this.f18199c = cVar;
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
    public Object get() {
        return this.f18197a ? C5546j.m22477a() : C5546j.m22474d(this.f18198b);
    }

    @Override
    public void mo22132h() {
    }

    @Override
    public void mo22131j(long j) {
        this.f18197a = true;
        this.f18198b = null;
    }

    @Override
    public void mo22128k(Object obj) {
        if (this.f18197a) {
            this.f18197a = false;
        } else {
            obj = this.f18199c.mo22172u(this.f18198b, obj);
        }
        this.f18198b = obj;
    }

    @Override
    public void mo22346s(AbstractC5670Y1 y1) {
        C5623N1 n1 = (C5623N1) y1;
        if (!n1.f18197a) {
            mo22128k(n1.f18198b);
        }
    }

    @Override
    public boolean mo22130t() {
        return false;
    }
}
