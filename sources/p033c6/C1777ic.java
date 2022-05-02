package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1777ic implements Parcelable.Creator<C1933tb> {
    @Override
    public final C1933tb createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        C1919sb sbVar = null;
        C1919sb sbVar2 = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 1:
                    str = C6750b.m19146e(parcel, q);
                    break;
                case 2:
                    str2 = C6750b.m19146e(parcel, q);
                    break;
                case 3:
                    str3 = C6750b.m19146e(parcel, q);
                    break;
                case 4:
                    str4 = C6750b.m19146e(parcel, q);
                    break;
                case 5:
                    str5 = C6750b.m19146e(parcel, q);
                    break;
                case 6:
                    sbVar = (C1919sb) C6750b.m19147d(parcel, q, C1919sb.CREATOR);
                    break;
                case 7:
                    sbVar2 = (C1919sb) C6750b.m19147d(parcel, q, C1919sb.CREATOR);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1933tb(str, str2, str3, str4, str5, sbVar, sbVar2);
    }

    @Override
    public final C1933tb[] newArray(int i) {
        return new C1933tb[i];
    }
}
