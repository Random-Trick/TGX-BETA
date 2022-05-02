package p126j$.util;

import java.util.Objects;
import p126j$.util.function.Consumer;

public interface Iterator<E> {

    public final class CC<E> {
        public static void $default$forEachRemaining(java.util.Iterator it, Consumer consumer) {
            Objects.requireNonNull(consumer);
            while (it.hasNext()) {
                consumer.mo22129k(it.next());
            }
        }

        public static void m22603a() {
            throw new UnsupportedOperationException("remove");
        }
    }

    void forEachRemaining(Consumer<? super E> consumer);

    boolean hasNext();

    E next();

    void remove();
}
