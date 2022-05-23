package j$.util.stream;

public final class C0408z extends AbstractC0334i2 {
    public final int f14906u;
    final Object f14907v;

    public C0408z(AbstractC0301c cVar, int i10, int i11, Object obj, int i12) {
        super(cVar, i11);
        this.f14906u = i12;
        this.f14907v = obj;
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        switch (this.f14906u) {
            case 0:
                return new C0400x(this, r2Var, 1);
            case 1:
                return new C0312e0(this, r2Var, 4);
            case 2:
                return new C0367p0(this, r2Var, 2);
            case 3:
                return new C0309d2(this, r2Var, 0);
            default:
                return new C0309d2(this, r2Var, 1);
        }
    }
}
