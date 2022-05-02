package p133j5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p118i5.C5217a;
import p176m5.C6750b;

public final class C5885t implements Parcelable.Creator<Status> {
    @Override
    public final Status createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C5217a aVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                i2 = C6750b.m19132s(parcel, q);
            } else if (k == 2) {
                str = C6750b.m19146e(parcel, q);
            } else if (k == 3) {
                pendingIntent = (PendingIntent) C6750b.m19147d(parcel, q, PendingIntent.CREATOR);
            } else if (k == 4) {
                aVar = (C5217a) C6750b.m19147d(parcel, q, C5217a.CREATOR);
            } else if (k != 1000) {
                C6750b.m19128w(parcel, q);
            } else {
                i = C6750b.m19132s(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new Status(i, i2, str, pendingIntent, aVar);
    }

    @Override
    public final Status[] newArray(int i) {
        return new Status[i];
    }
}
