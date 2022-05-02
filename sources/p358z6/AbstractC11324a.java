package p358z6;

import java.util.NoSuchElementException;
import p343y6.C10433i;

public abstract class AbstractC11324a<E> extends AbstractC11405s0<E> {
    public final int f36253a;
    public int f36254b;

    public AbstractC11324a(int i, int i2) {
        C10433i.m5127k(i2, i);
        this.f36253a = i;
        this.f36254b = i2;
    }

    public abstract E mo755a(int i);

    @Override
    public final boolean hasNext() {
        return this.f36254b < this.f36253a;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f36254b > 0;
    }

    @Override
    public final E next() {
        if (hasNext()) {
            int i = this.f36254b;
            this.f36254b = i + 1;
            return mo755a(i);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.f36254b;
    }

    @Override
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f36254b - 1;
            this.f36254b = i;
            return mo755a(i);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.f36254b - 1;
    }
}
