package g6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class n0 implements Parcelable.Creator<m0> {
    @Override
    public final m0 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        long j10 = -1;
        long j11 = -1;
        int i10 = 1;
        int i11 = 1;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 2) {
                i11 = b.s(parcel, q10);
            } else if (k10 == 3) {
                j10 = b.u(parcel, q10);
            } else if (k10 != 4) {
                b.w(parcel, q10);
            } else {
                j11 = b.u(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new m0(i10, i11, j10, j11);
    }

    @Override
    public final m0[] newArray(int i10) {
        return new m0[i10];
    }
}
