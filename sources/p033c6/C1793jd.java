package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1793jd implements Parcelable.Creator<C1805ka> {
    @Override
    public final C1805ka createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 2:
                    str = C6750b.m19146e(parcel, q);
                    break;
                case 3:
                    str2 = C6750b.m19146e(parcel, q);
                    break;
                case 4:
                    str3 = C6750b.m19146e(parcel, q);
                    break;
                case 5:
                    str4 = C6750b.m19146e(parcel, q);
                    break;
                case 6:
                    str5 = C6750b.m19146e(parcel, q);
                    break;
                case 7:
                    str6 = C6750b.m19146e(parcel, q);
                    break;
                case 8:
                    str7 = C6750b.m19146e(parcel, q);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1805ka(str, str2, str3, str4, str5, str6, str7);
    }

    @Override
    public final C1805ka[] newArray(int i) {
        return new C1805ka[i];
    }
}
