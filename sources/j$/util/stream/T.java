package j$.util.stream;

abstract class T implements P3 {
    boolean f14627a;
    Object f14628b;

    @Override
    public void c(double d10) {
        E0.i();
        throw null;
    }

    @Override
    public void d(int i10) {
        E0.p();
        throw null;
    }

    @Override
    public void e(long j10) {
        E0.q();
        throw null;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void k(long j10) {
    }

    @Override
    public final void y(Object obj) {
        if (!this.f14627a) {
            this.f14627a = true;
            this.f14628b = obj;
        }
    }

    @Override
    public final boolean u() {
        return this.f14627a;
    }
}
