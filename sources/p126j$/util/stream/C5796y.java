package p126j$.util.stream;

public class C5796y extends AbstractC5714h2 {
    public final int f18512u;
    final Object f18513v;

    public C5796y(AbstractC5686c cVar, AbstractC5686c cVar2, int i, int i2, Object obj, int i3) {
        super(cVar2, i, i2);
        this.f18512u = i3;
        this.f18513v = obj;
    }

    @Override
    public AbstractC5759q2 mo22137E0(int i, AbstractC5759q2 q2Var) {
        switch (this.f18512u) {
            case 0:
                return new C5786w(this, q2Var, 1);
            case 1:
                return new C5692d0(this, q2Var, 4);
            case 2:
                return new C5747o0(this, q2Var, 2);
            case 3:
                return new C5689c2(this, q2Var, 0);
            default:
                return new C5689c2(this, q2Var, 1);
        }
    }
}
