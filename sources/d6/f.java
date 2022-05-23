package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class f implements Parcelable.Creator<e> {
    @Override
    public final e createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 2) {
                i10 = b.s(parcel, q10);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                z10 = b.l(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new e(i10, z10);
    }

    @Override
    public final e[] newArray(int i10) {
        return new e[i10];
    }
}
