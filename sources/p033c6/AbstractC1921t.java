package p033c6;

import java.util.NoSuchElementException;

public abstract class AbstractC1921t<E> extends AbstractC1951v1<E> {
    public final int f6914a;
    public int f6915b;

    public AbstractC1921t(int i, int i2) {
        C1893r.m35934b(i2, i, "index");
        this.f6914a = i;
        this.f6915b = i2;
    }

    public abstract E mo35906a(int i);

    @Override
    public final boolean hasNext() {
        return this.f6915b < this.f6914a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f6915b > 0;
    }

    @Override
    public final E next() {
        if (hasNext()) {
            int i = this.f6915b;
            this.f6915b = i + 1;
            return mo35906a(i);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f6915b;
    }

    @Override
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f6915b - 1;
            this.f6915b = i;
            return mo35906a(i);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f6915b - 1;
    }
}
