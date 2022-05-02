package ge;

import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import p067ed.C4183a;
import p350yd.C10536ab;

public class C4858a {
    public static final AtomicBoolean f16587a = new AtomicBoolean(false);

    public static void m24994a() {
        if (!f16587a.get()) {
            try {
                throw new AssertionError("Trying to do something before application initialization. Log: \n" + C4861c.m24982c().m24983b());
            } catch (AssertionError e) {
                Tracer.m14774f(e);
            }
        }
    }

    public static synchronized void m24993b() {
        synchronized (C4858a.class) {
            AtomicBoolean atomicBoolean = f16587a;
            if (atomicBoolean.get()) {
                m24992c();
                return;
            }
            if (C4183a.f14091i) {
                C4859b.m24988d().m24985g();
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            C7888N.init();
            C4868i.m24726c2();
            boolean needMeasureLaunchSpeed = Log.needMeasureLaunchSpeed();
            if (needMeasureLaunchSpeed) {
                Log.m14719i("==== INITIALIZATION STARTED IN %dMS ===\nManufacturer: %s, Product: %s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis), Build.MANUFACTURER, Build.PRODUCT);
                uptimeMillis = SystemClock.uptimeMillis();
            }
            C10536ab.m4667o1();
            if (needMeasureLaunchSpeed) {
                Log.m14719i("==== INITIALIZATION FINISHED IN %dms ===", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
            atomicBoolean.set(true);
        }
    }

    public static void m24992c() {
        C10536ab.m4667o1().m4694g3().m28138o();
    }
}
