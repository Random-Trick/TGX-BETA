package m5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import n5.b;

public final class t0 implements Parcelable.Creator<s0> {
    @Override
    public final s0 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        int i10 = 0;
        Scope[] scopeArr = null;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 2) {
                i11 = b.s(parcel, q10);
            } else if (k10 == 3) {
                i12 = b.s(parcel, q10);
            } else if (k10 != 4) {
                b.w(parcel, q10);
            } else {
                scopeArr = (Scope[]) b.h(parcel, q10, Scope.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new s0(i10, i11, i12, scopeArr);
    }

    @Override
    public final s0[] newArray(int i10) {
        return new s0[i10];
    }
}
