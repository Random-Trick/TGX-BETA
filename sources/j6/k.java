package j6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class k implements Parcelable.Creator<c> {
    @Override
    public final c createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            if (b.k(q10) != 2) {
                b.w(parcel, q10);
            } else {
                str = b.e(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new c(str);
    }

    @Override
    public final c[] newArray(int i10) {
        return new c[i10];
    }
}
