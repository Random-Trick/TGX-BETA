package d6;

import java.util.Iterator;
import java.util.Objects;

public final class g1 {
    public static void a(Iterator<?> it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
