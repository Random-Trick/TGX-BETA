package j$.util;

import j$.util.function.Consumer;
import j$.util.function.n;

public interface B extends F {
    @Override
    boolean a(Consumer consumer);

    @Override
    void forEachRemaining(Consumer consumer);

    boolean i(n nVar);

    void n(n nVar);

    @Override
    B trySplit();
}
