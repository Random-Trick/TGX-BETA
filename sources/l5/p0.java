package l5;

import java.lang.ref.WeakReference;

public final class p0 extends h1 {
    public final WeakReference<q0> f16183a;

    public p0(q0 q0Var) {
        this.f16183a = new WeakReference<>(q0Var);
    }

    @Override
    public final void a() {
        q0 q0Var = this.f16183a.get();
        if (q0Var != null) {
            q0.u(q0Var);
        }
    }
}
