package p103h6;

import android.os.Parcel;
import p007a6.BinderC0189b;

public abstract class AbstractBinderC4990b0 extends BinderC0189b implements AbstractC4992c0 {
    public AbstractBinderC4990b0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
    }

    @Override
    public final boolean mo24285q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
