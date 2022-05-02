package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1792jc implements Parcelable.Creator<C1947ub> {
    @Override
    public final C1947ub createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        C2003yb ybVar = null;
        String str = null;
        String str2 = null;
        C2017zb[] zbVarArr = null;
        C1975wb[] wbVarArr = null;
        String[] strArr = null;
        C1905rb[] rbVarArr = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            switch (C6750b.m19141k(q)) {
                case 1:
                    ybVar = (C2003yb) C6750b.m19148d(parcel, q, C2003yb.CREATOR);
                    break;
                case 2:
                    str = C6750b.m19147e(parcel, q);
                    break;
                case 3:
                    str2 = C6750b.m19147e(parcel, q);
                    break;
                case 4:
                    zbVarArr = (C2017zb[]) C6750b.m19144h(parcel, q, C2017zb.CREATOR);
                    break;
                case 5:
                    wbVarArr = (C1975wb[]) C6750b.m19144h(parcel, q, C1975wb.CREATOR);
                    break;
                case 6:
                    strArr = C6750b.m19146f(parcel, q);
                    break;
                case 7:
                    rbVarArr = (C1905rb[]) C6750b.m19144h(parcel, q, C1905rb.CREATOR);
                    break;
                default:
                    C6750b.m19129w(parcel, q);
                    break;
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1947ub(ybVar, str, str2, zbVarArr, wbVarArr, strArr, rbVarArr);
    }

    @Override
    public final C1947ub[] newArray(int i) {
        return new C1947ub[i];
    }
}
