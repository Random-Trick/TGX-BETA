package z5;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;

public final class v {
    public final ConcurrentHashMap<u, List<Throwable>> f26999a = new ConcurrentHashMap<>(16, 0.75f, 10);
    public final ReferenceQueue<Throwable> f27000b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th, boolean z10) {
        ReferenceQueue<Throwable> referenceQueue = this.f27000b;
        while (true) {
            Reference<? extends Throwable> poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.f26999a.remove(poll);
            referenceQueue = this.f27000b;
        }
        List<Throwable> list = this.f26999a.get(new u(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f26999a.putIfAbsent(new u(th, this.f27000b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
