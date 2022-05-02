package p163l5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p118i5.C5219c;
import p176m5.C6750b;

public final class C6351i1 implements Parcelable.Creator<C6348h1> {
    @Override
    public final C6348h1 createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        Bundle bundle = null;
        C5219c[] cVarArr = null;
        C6340f fVar = null;
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                bundle = C6750b.m19150a(parcel, q);
            } else if (k == 2) {
                cVarArr = (C5219c[]) C6750b.m19143h(parcel, q, C5219c.CREATOR);
            } else if (k == 3) {
                i = C6750b.m19132s(parcel, q);
            } else if (k != 4) {
                C6750b.m19128w(parcel, q);
            } else {
                fVar = (C6340f) C6750b.m19147d(parcel, q, C6340f.CREATOR);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C6348h1(bundle, cVarArr, i, fVar);
    }

    @Override
    public final C6348h1[] newArray(int i) {
        return new C6348h1[i];
    }
}
