package p163l5;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p232q5.C8256p;

public final class C6378r {
    public static void m20517a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m20516b(boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void m20515c(boolean z, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void m20514d(@RecentlyNonNull Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb2.append("Must be called on ");
            sb2.append(name2);
            sb2.append(" thread, but got ");
            sb2.append(name);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public static void m20513e(@RecentlyNonNull Handler handler, @RecentlyNonNull String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void m20512f(@RecentlyNonNull String str) {
        if (!C8256p.m13021a()) {
            throw new IllegalStateException(str);
        }
    }

    @RecentlyNonNull
    @EnsuresNonNull({"#1"})
    public static String m20511g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @RecentlyNonNull
    @EnsuresNonNull({"#1"})
    public static String m20510h(String str, @RecentlyNonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void m20509i() {
        m20508j("Must not be called on the main application thread");
    }

    public static void m20508j(@RecentlyNonNull String str) {
        if (C8256p.m13021a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    public static <T> T m20507k(T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T m20506l(@RecentlyNonNull T t, @RecentlyNonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void m20505m(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m20504n(boolean z, @RecentlyNonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void m20503o(boolean z, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
