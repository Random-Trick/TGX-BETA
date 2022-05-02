package p328x6;

import android.text.TextUtils;
import java.util.Objects;

public final class C10106b {
    public static <T> T m6017a(T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    public static <T> T m6016b(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String m6015c(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void m6014d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
