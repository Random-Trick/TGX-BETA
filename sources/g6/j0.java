package g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import n5.b;

public final class j0 implements Parcelable.Creator<g> {
    @Override
    public final g createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        boolean z10 = false;
        ArrayList arrayList = null;
        h0 h0Var = null;
        boolean z11 = false;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                arrayList = b.i(parcel, q10, LocationRequest.CREATOR);
            } else if (k10 == 2) {
                z10 = b.l(parcel, q10);
            } else if (k10 == 3) {
                z11 = b.l(parcel, q10);
            } else if (k10 != 5) {
                b.w(parcel, q10);
            } else {
                h0Var = (h0) b.d(parcel, q10, h0.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new g(arrayList, z10, z11, h0Var);
    }

    @Override
    public final g[] newArray(int i10) {
        return new g[i10];
    }
}
