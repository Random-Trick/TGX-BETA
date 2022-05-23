package l5;

import j5.a;
import javax.annotation.concurrent.GuardedBy;

public final class d0 extends s0 {
    public final a f16055b;
    public final f0 f16056c;

    public d0(f0 f0Var, r0 r0Var, a aVar) {
        super(r0Var);
        this.f16056c = f0Var;
        this.f16055b = aVar;
    }

    @Override
    @GuardedBy("mLock")
    public final void a() {
        this.f16056c.f16085c.n(this.f16055b);
    }
}
