package p033c6;

import android.os.Parcel;
import android.os.Parcelable;
import p176m5.C6750b;

public final class C1718ed implements Parcelable.Creator<C1725f5> {
    @Override
    public final C1725f5 createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        C1709e4 e4Var = null;
        C1709e4 e4Var2 = null;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            switch (C6750b.m19141k(q)) {
                case 2:
                    str = C6750b.m19147e(parcel, q);
                    break;
                case 3:
                    str2 = C6750b.m19147e(parcel, q);
                    break;
                case 4:
                    str3 = C6750b.m19147e(parcel, q);
                    break;
                case 5:
                    str4 = C6750b.m19147e(parcel, q);
                    break;
                case 6:
                    str5 = C6750b.m19147e(parcel, q);
                    break;
                case 7:
                    e4Var = (C1709e4) C6750b.m19148d(parcel, q, C1709e4.CREATOR);
                    break;
                case 8:
                    e4Var2 = (C1709e4) C6750b.m19148d(parcel, q, C1709e4.CREATOR);
                    break;
                default:
                    C6750b.m19129w(parcel, q);
                    break;
            }
        }
        C6750b.m19142j(parcel, x);
        return new C1725f5(str, str2, str3, str4, str5, e4Var, e4Var2);
    }

    @Override
    public final C1725f5[] newArray(int i) {
        return new C1725f5[i];
    }
}
