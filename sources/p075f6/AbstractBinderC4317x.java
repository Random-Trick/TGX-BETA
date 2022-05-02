package p075f6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p357z5.BinderC11318u;
import p357z5.C11290d0;

public abstract class AbstractBinderC4317x extends BinderC11318u implements AbstractC4318y {
    public AbstractBinderC4317x() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static AbstractC4318y m28284s(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof AbstractC4318y) {
            return (AbstractC4318y) queryLocalInterface;
        }
        return new C4316w(iBinder);
    }

    @Override
    public final boolean mo898q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo928L((LocationResult) C11290d0.m947b(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo927g0((LocationAvailability) C11290d0.m947b(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
