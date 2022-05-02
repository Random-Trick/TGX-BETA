package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C4300n0 implements Parcelable.Creator<C4298m0> {
    @Override
    public final C4298m0 createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                i = C6750b.m19132s(parcel, q);
            } else if (k == 2) {
                i2 = C6750b.m19132s(parcel, q);
            } else if (k == 3) {
                j = C6750b.m19130u(parcel, q);
            } else if (k != 4) {
                C6750b.m19128w(parcel, q);
            } else {
                j2 = C6750b.m19130u(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C4298m0(i, i2, j, j2);
    }

    @Override
    public final C4298m0[] newArray(int i) {
        return new C4298m0[i];
    }
}
