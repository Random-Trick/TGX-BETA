package a6;

import android.location.Location;
import g6.e;
import l5.i;

public final class p implements i.b<e> {
    public final Location f574a;

    public p(q qVar, Location location) {
        this.f574a = location;
    }

    @Override
    public final void a(e eVar) {
        eVar.onLocationChanged(this.f574a);
    }

    @Override
    public final void b() {
    }
}
