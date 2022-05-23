package a7;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import z6.j;

public abstract class r0<F, T> implements Iterator<T>, j$.util.Iterator {
    public final Iterator<? extends F> f663a;

    public r0(Iterator<? extends F> it) {
        this.f663a = (Iterator) j.i(it);
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
        return this.f663a.hasNext();
    }

    @Override
    public final T next() {
        return a(this.f663a.next());
    }

    @Override
    public final void remove() {
        this.f663a.remove();
    }
}
