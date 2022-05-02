package p357z5;

import com.google.android.gms.location.LocationRequest;
import p075f6.AbstractC4280e;
import p133j5.AbstractC5867f;
import p148k5.C6126j;

public final class C11304k0 extends AbstractC11308m0 {
    public final LocationRequest f36218t;
    public final AbstractC4280e f36219u;

    public C11304k0(C11312o0 o0Var, AbstractC5867f fVar, LocationRequest locationRequest, AbstractC4280e eVar) {
        super(fVar);
        this.f36218t = locationRequest;
        this.f36219u = eVar;
    }

    @Override
    public final void mo930q(C11317t tVar) {
        tVar.m903p0(this.f36218t, C6126j.m21256a(this.f36219u, C11288c0.m949b(), AbstractC4280e.class.getSimpleName()), new BinderC11310n0(this));
    }
}
