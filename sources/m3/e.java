package m3;

import m3.o3;

public abstract class e implements s2 {
    public final o3.d f16628a = new o3.d();

    @Override
    @Deprecated
    public final int C() {
        return Z();
    }

    @Override
    public final boolean D() {
        o3 R = R();
        return !R.u() && R.r(I(), this.f16628a).Q;
    }

    @Override
    public final boolean F() {
        return Y() != -1;
    }

    @Override
    @Deprecated
    public final int K() {
        return Y();
    }

    @Override
    public final void L(int i10, int i11) {
        if (i10 != i11) {
            M(i10, i10 + 1, i11);
        }
    }

    @Override
    public final boolean N() {
        o3 R = R();
        return !R.u() && R.r(I(), this.f16628a).R;
    }

    @Override
    public final boolean W() {
        o3 R = R();
        return !R.u() && R.r(I(), this.f16628a).h();
    }

    public final long X() {
        o3 R = R();
        if (R.u()) {
            return -9223372036854775807L;
        }
        return R.r(I(), this.f16628a).f();
    }

    public final int Y() {
        o3 R = R();
        if (R.u()) {
            return -1;
        }
        return R.i(I(), a0(), S());
    }

    public final int Z() {
        o3 R = R();
        if (R.u()) {
            return -1;
        }
        return R.p(I(), a0(), S());
    }

    public final int a0() {
        int Q = Q();
        if (Q == 1) {
            return 0;
        }
        return Q;
    }

    @Override
    public final void c(long j10) {
        j(I(), j10);
    }

    @Override
    public final boolean n() {
        return Z() != -1;
    }

    @Override
    public final void r(int i10) {
        u(i10, i10 + 1);
    }

    @Override
    public final int s() {
        return R().t();
    }

    @Override
    @Deprecated
    public final int v() {
        return I();
    }

    @Override
    public final void y(int i10) {
        j(i10, -9223372036854775807L);
    }
}
