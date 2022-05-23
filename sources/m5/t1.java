package m5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import y5.a;
import y5.c;

public final class t1 extends a implements k {
    public t1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override
    public final Account zzb() {
        Parcel q10 = q(2, r());
        Account account = (Account) c.b(q10, Account.CREATOR);
        q10.recycle();
        return account;
    }
}
