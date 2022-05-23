package d6;

import android.os.IBinder;
import android.os.IInterface;

public abstract class i extends b0 implements j {
    public static j q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        if (queryLocalInterface instanceof j) {
            return (j) queryLocalInterface;
        }
        return new h(iBinder);
    }
}
