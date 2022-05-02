package p348yb;

import java.util.LinkedHashSet;
import java.util.Set;
import p278tb.C9085f0;
import qa.C8298k;

public final class C10494i {
    public final Set<C9085f0> f33643a = new LinkedHashSet();

    public final synchronized void m4942a(C9085f0 f0Var) {
        C8298k.m12934e(f0Var, "route");
        this.f33643a.remove(f0Var);
    }

    public final synchronized void m4941b(C9085f0 f0Var) {
        C8298k.m12934e(f0Var, "failedRoute");
        this.f33643a.add(f0Var);
    }

    public final synchronized boolean m4940c(C9085f0 f0Var) {
        C8298k.m12934e(f0Var, "route");
        return this.f33643a.contains(f0Var);
    }
}
