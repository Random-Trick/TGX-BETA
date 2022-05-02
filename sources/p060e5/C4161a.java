package p060e5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p176m5.C6750b;

public final class C4161a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override
    public final GoogleSignInAccount createFromParcel(Parcel parcel) {
        int x = C6750b.m19127x(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19134q(parcel);
            switch (C6750b.m19140k(q)) {
                case 1:
                    i = C6750b.m19132s(parcel, q);
                    break;
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
                    uri = (Uri) C6750b.m19147d(parcel, q, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C6750b.m19146e(parcel, q);
                    break;
                case 8:
                    j = C6750b.m19130u(parcel, q);
                    break;
                case 9:
                    str6 = C6750b.m19146e(parcel, q);
                    break;
                case 10:
                    arrayList = C6750b.m19142i(parcel, q, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C6750b.m19146e(parcel, q);
                    break;
                case 12:
                    str8 = C6750b.m19146e(parcel, q);
                    break;
                default:
                    C6750b.m19128w(parcel, q);
                    break;
            }
        }
        C6750b.m19141j(parcel, x);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override
    public final GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
