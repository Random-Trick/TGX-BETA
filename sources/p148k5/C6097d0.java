package p148k5;

import javax.annotation.concurrent.GuardedBy;
import p118i5.C5217a;

public final class C6097d0 extends AbstractC6165s0 {
    public final C5217a f19343b;
    public final C6107f0 f19344c;

    public C6097d0(C6107f0 f0Var, AbstractC6161r0 r0Var, C5217a aVar) {
        super(r0Var);
        this.f19344c = f0Var;
        this.f19343b = aVar;
    }

    @Override
    @GuardedBy("mLock")
    public final void mo21084a() {
        this.f19344c.f19388c.m21217n(this.f19343b);
    }
}
