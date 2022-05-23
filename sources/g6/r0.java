package g6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class r0 implements Parcelable.Creator<q0> {
    @Override
    public final q0 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        long j10 = 50;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        float f10 = 0.0f;
        int i10 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                z10 = b.l(parcel, q10);
            } else if (k10 == 2) {
                j10 = b.u(parcel, q10);
            } else if (k10 == 3) {
                f10 = b.o(parcel, q10);
            } else if (k10 == 4) {
                j11 = b.u(parcel, q10);
            } else if (k10 != 5) {
                b.w(parcel, q10);
            } else {
                i10 = b.s(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new q0(z10, j10, f10, j11, i10);
    }

    @Override
    public final q0[] newArray(int i10) {
        return new q0[i10];
    }
}
