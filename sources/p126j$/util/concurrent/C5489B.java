package p126j$.util.concurrent;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.AbstractC5464C;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.AbstractC5535q;
import p126j$.util.function.Consumer;

final class C5489B implements AbstractC5464C {
    long f17980a;
    final long f17981b;
    final long f17982c;
    final long f17983d;

    public C5489B(long j, long j2, long j3, long j4) {
        this.f17980a = j;
        this.f17981b = j2;
        this.f17982c = j3;
        this.f17983d = j4;
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22562s(this, consumer);
    }

    public C5489B trySplit() {
        long j = this.f17980a;
        long j2 = (this.f17981b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f17980a = j2;
        return new C5489B(j, j2, this.f17982c, this.f17983d);
    }

    @Override
    public int characteristics() {
        return 17728;
    }

    @Override
    public long estimateSize() {
        return this.f17981b - this.f17980a;
    }

    @Override
    public void forEachRemaining(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
        long j = this.f17980a;
        long j2 = this.f17981b;
        if (j < j2) {
            this.f17980a = j2;
            long j3 = this.f17982c;
            long j4 = this.f17983d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                qVar.mo22127e(current.m22529e(j3, j4));
                j++;
            } while (j < j2);
        }
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22570e(this, consumer);
    }

    @Override
    public boolean tryAdvance(AbstractC5535q qVar) {
        Objects.requireNonNull(qVar);
        long j = this.f17980a;
        if (j >= this.f17981b) {
            return false;
        }
        qVar.mo22127e(ThreadLocalRandom.current().m22529e(this.f17982c, this.f17983d));
        this.f17980a = j + 1;
        return true;
    }

    @Override
    public Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override
    public long getExactSizeIfKnown() {
        return AbstractC5485a.m22569h(this);
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22568j(this, i);
    }
}
