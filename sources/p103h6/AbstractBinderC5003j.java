package p103h6;

import android.os.Parcel;
import p007a6.AbstractBinderC0195h;
import p007a6.BinderC0189b;
import p007a6.C0190c;

public abstract class AbstractBinderC5003j extends BinderC0189b implements AbstractC5004k {
    public AbstractBinderC5003j() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override
    public final boolean mo24285q(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        boolean o0 = mo24335o0(AbstractBinderC0195h.m42117s(parcel.readStrongBinder()));
        parcel2.writeNoException();
        C0190c.m42123b(parcel2, o0);
        return true;
    }
}
