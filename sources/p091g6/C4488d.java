package p091g6;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import javax.annotation.concurrent.GuardedBy;
import p103h6.AbstractC5016w;
import p103h6.C5014u;
import p118i5.C5222f;
import p119i6.C5241b;
import p119i6.C5245f;
import p163l5.C6378r;

public final class C4488d {
    @GuardedBy("MapsInitializer.class")
    public static boolean f14827a = false;

    public static synchronized int m27518a(@RecentlyNonNull Context context) {
        synchronized (C4488d.class) {
            C6378r.m20505l(context, "Context is null");
            if (f14827a) {
                return 0;
            }
            try {
                AbstractC5016w a = C5014u.m24315a(context);
                try {
                    C4480b.m27537e(a.mo24309k());
                    C5241b.m23555b(a.mo24308t0());
                    f14827a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new C5245f(e);
                }
            } catch (C5222f e2) {
                return e2.f17370a;
            }
        }
    }
}
