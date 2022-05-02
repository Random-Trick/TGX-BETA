package p126j$.util.stream;

public class C5801z extends AbstractC5717i0 {
    public final int f18520u;
    final Object f18521v;

    public C5801z(AbstractC5686c cVar, AbstractC5686c cVar2, int i, int i2, Object obj, int i3) {
        super(cVar2, i, i2);
        this.f18520u = i3;
        this.f18521v = obj;
    }

    @Override
    public AbstractC5759q2 mo22136E0(int i, AbstractC5759q2 q2Var) {
        switch (this.f18520u) {
            case 0:
                return new C5786w(this, q2Var, 2);
            case 1:
                return new C5692d0(this, q2Var, 1);
            case 2:
                return new C5692d0(this, q2Var, 3);
            case 3:
                return new C5692d0(this, q2Var, 7);
            case 4:
                return new C5692d0(this, q2Var, 8);
            case 5:
                return new C5747o0(this, q2Var, 3);
            case 6:
                return new C5689c2(this, q2Var, 3);
            default:
                return new C5756q(this, q2Var);
        }
    }
}
