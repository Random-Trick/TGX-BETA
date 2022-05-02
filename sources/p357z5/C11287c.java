package p357z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p176m5.C6750b;

public final class C11287c implements Parcelable.Creator<C11285b> {
    @Override
    public final C11285b createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        Status status = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            if (C6750b.m19140k(q) != 1) {
                C6750b.m19128w(parcel, q);
            } else {
                status = (Status) C6750b.m19147d(parcel, q, Status.CREATOR);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C11285b(status);
    }

    @Override
    public final C11285b[] newArray(int i) {
        return new C11285b[i];
    }
}
