package p020b5;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

public final class C1230s {
    public static int f4561a = 0;
    public static boolean f4562b = true;

    @Pure
    public static String m37889a(String str, Throwable th) {
        String e = m37885e(th);
        if (TextUtils.isEmpty(e)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace = e.replace("\n", "\n  ");
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 4 + String.valueOf(replace).length());
        sb2.append(valueOf);
        sb2.append("\n  ");
        sb2.append(replace);
        sb2.append('\n');
        return sb2.toString();
    }

    @Pure
    public static void m37888b(String str, String str2) {
        if (f4561a == 0) {
            Log.d(str, str2);
        }
    }

    @Pure
    public static void m37887c(String str, String str2) {
        if (f4561a <= 3) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void m37886d(String str, String str2, Throwable th) {
        m37887c(str, m37889a(str2, th));
    }

    @Pure
    public static String m37885e(Throwable th) {
        if (th == null) {
            return null;
        }
        if (m37882h(th)) {
            return "UnknownHostException (no network)";
        }
        if (!f4562b) {
            return th.getMessage();
        }
        return Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    @Pure
    public static void m37884f(String str, String str2) {
        if (f4561a <= 1) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void m37883g(String str, String str2, Throwable th) {
        m37884f(str, m37889a(str2, th));
    }

    @Pure
    public static boolean m37882h(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    @Pure
    public static void m37881i(String str, String str2) {
        if (f4561a <= 2) {
            Log.w(str, str2);
        }
    }

    @Pure
    public static void m37880j(String str, String str2, Throwable th) {
        m37881i(str, m37889a(str2, th));
    }
}
