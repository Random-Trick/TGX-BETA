package p043d3;

import java.util.Objects;

public final class C3591d {
    public static <T> void m29919a(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    public static <T> T m29918b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T m29917c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }
}
