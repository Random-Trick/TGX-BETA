package m5;

import android.os.Bundle;
import android.os.Parcel;
import y5.b;
import y5.c;

public abstract class w0 extends b implements m {
    public w0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.b(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            j(parcel.readInt(), (Bundle) c.b(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            E0(parcel.readInt(), parcel.readStrongBinder(), (h1) c.b(parcel, h1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
