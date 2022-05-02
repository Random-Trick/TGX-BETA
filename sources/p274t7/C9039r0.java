package p274t7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p164l6.C6402a;

public final class C9039r0 {
    public static final long f29006a = TimeUnit.MINUTES.toMillis(1);
    public static final Object f29007b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")
    public static C6402a f29008c;

    @GuardedBy("WakeLockHolder.syncObject")
    public static void m10617a(Context context) {
        if (f29008c == null) {
            C6402a aVar = new C6402a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f29008c = aVar;
            aVar.m20464c(true);
        }
    }

    public static void m10616b(Intent intent) {
        synchronized (f29007b) {
            if (f29008c != null && m10615c(intent)) {
                m10614d(intent, false);
                f29008c.m20465b();
            }
        }
    }

    public static boolean m10615c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void m10614d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static ComponentName m10613e(Context context, Intent intent) {
        synchronized (f29007b) {
            m10617a(context);
            boolean c = m10615c(intent);
            m10614d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!c) {
                f29008c.m20466a(f29006a);
            }
            return startService;
        }
    }
}
