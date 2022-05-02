package p126j$.util.stream;

import p126j$.util.function.Consumer;

final class C5740m3 extends AbstractC5745n3 implements Consumer {
    final Object[] f18429b;

    public C5740m3(int i) {
        this.f18429b = new Object[i];
    }

    @Override
    public void mo22128k(Object obj) {
        Object[] objArr = this.f18429b;
        int i = this.f18435a;
        this.f18435a = i + 1;
        objArr[i] = obj;
    }
}
