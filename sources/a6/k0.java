package a6;

import com.google.android.gms.location.LocationRequest;
import g6.e;
import k5.f;
import l5.j;

public final class k0 extends m0 {
    public final LocationRequest f567t;
    public final e f568u;

    public k0(o0 o0Var, f fVar, LocationRequest locationRequest, e eVar) {
        super(fVar);
        this.f567t = locationRequest;
        this.f568u = eVar;
    }

    @Override
    public final void q(t tVar) {
        tVar.p0(this.f567t, j.a(this.f568u, c0.b(), e.class.getSimpleName()), new n0(this));
    }
}
