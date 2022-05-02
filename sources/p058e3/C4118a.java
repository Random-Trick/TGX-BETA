package p058e3;

import android.util.Log;

public final class C4118a {
    public static void m28886a(String str, String str2, Object obj) {
        Log.d(m28883d(str), String.format(str2, obj));
    }

    public static void m28885b(String str, String str2, Object... objArr) {
        Log.d(m28883d(str), String.format(str2, objArr));
    }

    public static void m28884c(String str, String str2, Throwable th) {
        Log.e(m28883d(str), str2, th);
    }

    public static String m28883d(String str) {
        return "TransportRuntime." + str;
    }

    public static void m28882e(String str, String str2) {
        Log.i(m28883d(str), str2);
    }

    public static void m28881f(String str, String str2, Object obj) {
        Log.w(m28883d(str), String.format(str2, obj));
    }
}
