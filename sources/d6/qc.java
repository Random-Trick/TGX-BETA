package d6;

import android.os.IBinder;
import android.os.IInterface;

public abstract class qc extends b0 implements rc {
    public static rc q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof rc) {
            return (rc) queryLocalInterface;
        }
        return new pc(iBinder);
    }
}
