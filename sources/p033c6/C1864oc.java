package p033c6;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p272t5.AbstractC8983b;

public final class C1864oc extends C1644a {
    public C1864oc(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    public final List<C1702dc> m35964E0(AbstractC8983b bVar, C1990xc xcVar) {
        Parcel q = m36121q();
        C1676c1.m36099b(q, bVar);
        C1676c1.m36100a(q, xcVar);
        Parcel s = m36120s(3, q);
        ArrayList createTypedArrayList = s.createTypedArrayList(C1702dc.CREATOR);
        s.recycle();
        return createTypedArrayList;
    }

    public final void m35963G1() {
        m36119t(1, m36121q());
    }

    public final void m35962H1() {
        m36119t(2, m36121q());
    }
}
