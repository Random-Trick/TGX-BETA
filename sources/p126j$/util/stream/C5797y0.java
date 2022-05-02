package p126j$.util.stream;

import p126j$.util.function.C5520b;

class C5797y0 extends AbstractC5802z0 implements AbstractC5744n2 {
    final EnumC5557A0 f18514c;
    final C5520b f18515d;

    public C5797y0(EnumC5557A0 a0, C5520b bVar) {
        super(a0);
        this.f18514c = a0;
        this.f18515d = bVar;
    }

    public void mo22128k(Double d) {
        AbstractC5572D0.m22419j(this, d);
    }

    @Override
    public void mo22135c(double d) {
        boolean z;
        boolean z2;
        if (!this.f18522a) {
            boolean C = this.f18515d.m22500C(d);
            z = this.f18514c.f18094a;
            if (C == z) {
                this.f18522a = true;
                z2 = this.f18514c.f18095b;
                this.f18523b = z2;
            }
        }
    }
}
