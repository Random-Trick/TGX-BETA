package ec;

import ab.o;
import ab.q;
import android.util.Log;
import cc.e;
import ja.h0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import ra.k;
import ub.z;

public final class c {
    public static final Map<String, String> f11502b;
    public static final c f11503c = new c();
    public static final CopyOnWriteArraySet<Logger> f11501a = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r12 = z.class.getPackage();
        String name = r12 != null ? r12.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = z.class.getName();
        k.d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = e.class.getName();
        k.d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = yb.e.class.getName();
        k.d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f11502b = h0.l(linkedHashMap);
    }

    public final void a(String str, int i10, String str2, Throwable th) {
        int min;
        k.e(str, "loggerName");
        k.e(str2, "message");
        String d10 = d(str);
        if (Log.isLoggable(d10, i10)) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            int i11 = 0;
            int length = str2.length();
            while (i11 < length) {
                int M = o.M(str2, '\n', i11, false, 4, null);
                if (M == -1) {
                    M = length;
                }
                while (true) {
                    min = Math.min(M, i11 + 4000);
                    String substring = str2.substring(i11, min);
                    k.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i10, d10, substring);
                    if (min >= M) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f11502b.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f11501a.add(logger)) {
            k.d(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.f11504a);
        }
    }

    public final String d(String str) {
        String str2 = f11502b.get(str);
        return str2 != null ? str2 : q.w0(str, 23);
    }
}
