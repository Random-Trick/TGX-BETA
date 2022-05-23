package g6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class l0 implements Parcelable.Creator<j> {
    @Override
    public final j createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    z10 = b.l(parcel, q10);
                    break;
                case 2:
                    z11 = b.l(parcel, q10);
                    break;
                case 3:
                    z12 = b.l(parcel, q10);
                    break;
                case 4:
                    z13 = b.l(parcel, q10);
                    break;
                case 5:
                    z14 = b.l(parcel, q10);
                    break;
                case 6:
                    z15 = b.l(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new j(z10, z11, z12, z13, z14, z15);
    }

    @Override
    public final j[] newArray(int i10) {
        return new j[i10];
    }
}
