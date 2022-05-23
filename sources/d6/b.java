package d6;

import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator<lc> {
    @Override
    public final lc createFromParcel(Parcel parcel) {
        int x10 = n5.b.x(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < x10) {
            int q10 = n5.b.q(parcel);
            int k10 = n5.b.k(q10);
            if (k10 == 2) {
                str = n5.b.e(parcel, q10);
            } else if (k10 != 3) {
                n5.b.w(parcel, q10);
            } else {
                str2 = n5.b.e(parcel, q10);
            }
        }
        n5.b.j(parcel, x10);
        return new lc(str, str2);
    }

    @Override
    public final lc[] newArray(int i10) {
        return new lc[i10];
    }
}
