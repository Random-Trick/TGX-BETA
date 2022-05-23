package j$.util;

import j$.util.function.AbstractC0278f;

public final class C0279g implements AbstractC0278f {
    private double f14462a;
    private double f14463b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    private void e(double d10) {
        double d11 = d10 - this.f14462a;
        double d12 = this.sum;
        double d13 = d12 + d11;
        this.f14462a = (d13 - d12) - d11;
        this.sum = d13;
    }

    public final void a(C0279g gVar) {
        this.count += gVar.count;
        this.f14463b += gVar.f14463b;
        e(gVar.sum);
        e(gVar.f14462a);
        this.min = Math.min(this.min, gVar.min);
        this.max = Math.max(this.max, gVar.max);
    }

    @Override
    public final void c(double d10) {
        this.count++;
        this.f14463b += d10;
        e(d10);
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d10);
    }

    public final double d() {
        double d10 = this.sum + this.f14462a;
        return (!Double.isNaN(d10) || !Double.isInfinite(this.f14463b)) ? d10 : this.f14463b;
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0279g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Double.valueOf(d());
        objArr[3] = Double.valueOf(this.min);
        objArr[4] = Double.valueOf(this.count > 0 ? d() / this.count : 0.0d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
