package p301v7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class C9876d {
    public static volatile C9876d f32163b;
    public final Set<AbstractC9878f> f32164a = new HashSet();

    public static C9876d m6706a() {
        C9876d dVar = f32163b;
        if (dVar == null) {
            synchronized (C9876d.class) {
                dVar = f32163b;
                if (dVar == null) {
                    dVar = new C9876d();
                    f32163b = dVar;
                }
            }
        }
        return dVar;
    }

    public Set<AbstractC9878f> m6705b() {
        Set<AbstractC9878f> unmodifiableSet;
        synchronized (this.f32164a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f32164a);
        }
        return unmodifiableSet;
    }
}
