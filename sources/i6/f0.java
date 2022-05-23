package i6;

import android.os.Parcel;
import b6.b;

public abstract class f0 extends b implements g0 {
    public f0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        c0(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
