package j$.util;

import j$.util.function.AbstractC0278f;
import j$.util.function.Consumer;

public interface z extends F {
    @Override
    boolean a(Consumer consumer);

    @Override
    void forEachRemaining(Consumer consumer);

    boolean j(AbstractC0278f fVar);

    void m(AbstractC0278f fVar);

    @Override
    z trySplit();
}
