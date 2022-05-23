package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class hd implements Parcelable.Creator<i8> {
    @Override
    public final i8 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 2) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 3) {
                str = b.e(parcel, q10);
            } else if (k10 == 4) {
                str2 = b.e(parcel, q10);
            } else if (k10 != 5) {
                b.w(parcel, q10);
            } else {
                str3 = b.e(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new i8(i10, str, str2, str3);
    }

    @Override
    public final i8[] newArray(int i10) {
        return new i8[i10];
    }
}
