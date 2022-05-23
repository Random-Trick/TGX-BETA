package j$.util.stream;

public final class C extends F {
    public final int f14504u;

    public C(AbstractC0301c cVar, int i10, int i11, int i12) {
        super(cVar, i11);
        this.f14504u = i12;
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        switch (this.f14504u) {
            case 0:
                return r2Var;
            case 1:
                return new C0312e0(this, r2Var, 2);
            default:
                return new C0367p0(this, r2Var, 0);
        }
    }
}
