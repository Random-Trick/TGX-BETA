package p289u9;

import p289u9.AbstractC9461b;
import p289u9.AbstractC9480j;
import qa.C8298k;

public abstract class AbstractC9463c<D, C extends AbstractC9461b> implements AbstractC9480j<D, C, D, C> {
    public C f30690b;

    @Override
    public void mo5861a() {
        AbstractC9480j.C9481a.m8556b(this);
    }

    public void m8579b(C c) {
        C8298k.m12933e(c, "<set-?>");
        this.f30690b = c;
    }

    @Override
    public C mo5860e() {
        C c = this.f30690b;
        if (c == null) {
            C8298k.m12924n("channel");
        }
        return c;
    }

    @Override
    public void mo5856i(C c) {
        C8298k.m12933e(c, "next");
        m8579b(c);
    }
}
