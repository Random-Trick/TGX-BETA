package e7;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import n7.b;

public class x<T> implements b<Set<T>> {
    public volatile Set<T> f11351b = null;
    public volatile Set<b<T>> f11350a = Collections.newSetFromMap(new ConcurrentHashMap());

    public x(Collection<b<T>> collection) {
        this.f11350a.addAll(collection);
    }

    public static x<?> b(Collection<b<?>> collection) {
        return new x<>((Set) collection);
    }

    public synchronized void a(b<T> bVar) {
        if (this.f11351b == null) {
            this.f11350a.add(bVar);
        } else {
            this.f11351b.add(bVar.get());
        }
    }

    public Set<T> get() {
        if (this.f11351b == null) {
            synchronized (this) {
                if (this.f11351b == null) {
                    this.f11351b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f11351b);
    }

    public final synchronized void d() {
        for (b<T> bVar : this.f11350a) {
            this.f11351b.add(bVar.get());
        }
        this.f11350a = null;
    }
}
