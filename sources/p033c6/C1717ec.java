package p033c6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1717ec implements Parcelable.Creator<C1702dc> {
    @Override
    public final C1702dc createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        C1975wb wbVar = null;
        C2017zb zbVar = null;
        C1657ac acVar = null;
        C1687cc ccVar = null;
        C1672bc bcVar = null;
        C1989xb xbVar = null;
        C1933tb tbVar = null;
        C1947ub ubVar = null;
        C1961vb vbVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            switch (C6750b.m19141k(q)) {
                case 1:
                    i = C6750b.m19133s(parcel, q);
                    break;
                case 2:
                    str = C6750b.m19147e(parcel, q);
                    break;
                case 3:
                    str2 = C6750b.m19147e(parcel, q);
                    break;
                case 4:
                    bArr = C6750b.m19150b(parcel, q);
                    break;
                case 5:
                    pointArr = (Point[]) C6750b.m19144h(parcel, q, Point.CREATOR);
                    break;
                case 6:
                    i2 = C6750b.m19133s(parcel, q);
                    break;
                case 7:
                    wbVar = (C1975wb) C6750b.m19148d(parcel, q, C1975wb.CREATOR);
                    break;
                case 8:
                    zbVar = (C2017zb) C6750b.m19148d(parcel, q, C2017zb.CREATOR);
                    break;
                case 9:
                    acVar = (C1657ac) C6750b.m19148d(parcel, q, C1657ac.CREATOR);
                    break;
                case 10:
                    ccVar = (C1687cc) C6750b.m19148d(parcel, q, C1687cc.CREATOR);
                    break;
                case 11:
                    bcVar = (C1672bc) C6750b.m19148d(parcel, q, C1672bc.CREATOR);
                    break;
                case 12:
                    xbVar = (C1989xb) C6750b.m19148d(parcel, q, C1989xb.CREATOR);
                    break;
                case 13:
                    tbVar = (C1933tb) C6750b.m19148d(parcel, q, C1933tb.CREATOR);
                    break;
                case 14:
                    ubVar = (C1947ub) C6750b.m19148d(parcel, q, C1947ub.CREATOR);
                    break;
                case 15:
                    vbVar = (C1961vb) C6750b.m19148d(parcel, q, C1961vb.CREATOR);
                    break;
                default:
                    C6750b.m19129w(parcel, q);
                    break;
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1702dc(i, str, str2, bArr, pointArr, i2, wbVar, zbVar, acVar, ccVar, bcVar, xbVar, tbVar, ubVar, vbVar);
    }

    @Override
    public final C1702dc[] newArray(int i) {
        return new C1702dc[i];
    }
}
