package p033c6;

import java.util.Iterator;
import java.util.Objects;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public abstract class AbstractC1923t1<F, T> implements Iterator<T>, p126j$.util.Iterator {
    public final Iterator<? extends F> f6917a;

    public AbstractC1923t1(Iterator<? extends F> it) {
        Objects.requireNonNull(it);
        this.f6917a = it;
    }

    public abstract T mo35908a(F f);

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
        return this.f6917a.hasNext();
    }

    @Override
    public final T next() {
        return mo35908a(this.f6917a.next());
    }

    @Override
    public final void remove() {
        this.f6917a.remove();
    }
}
