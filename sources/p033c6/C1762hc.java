package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1762hc implements Parcelable.Creator<C1919sb> {
    @Override
    public final C1919sb createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 1:
                    i = C6750b.m19132s(parcel, q);
                    break;
                case 2:
                    i2 = C6750b.m19132s(parcel, q);
                    break;
                case 3:
                    i3 = C6750b.m19132s(parcel, q);
                    break;
                case 4:
                    i4 = C6750b.m19132s(parcel, q);
                    break;
                case 5:
                    i5 = C6750b.m19132s(parcel, q);
                    break;
                case 6:
                    i6 = C6750b.m19132s(parcel, q);
                    break;
                case 7:
                    z = C6750b.m19139l(parcel, q);
                    break;
                case 8:
                    str = C6750b.m19146e(parcel, q);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1919sb(i, i2, i3, i4, i5, i6, z, str);
    }

    @Override
    public final C1919sb[] newArray(int i) {
        return new C1919sb[i];
    }
}
