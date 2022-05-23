package l6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import n5.b;

public final class i implements Parcelable.Creator<h> {
    @Override
    public final h createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                arrayList = b.g(parcel, q10);
            } else if (k10 != 2) {
                b.w(parcel, q10);
            } else {
                str = b.e(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new h(arrayList, str);
    }

    @Override
    public final h[] newArray(int i10) {
        return new h[i10];
    }
}
