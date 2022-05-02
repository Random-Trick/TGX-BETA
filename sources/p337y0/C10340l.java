package p337y0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
public final class C10340l {
    public static long f33204a;
    public static Method f33205b;
    public static Method f33206c;
    public static Method f33207d;
    public static Method f33208e;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                f33204a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f33205b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f33206c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f33207d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f33208e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    public static void m5398a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void m5397b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
