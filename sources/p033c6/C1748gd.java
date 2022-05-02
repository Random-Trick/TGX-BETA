package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1748gd implements Parcelable.Creator<C1757h7> {
    @Override
    public final C1757h7 createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                case 9:
                    str8 = C6750b.m19146e(parcel, q);
                    break;
                case 10:
                    str9 = C6750b.m19146e(parcel, q);
                    break;
                case 11:
                    str10 = C6750b.m19146e(parcel, q);
                    break;
                case 12:
                    str11 = C6750b.m19146e(parcel, q);
                    break;
                case 13:
                    str12 = C6750b.m19146e(parcel, q);
                    break;
                case 14:
                    str13 = C6750b.m19146e(parcel, q);
                    break;
                case 15:
                    str14 = C6750b.m19146e(parcel, q);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new C1757h7(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override
    public final C1757h7[] newArray(int i) {
        return new C1757h7[i];
    }
}
