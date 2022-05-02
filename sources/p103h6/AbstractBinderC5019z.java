package p103h6;

import android.os.Parcel;
import p007a6.BinderC0189b;

public abstract class AbstractBinderC5019z extends BinderC0189b implements AbstractC4988a0 {
    public AbstractBinderC5019z() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
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
