package p075f6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p176m5.C6750b;

public final class C4294k0 implements Parcelable.Creator<C4289i> {
    @Override
    public final C4289i createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        Status status = null;
        C4291j jVar = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                status = (Status) C6750b.m19148d(parcel, q, Status.CREATOR);
            } else if (k != 2) {
                C6750b.m19129w(parcel, q);
            } else {
                jVar = (C4291j) C6750b.m19148d(parcel, q, C4291j.CREATOR);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C4289i(status, jVar);
    }

    @Override
    public final C4289i[] newArray(int i) {
        return new C4289i[i];
    }
}
