package p126j$.util;

import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.C5529k;
import p126j$.util.function.Consumer;

public final class C5554r implements PrimitiveIterator.OfInt {
    final AbstractC5555s f18090a;

    private C5554r(AbstractC5555s sVar) {
        this.f18090a = sVar;
    }

    public static PrimitiveIterator.OfInt m22461a(AbstractC5555s sVar) {
        return new C5554r(sVar);
    }

    @Override
    public void forEachRemaining(IntConsumer intConsumer) {
        C5470I i = (C5470I) this.f18090a;
        Objects.requireNonNull(i);
        i.m22604a((AbstractC5530l) intConsumer);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        ((C5470I) this.f18090a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public void forEachRemaining2(IntConsumer intConsumer) {
        ((C5470I) this.f18090a).m22604a(C5529k.m22485a(intConsumer));
    }

    @Override
    public boolean hasNext() {
        return ((C5470I) this.f18090a).hasNext();
    }

    @Override
    public int nextInt() {
        return ((C5470I) this.f18090a).nextInt();
    }

    @Override
    public void remove() {
        ((C5470I) this.f18090a).remove();
    }
}
