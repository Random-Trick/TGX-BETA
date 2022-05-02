package p103h6;

import android.os.Parcel;
import p007a6.BinderC0189b;

public abstract class AbstractBinderC4994d0 extends BinderC0189b implements AbstractC4996e0 {
    public AbstractBinderC4994d0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
    }

    @Override
    public final boolean mo24286q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
