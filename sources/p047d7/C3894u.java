package p047d7;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import p126j$.util.concurrent.ConcurrentHashMap;
import p135j7.AbstractC5894b;
import p135j7.AbstractC5895c;
import p135j7.AbstractC5896d;
import p135j7.C5893a;

public class C3894u implements AbstractC5896d, AbstractC5895c {
    public final Map<Class<?>, ConcurrentHashMap<AbstractC5894b<Object>, Executor>> f13171a = new HashMap();
    public Queue<C5893a<?>> f13172b = new ArrayDeque();
    public final Executor f13173c;

    public C3894u(Executor executor) {
        this.f13173c = executor;
    }

    public static void m29627e(Map.Entry entry, C5893a aVar) {
        ((AbstractC5894b) entry.getKey()).mo10609a(aVar);
    }

    @Override
    public <T> void mo21891a(Class<T> cls, AbstractC5894b<? super T> bVar) {
        m29625g(cls, this.f13173c, bVar);
    }

    public void m29629c() {
        Queue<C5893a<?>> queue;
        synchronized (this) {
            queue = this.f13172b;
            if (queue != null) {
                this.f13172b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C5893a<?> aVar : queue) {
                m29626f(aVar);
            }
        }
    }

    public final synchronized Set<Map.Entry<AbstractC5894b<Object>, Executor>> m29628d(C5893a<?> aVar) {
        ConcurrentHashMap<AbstractC5894b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f13171a.get(aVar.m21892a());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    public void m29626f(final C5893a<?> aVar) {
        C3864c0.m29712b(aVar);
        synchronized (this) {
            Queue<C5893a<?>> queue = this.f13172b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<AbstractC5894b<Object>, Executor> entry : m29628d(aVar)) {
                entry.getValue().execute(new Runnable() {
                    @Override
                    public final void run() {
                        C3894u.m29627e(entry, aVar);
                    }
                });
            }
        }
    }

    public synchronized <T> void m29625g(Class<T> cls, Executor executor, AbstractC5894b<? super T> bVar) {
        C3864c0.m29712b(cls);
        C3864c0.m29712b(bVar);
        C3864c0.m29712b(executor);
        if (!this.f13171a.containsKey(cls)) {
            this.f13171a.put(cls, new ConcurrentHashMap<>());
        }
        this.f13171a.get(cls).put(bVar, executor);
    }
}
