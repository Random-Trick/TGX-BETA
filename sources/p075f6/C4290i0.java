package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C4290i0 implements Parcelable.Creator<C4288h0> {
    @Override
    public final C4288h0 createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                str2 = C6750b.m19146e(parcel, q);
            } else if (k == 2) {
                str3 = C6750b.m19146e(parcel, q);
            } else if (k != 5) {
                C6750b.m19128w(parcel, q);
            } else {
                str = C6750b.m19146e(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C4288h0(str, str2, str3);
    }

    @Override
    public final C4288h0[] newArray(int i) {
        return new C4288h0[i];
    }
}
