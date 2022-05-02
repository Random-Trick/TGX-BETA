package p033c6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p272t5.AbstractC8983b;

public final class C1749h extends C1644a implements AbstractC1779j {
    public C1749h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override
    public final C1734g mo35992Y(AbstractC8983b bVar, C1704e eVar) {
        C1734g gVar;
        Parcel q = m36121q();
        C1676c1.m36099b(q, bVar);
        C1676c1.m36100a(q, eVar);
        Parcel s = m36120s(1, q);
        IBinder readStrongBinder = s.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof C1734g) {
                gVar = (C1734g) queryLocalInterface;
            } else {
                gVar = new C1734g(readStrongBinder);
            }
        }
        s.recycle();
        return gVar;
    }
}
