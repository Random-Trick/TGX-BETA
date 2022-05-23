package j$.util.stream;

public final class C0404y extends F {
    public final int f14897u;
    final Object f14898v;

    public C0404y(AbstractC0301c cVar, int i10, int i11, Object obj, int i12) {
        super(cVar, i11);
        this.f14897u = i12;
        this.f14898v = obj;
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        switch (this.f14897u) {
            case 0:
                return new C0400x(this, r2Var, 0);
            case 1:
                return new C0400x(this, r2Var, 4);
            case 2:
                return new C0400x(this, r2Var, 5);
            case 3:
                return new C0400x(this, r2Var, 6);
            case 4:
                return new C0312e0(this, r2Var, 6);
            case 5:
                return new C0367p0(this, r2Var, 4);
            case 6:
                return new C0309d2(this, r2Var, 5);
            default:
                return new r(this, r2Var);
        }
    }
}
