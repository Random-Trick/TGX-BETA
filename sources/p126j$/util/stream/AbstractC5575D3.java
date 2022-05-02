package p126j$.util.stream;

import p126j$.util.AbstractC5468G;

abstract class AbstractC5575D3 {
    final long f18126a;
    final long f18127b;
    AbstractC5468G f18128c;
    long f18129d;
    long f18130e;

    public AbstractC5575D3(AbstractC5468G g, long j, long j2, long j3, long j4) {
        this.f18128c = g;
        this.f18126a = j;
        this.f18127b = j2;
        this.f18129d = j3;
        this.f18130e = j4;
    }

    protected abstract AbstractC5468G mo22139b(AbstractC5468G g, long j, long j2, long j3, long j4);

    public int characteristics() {
        return this.f18128c.characteristics();
    }

    public long estimateSize() {
        long j = this.f18126a;
        long j2 = this.f18130e;
        if (j < j2) {
            return j2 - Math.max(j, this.f18129d);
        }
        return 0L;
    }

    public AbstractC5468G trySplit() {
        long j = this.f18126a;
        long j2 = this.f18130e;
        if (j >= j2 || this.f18129d >= j2) {
            return null;
        }
        while (true) {
            AbstractC5468G trySplit = this.f18128c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f18129d;
            long min = Math.min(estimateSize, this.f18127b);
            long j3 = this.f18126a;
            if (j3 >= min) {
                this.f18129d = min;
            } else {
                long j4 = this.f18127b;
                if (min >= j4) {
                    this.f18128c = trySplit;
                    this.f18130e = min;
                } else {
                    long j5 = this.f18129d;
                    if (j5 < j3 || estimateSize > j4) {
                        this.f18129d = min;
                        return mo22139b(trySplit, j3, j4, j5, min);
                    }
                    this.f18129d = min;
                    return trySplit;
                }
            }
        }
    }
}
