package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class vc implements Parcelable.Creator<bc> {
    @Override
    public final bc createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                str = b.e(parcel, q10);
            } else if (k10 != 2) {
                b.w(parcel, q10);
            } else {
                str2 = b.e(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new bc(str, str2);
    }

    @Override
    public final bc[] newArray(int i10) {
        return new bc[i10];
    }
}
