package j5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class m implements Parcelable.Creator<a> {
    @Override
    public final a createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 2) {
                i11 = b.s(parcel, q10);
            } else if (k10 == 3) {
                pendingIntent = (PendingIntent) b.d(parcel, q10, PendingIntent.CREATOR);
            } else if (k10 != 4) {
                b.w(parcel, q10);
            } else {
                str = b.e(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new a(i10, i11, pendingIntent, str);
    }

    @Override
    public final a[] newArray(int i10) {
        return new a[i10];
    }
}
