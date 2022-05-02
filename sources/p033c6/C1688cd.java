package p033c6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1688cd implements Parcelable.Creator<C1673bd> {
    @Override
    public final C1673bd createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        String str = null;
        double d = 0.0d;
        String str2 = null;
        Point[] pointArr = null;
        C1773i8 i8Var = null;
        C1821lb lbVar = null;
        C1822lc lcVar = null;
        C1658ad adVar = null;
        C2018zc zcVar = null;
        C1789j9 j9Var = null;
        C1725f5 f5Var = null;
        C1741g6 g6Var = null;
        C1757h7 h7Var = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            switch (C6750b.m19141k(q)) {
                case 2:
                    i = C6750b.m19133s(parcel, q);
                    break;
                case 3:
                    str = C6750b.m19147e(parcel, q);
                    break;
                case 4:
                    str2 = C6750b.m19147e(parcel, q);
                    break;
                case 5:
                    i2 = C6750b.m19133s(parcel, q);
                    break;
                case 6:
                    pointArr = (Point[]) C6750b.m19144h(parcel, q, Point.CREATOR);
                    break;
                case 7:
                    i8Var = (C1773i8) C6750b.m19148d(parcel, q, C1773i8.CREATOR);
                    break;
                case 8:
                    lbVar = (C1821lb) C6750b.m19148d(parcel, q, C1821lb.CREATOR);
                    break;
                case 9:
                    lcVar = (C1822lc) C6750b.m19148d(parcel, q, C1822lc.CREATOR);
                    break;
                case 10:
                    adVar = (C1658ad) C6750b.m19148d(parcel, q, C1658ad.CREATOR);
                    break;
                case 11:
                    zcVar = (C2018zc) C6750b.m19148d(parcel, q, C2018zc.CREATOR);
                    break;
                case 12:
                    j9Var = (C1789j9) C6750b.m19148d(parcel, q, C1789j9.CREATOR);
                    break;
                case 13:
                    f5Var = (C1725f5) C6750b.m19148d(parcel, q, C1725f5.CREATOR);
                    break;
                case 14:
                    g6Var = (C1741g6) C6750b.m19148d(parcel, q, C1741g6.CREATOR);
                    break;
                case 15:
                    h7Var = (C1757h7) C6750b.m19148d(parcel, q, C1757h7.CREATOR);
                    break;
                case 16:
                    bArr = C6750b.m19150b(parcel, q);
                    break;
                case 17:
                    z = C6750b.m19140l(parcel, q);
                    break;
                case 18:
                    d = C6750b.m19138n(parcel, q);
                    break;
                default:
                    C6750b.m19129w(parcel, q);
                    break;
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1673bd(i, str, str2, i2, pointArr, i8Var, lbVar, lcVar, adVar, zcVar, j9Var, f5Var, g6Var, h7Var, bArr, z, d);
    }

    @Override
    public final C1673bd[] newArray(int i) {
        return new C1673bd[i];
    }
}
