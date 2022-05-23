package d6;

import android.os.IBinder;
import android.os.Parcel;
import u5.b;

public final class g extends a {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final bd[] E1(b bVar, k kVar) {
        Parcel q10 = q();
        c1.b(q10, bVar);
        c1.a(q10, kVar);
        Parcel r10 = r(2, q10);
        bd[] bdVarArr = (bd[]) r10.createTypedArray(bd.CREATOR);
        r10.recycle();
        return bdVarArr;
    }

    public final void p() {
        t(3, q());
    }

    public final bd[] x0(b bVar, k kVar) {
        Parcel q10 = q();
        c1.b(q10, bVar);
        c1.a(q10, kVar);
        Parcel r10 = r(1, q10);
        bd[] bdVarArr = (bd[]) r10.createTypedArray(bd.CREATOR);
        r10.recycle();
        return bdVarArr;
    }
}
