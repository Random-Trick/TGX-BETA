package l5;

import java.lang.ref.WeakReference;
import l6.d;
import l6.l;

public final class i0 extends d {
    public final WeakReference<l0> f16114a;

    public i0(l0 l0Var) {
        this.f16114a = new WeakReference<>(l0Var);
    }

    @Override
    public final void u(l lVar) {
        u0 u0Var;
        l0 l0Var = this.f16114a.get();
        if (l0Var != null) {
            u0Var = l0Var.f16128a;
            u0Var.k(new h0(this, l0Var, l0Var, lVar));
        }
    }
}
