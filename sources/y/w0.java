package y;

import java.util.HashMap;
import java.util.Map;

public final class w0 {
    public static final Object f26437a = new Object();
    public static final Map<Object, v> f26438b = new HashMap();

    public static v a(Object obj) {
        v vVar;
        synchronized (f26437a) {
            vVar = f26438b.get(obj);
        }
        return vVar == null ? v.f26428a : vVar;
    }
}
