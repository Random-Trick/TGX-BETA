package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import p176m5.C6750b;

public final class C4292j0 implements Parcelable.Creator<C4284g> {
    @Override
    public final C4284g createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        C4288h0 h0Var = null;
        boolean z2 = false;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                arrayList = C6750b.m19143i(parcel, q, LocationRequest.CREATOR);
            } else if (k == 2) {
                z = C6750b.m19140l(parcel, q);
            } else if (k == 3) {
                z2 = C6750b.m19140l(parcel, q);
            } else if (k != 5) {
                C6750b.m19129w(parcel, q);
            } else {
                h0Var = (C4288h0) C6750b.m19148d(parcel, q, C4288h0.CREATOR);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C4284g(arrayList, z, z2, h0Var);
    }

    @Override
    public final C4284g[] newArray(int i) {
        return new C4284g[i];
    }
}
