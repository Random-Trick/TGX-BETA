package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C2004yc implements Parcelable.Creator<C1990xc> {
    @Override
    public final C1990xc createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                i = C6750b.m19132s(parcel, q);
            } else if (k == 2) {
                i2 = C6750b.m19132s(parcel, q);
            } else if (k == 3) {
                i3 = C6750b.m19132s(parcel, q);
            } else if (k == 4) {
                i4 = C6750b.m19132s(parcel, q);
            } else if (k != 5) {
                C6750b.m19128w(parcel, q);
            } else {
                j = C6750b.m19130u(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1990xc(i, i2, i3, i4, j);
    }

    @Override
    public final C1990xc[] newArray(int i) {
        return new C1990xc[i];
    }
}
