package j$.util.stream;

import j$.util.H;
import java.util.concurrent.atomic.AtomicLong;

abstract class K3 {
    protected final H f14560a;
    protected final boolean f14561b;
    private final long f14562c;
    private final AtomicLong f14563d;

    public K3(H h10, long j10, long j11) {
        this.f14560a = h10;
        long j12 = 0;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        this.f14561b = i10 < 0;
        this.f14562c = i10 >= 0 ? j11 : j12;
        this.f14563d = new AtomicLong(i10 >= 0 ? j10 + j11 : j10);
    }

    public K3(H h10, K3 k32) {
        this.f14560a = h10;
        this.f14561b = k32.f14561b;
        this.f14563d = k32.f14563d;
        this.f14562c = k32.f14562c;
    }

    public final int characteristics() {
        return this.f14560a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.f14560a.estimateSize();
    }

    public final long o(long j10) {
        long j11;
        long min;
        do {
            j11 = this.f14563d.get();
            if (j11 != 0) {
                min = Math.min(j11, j10);
                if (min <= 0) {
                    break;
                }
            } else if (this.f14561b) {
                return j10;
            } else {
                return 0L;
            }
        } while (!this.f14563d.compareAndSet(j11, j11 - min));
        if (this.f14561b) {
            return Math.max(j10 - min, 0L);
        }
        long j12 = this.f14562c;
        return j11 > j12 ? Math.max(min - (j11 - j12), 0L) : min;
    }

    protected abstract H q(H h10);

    public final int r() {
        if (this.f14563d.get() > 0) {
            return 2;
        }
        return this.f14561b ? 3 : 1;
    }

    public final H trySplit() {
        H trySplit;
        if (this.f14563d.get() == 0 || (trySplit = this.f14560a.trySplit()) == null) {
            return null;
        }
        return q(trySplit);
    }
}
