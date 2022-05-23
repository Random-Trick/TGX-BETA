package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class ic implements Parcelable.Creator<tb> {
    @Override
    public final tb createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        sb sbVar = null;
        sb sbVar2 = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    str = b.e(parcel, q10);
                    break;
                case 2:
                    str2 = b.e(parcel, q10);
                    break;
                case 3:
                    str3 = b.e(parcel, q10);
                    break;
                case 4:
                    str4 = b.e(parcel, q10);
                    break;
                case 5:
                    str5 = b.e(parcel, q10);
                    break;
                case 6:
                    sbVar = (sb) b.d(parcel, q10, sb.CREATOR);
                    break;
                case 7:
                    sbVar2 = (sb) b.d(parcel, q10, sb.CREATOR);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new tb(str, str2, str3, str4, str5, sbVar, sbVar2);
    }

    @Override
    public final tb[] newArray(int i10) {
        return new tb[i10];
    }
}
