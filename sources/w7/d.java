package w7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {
    public static volatile d f25808b;
    public final Set<f> f25809a = new HashSet();

    public static d a() {
        d dVar = f25808b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f25808b;
                if (dVar == null) {
                    dVar = new d();
                    f25808b = dVar;
                }
            }
        }
        return dVar;
    }

    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f25809a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f25809a);
        }
        return unmodifiableSet;
    }
}
