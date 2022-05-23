package d6;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Objects;

public abstract class t1<F, T> implements Iterator<T>, j$.util.Iterator {
    public final Iterator<? extends F> f6981a;

    public t1(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f6981a = it;
    }

    public abstract T a(F f10);

    @Override
    public void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override
    public void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final boolean hasNext() {
        return this.f6981a.hasNext();
    }

    @Override
    public final T next() {
        return a(this.f6981a.next());
    }

    @Override
    public final void remove() {
        this.f6981a.remove();
    }
}
