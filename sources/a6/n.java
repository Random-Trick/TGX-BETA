package a6;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import g6.d;
import g6.x;
import l5.i;

public final class n extends x {
    public final i<d> f572a;

    public n(i<d> iVar) {
        this.f572a = iVar;
    }

    @Override
    public final void L(LocationResult locationResult) {
        this.f572a.c(new l(this, locationResult));
    }

    public final synchronized void h() {
        this.f572a.a();
    }

    @Override
    public final void j0(LocationAvailability locationAvailability) {
        this.f572a.c(new m(this, locationAvailability));
    }
}
