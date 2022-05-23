package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class jc implements Parcelable.Creator<ub> {
    @Override
    public final ub createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        yb ybVar = null;
        String str = null;
        String str2 = null;
        zb[] zbVarArr = null;
        wb[] wbVarArr = null;
        String[] strArr = null;
        rb[] rbVarArr = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    ybVar = (yb) b.d(parcel, q10, yb.CREATOR);
                    break;
                case 2:
                    str = b.e(parcel, q10);
                    break;
                case 3:
                    str2 = b.e(parcel, q10);
                    break;
                case 4:
                    zbVarArr = (zb[]) b.h(parcel, q10, zb.CREATOR);
                    break;
                case 5:
                    wbVarArr = (wb[]) b.h(parcel, q10, wb.CREATOR);
                    break;
                case 6:
                    strArr = b.f(parcel, q10);
                    break;
                case 7:
                    rbVarArr = (rb[]) b.h(parcel, q10, rb.CREATOR);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new ub(ybVar, str, str2, zbVarArr, wbVarArr, strArr, rbVarArr);
    }

    @Override
    public final ub[] newArray(int i10) {
        return new ub[i10];
    }
}
