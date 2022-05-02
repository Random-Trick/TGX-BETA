package p033c6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p272t5.AbstractC8983b;

public final class C1878pc extends C1644a implements AbstractC1906rc {
    public C1878pc(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override
    public final C1864oc mo35915n0(AbstractC8983b bVar, C1732fc fcVar) {
        C1864oc ocVar;
        Parcel q = m36124q();
        C1676c1.m36102b(q, bVar);
        C1676c1.m36103a(q, fcVar);
        Parcel s = m36123s(1, q);
        IBinder readStrongBinder = s.readStrongBinder();
        if (readStrongBinder == null) {
            ocVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            if (queryLocalInterface instanceof C1864oc) {
                ocVar = (C1864oc) queryLocalInterface;
            } else {
                ocVar = new C1864oc(readStrongBinder);
            }
        }
        s.recycle();
        return ocVar;
    }
}
