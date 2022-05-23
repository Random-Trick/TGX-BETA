package y6;

import android.text.TextUtils;
import java.util.Objects;

public final class b {
    public static <T> T a(T t10) {
        Objects.requireNonNull(t10, "null reference");
        return t10;
    }

    public static <T> T b(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String c(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void d(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }
}
