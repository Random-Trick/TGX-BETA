package a6;

import android.location.Location;
import g6.a0;
import g6.e;
import l5.i;

public final class q extends a0 {
    public final i<e> f575a;

    public q(i<e> iVar) {
        this.f575a = iVar;
    }

    @Override
    public final synchronized void D(Location location) {
        this.f575a.c(new p(this, location));
    }

    public final synchronized void h() {
        this.f575a.a();
    }
}
