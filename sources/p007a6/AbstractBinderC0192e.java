package p007a6;

import android.os.IBinder;
import android.os.IInterface;

public abstract class AbstractBinderC0192e extends BinderC0189b implements AbstractC0193f {
    public static AbstractC0193f m42119s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface instanceof AbstractC0193f) {
            return (AbstractC0193f) queryLocalInterface;
        }
        return new C0191d(iBinder);
    }
}
