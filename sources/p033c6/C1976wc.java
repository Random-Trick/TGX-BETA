package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1976wc implements Parcelable.Creator<C1687cc> {
    @Override
    public final C1687cc createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                str = C6750b.m19146e(parcel, q);
            } else if (k == 2) {
                str2 = C6750b.m19146e(parcel, q);
            } else if (k != 3) {
                C6750b.m19128w(parcel, q);
            } else {
                i = C6750b.m19132s(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1687cc(str, str2, i);
    }

    @Override
    public final C1687cc[] newArray(int i) {
        return new C1687cc[i];
    }
}
