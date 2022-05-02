package p126j$.util;

import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.C5534p;
import p126j$.util.function.Consumer;

public final class C5807u implements PrimitiveIterator.OfLong {
    final AbstractC5808v f18528a;

    private C5807u(AbstractC5808v vVar) {
        this.f18528a = vVar;
    }

    public static PrimitiveIterator.OfLong m22127a(AbstractC5808v vVar) {
        return new C5807u(vVar);
    }

    @Override
    public void forEachRemaining(LongConsumer longConsumer) {
        C5471J j = (C5471J) this.f18528a;
        Objects.requireNonNull(j);
        j.m22602a((AbstractC5535q) longConsumer);
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        ((C5471J) this.f18528a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override
    public void forEachRemaining2(LongConsumer longConsumer) {
        ((C5471J) this.f18528a).m22602a(C5534p.m22484a(longConsumer));
    }

    @Override
    public boolean hasNext() {
        return ((C5471J) this.f18528a).hasNext();
    }

    @Override
    public long nextLong() {
        return ((C5471J) this.f18528a).nextLong();
    }

    @Override
    public void remove() {
        ((C5471J) this.f18528a).remove();
    }
}
