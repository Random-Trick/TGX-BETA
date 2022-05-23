package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class qb implements Parcelable.Creator<rb> {
    @Override
    public final rb createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        int i10 = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 != 2) {
                b.w(parcel, q10);
            } else {
                strArr = b.f(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new rb(i10, strArr);
    }

    @Override
    public final rb[] newArray(int i10) {
        return new rb[i10];
    }
}
