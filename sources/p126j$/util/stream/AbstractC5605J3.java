package p126j$.util.stream;

import java.util.concurrent.atomic.AtomicLong;
import p126j$.util.AbstractC5468G;

abstract class AbstractC5605J3 {
    protected final AbstractC5468G f18165a;
    protected final boolean f18166b;
    private final long f18167c;
    private final AtomicLong f18168d;

    public AbstractC5605J3(AbstractC5468G g, long j, long j2) {
        this.f18165a = g;
        long j3 = 0;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        this.f18166b = i < 0;
        this.f18167c = i >= 0 ? j2 : j3;
        this.f18168d = new AtomicLong(i >= 0 ? j + j2 : j);
    }

    public AbstractC5605J3(AbstractC5468G g, AbstractC5605J3 j3) {
        this.f18165a = g;
        this.f18166b = j3.f18166b;
        this.f18168d = j3.f18168d;
        this.f18167c = j3.f18167c;
    }

    public final int characteristics() {
        return this.f18165a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f18165a.estimateSize();
    }

    public final long m22375o(long j) {
        long j2;
        long min;
        do {
            j2 = this.f18168d.get();
            if (j2 != 0) {
                min = Math.min(j2, j);
                if (min <= 0) {
                    break;
                }
            } else if (this.f18166b) {
                return j;
            } else {
                return 0L;
            }
        } while (!this.f18168d.compareAndSet(j2, j2 - min));
        if (this.f18166b) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.f18167c;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    protected abstract AbstractC5468G mo22374p(AbstractC5468G g);

    public final int m22373q() {
        if (this.f18168d.get() > 0) {
            return 2;
        }
        return this.f18166b ? 3 : 1;
    }

    public final AbstractC5468G trySplit() {
        AbstractC5468G trySplit;
        if (this.f18168d.get() == 0 || (trySplit = this.f18165a.trySplit()) == null) {
            return null;
        }
        return mo22374p(trySplit);
    }
}
