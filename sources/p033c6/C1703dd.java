package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1703dd implements Parcelable.Creator<C1709e4> {
    @Override
    public final C1709e4 createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            switch (C6750b.m19141k(q)) {
                case 2:
                    i = C6750b.m19133s(parcel, q);
                    break;
                case 3:
                    i2 = C6750b.m19133s(parcel, q);
                    break;
                case 4:
                    i3 = C6750b.m19133s(parcel, q);
                    break;
                case 5:
                    i4 = C6750b.m19133s(parcel, q);
                    break;
                case 6:
                    i5 = C6750b.m19133s(parcel, q);
                    break;
                case 7:
                    i6 = C6750b.m19133s(parcel, q);
                    break;
                case 8:
                    z = C6750b.m19140l(parcel, q);
                    break;
                case 9:
                    str = C6750b.m19147e(parcel, q);
                    break;
                default:
                    C6750b.m19129w(parcel, q);
                    break;
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1709e4(i, i2, i3, i4, i5, i6, z, str);
    }

    @Override
    public final C1709e4[] newArray(int i) {
        return new C1709e4[i];
    }
}
