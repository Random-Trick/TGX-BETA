package p119i6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.C3503a;
import p176m5.C6750b;

public final class C5253n implements Parcelable.Creator<C3503a> {
    @Override
    public final C3503a createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 2) {
                f = C6750b.m19137o(parcel, q);
            } else if (k != 3) {
                C6750b.m19129w(parcel, q);
            } else {
                f2 = C6750b.m19137o(parcel, q);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C3503a(f, f2);
    }

    @Override
    public final C3503a[] newArray(int i) {
        return new C3503a[i];
    }
}
