package ja;

import java.util.Collections;
import java.util.Set;
import ra.k;

public class i0 {
    public static final <T> Set<T> a(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        k.d(singleton, "singleton(element)");
        return singleton;
    }
}
