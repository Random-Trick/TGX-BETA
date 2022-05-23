package m5;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import r5.p;

public final class r {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, @RecentlyNonNull Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z10, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(@RecentlyNonNull Handler handler) {
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

    public static void e(@RecentlyNonNull Handler handler, @RecentlyNonNull String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void f(@RecentlyNonNull String str) {
        if (!p.a()) {
            throw new IllegalStateException(str);
        }
    }

    @RecentlyNonNull
    @EnsuresNonNull({"#1"})
    public static String g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @RecentlyNonNull
    @EnsuresNonNull({"#1"})
    public static String h(String str, @RecentlyNonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void i() {
        j("Must not be called on the main application thread");
    }

    public static void j(@RecentlyNonNull String str) {
        if (p.a()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    public static <T> T k(T t10) {
        Objects.requireNonNull(t10, "null reference");
        return t10;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T l(@RecentlyNonNull T t10, @RecentlyNonNull Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void m(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void n(boolean z10, @RecentlyNonNull Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void o(boolean z10, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
