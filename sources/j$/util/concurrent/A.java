package j$.util.concurrent;

import j$.util.AbstractC0264a;
import j$.util.function.AbstractC0278f;
import j$.util.function.Consumer;
import j$.util.z;
import java.util.Comparator;
import java.util.Objects;

final class A implements z {
    long f14364a;
    final long f14365b;
    final double f14366c;
    final double f14367d;

    public A(long j10, long j11, double d10, double d11) {
        this.f14364a = j10;
        this.f14365b = j11;
        this.f14366c = d10;
        this.f14367d = d11;
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.q(this, consumer);
    }

    public final A trySplit() {
        long j10 = this.f14364a;
        long j11 = (this.f14365b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f14364a = j11;
        return new A(j10, j11, this.f14366c, this.f14367d);
    }

    @Override
    public final int characteristics() {
        return 17728;
    }

    @Override
    public final long estimateSize() {
        return this.f14365b - this.f14364a;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.c(this, consumer);
    }

    @Override
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return AbstractC0264a.h(this);
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        return AbstractC0264a.k(this, i10);
    }

    @Override
    public final boolean tryAdvance(AbstractC0278f fVar) {
        Objects.requireNonNull(fVar);
        long j10 = this.f14364a;
        if (j10 >= this.f14365b) {
            return false;
        }
        fVar.c(ThreadLocalRandom.current().c(this.f14366c, this.f14367d));
        this.f14364a = j10 + 1;
        return true;
    }

    @Override
    public final void forEachRemaining(AbstractC0278f fVar) {
        Objects.requireNonNull(fVar);
        long j10 = this.f14364a;
        long j11 = this.f14365b;
        if (j10 < j11) {
            this.f14364a = j11;
            double d10 = this.f14366c;
            double d11 = this.f14367d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                fVar.c(current.c(d10, d11));
                j10++;
            } while (j10 < j11);
        }
    }
}
