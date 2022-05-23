package d6;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import u5.b;

public final class oc extends a {
    public oc(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final void E1() {
        t(1, q());
    }

    public final void F1() {
        t(2, q());
    }

    public final List<dc> x0(b bVar, xc xcVar) {
        Parcel q10 = q();
        c1.b(q10, bVar);
        c1.a(q10, xcVar);
        Parcel r10 = r(3, q10);
        ArrayList createTypedArrayList = r10.createTypedArrayList(dc.CREATOR);
        r10.recycle();
        return createTypedArrayList;
    }
}
