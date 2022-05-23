package y0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
public final class l {
    public static long f26464a;
    public static Method f26465b;
    public static Method f26466c;
    public static Method f26467d;
    public static Method f26468e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f26464a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f26465b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f26466c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f26467d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f26468e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
