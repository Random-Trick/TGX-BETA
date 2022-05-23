package a6;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import g6.d;
import g6.g;
import g6.s0;
import k5.f;
import l5.i;
import m5.e;
import m5.r;
import r5.b;

public final class t extends f0 {
    public final r f583t0;

    public t(Context context, Looper looper, f.b bVar, f.c cVar, String str, e eVar) {
        super(context, looper, bVar, cVar, str, eVar);
        this.f583t0 = new r(context, this.f560s0);
    }

    @Override
    public final boolean U() {
        return true;
    }

    @Override
    public final void k() {
        synchronized (this.f583t0) {
            if (a()) {
                try {
                    this.f583t0.h();
                    this.f583t0.i();
                } catch (Exception e10) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e10);
                }
            }
            super.k();
        }
    }

    public final void o0(v vVar, i<d> iVar, g gVar) {
        synchronized (this.f583t0) {
            this.f583t0.d(vVar, iVar, gVar);
        }
    }

    public final void p0(LocationRequest locationRequest, i<g6.e> iVar, g gVar) {
        synchronized (this.f583t0) {
            this.f583t0.c(locationRequest, iVar, gVar);
        }
    }

    public final void q0(i.a<g6.e> aVar, g gVar) {
        this.f583t0.e(aVar, gVar);
    }

    public final void r0(i.a<d> aVar, g gVar) {
        this.f583t0.f(aVar, gVar);
    }

    public final void s0(g gVar, l5.d<g6.i> dVar, String str) {
        v();
        boolean z10 = true;
        r.b(gVar != null, "locationSettingsRequest can't be null nor empty.");
        if (dVar == null) {
            z10 = false;
        }
        r.b(z10, "listener can't be null.");
        ((i) G()).x1(gVar, new s(dVar), null);
    }

    public final Location t0(String str) {
        if (b.b(q(), s0.f12148c)) {
            return this.f583t0.a(str);
        }
        return this.f583t0.b();
    }
}
