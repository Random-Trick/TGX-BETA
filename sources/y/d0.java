package y;

import androidx.camera.core.s1;
import androidx.camera.core.t1;
import androidx.camera.core.u;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class d0 {
    public final Object f26280a = new Object();
    public final Map<String, c0> f26281b = new LinkedHashMap();
    public final Set<c0> f26282c = new HashSet();

    public LinkedHashSet<c0> a() {
        LinkedHashSet<c0> linkedHashSet;
        synchronized (this.f26280a) {
            linkedHashSet = new LinkedHashSet<>(this.f26281b.values());
        }
        return linkedHashSet;
    }

    public void b(z zVar) {
        synchronized (this.f26280a) {
            try {
                try {
                    for (String str : zVar.a()) {
                        t1.a("CameraRepository", "Added camera: " + str);
                        this.f26281b.put(str, zVar.b(str));
                    }
                } catch (u e10) {
                    throw new s1(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
