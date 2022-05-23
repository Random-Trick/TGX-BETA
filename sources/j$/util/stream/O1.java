package j$.util.stream;

import j$.util.C0282j;
import j$.util.function.AbstractC0275c;

final class O1 implements Z1 {
    private boolean f14592a;
    private Object f14593b;
    final AbstractC0275c f14594c;

    public O1(AbstractC0275c cVar) {
        this.f14594c = cVar;
    }

    @Override
    public final void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public final void d(int i10) {
        E0.p();
        throw null;
    }

    @Override
    public final void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public final Object get() {
        return this.f14592a ? C0282j.a() : C0282j.d(this.f14593b);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        this.f14592a = true;
        this.f14593b = null;
    }

    @Override
    public final void l(Object obj) {
        if (this.f14592a) {
            this.f14592a = false;
        } else {
            obj = this.f14594c.v(this.f14593b, obj);
        }
        this.f14593b = obj;
    }

    @Override
    public final void t(Z1 z12) {
        O1 o12 = (O1) z12;
        if (!o12.f14592a) {
            l(o12.f14593b);
        }
    }

    @Override
    public final boolean u() {
        return false;
    }
}
