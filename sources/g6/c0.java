package g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import n5.b;

public final class c0 implements Parcelable.Creator<LocationAvailability> {
    @Override
    public final LocationAvailability createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        long j10 = 0;
        m0[] m0VarArr = null;
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i11 = b.s(parcel, q10);
            } else if (k10 == 2) {
                i12 = b.s(parcel, q10);
            } else if (k10 == 3) {
                j10 = b.u(parcel, q10);
            } else if (k10 == 4) {
                i10 = b.s(parcel, q10);
            } else if (k10 != 5) {
                b.w(parcel, q10);
            } else {
                m0VarArr = (m0[]) b.h(parcel, q10, m0.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new LocationAvailability(i10, i11, i12, j10, m0VarArr);
    }

    @Override
    public final LocationAvailability[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
