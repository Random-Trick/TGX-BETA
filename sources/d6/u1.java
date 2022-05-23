package d6;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

public abstract class u1<E> implements Iterator<E>, j$.util.Iterator {
    @Override
    public void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
