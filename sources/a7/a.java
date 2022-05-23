package a7;

import java.util.NoSuchElementException;
import z6.j;

public abstract class a<E> extends t0<E> {
    public final int f590a;
    public int f591b;

    public a(int i10, int i11) {
        j.k(i11, i10);
        this.f590a = i10;
        this.f591b = i11;
    }

    public abstract E a(int i10);

    @Override
    public final boolean hasNext() {
        return this.f591b < this.f590a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f591b > 0;
    }

    @Override
    public final E next() {
        if (hasNext()) {
            int i10 = this.f591b;
            this.f591b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f591b;
    }

    @Override
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f591b - 1;
            this.f591b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f591b - 1;
    }
}
