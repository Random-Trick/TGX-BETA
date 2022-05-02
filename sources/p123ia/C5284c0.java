package p123ia;

import java.util.Iterator;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p251ra.AbstractC8415a;
import qa.C8298k;

public final class C5284c0<T> implements Iterator<C5276a0<? extends T>>, AbstractC8415a, p126j$.util.Iterator {
    public final Iterator<T> f17477a;
    public int f17478b;

    public C5284c0(Iterator<? extends T> it) {
        C8298k.m12934e(it, "iterator");
        this.f17477a = it;
    }

    public final C5276a0<T> next() {
        int i = this.f17478b;
        this.f17478b = i + 1;
        if (i < 0) {
            C5304n.m23358n();
        }
        return new C5276a0<>(i, this.f17477a.next());
    }

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
        return this.f17477a.hasNext();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
