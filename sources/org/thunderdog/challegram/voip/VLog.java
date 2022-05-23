package org.thunderdog.challegram.voip;

import org.thunderdog.challegram.Log;

class VLog {
    public static void d(String str) {
        Log.d(2, "%s", str);
    }

    public static void e(String str) {
        Log.e(2, "%s", str);
    }

    public static void i(String str) {
        Log.i(2, "%s", str);
    }

    public static void v(String str) {
        Log.v(2, "%s", str);
    }

    public static void w(String str) {
        Log.w(2, "%s", str);
    }

    public static void e(Throwable th) {
        Log.e(2, th);
    }

    public static void e(String str, Throwable th) {
        Log.e(2, "%s", th, str);
    }
}
