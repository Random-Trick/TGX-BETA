package p126j$.util.stream;

import p126j$.util.function.AbstractC5525g;

final class C5720i3 extends AbstractC5735l3 implements AbstractC5525g {
    final double[] f18391c;

    public C5720i3(int i) {
        this.f18391c = new double[i];
    }

    @Override
    public void mo22217a(Object obj, long j) {
        AbstractC5525g gVar = (AbstractC5525g) obj;
        for (int i = 0; i < j; i++) {
            gVar.mo22150c(this.f18391c[i]);
        }
    }

    @Override
    public void mo22150c(double d) {
        double[] dArr = this.f18391c;
        int i = this.f18426b;
        this.f18426b = i + 1;
        dArr[i] = d;
    }
}
