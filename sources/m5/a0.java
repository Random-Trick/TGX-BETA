package m5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import n5.b;

public final class a0 implements Parcelable.Creator<v> {
    @Override
    public final v createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 != 2) {
                b.w(parcel, q10);
            } else {
                arrayList = b.i(parcel, q10, p.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new v(i10, arrayList);
    }

    @Override
    public final v[] newArray(int i10) {
        return new v[i10];
    }
}
