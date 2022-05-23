package d6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import u5.b;

public final class pc extends a implements rc {
    public pc(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override
    public final oc E(b bVar, fc fcVar) {
        oc ocVar;
        Parcel q10 = q();
        c1.b(q10, bVar);
        c1.a(q10, fcVar);
        Parcel r10 = r(1, q10);
        IBinder readStrongBinder = r10.readStrongBinder();
        if (readStrongBinder == null) {
            ocVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            if (queryLocalInterface instanceof oc) {
                ocVar = (oc) queryLocalInterface;
            } else {
                ocVar = new oc(readStrongBinder);
            }
        }
        r10.recycle();
        return ocVar;
    }
}
