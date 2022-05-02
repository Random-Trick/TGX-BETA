package p357z5;

import android.location.Location;
import p075f6.AbstractBinderC4273a0;
import p075f6.AbstractC4280e;
import p148k5.C6120i;

public final class BinderC11314q extends AbstractBinderC4273a0 {
    public final C6120i<AbstractC4280e> f36223a;

    public BinderC11314q(C6120i<AbstractC4280e> iVar) {
        this.f36223a = iVar;
    }

    @Override
    public final synchronized void mo918F(Location location) {
        this.f36223a.m21259c(new C11313p(this, location));
    }

    public final synchronized void m917h() {
        this.f36223a.m21261a();
    }
}
