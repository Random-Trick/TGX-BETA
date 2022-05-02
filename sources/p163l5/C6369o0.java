package p163l5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p176m5.AbstractC6749a;
import p176m5.C6752c;

public final class C6369o0 extends AbstractC6749a {
    public static final Parcelable.Creator<C6369o0> CREATOR = new C6372p0();
    public final GoogleSignInAccount f19990M;
    public final int f19991a;
    public final Account f19992b;
    public final int f19993c;

    public C6369o0(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f19991a = i;
        this.f19992b = account;
        this.f19993c = i2;
        this.f19990M = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C6752c.m19125a(parcel);
        C6752c.m19115k(parcel, 1, this.f19991a);
        C6752c.m19111o(parcel, 2, this.f19992b, i, false);
        C6752c.m19115k(parcel, 3, this.f19993c);
        C6752c.m19111o(parcel, 4, this.f19990M, i, false);
        C6752c.m19124b(parcel, a);
    }

    public C6369o0(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
