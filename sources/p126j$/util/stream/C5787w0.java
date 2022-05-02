package p126j$.util.stream;

import p126j$.util.function.C5520b;

class C5787w0 extends AbstractC5802z0 implements AbstractC5749o2 {
    final EnumC5557A0 f18497c;
    final C5520b f18498d;

    public C5787w0(EnumC5557A0 a0, C5520b bVar) {
        super(a0);
        this.f18497c = a0;
        this.f18498d = bVar;
    }

    public void mo22129k(Integer num) {
        AbstractC5572D0.m22418k(this, num);
    }

    @Override
    public void mo22135d(int i) {
        boolean z;
        boolean z2;
        if (!this.f18522a) {
            boolean D = this.f18498d.m22500D(i);
            z = this.f18497c.f18094a;
            if (D == z) {
                this.f18522a = true;
                z2 = this.f18497c.f18095b;
                this.f18523b = z2;
            }
        }
    }
}
