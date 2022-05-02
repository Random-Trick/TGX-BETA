package p126j$.util.stream;

public class C5561B extends AbstractC5576E {
    public final int f18109u;

    public C5561B(AbstractC5686c cVar, AbstractC5686c cVar2, int i, int i2, int i3) {
        super(cVar2, i, i2);
        this.f18109u = i3;
    }

    @Override
    public AbstractC5759q2 mo22136E0(int i, AbstractC5759q2 q2Var) {
        switch (this.f18109u) {
            case 0:
                return q2Var;
            case 1:
                return new C5692d0(this, q2Var, 2);
            default:
                return new C5747o0(this, q2Var, 0);
        }
    }
}
