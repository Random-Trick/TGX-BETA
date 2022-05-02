package p052dc;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import p025bc.C1314e;
import p123ia.C5295h0;
import p278tb.C9132z;
import p333xb.C10180e;
import qa.C8298k;
import za.C11452o;
import za.C11457q;

public final class C3973c {
    public static final Map<String, String> f13345b;
    public static final C3973c f13346c = new C3973c();
    public static final CopyOnWriteArraySet<Logger> f13344a = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = C9132z.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C9132z.class.getName();
        C8298k.m12935d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C1314e.class.getName();
        C8298k.m12935d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C10180e.class.getName();
        C8298k.m12935d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f13345b = C5295h0.m23415l(linkedHashMap);
    }

    public final void m29440a(String str, int i, String str2, Throwable th) {
        int min;
        C8298k.m12934e(str, "loggerName");
        C8298k.m12934e(str2, "message");
        String d = m29437d(str);
        if (Log.isLoggable(d, i)) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                int M = C11452o.m608M(str2, '\n', i2, false, 4, null);
                if (M == -1) {
                    M = length;
                }
                while (true) {
                    min = Math.min(M, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    C8298k.m12935d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, d, substring);
                    if (min >= M) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    public final void m29439b() {
        for (Map.Entry<String, String> entry : f13345b.entrySet()) {
            m29438c(entry.getKey(), entry.getValue());
        }
    }

    public final void m29438c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f13344a.add(logger)) {
            C8298k.m12935d(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(C3974d.f13347a);
        }
    }

    public final String m29437d(String str) {
        String str2 = f13345b.get(str);
        return str2 != null ? str2 : C11457q.m565w0(str, 23);
    }
}
