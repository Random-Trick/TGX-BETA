package p274t7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p164l6.C6402a;

public final class C9039r0 {
    public static final long f29009a = TimeUnit.MINUTES.toMillis(1);
    public static final Object f29010b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")
    public static C6402a f29011c;

    @GuardedBy("WakeLockHolder.syncObject")
    public static void m10616a(Context context) {
        if (f29011c == null) {
            C6402a aVar = new C6402a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f29011c = aVar;
            aVar.m20465c(true);
        }
    }

    public static void m10615b(Intent intent) {
        synchronized (f29010b) {
            if (f29011c != null && m10614c(intent)) {
                m10613d(intent, false);
                f29011c.m20466b();
            }
        }
    }

    public static boolean m10614c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void m10613d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static ComponentName m10612e(Context context, Intent intent) {
        synchronized (f29010b) {
            m10616a(context);
            boolean c = m10614c(intent);
            m10613d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!c) {
                f29011c.m20467a(f29009a);
            }
            return startService;
        }
    }
}
