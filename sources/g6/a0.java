package g6;

import a6.d0;
import a6.u;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a0 extends u implements b0 {
    public a0() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static b0 r(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof b0) {
            return (b0) queryLocalInterface;
        }
        return new z(iBinder);
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        D((Location) d0.b(parcel, Location.CREATOR));
        return true;
    }
}
