package ja;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import ra.k;
import sa.a;

public final class c0<T> implements Iterator<a0<? extends T>>, a, j$.util.Iterator {
    public final Iterator<T> f15166a;
    public int f15167b;

    public c0(Iterator<? extends T> it) {
        k.e(it, "iterator");
        this.f15166a = it;
    }

    public final a0<T> next() {
        int i10 = this.f15167b;
        this.f15167b = i10 + 1;
        if (i10 < 0) {
            n.n();
        }
        return new a0<>(i10, this.f15166a.next());
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
        return this.f15166a.hasNext();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
