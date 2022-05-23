package zb;

import java.util.LinkedHashSet;
import java.util.Set;
import ra.k;
import ub.f0;

public final class i {
    public final Set<f0> f27130a = new LinkedHashSet();

    public final synchronized void a(f0 f0Var) {
        k.e(f0Var, "route");
        this.f27130a.remove(f0Var);
    }

    public final synchronized void b(f0 f0Var) {
        k.e(f0Var, "failedRoute");
        this.f27130a.add(f0Var);
    }

    public final synchronized boolean c(f0 f0Var) {
        k.e(f0Var, "route");
        return this.f27130a.contains(f0Var);
    }
}
