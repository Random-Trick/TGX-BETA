package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class l implements Parcelable.Creator<k> {
    @Override
    public final k createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 2) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 3) {
                i11 = b.s(parcel, q10);
            } else if (k10 == 4) {
                i12 = b.s(parcel, q10);
            } else if (k10 == 5) {
                j10 = b.u(parcel, q10);
            } else if (k10 != 6) {
                b.w(parcel, q10);
            } else {
                i13 = b.s(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new k(i10, i11, i12, j10, i13);
    }

    @Override
    public final k[] newArray(int i10) {
        return new k[i10];
    }
}
