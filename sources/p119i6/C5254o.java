package p119i6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C5254o implements Parcelable.Creator<C5246g> {
    @Override
    public final C5246g createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            if (C6750b.m19140k(q) != 2) {
                C6750b.m19128w(parcel, q);
            } else {
                i = C6750b.m19132s(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C5246g(i);
    }

    @Override
    public final C5246g[] newArray(int i) {
        return new C5246g[i];
    }
}