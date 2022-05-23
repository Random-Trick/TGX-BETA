package j$.util.stream;

import j$.util.function.AbstractC0278f;

public final class C0375q3 implements AbstractC0364o2 {
    public final int f14844a;
    public final Object f14845b;

    public C0375q3(Object obj, int i10) {
        this.f14844a = i10;
        this.f14845b = obj;
    }

    @Override
    public final void c(double d10) {
        switch (this.f14844a) {
            case 0:
                ((AbstractC0278f) this.f14845b).c(d10);
                return;
            default:
                ((U2) this.f14845b).c(d10);
                return;
        }
    }

    @Override
    public final void d(int i10) {
        switch (this.f14844a) {
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
        switch (this.f14844a) {
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
        switch (this.f14844a) {
            case 0:
                y((Double) obj);
                return;
            default:
                y((Double) obj);
                return;
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void y(Double d10) {
        switch (this.f14844a) {
            case 0:
                E0.j(this, d10);
                return;
            default:
                E0.j(this, d10);
                return;
        }
    }
}
