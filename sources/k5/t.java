package k5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import j5.a;
import n5.b;

public final class t implements Parcelable.Creator<Status> {
    @Override
    public final Status createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i11 = b.s(parcel, q10);
            } else if (k10 == 2) {
                str = b.e(parcel, q10);
            } else if (k10 == 3) {
                pendingIntent = (PendingIntent) b.d(parcel, q10, PendingIntent.CREATOR);
            } else if (k10 == 4) {
                aVar = (a) b.d(parcel, q10, a.CREATOR);
            } else if (k10 != 1000) {
                b.w(parcel, q10);
            } else {
                i10 = b.s(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new Status(i10, i11, str, pendingIntent, aVar);
    }

    @Override
    public final Status[] newArray(int i10) {
        return new Status[i10];
    }
}
