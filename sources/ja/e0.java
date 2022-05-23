package ja;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import sa.a;

public abstract class e0 implements Iterator<Long>, a, j$.util.Iterator {
    public abstract long d();

    @Override
    public void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer<? super Long> consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public Object next() {
        return Long.valueOf(d());
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
