package p148k5;

import java.lang.ref.WeakReference;
import p149k6.BinderC6199d;
import p149k6.C6207l;

public final class BinderC6123i0 extends BinderC6199d {
    public final WeakReference<C6135l0> f19418a;

    public BinderC6123i0(C6135l0 l0Var) {
        this.f19418a = new WeakReference<>(l0Var);
    }

    @Override
    public final void mo21074r0(C6207l lVar) {
        C6173u0 u0Var;
        C6135l0 l0Var = this.f19418a.get();
        if (l0Var != null) {
            u0Var = l0Var.f19441a;
            u0Var.m21109k(new C6117h0(this, l0Var, l0Var, lVar));
        }
    }
}
