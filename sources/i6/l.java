package i6;

import android.os.Parcel;
import b6.b;
import u5.b;

public abstract class l extends b implements m {
    public l() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        S0(b.a.r(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
