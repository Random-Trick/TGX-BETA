package p118i5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C5229m implements Parcelable.Creator<C5217a> {
    @Override
    public final C5217a createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                i = C6750b.m19132s(parcel, q);
            } else if (k == 2) {
                i2 = C6750b.m19132s(parcel, q);
            } else if (k == 3) {
                pendingIntent = (PendingIntent) C6750b.m19147d(parcel, q, PendingIntent.CREATOR);
            } else if (k != 4) {
                C6750b.m19128w(parcel, q);
            } else {
                str = C6750b.m19146e(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C5217a(i, i2, pendingIntent, str);
    }

    @Override
    public final C5217a[] newArray(int i) {
        return new C5217a[i];
    }
}