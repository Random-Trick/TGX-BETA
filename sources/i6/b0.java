package i6;

import android.os.Parcel;
import b6.b;

public abstract class b0 extends b implements c0 {
    public b0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
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
