package p126j$.util;

import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.C5524f;
import p126j$.util.function.Consumer;

public final class C5551o implements PrimitiveIterator.OfDouble {
    final AbstractC5552p f18088a;

    private C5551o(AbstractC5552p pVar) {
        this.f18088a = pVar;
    }

    public static PrimitiveIterator.OfDouble m22461a(AbstractC5552p pVar) {
        return new C5551o(pVar);
    }

    @Override
    public void forEachRemaining(DoubleConsumer doubleConsumer) {
        C5472K k = (C5472K) this.f18088a;
        Objects.requireNonNull(k);
        k.m22600a((AbstractC5525g) doubleConsumer);
    }

    @Override
    public void forEachRemaining2(DoubleConsumer doubleConsumer) {
        ((C5472K) this.f18088a).m22600a(C5524f.m22485a(doubleConsumer));
    }

    @Override
    public boolean hasNext() {
        return ((C5472K) this.f18088a).hasNext();
    }

    @Override
    public double nextDouble() {
        return ((C5472K) this.f18088a).nextDouble();
    }

    @Override
    public void remove() {
        ((C5472K) this.f18088a).remove();
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5552p pVar = this.f18088a;
        p126j$.util.function.Consumer convert = Consumer.VivifiedWrapper.convert(consumer);
        C5472K k = (C5472K) pVar;
        Objects.requireNonNull(k);
        AbstractC5485a.m22573b(k, convert);
    }
}
