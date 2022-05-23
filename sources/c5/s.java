package c5;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

public final class s {
    public static int f4891a = 0;
    public static boolean f4892b = true;

    @Pure
    public static String a(String str, Throwable th) {
        String e10 = e(th);
        if (TextUtils.isEmpty(e10)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace = e10.replace("\n", "\n  ");
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 4 + String.valueOf(replace).length());
        sb2.append(valueOf);
        sb2.append("\n  ");
        sb2.append(replace);
        sb2.append('\n');
        return sb2.toString();
    }

    @Pure
    public static void b(String str, String str2) {
        if (f4891a == 0) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void c(String str, String str2) {
        if (f4891a <= 3) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    @Pure
    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        if (h(th)) {
            return "UnknownHostException (no network)";
        }
        if (!f4892b) {
            return th.getMessage();
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    @Pure
    public static void f(String str, String str2) {
        if (f4891a <= 1) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void g(String str, String str2, Throwable th) {
        f(str, a(str2, th));
    }

    @Pure
    public static boolean h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    @Pure
    public static void i(String str, String str2) {
        if (f4891a <= 2) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void j(String str, String str2, Throwable th) {
        i(str, a(str2, th));
    }
}
