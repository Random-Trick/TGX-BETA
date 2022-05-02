package p358z6;

import java.util.Iterator;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p343y6.C10433i;

public abstract class AbstractC11400q0<F, T> implements Iterator<T>, p126j$.util.Iterator {
    public final Iterator<? extends F> f36358a;

    public AbstractC11400q0(Iterator<? extends F> it) {
        this.f36358a = (Iterator) C10433i.m5129i(it);
    }

    public abstract T mo678a(F f);

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
        return this.f36358a.hasNext();
    }

    @Override
    public final T next() {
        return mo678a(this.f36358a.next());
    }

    @Override
    public final void remove() {
        this.f36358a.remove();
    }
}
