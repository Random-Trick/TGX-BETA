package d6;

import java.util.NoSuchElementException;

public abstract class t<E> extends v1<E> {
    public final int f6978a;
    public int f6979b;

    public t(int i10, int i11) {
        r.b(i11, i10, "index");
        this.f6978a = i10;
        this.f6979b = i11;
    }

    public abstract E a(int i10);

    @Override
    public final boolean hasNext() {
        return this.f6979b < this.f6978a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f6979b > 0;
    }

    @Override
    public final E next() {
        if (hasNext()) {
            int i10 = this.f6979b;
            this.f6979b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f6979b;
    }

    @Override
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f6979b - 1;
            this.f6979b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f6979b - 1;
    }
}
