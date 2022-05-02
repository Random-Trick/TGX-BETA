package p163l5;

import android.os.Bundle;
import android.os.Parcel;
import p327x5.BinderC10098b;
import p327x5.C10099c;

public abstract class AbstractBinderC6394w0 extends BinderC10098b implements AbstractC6362m {
    public AbstractBinderC6394w0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override
    public final boolean mo6024q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo20545z0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C10099c.m6022b(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo20546j(parcel.readInt(), (Bundle) C10099c.m6022b(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo20547Q0(parcel.readInt(), parcel.readStrongBinder(), (C6348h1) C10099c.m6022b(parcel, C6348h1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
