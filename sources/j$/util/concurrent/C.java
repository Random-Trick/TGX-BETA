package j$.util.concurrent;

import j$.util.AbstractC0264a;
import j$.util.D;
import j$.util.function.Consumer;
import j$.util.function.v;
import java.util.Comparator;
import java.util.Objects;

final class C implements D {
    long f14372a;
    final long f14373b;
    final long f14374c;
    final long f14375d;

    public C(long j10, long j11, long j12, long j13) {
        this.f14372a = j10;
        this.f14373b = j11;
        this.f14374c = j12;
        this.f14375d = j13;
    }

    @Override
    public final boolean a(Consumer consumer) {
        return AbstractC0264a.s(this, consumer);
    }

    public final C trySplit() {
        long j10 = this.f14372a;
        long j11 = (this.f14373b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f14372a = j11;
        return new C(j10, j11, this.f14374c, this.f14375d);
    }

    @Override
    public final int characteristics() {
        return 17728;
    }

    @Override
    public final long estimateSize() {
        return this.f14373b - this.f14372a;
    }

    @Override
    public final void forEachRemaining(v vVar) {
        Objects.requireNonNull(vVar);
        long j10 = this.f14372a;
        long j11 = this.f14373b;
        if (j10 < j11) {
            this.f14372a = j11;
            long j12 = this.f14374c;
            long j13 = this.f14375d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                vVar.e(current.e(j12, j13));
                j10++;
            } while (j10 < j11);
        }
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        AbstractC0264a.e(this, consumer);
    }

    @Override
    public final boolean tryAdvance(v vVar) {
        Objects.requireNonNull(vVar);
        long j10 = this.f14372a;
        if (j10 >= this.f14373b) {
            return false;
        }
        vVar.e(ThreadLocalRandom.current().e(this.f14374c, this.f14375d));
        this.f14372a = j10 + 1;
        return true;
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
}
