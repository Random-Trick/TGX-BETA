package m5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import n5.b;

public final class p0 implements Parcelable.Creator<o0> {
    @Override
    public final o0 createFromParcel(Parcel parcel) {
        int x10 = b.x(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < x10) {
            int q10 = b.q(parcel);
            int k10 = b.k(q10);
            if (k10 == 1) {
                i10 = b.s(parcel, q10);
            } else if (k10 == 2) {
                account = (Account) b.d(parcel, q10, Account.CREATOR);
            } else if (k10 == 3) {
                i11 = b.s(parcel, q10);
            } else if (k10 != 4) {
                b.w(parcel, q10);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.d(parcel, q10, GoogleSignInAccount.CREATOR);
            }
        }
        b.j(parcel, x10);
        return new o0(i10, account, i11, googleSignInAccount);
    }

    @Override
    public final o0[] newArray(int i10) {
        return new o0[i10];
    }
}
