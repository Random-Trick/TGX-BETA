package j$.util;

import j$.util.function.Consumer;
import java.util.Objects;

public interface Iterator<E> {

    public final class CC<E> {
        public static void $default$forEachRemaining(java.util.Iterator it, Consumer consumer) {
            Objects.requireNonNull(consumer);
            while (it.hasNext()) {
                consumer.l(it.next());
            }
        }

        public static void a() {
            throw new UnsupportedOperationException("remove");
        }
    }

    void forEachRemaining(Consumer<? super E> consumer);

    boolean hasNext();

    E next();

    void remove();
}
