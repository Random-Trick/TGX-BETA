package p075f6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p357z5.BinderC11318u;

public class BinderC4313u extends BinderC11318u implements AbstractC4315v {
    public static AbstractC4315v m28287s(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof AbstractC4315v) {
            return (AbstractC4315v) queryLocalInterface;
        }
        return new C4311t(iBinder);
    }

    @Override
    public final boolean mo898q(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }
}
