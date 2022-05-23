package a6;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import g6.a0;
import g6.b0;
import g6.y;
import n5.a;
import n5.c;

public final class x extends a {
    public static final Parcelable.Creator<x> CREATOR = new y();
    public final PendingIntent M;
    public final y N;
    public final g O;
    public final int f587a;
    public final v f588b;
    public final b0 f589c;

    public x(int i10, v vVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f587a = i10;
        this.f588b = vVar;
        g gVar = null;
        this.f589c = iBinder == null ? null : a0.r(iBinder);
        this.M = pendingIntent;
        this.N = iBinder2 == null ? null : g6.x.r(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof g) {
                gVar = (g) queryLocalInterface;
            } else {
                gVar = new e(iBinder3);
            }
        }
        this.O = gVar;
    }

    public static x b(b0 b0Var, g gVar) {
        if (gVar == null) {
            gVar = null;
        }
        return new x(2, null, b0Var, null, null, gVar);
    }

    public static x c(y yVar, g gVar) {
        if (gVar == null) {
            gVar = null;
        }
        return new x(2, null, null, null, yVar, gVar);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f587a);
        c.o(parcel, 2, this.f588b, i10, false);
        b0 b0Var = this.f589c;
        IBinder iBinder = null;
        c.j(parcel, 3, b0Var == null ? null : b0Var.asBinder(), false);
        c.o(parcel, 4, this.M, i10, false);
        y yVar = this.N;
        c.j(parcel, 5, yVar == null ? null : yVar.asBinder(), false);
        g gVar = this.O;
        if (gVar != null) {
            iBinder = gVar.asBinder();
        }
        c.j(parcel, 6, iBinder, false);
        c.b(parcel, a10);
    }
}
