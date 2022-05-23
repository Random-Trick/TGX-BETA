package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class ed implements Parcelable.Creator<f5> {
    @Override
    public final f5 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        e4 e4Var = null;
        e4 e4Var2 = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 2:
                    str = b.e(parcel, q10);
                    break;
                case 3:
                    str2 = b.e(parcel, q10);
                    break;
                case 4:
                    str3 = b.e(parcel, q10);
                    break;
                case 5:
                    str4 = b.e(parcel, q10);
                    break;
                case 6:
                    str5 = b.e(parcel, q10);
                    break;
                case 7:
                    e4Var = (e4) b.d(parcel, q10, e4.CREATOR);
                    break;
                case 8:
                    e4Var2 = (e4) b.d(parcel, q10, e4.CREATOR);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new f5(str, str2, str3, str4, str5, e4Var, e4Var2);
    }

    @Override
    public final f5[] newArray(int i10) {
        return new f5[i10];
    }
}
