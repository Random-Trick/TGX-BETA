package j$.util;

import j$.util.function.n;

public final class C0280h implements n {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public final void a(C0280h hVar) {
        this.count += hVar.count;
        this.sum += hVar.sum;
        this.min = Math.min(this.min, hVar.min);
        this.max = Math.max(this.max, hVar.max);
    }

    @Override
    public final void d(int i10) {
        this.count++;
        this.sum += i10;
        this.min = Math.min(this.min, i10);
        this.max = Math.max(this.max, i10);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0280h.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j10 = this.count;
        objArr[4] = Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
