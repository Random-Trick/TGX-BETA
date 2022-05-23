package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.H;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;

public final class D3 extends E3 implements H {
    public D3(H h10, long j10, long j11) {
        super(h10, j10, j11, 0L, Math.min(h10.estimateSize(), j11));
    }

    private D3(H h10, long j10, long j11, long j12, long j13) {
        super(h10, j10, j11, j12, j13);
    }

    @Override
    public final boolean a(Consumer consumer) {
        long j10;
        Objects.requireNonNull(consumer);
        if (this.f14521a >= this.f14525e) {
            return false;
        }
        while (true) {
            long j11 = this.f14521a;
            j10 = this.f14524d;
            if (j11 <= j10) {
                break;
            }
            this.f14523c.a(C0351m.f14818j);
            this.f14524d++;
        }
        if (j10 >= this.f14525e) {
            return false;
        }
        this.f14524d = j10 + 1;
        return this.f14523c.a(consumer);
    }

    @Override
    protected final H b(H h10, long j10, long j11, long j12, long j13) {
        return new D3(h10, j10, j11, j12, j13);
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j10 = this.f14521a;
        long j11 = this.f14525e;
        if (j10 < j11) {
            long j12 = this.f14524d;
            if (j12 < j11) {
                if (j12 < j10 || this.f14523c.estimateSize() + j12 > this.f14522b) {
                    while (this.f14521a > this.f14524d) {
                        this.f14523c.a(C0346l.f14803n);
                        this.f14524d++;
                    }
                    while (this.f14524d < this.f14525e) {
                        this.f14523c.a(consumer);
                        this.f14524d++;
                    }
                    return;
                }
                this.f14523c.forEachRemaining(consumer);
                this.f14524d = this.f14525e;
            }
        }
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
