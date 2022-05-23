package g6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import n5.b;

public final class k0 implements Parcelable.Creator<i> {
    @Override
    public final i createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        Status status = null;
        j jVar = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                status = (Status) b.d(parcel, q10, Status.CREATOR);
            } else if (k10 != 2) {
                b.w(parcel, q10);
            } else {
                jVar = (j) b.d(parcel, q10, j.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new i(status, jVar);
    }

    @Override
    public final i[] newArray(int i10) {
        return new i[i10];
    }
}
