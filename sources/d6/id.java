package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class id implements Parcelable.Creator<j9> {
    @Override
    public final j9 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 2) {
                d10 = b.n(parcel, q10);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                d11 = b.n(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new j9(d10, d11);
    }

    @Override
    public final j9[] newArray(int i10) {
        return new j9[i10];
    }
}
