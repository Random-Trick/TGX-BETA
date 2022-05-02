package p075f6;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p357z5.BinderC11318u;
import p357z5.C11290d0;

public abstract class AbstractBinderC4273a0 extends BinderC11318u implements AbstractC4275b0 {
    public AbstractBinderC4273a0() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static AbstractC4275b0 m28309s(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof AbstractC4275b0) {
            return (AbstractC4275b0) queryLocalInterface;
        }
        return new C4319z(iBinder);
    }

    @Override
    public final boolean mo898q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo918F((Location) C11290d0.m947b(parcel, Location.CREATOR));
        return true;
    }
}
