package p163l5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import p327x5.BinderC10098b;

public interface AbstractC6355k extends IInterface {

    public static abstract class AbstractBinderC6356a extends BinderC10098b implements AbstractC6355k {
        @RecentlyNonNull
        public static AbstractC6355k m20565s(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof AbstractC6355k) {
                return (AbstractC6355k) queryLocalInterface;
            }
            return new C6386t1(iBinder);
        }
    }

    @RecentlyNonNull
    Account zzb();
}
