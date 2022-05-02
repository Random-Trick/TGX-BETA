package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1747gc implements Parcelable.Creator<C1732fc> {
    @Override
    public final C1732fc createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            if (C6750b.m19140k(q) != 1) {
                C6750b.m19128w(parcel, q);
            } else {
                i = C6750b.m19132s(parcel, q);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1732fc(i);
    }

    @Override
    public final C1732fc[] newArray(int i) {
        return new C1732fc[i];
    }
}
