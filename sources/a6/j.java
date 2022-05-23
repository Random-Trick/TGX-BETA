package a6;

import android.os.Parcel;
import g6.i;

public abstract class j extends u implements k {
    public j() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        T((i) d0.b(parcel, i.CREATOR));
        return true;
    }
}
