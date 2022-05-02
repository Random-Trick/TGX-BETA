package p033c6;

import android.os.IBinder;
import android.os.IInterface;

public abstract class AbstractBinderC1764i extends BinderC1660b0 implements AbstractC1779j {
    public static AbstractC1779j m35996q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        if (queryLocalInterface instanceof AbstractC1779j) {
            return (AbstractC1779j) queryLocalInterface;
        }
        return new C1749h(iBinder);
    }
}
