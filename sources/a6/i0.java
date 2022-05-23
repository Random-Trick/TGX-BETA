package a6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import g6.u;
import g6.v;
import n5.a;
import n5.c;

public final class i0 extends a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();
    public final g M;
    public final int f564a;
    public final g0 f565b;
    public final v f566c;

    public i0(int i10, g0 g0Var, IBinder iBinder, IBinder iBinder2) {
        this.f564a = i10;
        this.f565b = g0Var;
        g gVar = null;
        this.f566c = iBinder == null ? null : u.r(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof g) {
                gVar = (g) queryLocalInterface;
            } else {
                gVar = new e(iBinder2);
            }
        }
        this.M = gVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f564a);
        c.o(parcel, 2, this.f565b, i10, false);
        v vVar = this.f566c;
        IBinder iBinder = null;
        c.j(parcel, 3, vVar == null ? null : vVar.asBinder(), false);
        g gVar = this.M;
        if (gVar != null) {
            iBinder = gVar.asBinder();
        }
        c.j(parcel, 4, iBinder, false);
        c.b(parcel, a10);
    }
}
