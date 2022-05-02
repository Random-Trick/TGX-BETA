package p357z5;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p075f6.AbstractBinderC4317x;
import p075f6.AbstractC4278d;
import p148k5.C6120i;

public final class BinderC11309n extends AbstractBinderC4317x {
    public final C6120i<AbstractC4278d> f36223a;

    public BinderC11309n(C6120i<AbstractC4278d> iVar) {
        this.f36223a = iVar;
    }

    @Override
    public final void mo928L(LocationResult locationResult) {
        this.f36223a.m21260c(new C11305l(this, locationResult));
    }

    @Override
    public final void mo927g0(LocationAvailability locationAvailability) {
        this.f36223a.m21260c(new C11307m(this, locationAvailability));
    }

    public final synchronized void m926h() {
        this.f36223a.m21262a();
    }
}
