package p126j$.util.stream;

import p126j$.util.function.Function;

class C5699e2 extends AbstractC5714h2 {
    public final int f18345u;
    final Function f18346v;

    public C5699e2(AbstractC5719i2 i2Var, AbstractC5686c cVar, int i, int i2, Function function, int i3) {
        super(cVar, i, i2);
        this.f18345u = i3;
        this.f18346v = function;
    }

    @Override
    public AbstractC5759q2 mo22137E0(int i, AbstractC5759q2 q2Var) {
        switch (this.f18345u) {
            case 0:
                return new C5689c2(this, q2Var, 2);
            default:
                return new C5689c2(this, q2Var, 6);
        }
    }
}
