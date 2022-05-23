package m5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j5.c;
import n5.b;

public final class i1 implements Parcelable.Creator<h1> {
    @Override
    public final h1 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        Bundle bundle = null;
        c[] cVarArr = null;
        f fVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                bundle = b.a(parcel, q10);
            } else if (k10 == 2) {
                cVarArr = (c[]) b.h(parcel, q10, c.CREATOR);
            } else if (k10 == 3) {
                i10 = b.s(parcel, q10);
            } else if (k10 != 4) {
                b.w(parcel, q10);
            } else {
                fVar = (f) b.d(parcel, q10, f.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new h1(bundle, cVarArr, i10, fVar);
    }

    @Override
    public final h1[] newArray(int i10) {
        return new h1[i10];
    }
}
