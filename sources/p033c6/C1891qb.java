package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1891qb implements Parcelable.Creator<C1905rb> {
    @Override
    public final C1905rb createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                i = C6750b.m19133s(parcel, q);
            } else if (k != 2) {
                C6750b.m19129w(parcel, q);
            } else {
                strArr = C6750b.m19146f(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1905rb(i, strArr);
    }

    @Override
    public final C1905rb[] newArray(int i) {
        return new C1905rb[i];
    }
}
