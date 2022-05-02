package p126j$.util.stream;

import p126j$.util.AbstractC5468G;

final class C5567C0 extends AbstractC5691d {
    private final C5562B0 f18114j;

    public C5567C0(C5562B0 b0, AbstractC5572D0 d0, AbstractC5468G g) {
        super(d0, g);
        this.f18114j = b0;
    }

    C5567C0(C5567C0 c0, AbstractC5468G g) {
        super(c0, g);
        this.f18114j = c0.f18114j;
    }

    @Override
    public Object mo22278a() {
        boolean z;
        AbstractC5572D0 d0 = this.f18350a;
        AbstractC5802z0 z0Var = (AbstractC5802z0) this.f18114j.f18112c.get();
        d0.mo22300q0(z0Var, this.f18351b);
        boolean z2 = z0Var.f18523b;
        z = this.f18114j.f18111b.f18095b;
        if (z2 != z) {
            return null;
        }
        m22289l(Boolean.valueOf(z2));
        return null;
    }

    @Override
    public AbstractC5701f mo22273f(AbstractC5468G g) {
        return new C5567C0(this, g);
    }

    @Override
    protected Object mo22290k() {
        boolean z;
        z = this.f18114j.f18111b.f18095b;
        return Boolean.valueOf(!z);
    }
}
