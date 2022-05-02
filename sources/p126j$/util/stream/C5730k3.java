package p126j$.util.stream;

import p126j$.util.function.AbstractC5535q;

final class C5730k3 extends AbstractC5735l3 implements AbstractC5535q {
    final long[] f18414c;

    public C5730k3(int i) {
        this.f18414c = new long[i];
    }

    @Override
    public void mo22218a(Object obj, long j) {
        AbstractC5535q qVar = (AbstractC5535q) obj;
        for (int i = 0; i < j; i++) {
            qVar.mo22128e(this.f18414c[i]);
        }
    }

    @Override
    public void mo22128e(long j) {
        long[] jArr = this.f18414c;
        int i = this.f18426b;
        this.f18426b = i + 1;
        jArr[i] = j;
    }
}
