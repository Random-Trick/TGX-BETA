package j$.util.stream;

import j$.util.C0285m;
import j$.util.function.l;

final class U1 implements Z1, AbstractC0369p2 {
    private boolean f14637a;
    private int f14638b;
    final l f14639c;

    public U1(l lVar) {
        this.f14639c = lVar;
    }

    @Override
    public final void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public final void d(int i10) {
        if (this.f14637a) {
            this.f14637a = false;
        } else {
            i10 = this.f14639c.i(this.f14638b, i10);
        }
        this.f14638b = i10;
    }

    @Override
    public final void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public final Object get() {
        return this.f14637a ? C0285m.a() : C0285m.d(this.f14638b);
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
        this.f14637a = true;
        this.f14638b = 0;
    }

    @Override
    public final void l(Object obj) {
        p((Integer) obj);
    }

    @Override
    public final void p(Integer num) {
        E0.l(this, num);
    }

    @Override
    public final void t(Z1 z12) {
        U1 u12 = (U1) z12;
        if (!u12.f14637a) {
            d(u12.f14638b);
        }
    }

    @Override
    public final boolean u() {
        return false;
    }
}
