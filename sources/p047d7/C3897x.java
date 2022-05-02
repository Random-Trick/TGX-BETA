package p047d7;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import p126j$.util.concurrent.ConcurrentHashMap;
import p178m7.AbstractC6794b;

public class C3897x<T> implements AbstractC6794b<Set<T>> {
    public volatile Set<T> f13178b = null;
    public volatile Set<AbstractC6794b<T>> f13177a = Collections.newSetFromMap(new ConcurrentHashMap());

    public C3897x(Collection<AbstractC6794b<T>> collection) {
        this.f13177a.addAll(collection);
    }

    public static C3897x<?> m29625b(Collection<AbstractC6794b<?>> collection) {
        return new C3897x<>((Set) collection);
    }

    public synchronized void m29626a(AbstractC6794b<T> bVar) {
        if (this.f13178b == null) {
            this.f13177a.add(bVar);
        } else {
            this.f13178b.add(bVar.get());
        }
    }

    public Set<T> get() {
        if (this.f13178b == null) {
            synchronized (this) {
                if (this.f13178b == null) {
                    this.f13178b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m29623d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f13178b);
    }

    public final synchronized void m29623d() {
        for (AbstractC6794b<T> bVar : this.f13177a) {
            this.f13178b.add(bVar.get());
        }
        this.f13177a = null;
    }
}
