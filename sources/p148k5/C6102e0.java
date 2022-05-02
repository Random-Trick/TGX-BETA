package p148k5;

import javax.annotation.concurrent.GuardedBy;
import p118i5.C5217a;
import p163l5.AbstractC6325c;

public final class C6102e0 extends AbstractC6165s0 {
    public final AbstractC6325c.AbstractC6328c f19349b;

    public C6102e0(C6107f0 f0Var, AbstractC6161r0 r0Var, AbstractC6325c.AbstractC6328c cVar) {
        super(r0Var);
        this.f19349b = cVar;
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21084a() {
        this.f19349b.mo20623b(new C5217a(16, null));
    }
}
