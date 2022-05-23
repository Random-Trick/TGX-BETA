package j$.util;

import j$.util.Iterator;
import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public final class C0288p implements PrimitiveIterator.OfDouble {
    final AbstractC0289q f14476a;

    private C0288p(AbstractC0289q qVar) {
        this.f14476a = qVar;
    }

    public static PrimitiveIterator.OfDouble a(AbstractC0289q qVar) {
        return new C0288p(qVar);
    }

    @Override
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        ((L) this.f14476a).forEachRemaining(doubleConsumer);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0289q qVar = this.f14476a;
        j$.util.function.Consumer convert = Consumer.VivifiedWrapper.convert(consumer);
        L l10 = (L) qVar;
        Objects.requireNonNull(l10);
        AbstractC0264a.b(l10, convert);
    }

    @Override
    public final void forEachRemaining2(DoubleConsumer doubleConsumer) {
        ((L) this.f14476a).forEachRemaining(C0277e.a(doubleConsumer));
    }

    @Override
    public final boolean hasNext() {
        return ((L) this.f14476a).hasNext();
    }

    @Override
    public final double nextDouble() {
        return ((L) this.f14476a).nextDouble();
    }

    @Override
    public final void remove() {
        Objects.requireNonNull((L) this.f14476a);
        Iterator.CC.a();
        throw null;
    }
}
