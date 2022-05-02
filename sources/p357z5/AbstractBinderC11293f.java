package p357z5;

import android.os.Parcel;

public abstract class AbstractBinderC11293f extends BinderC11318u implements AbstractC11295g {
    public AbstractBinderC11293f() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override
    public final boolean mo898q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo925J0((C11285b) C11290d0.m947b(parcel, C11285b.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo924h();
        }
        return true;
    }
}
