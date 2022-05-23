package b2;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a {
    public static long f3696a;
    public static Method f3697b;

    public static void a(String str) {
        b.a(str);
    }

    public static void b() {
        b.b();
    }

    public static void c(String str, Exception exc) {
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
    public static boolean d() {
        try {
            if (f3697b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    public static boolean e() {
        try {
            if (f3697b == null) {
                f3696a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3697b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3697b.invoke(null, Long.valueOf(f3696a))).booleanValue();
        } catch (Exception e10) {
            c("isTagEnabled", e10);
            return false;
        }
    }
}
