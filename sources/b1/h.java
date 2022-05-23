package b1;

import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

public final class h {
    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int c(int i10, int i11, int i12, String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        } else if (i10 <= i12) {
            return i10;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
    }

    public static int d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T f(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void g(boolean z10) {
        h(z10, null);
    }

    public static void h(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static <T extends CharSequence> T i(T t10, Object obj) {
        if (!TextUtils.isEmpty(t10)) {
            return t10;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
}
