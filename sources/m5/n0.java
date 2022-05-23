package m5;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class n0 implements Parcelable.Creator<p> {
    @Override
    public final p createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        long j10 = 0;
        String str2 = null;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    i10 = b.s(parcel, q10);
                    break;
                case 2:
                    i11 = b.s(parcel, q10);
                    break;
                case 3:
                    i12 = b.s(parcel, q10);
                    break;
                case 4:
                    j10 = b.u(parcel, q10);
                    break;
                case 5:
                    j11 = b.u(parcel, q10);
                    break;
                case 6:
                    str = b.e(parcel, q10);
                    break;
                case 7:
                    str2 = b.e(parcel, q10);
                    break;
                case 8:
                    i13 = b.s(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new p(i10, i11, i12, j10, j11, str, str2, i13);
    }

    @Override
    public final p[] newArray(int i10) {
        return new p[i10];
    }
}
