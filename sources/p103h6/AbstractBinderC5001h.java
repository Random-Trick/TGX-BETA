package p103h6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p007a6.BinderC0189b;

public abstract class AbstractBinderC5001h extends BinderC0189b implements AbstractC5002i {
    public AbstractBinderC5001h() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override
    public final boolean mo24285q(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC4989b bVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (queryLocalInterface instanceof AbstractC4989b) {
                bVar = (AbstractC4989b) queryLocalInterface;
            } else {
                bVar = new C5017x(readStrongBinder);
            }
        }
        mo24336h0(bVar);
        parcel2.writeNoException();
        return true;
    }
}
