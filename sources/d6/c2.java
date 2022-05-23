package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class c2 implements Parcelable.Creator<d3> {
    @Override
    public final d3 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        int i10 = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 2) {
                i10 = b.s(parcel, q10);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                strArr = b.f(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new d3(i10, strArr);
    }

    @Override
    public final d3[] newArray(int i10) {
        return new d3[i10];
    }
}
