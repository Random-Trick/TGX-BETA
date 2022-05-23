package m5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import n5.a;
import n5.c;

public final class o0 extends a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();
    public final GoogleSignInAccount M;
    public final int f17236a;
    public final Account f17237b;
    public final int f17238c;

    public o0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f17236a = i10;
        this.f17237b = account;
        this.f17238c = i11;
        this.M = googleSignInAccount;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f17236a);
        c.o(parcel, 2, this.f17237b, i10, false);
        c.k(parcel, 3, this.f17238c);
        c.o(parcel, 4, this.M, i10, false);
        c.b(parcel, a10);
    }

    public o0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
