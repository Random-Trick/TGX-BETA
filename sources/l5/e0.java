package l5;

import j5.a;
import javax.annotation.concurrent.GuardedBy;
import m5.c;

public final class e0 extends s0 {
    public final c.AbstractC0154c f16061b;

    public e0(f0 f0Var, r0 r0Var, c.AbstractC0154c cVar) {
        super(r0Var);
        this.f16061b = cVar;
    }

    @Override
    @GuardedBy("mLock")
    public final void a() {
        this.f16061b.c(new a(16, null));
    }
}
