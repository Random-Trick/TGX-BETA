package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class c implements Parcelable.Creator<zc> {
    @Override
    public final zc createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 2) {
                str = b.e(parcel, q10);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                str2 = b.e(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new zc(str, str2);
    }

    @Override
    public final zc[] newArray(int i10) {
        return new zc[i10];
    }
}
