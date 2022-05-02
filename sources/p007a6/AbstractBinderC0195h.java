package p007a6;

import android.os.IBinder;
import android.os.IInterface;

public abstract class AbstractBinderC0195h extends BinderC0189b implements AbstractC0196i {
    public static AbstractC0196i m42120s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof AbstractC0196i) {
            return (AbstractC0196i) queryLocalInterface;
        }
        return new C0194g(iBinder);
    }
}
