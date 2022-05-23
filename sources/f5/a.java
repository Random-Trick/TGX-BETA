package f5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import n5.b;

public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override
    public final GoogleSignInAccount createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        String str = null;
        long j10 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        int i10 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            switch (b.k(q10)) {
                case 1:
                    i10 = b.s(parcel, q10);
                    break;
                case 2:
                    str = b.e(parcel, q10);
                    break;
                case 3:
                    str2 = b.e(parcel, q10);
                    break;
                case 4:
                    str3 = b.e(parcel, q10);
                    break;
                case 5:
                    str4 = b.e(parcel, q10);
                    break;
                case 6:
                    uri = (Uri) b.d(parcel, q10, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.e(parcel, q10);
                    break;
                case 8:
                    j10 = b.u(parcel, q10);
                    break;
                case 9:
                    str6 = b.e(parcel, q10);
                    break;
                case 10:
                    arrayList = b.i(parcel, q10, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.e(parcel, q10);
                    break;
                case 12:
                    str8 = b.e(parcel, q10);
                    break;
                default:
                    b.w(parcel, q10);
                    break;
            }
        }
        b.j(parcel, x10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override
    public final GoogleSignInAccount[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
