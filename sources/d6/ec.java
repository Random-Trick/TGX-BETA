package d6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class ec implements Parcelable.Creator<dc> {
    @Override
    public final dc createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        wb wbVar = null;
        zb zbVar = null;
        ac acVar = null;
        cc ccVar = null;
        bc bcVar = null;
        xb xbVar = null;
        tb tbVar = null;
        ub ubVar = null;
        vb vbVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    i10 = b.s(parcel, q10);
                    break;
                case 2:
                    str = b.e(parcel, q10);
                    break;
                case 3:
                    str2 = b.e(parcel, q10);
                    break;
                case 4:
                    bArr = b.b(parcel, q10);
                    break;
                case 5:
                    pointArr = (Point[]) b.h(parcel, q10, Point.CREATOR);
                    break;
                case 6:
                    i11 = b.s(parcel, q10);
                    break;
                case 7:
                    wbVar = (wb) b.d(parcel, q10, wb.CREATOR);
                    break;
                case 8:
                    zbVar = (zb) b.d(parcel, q10, zb.CREATOR);
                    break;
                case 9:
                    acVar = (ac) b.d(parcel, q10, ac.CREATOR);
                    break;
                case 10:
                    ccVar = (cc) b.d(parcel, q10, cc.CREATOR);
                    break;
                case 11:
                    bcVar = (bc) b.d(parcel, q10, bc.CREATOR);
                    break;
                case 12:
                    xbVar = (xb) b.d(parcel, q10, xb.CREATOR);
                    break;
                case 13:
                    tbVar = (tb) b.d(parcel, q10, tb.CREATOR);
                    break;
                case 14:
                    ubVar = (ub) b.d(parcel, q10, ub.CREATOR);
                    break;
                case 15:
                    vbVar = (vb) b.d(parcel, q10, vb.CREATOR);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new dc(i10, str, str2, bArr, pointArr, i11, wbVar, zbVar, acVar, ccVar, bcVar, xbVar, tbVar, ubVar, vbVar);
    }

    @Override
    public final dc[] newArray(int i10) {
        return new dc[i10];
    }
}
