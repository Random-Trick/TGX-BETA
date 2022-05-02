package p033c6;

import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class C1839n1 {
    @CheckForNull
    public static <V> V m35974a(Map<?, V> map, @CheckForNull Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean m35973b(Map<?, ?> map, @CheckForNull Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
