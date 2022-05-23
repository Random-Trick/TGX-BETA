package a6;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import g6.g;

public final class h extends a implements i {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override
    public final void B1(boolean z10) {
        Parcel q10 = q();
        d0.a(q10, z10);
        t(12, q10);
    }

    @Override
    public final void H(x xVar) {
        Parcel q10 = q();
        d0.c(q10, xVar);
        t(59, q10);
    }

    @Override
    public final Location Q0() {
        Parcel r10 = r(7, q());
        Location location = (Location) d0.b(r10, Location.CREATOR);
        r10.recycle();
        return location;
    }

    @Override
    public final void X0(i0 i0Var) {
        Parcel q10 = q();
        d0.c(q10, i0Var);
        t(75, q10);
    }

    @Override
    public final Location p0(String str) {
        Parcel q10 = q();
        q10.writeString(str);
        Parcel r10 = r(80, q10);
        Location location = (Location) d0.b(r10, Location.CREATOR);
        r10.recycle();
        return location;
    }

    @Override
    public final void x1(g gVar, k kVar, String str) {
        Parcel q10 = q();
        d0.c(q10, gVar);
        d0.d(q10, kVar);
        q10.writeString(null);
        t(63, q10);
    }
}
