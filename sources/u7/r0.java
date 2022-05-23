package u7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import m6.a;

public final class r0 {
    public static final long f23689a = TimeUnit.MINUTES.toMillis(1);
    public static final Object f23690b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")
    public static a f23691c;

    @GuardedBy("WakeLockHolder.syncObject")
    public static void a(Context context) {
        if (f23691c == null) {
            a aVar = new a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f23691c = aVar;
            aVar.c(true);
        }
    }

    public static void b(Intent intent) {
        synchronized (f23690b) {
            if (f23691c != null && c(intent)) {
                d(intent, false);
                f23691c.b();
            }
        }
    }

    public static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void d(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    public static ComponentName e(Context context, Intent intent) {
        synchronized (f23690b) {
            a(context);
            boolean c10 = c(intent);
            d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!c10) {
                f23691c.a(f23689a);
            }
            return startService;
        }
    }
}
