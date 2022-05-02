package p126j$.util.stream;

import p126j$.util.function.AbstractC5530l;

final class C5725j3 extends AbstractC5735l3 implements AbstractC5530l {
    final int[] f18395c;

    public C5725j3(int i) {
        this.f18395c = new int[i];
    }

    @Override
    public void mo22218a(Object obj, long j) {
        AbstractC5530l lVar = (AbstractC5530l) obj;
        for (int i = 0; i < j; i++) {
            lVar.mo22145d(this.f18395c[i]);
        }
    }

    @Override
    public void mo22145d(int i) {
        int[] iArr = this.f18395c;
        int i2 = this.f18426b;
        this.f18426b = i2 + 1;
        iArr[i2] = i;
    }
}
