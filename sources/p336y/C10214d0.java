package p336y;

import androidx.camera.core.C0656t1;
import androidx.camera.core.C0662u1;
import androidx.camera.core.C0664v;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class C10214d0 {
    public final Object f32977a = new Object();
    public final Map<String, AbstractC10208c0> f32978b = new LinkedHashMap();
    public final Set<AbstractC10208c0> f32979c = new HashSet();

    public LinkedHashSet<AbstractC10208c0> m5718a() {
        LinkedHashSet<AbstractC10208c0> linkedHashSet;
        synchronized (this.f32977a) {
            linkedHashSet = new LinkedHashSet<>(this.f32978b.values());
        }
        return linkedHashSet;
    }

    public void m5717b(AbstractC10322z zVar) {
        synchronized (this.f32977a) {
            try {
                try {
                    for (String str : zVar.mo5460a()) {
                        C0662u1.m40653a("CameraRepository", "Added camera: " + str);
                        this.f32978b.put(str, zVar.mo5459b(str));
                    }
                } catch (C0664v e) {
                    throw new C0656t1(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}