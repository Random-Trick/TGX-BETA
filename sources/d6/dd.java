package d6;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class dd implements Parcelable.Creator<e4> {
    @Override
    public final e4 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 2:
                    i10 = b.s(parcel, q10);
                    break;
                case 3:
                    i11 = b.s(parcel, q10);
                    break;
                case 4:
                    i12 = b.s(parcel, q10);
                    break;
                case 5:
                    i13 = b.s(parcel, q10);
                    break;
                case 6:
                    i14 = b.s(parcel, q10);
                    break;
                case 7:
                    i15 = b.s(parcel, q10);
                    break;
                case 8:
                    z10 = b.l(parcel, q10);
                    break;
                case 9:
                    str = b.e(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new e4(i10, i11, i12, i13, i14, i15, z10, str);
    }

    @Override
    public final e4[] newArray(int i10) {
        return new e4[i10];
    }
}
