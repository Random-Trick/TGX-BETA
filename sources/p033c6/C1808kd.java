package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1808kd implements Parcelable.Creator<C1821lb> {
    @Override
    public final C1821lb createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 2) {
                i = C6750b.m19132s(parcel, q);
            } else if (k != 3) {
                C6750b.m19128w(parcel, q);
            } else {
                str = C6750b.m19146e(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1821lb(i, str);
    }

    @Override
    public final C1821lb[] newArray(int i) {
        return new C1821lb[i];
    }
}