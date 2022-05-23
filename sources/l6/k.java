package l6;

import android.os.Parcel;
import android.os.Parcelable;
import m5.o0;
import n5.b;

public final class k implements Parcelable.Creator<j> {
    @Override
    public final j createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        int i10 = 0;
        o0 o0Var = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 != 2) {
                b.w(parcel, q10);
            } else {
                o0Var = (o0) b.d(parcel, q10, o0.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new j(i10, o0Var);
    }

    @Override
    public final j[] newArray(int i10) {
        return new j[i10];
    }
}
