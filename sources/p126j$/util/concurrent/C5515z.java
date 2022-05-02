package p126j$.util.concurrent;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.AbstractC5485a;
import p126j$.util.AbstractC5811y;
import p126j$.util.function.AbstractC5525g;
import p126j$.util.function.Consumer;

final class C5515z implements AbstractC5811y {
    long f18049a;
    final long f18050b;
    final double f18051c;
    final double f18052d;

    public C5515z(long j, long j2, double d, double d2) {
        this.f18049a = j;
        this.f18050b = j2;
        this.f18051c = d;
        this.f18052d = d2;
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        return AbstractC5485a.m22565q(this, consumer);
    }

    public C5515z trySplit() {
        long j = this.f18049a;
        long j2 = (this.f18050b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f18049a = j2;
        return new C5515z(j, j2, this.f18051c, this.f18052d);
    }

    @Override
    public int characteristics() {
        return 17728;
    }

    @Override
    public long estimateSize() {
        return this.f18050b - this.f18049a;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22573c(this, consumer);
    }

    @Override
    public Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override
    public long getExactSizeIfKnown() {
        return AbstractC5485a.m22570h(this);
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22569j(this, i);
    }

    @Override
    public boolean tryAdvance(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
        long j = this.f18049a;
        if (j >= this.f18050b) {
            return false;
        }
        gVar.mo22151c(ThreadLocalRandom.current().m22532c(this.f18051c, this.f18052d));
        this.f18049a = j + 1;
        return true;
    }

    @Override
    public void forEachRemaining(AbstractC5525g gVar) {
        Objects.requireNonNull(gVar);
        long j = this.f18049a;
        long j2 = this.f18050b;
        if (j < j2) {
            this.f18049a = j2;
            double d = this.f18051c;
            double d2 = this.f18052d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                gVar.mo22151c(current.m22532c(d, d2));
                j++;
            } while (j < j2);
        }
    }
}
