package k0;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class d<T> implements Iterator<T>, j$.util.Iterator {
    public int f15574a;
    public int f15575b;
    public boolean f15576c;

    public d(int i10) {
        this.f15574a = i10;
    }

    public abstract T a(int i10);

    public abstract void b(int i10);

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
        return this.f15575b < this.f15574a;
    }

    @Override
    public T next() {
        if (hasNext()) {
            T a10 = a(this.f15575b);
            this.f15575b++;
            this.f15576c = true;
            return a10;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        if (this.f15576c) {
            int i10 = this.f15575b - 1;
            this.f15575b = i10;
            b(i10);
            this.f15574a--;
            this.f15576c = false;
            return;
        }
        throw new IllegalStateException();
    }
}
