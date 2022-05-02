package p043d3;

import java.util.Objects;

public final class C3591d {
    public static <T> void m29917a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    public static <T> T m29916b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T m29915c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
