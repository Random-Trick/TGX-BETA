package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1677c2 implements Parcelable.Creator<C1693d3> {
    @Override
    public final C1693d3 createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 2) {
                i = C6750b.m19132s(parcel, q);
            } else if (k != 3) {
                C6750b.m19128w(parcel, q);
            } else {
                strArr = C6750b.m19145f(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1693d3(i, strArr);
    }

    @Override
    public final C1693d3[] newArray(int i) {
        return new C1693d3[i];
    }
}