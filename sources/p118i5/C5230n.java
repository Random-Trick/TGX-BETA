package p118i5;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C5230n implements Parcelable.Creator<C5219c> {
    @Override
    public final C5219c createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                str = C6750b.m19146e(parcel, q);
            } else if (k == 2) {
                i = C6750b.m19132s(parcel, q);
            } else if (k != 3) {
                C6750b.m19128w(parcel, q);
            } else {
                j = C6750b.m19130u(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C5219c(str, i, j);
    }

    @Override
    public final C5219c[] newArray(int i) {
        return new C5219c[i];
    }
}
