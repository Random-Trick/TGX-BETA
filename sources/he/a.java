package he;

import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.N;
import zd.ya;

public class a {
    public static final AtomicBoolean f13805a = new AtomicBoolean(false);

    public static void a() {
        if (!f13805a.get()) {
            try {
                throw new AssertionError("Trying to do something before application initialization. Log: \n" + c.c().b());
            } catch (AssertionError e10) {
                Tracer.f(e10);
            }
        }
    }

    public static synchronized void b() {
        synchronized (a.class) {
            AtomicBoolean atomicBoolean = f13805a;
            if (atomicBoolean.get()) {
                c();
                return;
            }
            if (fd.a.f11887i) {
                b.d().g();
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            N.init();
            i.c2();
            boolean needMeasureLaunchSpeed = Log.needMeasureLaunchSpeed();
            if (needMeasureLaunchSpeed) {
                Log.i("==== INITIALIZATION STARTED IN %dMS ===\nManufacturer: %s, Product: %s", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis), Build.MANUFACTURER, Build.PRODUCT);
                uptimeMillis = SystemClock.uptimeMillis();
            }
            ya.o1();
            if (needMeasureLaunchSpeed) {
                Log.i("==== INITIALIZATION FINISHED IN %dms ===", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
            atomicBoolean.set(true);
        }
    }

    public static void c() {
        ya.o1().g3().o();
    }
}
