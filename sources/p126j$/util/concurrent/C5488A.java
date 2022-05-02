package p126j$.util.concurrent;

import java.util.Comparator;
import java.util.Objects;
import p126j$.util.AbstractC5462A;
import p126j$.util.AbstractC5485a;
import p126j$.util.function.AbstractC5530l;
import p126j$.util.function.Consumer;

final class C5488A implements AbstractC5462A {
    long f17976a;
    final long f17977b;
    final int f17978c;
    final int f17979d;

    public C5488A(long j, long j2, int i, int i2) {
        this.f17976a = j;
        this.f17977b = j2;
        this.f17978c = i;
        this.f17979d = i2;
    }

    @Override
    public boolean mo22124a(Consumer consumer) {
        return AbstractC5485a.m22563r(this, consumer);
    }

    public C5488A trySplit() {
        long j = this.f17976a;
        long j2 = (this.f17977b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f17976a = j2;
        return new C5488A(j, j2, this.f17978c, this.f17979d);
    }

    @Override
    public int characteristics() {
        return 17728;
    }

    @Override
    public long estimateSize() {
        return this.f17977b - this.f17976a;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        AbstractC5485a.m22571d(this, consumer);
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

    @Override
    public boolean tryAdvance(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
        long j = this.f17976a;
        if (j >= this.f17977b) {
            return false;
        }
        lVar.mo22144d(ThreadLocalRandom.current().m22530d(this.f17978c, this.f17979d));
        this.f17976a = j + 1;
        return true;
    }

    @Override
    public void forEachRemaining(AbstractC5530l lVar) {
        Objects.requireNonNull(lVar);
        long j = this.f17976a;
        long j2 = this.f17977b;
        if (j < j2) {
            this.f17976a = j2;
            int i = this.f17978c;
            int i2 = this.f17979d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                lVar.mo22144d(current.m22530d(i, i2));
                j++;
            } while (j < j2);
        }
    }
}
