package p126j$.util.stream;

import p126j$.util.function.AbstractC5541w;

class C5782v0 extends AbstractC5802z0 {
    final EnumC5557A0 f18489c;
    final AbstractC5541w f18490d;

    public C5782v0(EnumC5557A0 a0, AbstractC5541w wVar) {
        super(a0);
        this.f18489c = a0;
        this.f18490d = wVar;
    }

    @Override
    public void mo22128k(Object obj) {
        boolean z;
        boolean z2;
        if (!this.f18522a) {
            boolean n = this.f18490d.mo22210n(obj);
            z = this.f18489c.f18094a;
            if (n == z) {
                this.f18522a = true;
                z2 = this.f18489c.f18095b;
                this.f18523b = z2;
            }
        }
    }
}
