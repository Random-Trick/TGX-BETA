package d6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import u5.b;

public final class h extends a implements j {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override
    public final g V0(b bVar, e eVar) {
        g gVar;
        Parcel q10 = q();
        c1.b(q10, bVar);
        c1.a(q10, eVar);
        Parcel r10 = r(1, q10);
        IBinder readStrongBinder = r10.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof g) {
                gVar = (g) queryLocalInterface;
            } else {
                gVar = new g(readStrongBinder);
            }
        }
        r10.recycle();
        return gVar;
    }
}
