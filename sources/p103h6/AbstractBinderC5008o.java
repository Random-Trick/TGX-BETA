package p103h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p007a6.BinderC0189b;

public abstract class AbstractBinderC5008o extends BinderC0189b implements AbstractC5009p {
    public AbstractBinderC5008o() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override
    public final boolean mo24285q(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC4993d dVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (queryLocalInterface instanceof AbstractC4993d) {
                dVar = (AbstractC4993d) queryLocalInterface;
            } else {
                dVar = new C5010q(readStrongBinder);
            }
        }
        mo24329I(dVar);
        parcel2.writeNoException();
        return true;
    }
}
