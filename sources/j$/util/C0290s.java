package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import j$.util.function.m;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public final class C0290s implements PrimitiveIterator.OfInt {
    final AbstractC0412t f14478a;

    private C0290s(AbstractC0412t tVar) {
        this.f14478a = tVar;
    }

    public static PrimitiveIterator.OfInt a(AbstractC0412t tVar) {
        return new C0290s(tVar);
    }

    @Override
    public final void forEachRemaining(IntConsumer intConsumer) {
        ((J) this.f14478a).forEachRemaining(intConsumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        ((J) this.f14478a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public final void forEachRemaining2(IntConsumer intConsumer) {
        ((J) this.f14478a).forEachRemaining(m.a(intConsumer));
    }

    @Override
    public final boolean hasNext() {
        return ((J) this.f14478a).hasNext();
    }

    @Override
    public final int nextInt() {
        return ((J) this.f14478a).nextInt();
    }

    @Override
    public final void remove() {
        Objects.requireNonNull((J) this.f14478a);
        Iterator.CC.a();
        throw null;
    }
}
