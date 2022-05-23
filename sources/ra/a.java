package ra;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<T> implements Iterator<T>, sa.a, j$.util.Iterator {
    public final T[] f21800a;
    public int f21801b;

    public a(T[] tArr) {
        k.e(tArr, "array");
        this.f21800a = tArr;
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
        return this.f21801b < this.f21800a.length;
    }

    @Override
    public T next() {
        try {
            T[] tArr = this.f21800a;
            int i10 = this.f21801b;
            this.f21801b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f21801b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
