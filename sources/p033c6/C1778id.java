package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1778id implements Parcelable.Creator<C1789j9> {
    @Override
    public final C1789j9 createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 2) {
                d = C6750b.m19137n(parcel, q);
            } else if (k != 3) {
                C6750b.m19128w(parcel, q);
            } else {
                d2 = C6750b.m19137n(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1789j9(d, d2);
    }

    @Override
    public final C1789j9[] newArray(int i) {
        return new C1789j9[i];
    }
}