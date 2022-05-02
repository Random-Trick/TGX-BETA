package p047d7;

import java.util.Objects;

public final class C3864c0 {
    public static void m29713a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T m29712b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T m29711c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static void m29710d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
