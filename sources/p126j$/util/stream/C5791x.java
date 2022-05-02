package p126j$.util.stream;

public class C5791x extends AbstractC5576E {
    public final int f18503u;
    final Object f18504v;

    public C5791x(AbstractC5686c cVar, AbstractC5686c cVar2, int i, int i2, Object obj, int i3) {
        super(cVar2, i, i2);
        this.f18503u = i3;
        this.f18504v = obj;
    }

    @Override
    public AbstractC5759q2 mo22137E0(int i, AbstractC5759q2 q2Var) {
        switch (this.f18503u) {
            case 0:
                return new C5786w(this, q2Var, 0);
            case 1:
                return new C5786w(this, q2Var, 4);
            case 2:
                return new C5786w(this, q2Var, 5);
            case 3:
                return new C5786w(this, q2Var, 6);
            case 4:
                return new C5692d0(this, q2Var, 6);
            case 5:
                return new C5747o0(this, q2Var, 4);
            case 6:
                return new C5689c2(this, q2Var, 5);
            default:
                return new C5756q(this, q2Var);
        }
    }
}
