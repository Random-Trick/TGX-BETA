package p163l5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p327x5.C10097a;
import p327x5.C10099c;

public final class C6386t1 extends C10097a implements AbstractC6355k {
    public C6386t1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override
    public final Account zzb() {
        Parcel q = m6026q(2, m6025s());
        Account account = (Account) C10099c.m6022b(q, Account.CREATOR);
        q.recycle();
        return account;
    }
}
