package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import j$.util.function.n;
import java.util.NoSuchElementException;
import java.util.Objects;

final class J implements AbstractC0412t, n, Iterator {
    boolean f14325a = false;
    int f14326b;
    final B f14327c;

    public J(B b10) {
        this.f14327c = b10;
    }

    public final void forEachRemaining(n nVar) {
        Objects.requireNonNull(nVar);
        while (hasNext()) {
            nVar.d(nextInt());
        }
    }

    @Override
    public final void d(int i10) {
        this.f14325a = true;
        this.f14326b = i10;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof n) {
            forEachRemaining((n) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!Y.f14360a) {
            while (hasNext()) {
                consumer.l(Integer.valueOf(nextInt()));
            }
            return;
        }
        Y.a(J.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    @Override
    public final boolean hasNext() {
        if (!this.f14325a) {
            this.f14327c.i(this);
        }
        return this.f14325a;
    }

    @Override
    public final Integer next() {
        if (!Y.f14360a) {
            return Integer.valueOf(nextInt());
        }
        Y.a(J.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    public final int nextInt() {
        if (this.f14325a || hasNext()) {
            this.f14325a = false;
            return this.f14326b;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        Iterator.CC.a();
        throw null;
    }
}
