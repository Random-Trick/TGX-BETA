package p126j$.util.concurrent;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import p126j$.util.function.BiConsumer;
import sun.misc.Unsafe;

public abstract class AbstractC5490a {
    public static void m22525a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.mo22180p(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static boolean m22524b(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
