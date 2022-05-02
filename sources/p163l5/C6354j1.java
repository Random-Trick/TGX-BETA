package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C6354j1 implements Parcelable.Creator<C6340f> {
    @Override
    public final C6340f createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        C6384t tVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 1:
                    tVar = (C6384t) C6750b.m19147d(parcel, q, C6384t.CREATOR);
                    break;
                case 2:
                    z = C6750b.m19139l(parcel, q);
                    break;
                case 3:
                    z2 = C6750b.m19139l(parcel, q);
                    break;
                case 4:
                    iArr = C6750b.m19148c(parcel, q);
                    break;
                case 5:
                    i = C6750b.m19132s(parcel, q);
                    break;
                case 6:
                    iArr2 = C6750b.m19148c(parcel, q);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new C6340f(tVar, z, z2, iArr, i, iArr2);
    }

    @Override
    public final C6340f[] newArray(int i) {
        return new C6340f[i];
    }
}
