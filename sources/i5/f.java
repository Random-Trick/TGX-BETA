package i5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class f implements Parcelable.Creator<a> {
    @Override
    public final a createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            if (b.k(q10) != 1) {
                b.w(parcel, q10);
            } else {
                intent = (Intent) b.d(parcel, q10, Intent.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new a(intent);
    }

    @Override
    public final a[] newArray(int i10) {
        return new a[i10];
    }
}
