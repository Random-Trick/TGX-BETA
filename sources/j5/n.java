package j5;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class n implements Parcelable.Creator<c> {
    @Override
    public final c createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                str = b.e(parcel, q10);
            } else if (k10 == 2) {
                i10 = b.s(parcel, q10);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                j10 = b.u(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new c(str, i10, j10);
    }

    @Override
    public final c[] newArray(int i10) {
        return new c[i10];
    }
}
