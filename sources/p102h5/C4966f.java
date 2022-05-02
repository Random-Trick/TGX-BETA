package p102h5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C4966f implements Parcelable.Creator<C4955a> {
    @Override
    public final C4955a createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            if (C6750b.m19141k(q) != 1) {
                C6750b.m19129w(parcel, q);
            } else {
                intent = (Intent) C6750b.m19148d(parcel, q, Intent.CREATOR);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C4955a(intent);
    }

    @Override
    public final C4955a[] newArray(int i) {
        return new C4955a[i];
    }
}
