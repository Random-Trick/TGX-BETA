package j6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.a;
import n5.b;

public final class n implements Parcelable.Creator<a> {
    @Override
    public final a createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 2) {
                f10 = b.o(parcel, q10);
            } else if (k10 != 3) {
                b.w(parcel, q10);
            } else {
                f11 = b.o(parcel, q10);
            }
        }
        b.j(parcel, x10);
        return new a(f10, f11);
    }

    @Override
    public final a[] newArray(int i10) {
        return new a[i10];
    }
}
