package qa;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;
import p251ra.AbstractC8415a;

public final class C8286a<T> implements Iterator<T>, AbstractC8415a, p126j$.util.Iterator {
    public final T[] f26764a;
    public int f26765b;

    public C8286a(T[] tArr) {
        C8298k.m12934e(tArr, "array");
        this.f26764a = tArr;
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
    public boolean hasNext() {
        return this.f26765b < this.f26764a.length;
    }

    @Override
    public T next() {
        try {
            T[] tArr = this.f26764a;
            int i = this.f26765b;
            this.f26765b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f26765b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}