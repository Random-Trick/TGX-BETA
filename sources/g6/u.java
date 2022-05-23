package g6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class u extends a6.u implements v {
    public static v r(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof v) {
            return (v) queryLocalInterface;
        }
        return new t(iBinder);
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
