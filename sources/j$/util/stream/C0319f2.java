package j$.util.stream;

import j$.util.function.Function;

final class C0319f2 extends AbstractC0334i2 {
    public final int f14747u;
    final Function f14748v;

    public C0319f2(AbstractC0301c cVar, int i10, int i11, Function function, int i12) {
        super(cVar, i11);
        this.f14747u = i12;
        this.f14748v = function;
    }

    @Override
    public final AbstractC0378r2 I0(int i10, AbstractC0378r2 r2Var) {
        switch (this.f14747u) {
            case 0:
                return new C0309d2(this, r2Var, 2);
            default:
                return new C0309d2(this, r2Var, 6);
        }
    }
}
