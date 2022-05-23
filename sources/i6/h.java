package i6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b6.b;

public abstract class h extends b implements i {
    public h() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        b bVar;
        if (i10 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (queryLocalInterface instanceof b) {
                bVar = (b) queryLocalInterface;
            } else {
                bVar = new x(readStrongBinder);
            }
        }
        g0(bVar);
        parcel2.writeNoException();
        return true;
    }
}
