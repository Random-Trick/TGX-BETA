package a6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class j0 implements Parcelable.Creator<i0> {
    @Override
    public final i0 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        g0 g0Var = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i10 = 1;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 2) {
                g0Var = (g0) b.d(parcel, q10, g0.CREATOR);
            } else if (k10 == 3) {
                iBinder = b.r(parcel, q10);
            } else if (k10 != 4) {
                b.w(parcel, q10);
            } else {
                iBinder2 = b.r(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new i0(i10, g0Var, iBinder, iBinder2);
    }

    @Override
    public final i0[] newArray(int i10) {
        return new i0[i10];
    }
}
