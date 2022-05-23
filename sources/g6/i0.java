package g6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class i0 implements Parcelable.Creator<h0> {
    @Override
    public final h0 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                str2 = b.e(parcel, q10);
            } else if (k10 == 2) {
                str3 = b.e(parcel, q10);
            } else if (k10 != 5) {
                b.w(parcel, q10);
            } else {
                str = b.e(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new h0(str, str2, str3);
    }

    @Override
    public final h0[] newArray(int i10) {
        return new h0[i10];
    }
}
