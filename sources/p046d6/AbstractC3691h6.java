package p046d6;

import java.util.NoSuchElementException;

public abstract class AbstractC3691h6<E> extends AbstractC3643c8<E> {
    public final int f12563a;
    public int f12564b;

    public AbstractC3691h6(int i, int i2) {
        C3669f4.m29840b(i2, i, "index");
        this.f12563a = i;
        this.f12564b = i2;
    }

    public abstract E mo29737a(int i);

    @Override
    public final boolean hasNext() {
        return this.f12564b < this.f12563a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f12564b > 0;
    }

    @Override
    public final E next() {
        if (hasNext()) {
            int i = this.f12564b;
            this.f12564b = i + 1;
            return mo29737a(i);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f12564b;
    }

    @Override
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f12564b - 1;
            this.f12564b = i;
            return mo29737a(i);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f12564b - 1;
    }
}
