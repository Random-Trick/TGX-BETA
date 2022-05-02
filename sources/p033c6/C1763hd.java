package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1763hd implements Parcelable.Creator<C1773i8> {
    @Override
    public final C1773i8 createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 2) {
                i = C6750b.m19133s(parcel, q);
            } else if (k == 3) {
                str = C6750b.m19147e(parcel, q);
            } else if (k == 4) {
                str2 = C6750b.m19147e(parcel, q);
            } else if (k != 5) {
                C6750b.m19129w(parcel, q);
            } else {
                str3 = C6750b.m19147e(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1773i8(i, str, str2, str3);
    }

    @Override
    public final C1773i8[] newArray(int i) {
        return new C1773i8[i];
    }
}
