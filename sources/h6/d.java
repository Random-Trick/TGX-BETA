package h6;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import i6.u;
import i6.w;
import j6.b;
import j6.f;
import javax.annotation.concurrent.GuardedBy;
import m5.r;

public final class d {
    @GuardedBy("MapsInitializer.class")
    public static boolean f12535a = false;

    public static synchronized int a(@RecentlyNonNull Context context) {
        synchronized (d.class) {
            r.l(context, "Context is null");
            if (f12535a) {
                return 0;
            }
            try {
                w a10 = u.a(context);
                try {
                    b.e(a10.k());
                    b.b(a10.v0());
                    f12535a = true;
                    return 0;
                } catch (RemoteException e10) {
                    throw new f(e10);
                }
            } catch (j5.f e11) {
                return e11.f15076a;
            }
        }
    }
}
