package p357z5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p075f6.C4306q0;
import p163l5.C6333d;
import p176m5.C6750b;

public final class C11298h0 implements Parcelable.Creator<C11296g0> {
    @Override
    public final C11296g0 createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        C4306q0 q0Var = C11296g0.f36210N;
        List<C6333d> list = C11296g0.f36209M;
        String str = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                q0Var = (C4306q0) C6750b.m19148d(parcel, q, C4306q0.CREATOR);
            } else if (k == 2) {
                list = C6750b.m19143i(parcel, q, C6333d.CREATOR);
            } else if (k != 3) {
                C6750b.m19129w(parcel, q);
            } else {
                str = C6750b.m19147e(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C11296g0(q0Var, list, str);
    }

    @Override
    public final C11296g0[] newArray(int i) {
        return new C11296g0[i];
    }
}
