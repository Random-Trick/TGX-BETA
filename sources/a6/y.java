package a6;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class y implements Parcelable.Creator<x> {
    @Override
    public final x createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        v vVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i10 = 1;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    i10 = b.s(parcel, q10);
                    break;
                case 2:
                    vVar = (v) b.d(parcel, q10, v.CREATOR);
                    break;
                case 3:
                    iBinder = b.r(parcel, q10);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.d(parcel, q10, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.r(parcel, q10);
                    break;
                case 6:
                    iBinder3 = b.r(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new x(i10, vVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override
    public final x[] newArray(int i10) {
        return new x[i10];
    }
}
