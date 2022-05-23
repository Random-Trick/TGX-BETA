package j$.util.stream;

import j$.util.H;

abstract class E3 {
    final long f14521a;
    final long f14522b;
    H f14523c;
    long f14524d;
    long f14525e;

    public E3(H h10, long j10, long j11, long j12, long j13) {
        this.f14523c = h10;
        this.f14521a = j10;
        this.f14522b = j11;
        this.f14524d = j12;
        this.f14525e = j13;
    }

    protected abstract H b(H h10, long j10, long j11, long j12, long j13);

    public final int characteristics() {
        return this.f14523c.characteristics();
    }

    public final long estimateSize() {
        long j10 = this.f14521a;
        long j11 = this.f14525e;
        if (j10 < j11) {
            return j11 - Math.max(j10, this.f14524d);
        }
        return 0L;
    }

    public final H trySplit() {
        long j10 = this.f14521a;
        long j11 = this.f14525e;
        if (j10 >= j11 || this.f14524d >= j11) {
            return null;
        }
        while (true) {
            H trySplit = this.f14523c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f14524d;
            long min = Math.min(estimateSize, this.f14522b);
            long j12 = this.f14521a;
            if (j12 >= min) {
                this.f14524d = min;
            } else {
                long j13 = this.f14522b;
                if (min >= j13) {
                    this.f14523c = trySplit;
                    this.f14525e = min;
                } else {
                    long j14 = this.f14524d;
                    if (j14 < j12 || estimateSize > j13) {
                        this.f14524d = min;
                        return b(trySplit, j12, j13, j14, min);
                    }
                    this.f14524d = min;
                    return trySplit;
                }
            }
        }
    }
}
