package p021b6;

import java.util.Iterator;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public abstract class AbstractC1270l<E> implements Iterator<E>, p126j$.util.Iterator {
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
