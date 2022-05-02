package p126j$.util;

import p126j$.util.function.AbstractC5525g;

public class C5543g implements AbstractC5525g {
    private double f18074a;
    private double f18075b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    private void m22481e(double d) {
        double d2 = d - this.f18074a;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.f18074a = (d4 - d3) - d2;
        this.sum = d4;
    }

    public void m22483a(C5543g gVar) {
        this.count += gVar.count;
        this.f18075b += gVar.f18075b;
        m22481e(gVar.sum);
        m22481e(gVar.f18074a);
        this.min = Math.min(this.min, gVar.min);
        this.max = Math.max(this.max, gVar.max);
    }

    @Override
    public void mo22151c(double d) {
        this.count++;
        this.f18075b += d;
        m22481e(d);
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    public final double m22482d() {
        double d = this.sum + this.f18074a;
        return (!Double.isNaN(d) || !Double.isInfinite(this.f18075b)) ? d : this.f18075b;
    }

    public String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C5543g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Double.valueOf(m22482d());
        objArr[3] = Double.valueOf(this.min);
        objArr[4] = Double.valueOf(this.count > 0 ? m22482d() / this.count : 0.0d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
