package p357z5;

import android.location.Location;
import p075f6.AbstractC4280e;
import p148k5.C6120i;

public final class C11313p implements C6120i.AbstractC6122b<AbstractC4280e> {
    public final Location f36225a;

    public C11313p(BinderC11314q qVar, Location location) {
        this.f36225a = location;
    }

    @Override
    public final void mo920a(AbstractC4280e eVar) {
        eVar.onLocationChanged(this.f36225a);
    }

    @Override
    public final void mo919b() {
    }
}
