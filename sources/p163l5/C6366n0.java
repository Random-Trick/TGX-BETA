package p163l5;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C6366n0 implements Parcelable.Creator<C6371p> {
    @Override
    public final C6371p createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            switch (C6750b.m19141k(q)) {
                case 1:
                    i = C6750b.m19133s(parcel, q);
                    break;
                case 2:
                    i2 = C6750b.m19133s(parcel, q);
                    break;
                case 3:
                    i3 = C6750b.m19133s(parcel, q);
                    break;
                case 4:
                    j = C6750b.m19131u(parcel, q);
                    break;
                case 5:
                    j2 = C6750b.m19131u(parcel, q);
                    break;
                case 6:
                    str = C6750b.m19147e(parcel, q);
                    break;
                case 7:
                    str2 = C6750b.m19147e(parcel, q);
                    break;
                case 8:
                    i4 = C6750b.m19133s(parcel, q);
                    break;
                default:
                    C6750b.m19129w(parcel, q);
                    break;
            }
        }
        C6750b.m19142j(parcel, x);
        return new C6371p(i, i2, i3, j, j2, str, str2, i4);
    }

    @Override
    public final C6371p[] newArray(int i) {
        return new C6371p[i];
    }
}
