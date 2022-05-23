package b6;

import android.os.IBinder;
import android.os.IInterface;

public abstract class h extends b implements i {
    public static i r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof i) {
            return (i) queryLocalInterface;
        }
        return new g(iBinder);
    }
}
