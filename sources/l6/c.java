package l6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class c implements Parcelable.Creator<b> {
    @Override
    public final b createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 2) {
                i11 = b.s(parcel, q10);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                intent = (Intent) b.d(parcel, q10, Intent.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new b(i10, i11, intent);
    }

    @Override
    public final b[] newArray(int i10) {
        return new b[i10];
    }
}
