package d6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class cd implements Parcelable.Creator<bd> {
    @Override
    public final bd createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        double d10 = 0.0d;
        String str2 = null;
        Point[] pointArr = null;
        i8 i8Var = null;
        lb lbVar = null;
        lc lcVar = null;
        ad adVar = null;
        zc zcVar = null;
        j9 j9Var = null;
        f5 f5Var = null;
        g6 g6Var = null;
        h7 h7Var = null;
        byte[] bArr = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 2:
                    i10 = b.s(parcel, q10);
                    break;
                case 3:
                    str = b.e(parcel, q10);
                    break;
                case 4:
                    str2 = b.e(parcel, q10);
                    break;
                case 5:
                    i11 = b.s(parcel, q10);
                    break;
                case 6:
                    pointArr = (Point[]) b.h(parcel, q10, Point.CREATOR);
                    break;
                case 7:
                    i8Var = (i8) b.d(parcel, q10, i8.CREATOR);
                    break;
                case 8:
                    lbVar = (lb) b.d(parcel, q10, lb.CREATOR);
                    break;
                case 9:
                    lcVar = (lc) b.d(parcel, q10, lc.CREATOR);
                    break;
                case 10:
                    adVar = (ad) b.d(parcel, q10, ad.CREATOR);
                    break;
                case 11:
                    zcVar = (zc) b.d(parcel, q10, zc.CREATOR);
                    break;
                case 12:
                    j9Var = (j9) b.d(parcel, q10, j9.CREATOR);
                    break;
                case 13:
                    f5Var = (f5) b.d(parcel, q10, f5.CREATOR);
                    break;
                case 14:
                    g6Var = (g6) b.d(parcel, q10, g6.CREATOR);
                    break;
                case 15:
                    h7Var = (h7) b.d(parcel, q10, h7.CREATOR);
                    break;
                case 16:
                    bArr = b.b(parcel, q10);
                    break;
                case 17:
                    z10 = b.l(parcel, q10);
                    break;
                case 18:
                    d10 = b.n(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new bd(i10, str, str2, i11, pointArr, i8Var, lbVar, lcVar, adVar, zcVar, j9Var, f5Var, g6Var, h7Var, bArr, z10, d10);
    }

    @Override
    public final bd[] newArray(int i10) {
        return new bd[i10];
    }
}
