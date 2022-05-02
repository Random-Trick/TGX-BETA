package p149k6;

import android.os.Parcel;
import android.os.Parcelable;
import p163l5.C6369o0;
import p176m5.C6750b;

public final class C6206k implements Parcelable.Creator<C6205j> {
    @Override
    public final C6205j createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        int i = 0;
        C6369o0 o0Var = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            int k = C6750b.m19140k(q);
            if (k == 1) {
                i = C6750b.m19132s(parcel, q);
            } else if (k != 2) {
                C6750b.m19128w(parcel, q);
            } else {
                o0Var = (C6369o0) C6750b.m19147d(parcel, q, C6369o0.CREATOR);
            }
        }
        C6750b.m19141j(parcel, x);
        return new C6205j(i, o0Var);
    }

    @Override
    public final C6205j[] newArray(int i) {
        return new C6205j[i];
    }
}
