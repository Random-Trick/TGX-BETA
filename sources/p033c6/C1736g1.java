package p033c6;

import java.util.Iterator;
import java.util.Objects;

public final class C1736g1 {
    public static void m36037a(Iterator<?> it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
