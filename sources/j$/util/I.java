package j$.util;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class I implements Iterator, Consumer {
    boolean f14322a = false;
    Object f14323b;
    final H f14324c;

    public I(H h10) {
        this.f14324c = h10;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14322a) {
            this.f14324c.a(this);
        }
        return this.f14322a;
    }

    @Override
    public final void l(Object obj) {
        this.f14322a = true;
        this.f14323b = obj;
    }

    @Override
    public final Object next() {
        if (this.f14322a || hasNext()) {
            this.f14322a = false;
            return this.f14323b;
        }
        throw new NoSuchElementException();
    }
}
