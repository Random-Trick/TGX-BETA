package p126j$.util.stream;

import p126j$.util.function.C5520b;

class C5792x0 extends AbstractC5802z0 implements AbstractC5754p2 {
    final EnumC5557A0 f18505c;
    final C5520b f18506d;

    public C5792x0(EnumC5557A0 a0, C5520b bVar) {
        super(a0);
        this.f18505c = a0;
        this.f18506d = bVar;
    }

    public void mo22129k(Long l) {
        AbstractC5572D0.m22417l(this, l);
    }

    @Override
    public void mo22134e(long j) {
        boolean z;
        boolean z2;
        if (!this.f18522a) {
            boolean E = this.f18506d.m22499E(j);
            z = this.f18505c.f18094a;
            if (E == z) {
                this.f18522a = true;
                z2 = this.f18505c.f18095b;
                this.f18523b = z2;
            }
        }
    }
}
