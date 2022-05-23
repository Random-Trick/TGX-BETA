package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import j$.util.function.v;
import java.util.NoSuchElementException;
import java.util.Objects;

final class K implements AbstractC0415w, v, Iterator {
    boolean f14328a = false;
    long f14329b;
    final D f14330c;

    public K(D d10) {
        this.f14330c = d10;
    }

    public final void forEachRemaining(v vVar) {
        Objects.requireNonNull(vVar);
        while (hasNext()) {
            vVar.e(nextLong());
        }
    }

    @Override
    public final void e(long j10) {
        this.f14328a = true;
        this.f14329b = j10;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof v) {
            forEachRemaining((v) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!Y.f14360a) {
            while (hasNext()) {
                consumer.l(Long.valueOf(nextLong()));
            }
            return;
        }
        Y.a(K.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
        throw null;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14328a) {
            this.f14330c.g(this);
        }
        return this.f14328a;
    }

    @Override
    public final Long next() {
        if (!Y.f14360a) {
            return Long.valueOf(nextLong());
        }
        Y.a(K.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    public final long nextLong() {
        if (this.f14328a || hasNext()) {
            this.f14328a = false;
            return this.f14329b;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        Iterator.CC.a();
        throw null;
    }
}
