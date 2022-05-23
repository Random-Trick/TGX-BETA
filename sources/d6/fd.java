package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class fd implements Parcelable.Creator<g6> {
    @Override
    public final g6 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        ka kaVar = null;
        String str = null;
        String str2 = null;
        lb[] lbVarArr = null;
        i8[] i8VarArr = null;
        String[] strArr = null;
        d3[] d3VarArr = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 2:
                    kaVar = (ka) b.d(parcel, q10, ka.CREATOR);
                    break;
                case 3:
                    str = b.e(parcel, q10);
                    break;
                case 4:
                    str2 = b.e(parcel, q10);
                    break;
                case 5:
                    lbVarArr = (lb[]) b.h(parcel, q10, lb.CREATOR);
                    break;
                case 6:
                    i8VarArr = (i8[]) b.h(parcel, q10, i8.CREATOR);
                    break;
                case 7:
                    strArr = b.f(parcel, q10);
                    break;
                case 8:
                    d3VarArr = (d3[]) b.h(parcel, q10, d3.CREATOR);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new g6(kaVar, str, str2, lbVarArr, i8VarArr, strArr, d3VarArr);
    }

    @Override
    public final g6[] newArray(int i10) {
        return new g6[i10];
    }
}
