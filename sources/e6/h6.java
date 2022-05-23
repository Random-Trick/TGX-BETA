package e6;

import java.util.NoSuchElementException;

public abstract class h6<E> extends c8<E> {
    public final int f10825a;
    public int f10826b;

    public h6(int i10, int i11) {
        f4.b(i11, i10, "index");
        this.f10825a = i10;
        this.f10826b = i11;
    }

    public abstract E a(int i10);

    @Override
    public final boolean hasNext() {
        return this.f10826b < this.f10825a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f10826b > 0;
    }

    @Override
    public final E next() {
        if (hasNext()) {
            int i10 = this.f10826b;
            this.f10826b = i10 + 1;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f10826b;
    }

    @Override
    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f10826b - 1;
            this.f10826b = i10;
            return a(i10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f10826b - 1;
    }
}
