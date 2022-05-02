package p119i6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C5250k implements Parcelable.Creator<C5242c> {
    @Override
    public final C5242c createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            if (C6750b.m19140k(q) != 2) {
                C6750b.m19128w(parcel, q);
            } else {
                str = C6750b.m19146e(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C5242c(str);
    }

    @Override
    public final C5242c[] newArray(int i) {
        return new C5242c[i];
    }
}
