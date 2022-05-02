package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1948uc implements Parcelable.Creator<C1657ac> {
    @Override
    public final C1657ac createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                str = C6750b.m19146e(parcel, q);
            } else if (k != 2) {
                C6750b.m19128w(parcel, q);
            } else {
                str2 = C6750b.m19146e(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1657ac(str, str2);
    }

    @Override
    public final C1657ac[] newArray(int i) {
        return new C1657ac[i];
    }
}
