package v9;

import ra.k;
import v9.b;
import v9.j;

public abstract class c<D, C extends b> implements j<D, C, D, C> {
    public C f24788b;

    @Override
    public void a() {
        j.a.b(this);
    }

    public void b(C c10) {
        k.e(c10, "<set-?>");
        this.f24788b = c10;
    }

    @Override
    public void d(C c10) {
        k.e(c10, "next");
        b(c10);
    }

    @Override
    public C f() {
        C c10 = this.f24788b;
        if (c10 == null) {
            k.n("channel");
        }
        return c10;
    }
}
