package p033c6;

import android.os.IBinder;
import android.os.Parcel;
import p272t5.AbstractC8983b;

public final class C1734g extends C1644a {
    public C1734g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final C1673bd[] m36044E0(AbstractC8983b bVar, C1794k kVar) {
        Parcel q = m36121q();
        C1676c1.m36099b(q, bVar);
        C1676c1.m36100a(q, kVar);
        Parcel s = m36120s(1, q);
        C1673bd[] bdVarArr = (C1673bd[]) s.createTypedArray(C1673bd.CREATOR);
        s.recycle();
        return bdVarArr;
    }

    public final C1673bd[] m36043G1(AbstractC8983b bVar, C1794k kVar) {
        Parcel q = m36121q();
        C1676c1.m36099b(q, bVar);
        C1676c1.m36100a(q, kVar);
        Parcel s = m36120s(2, q);
        C1673bd[] bdVarArr = (C1673bd[]) s.createTypedArray(C1673bd.CREATOR);
        s.recycle();
        return bdVarArr;
    }

    public final void m36042p() {
        m36119t(3, m36121q());
    }
}
