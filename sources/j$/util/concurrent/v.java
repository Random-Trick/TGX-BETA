package j$.util.concurrent;

import j$.util.function.BiConsumer;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

public abstract class v {
    public static void a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.q(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }
}
