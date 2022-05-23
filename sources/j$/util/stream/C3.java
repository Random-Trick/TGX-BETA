package j$.util.stream;

import j$.util.AbstractC0264a;
import j$.util.F;
import java.util.Comparator;
import java.util.Objects;

public abstract class C3 extends E3 implements F {
    public C3(F f10, long j10, long j11) {
        super(f10, j10, j11, 0L, Math.min(f10.estimateSize(), j11));
    }

    protected abstract Object c();

    @Override
    public final void n(Object obj) {
        Objects.requireNonNull(obj);
        long j10 = this.f14521a;
        long j11 = this.f14525e;
        if (j10 < j11) {
            long j12 = this.f14524d;
            if (j12 < j11) {
                if (j12 < j10 || ((F) this.f14523c).estimateSize() + j12 > this.f14522b) {
                    while (this.f14521a > this.f14524d) {
                        ((F) this.f14523c).tryAdvance(c());
                        this.f14524d++;
                    }
                    while (this.f14524d < this.f14525e) {
                        ((F) this.f14523c).tryAdvance(obj);
                        this.f14524d++;
                    }
                    return;
                }
                ((F) this.f14523c).forEachRemaining(obj);
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

    @Override
    public final boolean j(Object obj) {
        long j10;
        Objects.requireNonNull(obj);
        if (this.f14521a >= this.f14525e) {
            return false;
        }
        while (true) {
            long j11 = this.f14521a;
            j10 = this.f14524d;
            if (j11 <= j10) {
                break;
            }
            ((F) this.f14523c).tryAdvance(c());
            this.f14524d++;
        }
        if (j10 >= this.f14525e) {
            return false;
        }
        this.f14524d = j10 + 1;
        return ((F) this.f14523c).tryAdvance(obj);
    }

    public C3(F f10, long j10, long j11, long j12, long j13, E0 e02) {
        super(f10, j10, j11, j12, j13);
    }
}
