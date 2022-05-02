package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1920sc implements Parcelable.Creator<C2003yb> {
    @Override
    public final C2003yb createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            switch (C6750b.m19141k(q)) {
                case 1:
                    str = C6750b.m19147e(parcel, q);
                    break;
                case 2:
                    str2 = C6750b.m19147e(parcel, q);
                    break;
                case 3:
                    str3 = C6750b.m19147e(parcel, q);
                    break;
                case 4:
                    str4 = C6750b.m19147e(parcel, q);
                    break;
                case 5:
                    str5 = C6750b.m19147e(parcel, q);
                    break;
                case 6:
                    str6 = C6750b.m19147e(parcel, q);
                    break;
                case 7:
                    str7 = C6750b.m19147e(parcel, q);
                    break;
                default:
                    C6750b.m19129w(parcel, q);
                    break;
            }
        }
        C6750b.m19142j(parcel, x);
        return new C2003yb(str, str2, str3, str4, str5, str6, str7);
    }

    @Override
    public final C2003yb[] newArray(int i) {
        return new C2003yb[i];
    }
}
