package i6;

import android.os.Parcel;
import b6.b;
import b6.c;
import b6.h;

public abstract class j extends b implements k {
    public j() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        boolean f12 = f1(h.r(parcel.readStrongBinder()));
        parcel2.writeNoException();
        c.b(parcel2, f12);
        return true;
    }
}
