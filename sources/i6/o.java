package i6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b6.b;

public abstract class o extends b implements p {
    public o() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override
    public final boolean q(int i10, Parcel parcel, Parcel parcel2, int i11) {
        d dVar;
        if (i10 != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (queryLocalInterface instanceof d) {
                dVar = (d) queryLocalInterface;
            } else {
                dVar = new q(readStrongBinder);
            }
        }
        q0(dVar);
        parcel2.writeNoException();
        return true;
    }
}
