package p058e3;

import android.util.Log;

public final class C4118a {
    public static void m28884a(String str, String str2, Object obj) {
        Log.d(m28881d(str), String.format(str2, obj));
    }

    public static void m28883b(String str, String str2, Object... objArr) {
        Log.d(m28881d(str), String.format(str2, objArr));
    }

    public static void m28882c(String str, String str2, Throwable th) {
        Log.e(m28881d(str), str2, th);
    }

    public static String m28881d(String str) {
        return "TransportRuntime." + str;
    }

    public static void m28880e(String str, String str2) {
        Log.i(m28881d(str), str2);
    }

    public static void m28879f(String str, String str2, Object obj) {
        Log.w(m28881d(str), String.format(str2, obj));
    }
}
