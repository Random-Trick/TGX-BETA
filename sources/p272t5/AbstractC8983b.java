package p272t5;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;
import p327x5.BinderC10098b;

public interface AbstractC8983b extends IInterface {

    public static abstract class AbstractBinderC8984a extends BinderC10098b implements AbstractC8983b {
        public AbstractBinderC8984a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        public static AbstractC8983b m10769s(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof AbstractC8983b) {
                return (AbstractC8983b) queryLocalInterface;
            }
            return new C8995l(iBinder);
        }
    }
}
