package a6;

import android.os.Parcel;

public abstract class f extends u implements g {
    public f() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            R0((b) d0.b(parcel, b.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            h();
        }
        return true;
    }
}
