package p357z5;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import p075f6.AbstractC4278d;
import p075f6.AbstractC4280e;
import p075f6.C4284g;
import p075f6.C4289i;
import p075f6.C4310s0;
import p133j5.AbstractC5867f;
import p148k5.AbstractC6096d;
import p148k5.C6120i;
import p163l5.C6336e;
import p163l5.C6378r;
import p232q5.C8242b;

public final class C11317t extends C11294f0 {
    public final C11315r f36231t0;

    public C11317t(Context context, Looper looper, AbstractC5867f.AbstractC5869b bVar, AbstractC5867f.AbstractC5870c cVar, String str, C6336e eVar) {
        super(context, looper, bVar, cVar, str, eVar);
        this.f36231t0 = new C11315r(context, this.f36205s0);
    }

    @Override
    public final boolean mo906U() {
        return true;
    }

    @Override
    public final void mo905j() {
        synchronized (this.f36231t0) {
            if (m20649a()) {
                try {
                    this.f36231t0.m909h();
                    this.f36231t0.m908i();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo905j();
        }
    }

    public final void m904o0(C11319v vVar, C6120i<AbstractC4278d> iVar, AbstractC11295g gVar) {
        synchronized (this.f36231t0) {
            this.f36231t0.m913d(vVar, iVar, gVar);
        }
    }

    public final void m903p0(LocationRequest locationRequest, C6120i<AbstractC4280e> iVar, AbstractC11295g gVar) {
        synchronized (this.f36231t0) {
            this.f36231t0.m914c(locationRequest, iVar, gVar);
        }
    }

    public final void m902q0(C6120i.C6121a<AbstractC4280e> aVar, AbstractC11295g gVar) {
        this.f36231t0.m912e(aVar, gVar);
    }

    public final void m901r0(C6120i.C6121a<AbstractC4278d> aVar, AbstractC11295g gVar) {
        this.f36231t0.m911f(aVar, gVar);
    }

    public final void m900s0(C4284g gVar, AbstractC6096d<C4289i> dVar, String str) {
        m20624v();
        boolean z = true;
        C6378r.m20515b(gVar != null, "locationSettingsRequest can't be null nor empty.");
        if (dVar == null) {
            z = false;
        }
        C6378r.m20515b(z, "listener can't be null.");
        ((AbstractC11299i) m20665G()).mo933Z(gVar, new BinderC11316s(dVar), null);
    }

    public final Location m899t0(String str) {
        if (C8242b.m13055b(m20629q(), C4310s0.f14379c)) {
            return this.f36231t0.m916a(str);
        }
        return this.f36231t0.m915b();
    }
}
