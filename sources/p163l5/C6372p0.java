package p163l5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p176m5.C6750b;

public final class C6372p0 implements Parcelable.Creator<C6369o0> {
    @Override
    public final C6369o0 createFromParcel(Parcel parcel) {
        int x = C6750b.m19128x(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int q = C6750b.m19135q(parcel);
            int k = C6750b.m19141k(q);
            if (k == 1) {
                i = C6750b.m19133s(parcel, q);
            } else if (k == 2) {
                account = (Account) C6750b.m19148d(parcel, q, Account.CREATOR);
            } else if (k == 3) {
                i2 = C6750b.m19133s(parcel, q);
            } else if (k != 4) {
                C6750b.m19129w(parcel, q);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C6750b.m19148d(parcel, q, GoogleSignInAccount.CREATOR);
            }
        }
        C6750b.m19142j(parcel, x);
        return new C6369o0(i, account, i2, googleSignInAccount);
    }

    @Override
    public final C6369o0[] newArray(int i) {
        return new C6369o0[i];
    }
}
