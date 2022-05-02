package p016b1;

import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

public final class C1132h {
    public static void m38329a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m38328b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int m38327c(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        } else if (i <= i3) {
            return i;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static int m38326d(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T m38325e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T m38324f(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void m38323g(boolean z) {
        m38322h(z, null);
    }

    public static void m38322h(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static <T extends CharSequence> T m38321i(T t, Object obj) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
}
