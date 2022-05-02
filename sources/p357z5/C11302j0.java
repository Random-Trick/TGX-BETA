package p357z5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C11302j0 implements Parcelable.Creator<C11300i0> {
    @Override
    public final C11300i0 createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        C11296g0 g0Var = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                i = C6750b.m19132s(parcel, q);
            } else if (k == 2) {
                g0Var = (C11296g0) C6750b.m19147d(parcel, q, C11296g0.CREATOR);
            } else if (k == 3) {
                iBinder = C6750b.m19133r(parcel, q);
            } else if (k != 4) {
                C6750b.m19128w(parcel, q);
            } else {
                iBinder2 = C6750b.m19133r(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C11300i0(i, g0Var, iBinder, iBinder2);
    }

    @Override
    public final C11300i0[] newArray(int i) {
        return new C11300i0[i];
    }
}
