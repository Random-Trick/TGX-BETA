package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class jd implements Parcelable.Creator<ka> {
    @Override
    public final ka createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    str6 = b.e(parcel, q10);
                    break;
                case 8:
                    str7 = b.e(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new ka(str, str2, str3, str4, str5, str6, str7);
    }

    @Override
    public final ka[] newArray(int i10) {
        return new ka[i10];
    }
}
