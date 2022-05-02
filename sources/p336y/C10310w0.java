package p336y;

import java.util.HashMap;
import java.util.Map;

public final class C10310w0 {
    public static final Object f33164a = new Object();
    public static final Map<Object, AbstractC10304v> f33165b = new HashMap();

    public static AbstractC10304v m5493a(Object obj) {
        AbstractC10304v vVar;
        synchronized (f33164a) {
            vVar = f33165b.get(obj);
        }
        return vVar == null ? AbstractC10304v.f33155a : vVar;
    }
}
