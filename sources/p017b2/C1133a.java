package p017b2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class C1133a {
    public static long f4335a;
    public static Method f4336b;

    public static void m38317a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C1134b.m38312a(str);
        }
    }

    public static void m38316b() {
        if (Build.VERSION.SDK_INT >= 18) {
            C1134b.m38311b();
        }
    }

    public static void m38315c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean m38314d() {
        try {
            if (f4336b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m38313e();
    }

    public static boolean m38313e() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f4336b == null) {
                    f4335a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f4336b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f4336b.invoke(null, Long.valueOf(f4335a))).booleanValue();
            } catch (Exception e) {
                m38315c("isTagEnabled", e);
            }
        }
        return false;
    }
}
