package m5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j5.a;
import n5.b;

public final class r0 implements Parcelable.Creator<q0> {
    @Override
    public final q0 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        IBinder iBinder = null;
        a aVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 2) {
                iBinder = b.r(parcel, q10);
            } else if (k10 == 3) {
                aVar = (a) b.d(parcel, q10, a.CREATOR);
            } else if (k10 == 4) {
                z10 = b.l(parcel, q10);
            } else if (k10 != 5) {
                b.w(parcel, q10);
            } else {
                z11 = b.l(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new q0(i10, iBinder, aVar, z10, z11);
    }

    @Override
    public final q0[] newArray(int i10) {
        return new q0[i10];
    }
}
