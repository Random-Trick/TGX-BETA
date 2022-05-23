package j$.util;

import j$.util.function.n;
import j$.util.function.v;

public final class C0281i implements v, n {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public final void a(C0281i iVar) {
        this.count += iVar.count;
        this.sum += iVar.sum;
        this.min = Math.min(this.min, iVar.min);
        this.max = Math.max(this.max, iVar.max);
    }

    @Override
    public final void d(int i10) {
        e(i10);
    }

    @Override
    public final void e(long j10) {
        this.count++;
        this.sum += j10;
        this.min = Math.min(this.min, j10);
        this.max = Math.max(this.max, j10);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0281i.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j10 = this.count;
        objArr[4] = Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
