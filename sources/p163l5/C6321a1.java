package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C6321a1 implements Parcelable.Creator<C6384t> {
    @Override
    public final C6384t createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                i = C6750b.m19133s(parcel, q);
            } else if (k == 2) {
                z = C6750b.m19140l(parcel, q);
            } else if (k == 3) {
                z2 = C6750b.m19140l(parcel, q);
            } else if (k == 4) {
                i2 = C6750b.m19133s(parcel, q);
            } else if (k != 5) {
                C6750b.m19129w(parcel, q);
            } else {
                i3 = C6750b.m19133s(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C6384t(i, z, z2, i2, i3);
    }

    @Override
    public final C6384t[] newArray(int i) {
        return new C6384t[i];
    }
}
