package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class nc implements Parcelable.Creator<xb> {
    @Override
    public final xb createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                d10 = b.n(parcel, q10);
            } else if (k10 != 2) {
                b.w(parcel, q10);
            } else {
                d11 = b.n(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new xb(d10, d11);
    }

    @Override
    public final xb[] newArray(int i10) {
        return new xb[i10];
    }
}
