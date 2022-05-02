package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import p176m5.C6750b;

public final class C4277c0 implements Parcelable.Creator<LocationAvailability> {
    @Override
    public final LocationAvailability createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        long j = 0;
        C4298m0[] m0VarArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                i2 = C6750b.m19133s(parcel, q);
            } else if (k == 2) {
                i3 = C6750b.m19133s(parcel, q);
            } else if (k == 3) {
                j = C6750b.m19131u(parcel, q);
            } else if (k == 4) {
                i = C6750b.m19133s(parcel, q);
            } else if (k != 5) {
                C6750b.m19129w(parcel, q);
            } else {
                m0VarArr = (C4298m0[]) C6750b.m19144h(parcel, q, C4298m0.CREATOR);
            }
        }
        C6750b.m19142j(parcel, x);
        return new LocationAvailability(i, i2, i3, j, m0VarArr);
    }

    @Override
    public final LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
