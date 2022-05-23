package a6;

import android.os.Parcel;
import android.os.Parcelable;
import g6.q0;
import java.util.List;
import m5.d;
import n5.b;

public final class h0 implements Parcelable.Creator<g0> {
    @Override
    public final g0 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        q0 q0Var = g0.N;
        List<d> list = g0.M;
        String str = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                q0Var = (q0) b.d(parcel, q10, q0.CREATOR);
            } else if (k10 == 2) {
                list = b.i(parcel, q10, d.CREATOR);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                str = b.e(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new g0(q0Var, list, str);
    }

    @Override
    public final g0[] newArray(int i10) {
        return new g0[i10];
    }
}
