package p103h6;

import android.os.Parcel;
import p007a6.BinderC0189b;
import p272t5.AbstractC8983b;

public abstract class AbstractBinderC5005l extends BinderC0189b implements AbstractC5006m {
    public AbstractBinderC5005l() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    @Override
    public final boolean mo24286q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo24335b1(AbstractC8983b.AbstractBinderC8984a.m10768s(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
