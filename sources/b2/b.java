package b2;

import android.os.Trace;

public final class b {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
