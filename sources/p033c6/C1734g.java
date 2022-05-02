package p033c6;

import android.os.IBinder;
import android.os.Parcel;
import p272t5.AbstractC8983b;

public final class C1734g extends C1644a {
    public C1734g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final C1673bd[] m36047E0(AbstractC8983b bVar, C1794k kVar) {
        Parcel q = m36124q();
        C1676c1.m36102b(q, bVar);
        C1676c1.m36103a(q, kVar);
        Parcel s = m36123s(1, q);
        C1673bd[] bdVarArr = (C1673bd[]) s.createTypedArray(C1673bd.CREATOR);
        s.recycle();
        return bdVarArr;
    }

    public final C1673bd[] m36046G1(AbstractC8983b bVar, C1794k kVar) {
        Parcel q = m36124q();
        C1676c1.m36102b(q, bVar);
        C1676c1.m36103a(q, kVar);
        Parcel s = m36123s(2, q);
        C1673bd[] bdVarArr = (C1673bd[]) s.createTypedArray(C1673bd.CREATOR);
        s.recycle();
        return bdVarArr;
    }

    public final void m36045p() {
        m36122t(3, m36124q());
    }
}
