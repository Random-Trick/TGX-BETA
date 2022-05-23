package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import n5.b;

public final class c implements Parcelable.Creator<b> {
    @Override
    public final b createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        Status status = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            if (b.k(q10) != 1) {
                b.w(parcel, q10);
            } else {
                status = (Status) b.d(parcel, q10, Status.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new b(status);
    }

    @Override
    public final b[] newArray(int i10) {
        return new b[i10];
    }
}
