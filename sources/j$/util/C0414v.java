package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import j$.util.function.u;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

public final class C0414v implements PrimitiveIterator.OfLong {
    final AbstractC0415w f14915a;

    private C0414v(AbstractC0415w wVar) {
        this.f14915a = wVar;
    }

    public static PrimitiveIterator.OfLong a(AbstractC0415w wVar) {
        return new C0414v(wVar);
    }

    @Override
    public final void forEachRemaining(LongConsumer longConsumer) {
        ((K) this.f14915a).forEachRemaining(longConsumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        ((K) this.f14915a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final void forEachRemaining2(LongConsumer longConsumer) {
        ((K) this.f14915a).forEachRemaining(u.a(longConsumer));
    }

    @Override
    public final boolean hasNext() {
        return ((K) this.f14915a).hasNext();
    }

    @Override
    public final long nextLong() {
        return ((K) this.f14915a).nextLong();
    }

    @Override
    public final void remove() {
        Objects.requireNonNull((K) this.f14915a);
        Iterator.CC.a();
        throw null;
    }
}
