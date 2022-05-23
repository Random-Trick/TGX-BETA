package j$.util;

import j$.util.Iterator;
import j$.util.function.AbstractC0278f;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class L implements AbstractC0289q, AbstractC0278f, Iterator {
    boolean f14331a = false;
    double f14332b;
    final z f14333c;

    public L(z zVar) {
        this.f14333c = zVar;
    }

    public final void forEachRemaining(AbstractC0278f fVar) {
        Objects.requireNonNull(fVar);
        while (hasNext()) {
            fVar.c(nextDouble());
        }
    }

    @Override
    public final void c(double d10) {
        this.f14331a = true;
        this.f14332b = d10;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.b(this, consumer);
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14331a) {
            this.f14333c.j(this);
        }
        return this.f14331a;
    }

    @Override
    public final Double next() {
        if (!Y.f14360a) {
            return Double.valueOf(nextDouble());
        }
        Y.a(L.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    public final double nextDouble() {
        if (this.f14331a || hasNext()) {
            this.f14331a = false;
            return this.f14332b;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        Iterator.CC.a();
        throw null;
    }
}
