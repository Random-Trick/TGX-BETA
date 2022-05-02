package p021b6;

import java.util.NoSuchElementException;

public abstract class AbstractC1254d<E> extends AbstractC1272m<E> {
    public final int f4615a;
    public int f4616b;

    public AbstractC1254d(int i, int i2) {
        C1250b.m37824b(i2, i, "index");
        this.f4615a = i;
        this.f4616b = i2;
    }

    public abstract E mo37819a(int i);

    @Override
    public final boolean hasNext() {
        return this.f4616b < this.f4615a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f4616b > 0;
    }

    @Override
    public final E next() {
        if (hasNext()) {
            int i = this.f4616b;
            this.f4616b = i + 1;
            return mo37819a(i);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f4616b;
    }

    @Override
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f4616b - 1;
            this.f4616b = i;
            return mo37819a(i);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f4616b - 1;
    }
}
