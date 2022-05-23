package g6;

import a6.d0;
import a6.u;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract class x extends u implements y {
    public x() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static y r(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof y) {
            return (y) queryLocalInterface;
        }
        return new w(iBinder);
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            L((LocationResult) d0.b(parcel, LocationResult.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            j0((LocationAvailability) d0.b(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
