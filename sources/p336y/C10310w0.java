package p336y;

import java.util.HashMap;
import java.util.Map;

public final class C10310w0 {
    public static final Object f33167a = new Object();
    public static final Map<Object, AbstractC10304v> f33168b = new HashMap();

    public static AbstractC10304v m5493a(Object obj) {
        AbstractC10304v vVar;
        synchronized (f33167a) {
            vVar = f33168b.get(obj);
        }
        return vVar == null ? AbstractC10304v.f33158a : vVar;
    }
}
