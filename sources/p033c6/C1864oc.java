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

    public final List<C1702dc> m35967E0(AbstractC8983b bVar, C1990xc xcVar) {
        Parcel q = m36124q();
        C1676c1.m36102b(q, bVar);
        C1676c1.m36103a(q, xcVar);
        Parcel s = m36123s(3, q);
        ArrayList createTypedArrayList = s.createTypedArrayList(C1702dc.CREATOR);
        s.recycle();
        return createTypedArrayList;
    }

    public final void m35966G1() {
        m36122t(1, m36124q());
    }

    public final void m35965H1() {
        m36122t(2, m36124q());
    }
}
