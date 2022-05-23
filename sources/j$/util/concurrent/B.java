package j$.util.concurrent;

import j$.util.AbstractC0264a;
import j$.util.function.Consumer;
import j$.util.function.n;
import java.util.Comparator;
import java.util.Objects;

final class B implements j$.util.B {
    long f14368a;
    final long f14369b;
    final int f14370c;
    final int f14371d;

    public B(long j10, long j11, int i10, int i11) {
        this.f14368a = j10;
        this.f14369b = j11;
        this.f14370c = i10;
        this.f14371d = i11;
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.r(this, consumer);
    }

    public final B trySplit() {
        long j10 = this.f14368a;
        long j11 = (this.f14369b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f14368a = j11;
        return new B(j10, j11, this.f14370c, this.f14371d);
    }

    @Override
    public final int characteristics() {
        return 17728;
    }

    @Override
    public final long estimateSize() {
        return this.f14369b - this.f14368a;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.d(this, consumer);
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
    public final boolean tryAdvance(n nVar) {
        Objects.requireNonNull(nVar);
        long j10 = this.f14368a;
        if (j10 >= this.f14369b) {
            return false;
        }
        nVar.d(ThreadLocalRandom.current().d(this.f14370c, this.f14371d));
        this.f14368a = j10 + 1;
        return true;
    }

    @Override
    public final void forEachRemaining(n nVar) {
        Objects.requireNonNull(nVar);
        long j10 = this.f14368a;
        long j11 = this.f14369b;
        if (j10 < j11) {
            this.f14368a = j11;
            int i10 = this.f14370c;
            int i11 = this.f14371d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                nVar.d(current.d(i10, i11));
                j10++;
            } while (j10 < j11);
        }
    }
}
