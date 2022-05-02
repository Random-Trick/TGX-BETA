package p148k5;

import java.lang.ref.WeakReference;

public final class C6152p0 extends AbstractC6118h1 {
    public final WeakReference<C6156q0> f19496a;

    public C6152p0(C6156q0 q0Var) {
        this.f19496a = new WeakReference<>(q0Var);
    }

    @Override
    public final void mo21104a() {
        C6156q0 q0Var = this.f19496a.get();
        if (q0Var != null) {
            C6156q0.m21163u(q0Var);
        }
    }
}
