package j$.util.stream;

public final class C0317f0 extends AbstractC0381s0 {
    public final int f14746u;

    public C0317f0(AbstractC0301c cVar, int i10, int i11, int i12) {
        super(cVar, i11);
        this.f14746u = i12;
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        switch (this.f14746u) {
            case 0:
                return new C0312e0(this, r2Var, 0);
            default:
                return r2Var;
        }
    }
}
