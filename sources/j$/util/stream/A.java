package j$.util.stream;

public final class A extends AbstractC0337j0 {
    public final int f14479u;
    final Object f14480v;

    public A(AbstractC0301c cVar, int i10, int i11, Object obj, int i12) {
        super(cVar, i11);
        this.f14479u = i12;
        this.f14480v = obj;
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        switch (this.f14479u) {
            case 0:
                return new C0400x(this, r2Var, 2);
            case 1:
                return new C0312e0(this, r2Var, 1);
            case 2:
                return new C0312e0(this, r2Var, 3);
            case 3:
                return new C0312e0(this, r2Var, 7);
            case 4:
                return new C0312e0(this, r2Var, 8);
            case 5:
                return new C0367p0(this, r2Var, 3);
            case 6:
                return new C0309d2(this, r2Var, 3);
            default:
                return new r(this, r2Var);
        }
    }
}
