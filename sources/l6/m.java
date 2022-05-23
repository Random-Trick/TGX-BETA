package l6;

import android.os.Parcel;
import android.os.Parcelable;
import j5.a;
import m5.q0;
import n5.b;

public final class m implements Parcelable.Creator<l> {
    @Override
    public final l createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        a aVar = null;
        q0 q0Var = null;
        int i10 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 2) {
                aVar = (a) b.d(parcel, q10, a.CREATOR);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                q0Var = (q0) b.d(parcel, q10, q0.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new l(i10, aVar, q0Var);
    }

    @Override
    public final l[] newArray(int i10) {
        return new l[i10];
    }
}
