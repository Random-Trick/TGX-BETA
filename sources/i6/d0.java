package i6;

import android.os.Parcel;
import b6.b;

public abstract class d0 extends b implements e0 {
    public d0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
