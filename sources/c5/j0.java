package c5;

import android.os.Trace;

public final class j0 {
    public static void a(String str) {
        if (l0.f4841a >= 18) {
            b(str);
        }
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (l0.f4841a >= 18) {
            d();
        }
    }

    public static void d() {
        Trace.endSection();
    }
}
