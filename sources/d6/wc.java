package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class wc implements Parcelable.Creator<cc> {
    @Override
    public final cc createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        String str2 = null;
        int i10 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                str = b.e(parcel, q10);
            } else if (k10 == 2) {
                str2 = b.e(parcel, q10);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                i10 = b.s(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new cc(str, str2, i10);
    }

    @Override
    public final cc[] newArray(int i10) {
        return new cc[i10];
    }
}
