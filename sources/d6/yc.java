package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class yc implements Parcelable.Creator<xc> {
    @Override
    public final xc createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 2) {
                i11 = b.s(parcel, q10);
            } else if (k10 == 3) {
                i12 = b.s(parcel, q10);
            } else if (k10 == 4) {
                i13 = b.s(parcel, q10);
            } else if (k10 != 5) {
                b.w(parcel, q10);
            } else {
                j10 = b.u(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new xc(i10, i11, i12, i13, j10);
    }

    @Override
    public final xc[] newArray(int i10) {
        return new xc[i10];
    }
}
