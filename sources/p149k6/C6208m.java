package p149k6;

import android.os.Parcel;
import android.os.Parcelable;
import p118i5.C5217a;
import p163l5.C6376q0;
import p176m5.C6750b;

public final class C6208m implements Parcelable.Creator<C6207l> {
    @Override
    public final C6207l createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        C5217a aVar = null;
        C6376q0 q0Var = null;
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                i = C6750b.m19133s(parcel, q);
            } else if (k == 2) {
                aVar = (C5217a) C6750b.m19148d(parcel, q, C5217a.CREATOR);
            } else if (k != 3) {
                C6750b.m19129w(parcel, q);
            } else {
                q0Var = (C6376q0) C6750b.m19148d(parcel, q, C6376q0.CREATOR);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C6207l(i, aVar, q0Var);
    }

    @Override
    public final C6207l[] newArray(int i) {
        return new C6207l[i];
    }
}
