package p103h6;

import android.os.Parcel;
import p007a6.BinderC0189b;

public abstract class AbstractBinderC4998f0 extends BinderC0189b implements AbstractC5000g0 {
    public AbstractBinderC4998f0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override
    public final boolean mo24286q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo24338c0(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
