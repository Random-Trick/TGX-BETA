package p163l5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p118i5.C5217a;
import p176m5.C6750b;

public final class C6379r0 implements Parcelable.Creator<C6376q0> {
    @Override
    public final C6376q0 createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        IBinder iBinder = null;
        C5217a aVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                i = C6750b.m19132s(parcel, q);
            } else if (k == 2) {
                iBinder = C6750b.m19133r(parcel, q);
            } else if (k == 3) {
                aVar = (C5217a) C6750b.m19147d(parcel, q, C5217a.CREATOR);
            } else if (k == 4) {
                z = C6750b.m19139l(parcel, q);
            } else if (k != 5) {
                C6750b.m19128w(parcel, q);
            } else {
                z2 = C6750b.m19139l(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C6376q0(i, iBinder, aVar, z, z2);
    }

    @Override
    public final C6376q0[] newArray(int i) {
        return new C6376q0[i];
    }
}
