package t6;

import java.util.Objects;

public final class b0 {
    public static Object a(Object obj) {
        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }

    public static void b(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
