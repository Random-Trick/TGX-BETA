package m5;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class a1 implements Parcelable.Creator<t> {
    @Override
    public final t createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 2) {
                z10 = b.l(parcel, q10);
            } else if (k10 == 3) {
                z11 = b.l(parcel, q10);
            } else if (k10 == 4) {
                i11 = b.s(parcel, q10);
            } else if (k10 != 5) {
                b.w(parcel, q10);
            } else {
                i12 = b.s(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new t(i10, z10, z11, i11, i12);
    }

    @Override
    public final t[] newArray(int i10) {
        return new t[i10];
    }
}
