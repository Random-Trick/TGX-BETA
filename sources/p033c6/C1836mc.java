package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1836mc implements Parcelable.Creator<C1975wb> {
    @Override
    public final C1975wb createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                i = C6750b.m19132s(parcel, q);
            } else if (k == 2) {
                str = C6750b.m19146e(parcel, q);
            } else if (k == 3) {
                str2 = C6750b.m19146e(parcel, q);
            } else if (k != 4) {
                C6750b.m19128w(parcel, q);
            } else {
                str3 = C6750b.m19146e(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1975wb(i, str, str2, str3);
    }

    @Override
    public final C1975wb[] newArray(int i) {
        return new C1975wb[i];
    }
}
