package p357z5;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C11322y implements Parcelable.Creator<C11321x> {
    @Override
    public final C11321x createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        C11319v vVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 1:
                    i = C6750b.m19132s(parcel, q);
                    break;
                case 2:
                    vVar = (C11319v) C6750b.m19147d(parcel, q, C11319v.CREATOR);
                    break;
                case 3:
                    iBinder = C6750b.m19133r(parcel, q);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C6750b.m19147d(parcel, q, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = C6750b.m19133r(parcel, q);
                    break;
                case 6:
                    iBinder3 = C6750b.m19133r(parcel, q);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new C11321x(i, vVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override
    public final C11321x[] newArray(int i) {
        return new C11321x[i];
    }
}
