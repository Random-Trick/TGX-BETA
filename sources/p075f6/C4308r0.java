package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C4308r0 implements Parcelable.Creator<C4306q0> {
    @Override
    public final C4306q0 createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                z = C6750b.m19139l(parcel, q);
            } else if (k == 2) {
                j = C6750b.m19130u(parcel, q);
            } else if (k == 3) {
                f = C6750b.m19136o(parcel, q);
            } else if (k == 4) {
                j2 = C6750b.m19130u(parcel, q);
            } else if (k != 5) {
                C6750b.m19128w(parcel, q);
            } else {
                i = C6750b.m19132s(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C4306q0(z, j, f, j2, i);
    }

    @Override
    public final C4306q0[] newArray(int i) {
        return new C4306q0[i];
    }
}
