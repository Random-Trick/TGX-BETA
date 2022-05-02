package p033c6;

import android.os.IBinder;
import android.os.IInterface;

public abstract class AbstractBinderC1892qc extends BinderC1660b0 implements AbstractC1906rc {
    public static AbstractC1906rc m35939q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof AbstractC1906rc) {
            return (AbstractC1906rc) queryLocalInterface;
        }
        return new C1878pc(iBinder);
    }
}
