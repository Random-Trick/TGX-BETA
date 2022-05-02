package p342y5;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import p126j$.util.concurrent.ConcurrentHashMap;

public final class C10414v {
    public final ConcurrentHashMap<C10413u, List<Throwable>> f33484a = new ConcurrentHashMap<>(16, 0.75f, 10);
    public final ReferenceQueue<Throwable> f33485b = new ReferenceQueue<>();

    public final List<Throwable> m5156a(Throwable th, boolean z) {
        ReferenceQueue<Throwable> referenceQueue = this.f33485b;
        while (true) {
            Reference<? extends Throwable> poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.f33484a.remove(poll);
            referenceQueue = this.f33485b;
        }
        List<Throwable> list = this.f33484a.get(new C10413u(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f33484a.putIfAbsent(new C10413u(th, this.f33485b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
