package c6;

import java.util.NoSuchElementException;

public abstract class d<E> extends m<E> {
    public final int f4944a;
    public int f4945b;

    public d(int i10, int i11) {
        b.b(i11, i10, "index");
        this.f4944a = i10;
        this.f4945b = i11;
    }

    public abstract E a(int i10);

    @Override
    public final boolean hasNext() {
        return this.f4945b < this.f4944a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f4945b > 0;
    }

    @Override
    public final E next() {
        if (hasNext()) {
            int i10 = this.f4945b;
            this.f4945b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f4945b;
    }

    @Override
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f4945b - 1;
            this.f4945b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f4945b - 1;
    }
}
