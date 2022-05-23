package m5;

import android.os.Parcel;
import android.os.Parcelable;
import n5.b;

public final class j1 implements Parcelable.Creator<f> {
    @Override
    public final f createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        t tVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    tVar = (t) b.d(parcel, q10, t.CREATOR);
                    break;
                case 2:
                    z10 = b.l(parcel, q10);
                    break;
                case 3:
                    z11 = b.l(parcel, q10);
                    break;
                case 4:
                    iArr = b.c(parcel, q10);
                    break;
                case 5:
                    i10 = b.s(parcel, q10);
                    break;
                case 6:
                    iArr2 = b.c(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new f(tVar, z10, z11, iArr, i10, iArr2);
    }

    @Override
    public final f[] newArray(int i10) {
        return new f[i10];
    }
}
