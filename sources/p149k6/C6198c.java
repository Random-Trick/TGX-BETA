package p149k6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C6198c implements Parcelable.Creator<C6197b> {
    @Override
    public final C6197b createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                i = C6750b.m19133s(parcel, q);
            } else if (k == 2) {
                i2 = C6750b.m19133s(parcel, q);
            } else if (k != 3) {
                C6750b.m19129w(parcel, q);
            } else {
                intent = (Intent) C6750b.m19148d(parcel, q, Intent.CREATOR);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C6197b(i, i2, intent);
    }

    @Override
    public final C6197b[] newArray(int i) {
        return new C6197b[i];
    }
}
