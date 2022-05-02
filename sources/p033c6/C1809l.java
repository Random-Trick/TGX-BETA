package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1809l implements Parcelable.Creator<C1794k> {
    @Override
    public final C1794k createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 2) {
                i = C6750b.m19133s(parcel, q);
            } else if (k == 3) {
                i2 = C6750b.m19133s(parcel, q);
            } else if (k == 4) {
                i3 = C6750b.m19133s(parcel, q);
            } else if (k == 5) {
                j = C6750b.m19131u(parcel, q);
            } else if (k != 6) {
                C6750b.m19129w(parcel, q);
            } else {
                i4 = C6750b.m19133s(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1794k(i, i2, i3, j, i4);
    }

    @Override
    public final C1794k[] newArray(int i) {
        return new C1794k[i];
    }
}
