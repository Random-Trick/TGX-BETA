package p119i6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C5254o implements Parcelable.Creator<C5246g> {
    @Override
    public final C5246g createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            if (C6750b.m19141k(q) != 2) {
                C6750b.m19129w(parcel, q);
            } else {
                i = C6750b.m19133s(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C5246g(i);
    }

    @Override
    public final C5246g[] newArray(int i) {
        return new C5246g[i];
    }
}
