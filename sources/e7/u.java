package e7;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import k7.a;
import k7.b;
import k7.c;
import k7.d;

public class u implements d, c {
    public final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> f11344a = new HashMap();
    public Queue<a<?>> f11345b = new ArrayDeque();
    public final Executor f11346c;

    public u(Executor executor) {
        this.f11346c = executor;
    }

    public static void e(Map.Entry entry, a aVar) {
        ((b) entry.getKey()).a(aVar);
    }

    @Override
    public <T> void a(Class<T> cls, b<? super T> bVar) {
        g(cls, this.f11346c, bVar);
    }

    public void c() {
        Queue<a<?>> queue;
        synchronized (this) {
            queue = this.f11345b;
            if (queue != null) {
                this.f11345b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (a<?> aVar : queue) {
                f(aVar);
            }
        }
    }

    public final synchronized Set<Map.Entry<b<Object>, Executor>> d(a<?> aVar) {
        ConcurrentHashMap<b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f11344a.get(aVar.a());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    public void f(final a<?> aVar) {
        c0.b(aVar);
        synchronized (this) {
            Queue<a<?>> queue = this.f11345b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<b<Object>, Executor> entry : d(aVar)) {
                entry.getValue().execute(new Runnable() {
                    @Override
                    public final void run() {
                        u.e(entry, aVar);
                    }
                });
            }
        }
    }

    public synchronized <T> void g(Class<T> cls, Executor executor, b<? super T> bVar) {
        c0.b(cls);
        c0.b(bVar);
        c0.b(executor);
        if (!this.f11344a.containsKey(cls)) {
            this.f11344a.put(cls, new ConcurrentHashMap<>());
        }
        this.f11344a.get(cls).put(bVar, executor);
    }
}
