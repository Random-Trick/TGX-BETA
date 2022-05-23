package b6;

import android.os.IBinder;
import android.os.IInterface;

public abstract class e extends b implements f {
    public static f r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new d(iBinder);
    }
}
