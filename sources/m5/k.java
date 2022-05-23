package m5;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import y5.b;

public interface k extends IInterface {

    public static abstract class a extends b implements k {
        @RecentlyNonNull
        public static k r(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof k) {
                return (k) queryLocalInterface;
            }
            return new t1(iBinder);
        }
    }

    @RecentlyNonNull
    Account zzb();
}
