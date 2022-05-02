package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1677c2 implements Parcelable.Creator<C1693d3> {
    @Override
    public final C1693d3 createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 2) {
                i = C6750b.m19133s(parcel, q);
            } else if (k != 3) {
                C6750b.m19129w(parcel, q);
            } else {
                strArr = C6750b.m19146f(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1693d3(i, strArr);
    }

    @Override
    public final C1693d3[] newArray(int i) {
        return new C1693d3[i];
    }
}
