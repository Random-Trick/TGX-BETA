package p143k0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public abstract class AbstractC6034d<T> implements Iterator<T>, p126j$.util.Iterator {
    public int f19194a;
    public int f19195b;
    public boolean f19196c;

    public AbstractC6034d(int i) {
        this.f19194a = i;
    }

    public abstract T mo21513a(int i);

    public abstract void mo21512b(int i);

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
        return this.f19195b < this.f19194a;
    }

    @Override
    public T next() {
        if (hasNext()) {
            T a = mo21513a(this.f19195b);
            this.f19195b++;
            this.f19196c = true;
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        if (this.f19196c) {
            int i = this.f19195b - 1;
            this.f19195b = i;
            mo21512b(i);
            this.f19194a--;
            this.f19196c = false;
            return;
        }
        throw new IllegalStateException();
    }
}
