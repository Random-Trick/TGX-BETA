package j$.util.stream;

import j$.util.function.Consumer;

public final class L3 implements AbstractC0378r2 {
    public final int f14571a;
    public final Object f14572b;

    public L3(Object obj, int i10) {
        this.f14571a = i10;
        this.f14572b = obj;
    }

    @Override
    public final void c(double d10) {
        switch (this.f14571a) {
            case 0:
                E0.i();
                throw null;
            default:
                E0.i();
                throw null;
        }
    }

    @Override
    public final void d(int i10) {
        switch (this.f14571a) {
            case 0:
                E0.p();
                throw null;
            default:
                E0.p();
                throw null;
        }
    }

    @Override
    public final void e(long j10) {
        switch (this.f14571a) {
            case 0:
                E0.q();
                throw null;
            default:
                E0.q();
                throw null;
        }
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
    }

    @Override
    public final void l(Object obj) {
        switch (this.f14571a) {
            case 0:
                ((Consumer) this.f14572b).l(obj);
                return;
            default:
                ((C0300b3) this.f14572b).l(obj);
                return;
        }
    }

    @Override
    public final boolean u() {
        return false;
    }
}
