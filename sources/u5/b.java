package u5;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.RecentlyNonNull;

public interface b extends IInterface {

    public static abstract class a extends y5.b implements b {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @RecentlyNonNull
        public static b r(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof b) {
                return (b) queryLocalInterface;
            }
            return new l(iBinder);
        }
    }
}
