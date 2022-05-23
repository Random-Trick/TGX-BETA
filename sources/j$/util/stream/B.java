package j$.util.stream;

public final class B extends AbstractC0381s0 {
    public final int f14486u;
    final Object f14487v;

    public B(AbstractC0301c cVar, int i10, int i11, Object obj, int i12) {
        super(cVar, i11);
        this.f14486u = i12;
        this.f14487v = obj;
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        switch (this.f14486u) {
            case 0:
                return new C0400x(this, r2Var, 3);
            case 1:
                return new C0312e0(this, r2Var, 5);
            case 2:
                return new C0367p0(this, r2Var, 1);
            case 3:
                return new C0367p0(this, r2Var, 5);
            case 4:
                return new C0367p0(this, r2Var, 6);
            case 5:
                return new C0367p0(this, r2Var, 7);
            case 6:
                return new r(this, r2Var);
            default:
                return new C0309d2(this, r2Var, 4);
        }
    }
}
